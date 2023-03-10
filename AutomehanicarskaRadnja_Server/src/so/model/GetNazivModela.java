package so.model;

import domain.Model;
import java.util.List;
import so.AbstractSystemOperation;

/**
 *
 * @author Nebojsa Brankovic
 */
public class GetNazivModela extends AbstractSystemOperation {

    private String nazivModela;

    @Override
    protected void preconditions(Object ado) throws Exception {
        if (!(ado instanceof Model)) {
            throw new Exception("Objekat nije instanca klase Model!");
        }
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        List<Model> modeli = repository.getAll((Model) ado);
        for (Model model : modeli) {
            if (model.getModelId() == ((Model) ado).getModelId()) {
                this.nazivModela = model.getNazivModela();
            }
        }
    }

    public String getNazivModela() {
        return this.nazivModela;
    }
}
