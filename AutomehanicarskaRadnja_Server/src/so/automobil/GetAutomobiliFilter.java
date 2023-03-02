package so.automobil;

import domain.Automobil;
import java.util.List;
import so.AbstractSystemOperation;

/**
 *
 * @author Nebojsa Brankovic
 */
public class GetAutomobiliFilter extends AbstractSystemOperation {

    private List<Automobil> automobili;

    @Override
    protected void preconditions(Object ado) throws Exception {
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        this.automobili = repository.getAllFilter(new Automobil(), (String) ado);
    }

    public List<Automobil> getAutomobili() {
        return this.automobili;
    }

}
