package so.automobil;

import domain.Automobil;
import java.util.List;
import so.AbstractSystemOperation;

/**
 *
 * @author Nebojsa Brankovic
 */
public class GetAutomobili extends AbstractSystemOperation {

    private List<Automobil> automobili;

    @Override
    protected void preconditions(Object ado) throws Exception {
        if (!(ado instanceof Automobil)) {
            throw new Exception("Objekat nije instanca klase Automobil!");
        }
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        this.automobili = repository.getAll((Automobil) ado);
    }

    public List<Automobil> getAutomobili() {
        return this.automobili;
    }
}
