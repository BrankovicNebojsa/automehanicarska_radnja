package so.musterija;

import domain.Musterija;
import so.AbstractSystemOperation;

/**
 *
 * @author Nebojsa Brankovic
 */
public class DeleteMusterija extends AbstractSystemOperation {

    @Override
    protected void preconditions(Object ado) throws Exception {
        if (!(ado instanceof Musterija)) {
            throw new Exception("Objekat nije instanca klase Musterija!");
        }
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        repository.delete((Musterija) ado);
    }

}
