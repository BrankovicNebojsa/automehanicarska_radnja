package so.musterija;

import domain.Musterija;
import java.util.List;
import so.AbstractSystemOperation;

/**
 *
 * @author Nebojsa Brankovic
 */
public class SaveMusterije extends AbstractSystemOperation {

    @Override
    protected void preconditions(Object ado) throws Exception {

        List<Musterija> musterije = (List<Musterija>) ado;
        List<Musterija> musterijeIzBaze = repository.getAll(new Musterija());

        for (Musterija musterija : musterije) {
            for (Musterija musterijaIzBaze : musterijeIzBaze) {
                if (musterija.getImeMusterije().equals(musterijaIzBaze.getImeMusterije())
                        && musterija.getPrezimeMusterije().equals(musterijaIzBaze.getPrezimeMusterije())
                        && musterija.getMailMusterije().equals(musterijaIzBaze.getMailMusterije())
                        && musterija.getTelefonMusterije().equals(musterijaIzBaze.getTelefonMusterije())) {
                    throw new Exception("Vec postoji musterija sa unetim vrednostima");
                }
            }
        }
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        for (Musterija musterija : (List<Musterija>) ado) {
            repository.save(musterija);
        }
    }
}
