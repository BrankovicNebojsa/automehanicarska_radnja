package so.automobil;

import domain.Automobil;
import so.AbstractSystemOperation;

/**
 *
 * @author Nebojsa Brankovic
 */
public class DeleteAutomobil extends AbstractSystemOperation {

    @Override
    protected void preconditions(Object ado) throws Exception {
        if (!(ado instanceof Automobil)) {
            throw new Exception("Objekat nije instanca klase Automobil!");
        }
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        repository.delete((Automobil) ado);
    }
}
