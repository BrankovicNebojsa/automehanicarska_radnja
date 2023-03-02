package so.model;

import domain.Model;
import java.util.ArrayList;
import java.util.List;
import so.AbstractSystemOperation;

/**
 *
 * @author Nebojsa Brankovic
 */
public class GetModeliFromNazivMarke extends AbstractSystemOperation {

    private List<Model> modeli;

    @Override
    protected void preconditions(Object ado) throws Exception {
        if (!(ado instanceof Model)) {
            throw new Exception("Objekat nije instanca klase Model!");
        }
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        List<Model> modeli1 = repository.getAll((Model) ado);
        this.modeli = new ArrayList<>();
        for (Model model : modeli1) {
            if (model.getMarka().getNazivMarke().equals(((Model) ado).getMarka().getNazivMarke())) {
                this.modeli.add(model);
            }
        }
    }

    public List<Model> getModeli() {
        return this.modeli;
    }
}
