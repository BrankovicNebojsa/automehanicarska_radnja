package so.rezervacija;

import domain.Rezervacija;
import so.AbstractSystemOperation;

/**
 *
 * @author Nebojsa Brankovic
 */
public class DeleteRezervacija extends AbstractSystemOperation {

    @Override
    protected void preconditions(Object ado) throws Exception {
        if (!(ado instanceof Rezervacija)) {
            throw new Exception("Objekat nije instanca klase Rezervacija!");
        }
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        repository.delete((Rezervacija) ado);
    }

}
