package so.automobil;

import domain.Automobil;
import java.util.List;
import so.AbstractSystemOperation;

/**
 *
 * @author Nebojsa Brankovic
 */
public class SaveAutomobili extends AbstractSystemOperation {

    @Override
    protected void preconditions(Object ado) throws Exception {
        List<Automobil> automobili = (List<Automobil>) ado;
        List<Automobil> automobiliIzBaze = repository.getAll(new Automobil());

        for (Automobil automobil : automobili) {
            for (Automobil automobilIzBaze : automobiliIzBaze) {
                if (automobilIzBaze.getRegistracioniBroj().equals(automobil.getRegistracioniBroj())) {
                    throw new Exception("Vec postoji automobil sa tablicama " + automobilIzBaze.getRegistracioniBroj());
                }
            }
        }
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        for (Automobil automobil : (List<Automobil>) ado) {
            repository.save(automobil);
        }
    }
}
