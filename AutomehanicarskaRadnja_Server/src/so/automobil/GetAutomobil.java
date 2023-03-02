package so.automobil;

import domain.Automobil;
import java.util.List;
import so.AbstractSystemOperation;

/**
 *
 * @author Nebojsa Brankovic
 */
public class GetAutomobil extends AbstractSystemOperation {

    private Automobil automobil;

    @Override
    protected void preconditions(Object ado) throws Exception {
        if (!(ado instanceof Automobil)) {
            throw new Exception("Objekat nije instanca klase Automobil!");
        }
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        List<Automobil> automobili = repository.getAll((Automobil) ado);
        for (Automobil automobil : automobili) {
            if (automobil.getRegistracioniBroj().equals(((Automobil) ado).getRegistracioniBroj())) {
                this.automobil = automobil;
            }
        }
    }

    public Automobil getAutomobil() {
        return this.automobil;
    }

}
