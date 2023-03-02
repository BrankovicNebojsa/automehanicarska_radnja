package so.musterija;

import domain.Musterija;
import java.util.List;
import so.AbstractSystemOperation;

/**
 *
 * @author Nebojsa Brankovic
 */
public class GetMusterije extends AbstractSystemOperation {

    private List<Musterija> musterije;

    @Override
    protected void preconditions(Object ado) throws Exception {
        if (!(ado instanceof Musterija)) {
            throw new Exception("Objekat nije instanca klase Musterija!");
        }
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        this.musterije = repository.getAll((Musterija) ado);
    }

    public List<Musterija> getMusterije() {
        return this.musterije;
    }
}
