package so.rezervacija;

import domain.Rezervacija;
import java.util.List;
import so.AbstractSystemOperation;

/**
 *
 * @author Nebojsa Brankovic
 */
public class SaveRezervacije extends AbstractSystemOperation {

    @Override
    protected void preconditions(Object ado) throws Exception {
        List<Rezervacija> rezervacije = (List<Rezervacija>) ado;
        List<Rezervacija> rezervacijeIzBaze = repository.getAll(new Rezervacija());

        for (Rezervacija rezervacija : rezervacije) {
            for (Rezervacija rezervacijaIzBaze : rezervacijeIzBaze) {
                if (rezervacija.getPocetakServisa().equals(rezervacijaIzBaze.getPocetakServisa())
                        && rezervacija.getRadnik().getRadnikId() == rezervacijaIzBaze.getRadnik().getRadnikId()) {
                    throw new Exception("Vec postoji rezervacija kod " + rezervacija.getRadnik().getImeRadnika()
                            + " " + rezervacija.getRadnik().getPrezimeRadnika() + " u to vreme");
                }
            }
        }
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        for (Rezervacija rezervacija : (List<Rezervacija>) ado) {
            repository.save(rezervacija);
        }
    }
}
