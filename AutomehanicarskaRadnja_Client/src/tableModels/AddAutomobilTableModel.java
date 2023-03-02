package tableModels;

import controller.Controller;
import domain.Automobil;
import domain.Marka;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Nebojsa Brankovic
 */
public class AddAutomobilTableModel extends AbstractTableModel {

    private List<Automobil> automobili = new ArrayList<>();
    private Controller c;

    public AddAutomobilTableModel() {
        c = new Controller();
    }

    @Override
    public int getRowCount() {
        return automobili.size();
    }

    @Override
    public int getColumnCount() {
        return 8;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return automobili.get(rowIndex).getRegistracioniBroj();
            case 1:
                Marka m = new Marka();
                m.setMarkaId(automobili.get(rowIndex).getModel().getMarka().getMarkaId());
                return c.getNazivMarke(m);
            case 2:
                return automobili.get(rowIndex).getModel().getNazivModela();
            case 3:
                return automobili.get(rowIndex).getGodiste();
            case 4:
                return automobili.get(rowIndex).getKubikaza();
            case 5:
                return automobili.get(rowIndex).getKonjskaSnaga();
            case 6:
                return automobili.get(rowIndex).getMusterija().getImeMusterije() + " "
                        + automobili.get(rowIndex).getMusterija().getPrezimeMusterije();
            case 7:
                if (automobili.get(rowIndex).getPoslednjiServis() != null) {
                    String poslednjiServis = new SimpleDateFormat("yyyy-MM-dd").format(automobili.get(rowIndex).getPoslednjiServis());
                    return poslednjiServis;
                } else {
                    return "N/A";
                }
            default:
                return "N/A";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Registracioni broj";
            case 1:
                return "Marka";
            case 2:
                return "Model";
            case 3:
                return "Godiste";
            case 4:
                return "Kubikaza";
            case 5:
                return "Konjska snaga";
            case 6:
                return "Vlasnik";
            case 7:
                return "Poslednji servis";
            default:
                return "N/A";
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    public List<Automobil> getAutomobili() {
        return automobili;
    }

    public void addAutomobil(Automobil automobil) {
        automobili.add(automobil);
        fireTableDataChanged();
    }
}
