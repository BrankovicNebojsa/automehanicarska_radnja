package so.radnik;

import domain.Radnik;
import java.util.List;
import so.AbstractSystemOperation;

/**
 *
 * @author Nebojsa Brankovic
 */
public class GetRadniciFilter extends AbstractSystemOperation {

    private List<Radnik> radnici;

    @Override
    protected void preconditions(Object ado) throws Exception {
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        this.radnici = repository.getAllFilter(new Radnik(), (String) ado);
    }

    public List<Radnik> getRadnici() {
        return this.radnici;
    }
}
