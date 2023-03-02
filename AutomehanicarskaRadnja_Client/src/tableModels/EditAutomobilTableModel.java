package tableModels;

import controller.Controller;
import domain.Automobil;
import domain.Marka;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Nebojsa Brankovic
 */
public class EditAutomobilTableModel extends AbstractTableModel {

    private List<Automobil> automobili = new ArrayList<>();
    private Controller c;

    public EditAutomobilTableModel(List<Automobil> automobili) {
        this.automobili = automobili;
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
        if (columnIndex == 7) {
            return true;
        }
        return false;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        if (columnIndex == 7) {
            String poslednjiServis = (String) aValue;
            try {
                Date poslednjiServisD = new SimpleDateFormat("yyyy-MM-dd").parse(poslednjiServis);
                automobili.get(rowIndex).setPoslednjiServis((Date) poslednjiServisD);
            } catch (ParseException ex) {
                System.out.println("Greksa pri parsiranju datuma u EditAutomobilTableModel.setValueAt(aValue, rowIndex, columnIndex)");
            }
        }
        c.updateAutomobilPoslednjiServis(automobili.get(rowIndex));
        fireTableDataChanged();

    }

    public List<Automobil> getAutomobili() {
        return automobili;
    }

}
