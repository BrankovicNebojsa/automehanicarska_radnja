package so.radnik;

import domain.Radnik;
import java.util.List;
import so.AbstractSystemOperation;

/**
 *
 * @author Nebojsa Brankovic
 */
public class GetRadnikFromRadnikId extends AbstractSystemOperation {

    private Radnik radnik;

    @Override
    protected void preconditions(Object ado) throws Exception {
        if (!(ado instanceof Radnik)) {
            throw new Exception("Objekat nije instanca klase Radnik!");
        }
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        List<Radnik> radnici = repository.getAll((Radnik) ado);
        for (Radnik radnik : radnici) {
            if (radnik.getRadnikId() == ((Radnik) ado).getRadnikId()) {
                this.radnik = radnik;
            }
        }
    }

    public Radnik getRadnik() {
        return this.radnik;
    }

}
