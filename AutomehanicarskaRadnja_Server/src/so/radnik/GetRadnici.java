package so.radnik;

import domain.Radnik;
import java.util.List;
import so.AbstractSystemOperation;

/**
 *
 * @author Nebojsa Brankovic
 */
public class GetRadnici extends AbstractSystemOperation {

    private List<Radnik> radnici;

    @Override
    protected void preconditions(Object ado) throws Exception {
        if (!(ado instanceof Radnik)) {
            throw new Exception("Objekat nije instanca klase Radnik!");
        }
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        this.radnici = repository.getAll((Radnik) ado);
    }

    public List<Radnik> getRadnici() {
        return this.radnici;
    }
}
