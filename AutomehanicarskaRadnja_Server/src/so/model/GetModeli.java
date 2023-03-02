package so.model;

import domain.Model;
import java.util.List;
import so.AbstractSystemOperation;

/**
 *
 * @author Nebojsa Brankovic
 */
public class GetModeli extends AbstractSystemOperation {

    private List<Model> modeli;

    @Override
    protected void preconditions(Object ado) throws Exception {
        if (!(ado instanceof Model)) {
            throw new Exception("Objekat nije instanca klase Model!");
        }
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        modeli = repository.getAll((Model) ado);
    }

    public List<Model> getModeli() {
        return this.modeli;
    }

}
