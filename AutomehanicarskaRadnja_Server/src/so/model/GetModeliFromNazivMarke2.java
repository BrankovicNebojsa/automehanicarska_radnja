package so.model;

import domain.Model;
import java.util.ArrayList;
import java.util.List;
import so.AbstractSystemOperation;

/**
 *
 * @author Nebojsa Brankovic
 */
public class GetModeliFromNazivMarke2 extends AbstractSystemOperation {

    private List<Model> modeli;

    @Override
    protected void preconditions(Object ado) throws Exception {
        if (!(ado instanceof Model)) {
            throw new Exception("Objekat nije instanca klase Model!");
        }
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        this.modeli = repository.getAllFilter((Model) ado, ((Model) ado).getMarka().getNazivMarke());
    }

    public List<Model> getModeli() {
        return this.modeli;
    }
}
