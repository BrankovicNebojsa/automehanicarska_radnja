package so.marka;

import domain.Marka;
import domain.Model;
import java.util.List;
import so.AbstractSystemOperation;

/**
 *
 * @author Nebojsa Brankovic
 */
public class SaveMarka extends AbstractSystemOperation {

    @Override
    protected void preconditions(Object ado) throws Exception {
        if (!(ado instanceof Marka)) {
            System.out.println("Objekat nije instanca klase Marka!");
        }

        List<Marka> marke = repository.getAll(ado);

        for (Marka marka : marke) {
            if (marka.getNazivMarke().equals(((Marka) ado).getNazivMarke())) {
                throw new Exception("Vec postoji marka sa unetim nazivom");
            }
        }

        List<Model> modeliIzBaze = repository.getAll(new Model());
        List<Model> modeli = ((Marka) ado).getModeli();

        for (Model modelIzBaze : modeliIzBaze) {
            for (Model model : modeli) {
                if (model.getNazivModela().equals(modelIzBaze.getNazivModela())
                        && model.getMarka().getNazivMarke().equals(modelIzBaze.getMarka().getNazivMarke())) {
                    throw new Exception("Vec postoji model sa unetim nazivom");
                }
            }
        }
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        repository.save(ado);
        List<Marka> marke = repository.getAll(ado);
        int markaId = -1;

        for (Marka marka : marke) {
            if (marka.getNazivMarke().equals(((Marka) ado).getNazivMarke())) {
                markaId = marka.getMarkaId();
            }
        }

        List<Model> modeli = ((Marka) ado).getModeli();
        for (Model model : modeli) {
            model.getMarka().setMarkaId(markaId);
            repository.save(model);
        }
    }

}
