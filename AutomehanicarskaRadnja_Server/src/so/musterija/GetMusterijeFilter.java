package so.musterija;

import domain.Musterija;
import java.util.List;
import so.AbstractSystemOperation;

/**
 *
 * @author Nebojsa Brankovic
 */
public class GetMusterijeFilter extends AbstractSystemOperation {

    private List<Musterija> musterije;

    @Override
    protected void preconditions(Object ado) throws Exception {
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        this.musterije = repository.getAllFilter(new Musterija(), (String) ado);
    }

    public List<Musterija> getMusterije() {
        return this.musterije;
    }
}
