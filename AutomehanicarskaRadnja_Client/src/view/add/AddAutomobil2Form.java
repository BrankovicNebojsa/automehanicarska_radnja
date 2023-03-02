package view.add;

import controller.Controller;
import domain.Automobil;
import domain.Boja;
import domain.Marka;
import domain.Model;
import domain.Musterija;
import domain.TipMenjaca;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import view.find.FindAutomobilForm;
import view.find.FindVlasnik2Form;

/**
 *
 * @author Nebojsa Brankovic
 */
public class AddAutomobil2Form extends javax.swing.JFrame {

    /**
     * Creates new form AddAutomobilForm
     */
    private Automobil automobil;
    private FindAutomobilForm naf;
    private Controller c;

    public AddAutomobil2Form(FindAutomobilForm naf) {
        initComponents();
        c = new Controller();
        this.automobil = new Automobil();
        this.naf = naf;
        prepareForm();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelRegistracioniBroj = new javax.swing.JLabel();
        jTextFieldRegistracioniBroj = new javax.swing.JTextField();
        jLabelRegistracioniBrojObaveza = new javax.swing.JLabel();
        jLabelGodiste = new javax.swing.JLabel();
        jComboBoxGodista = new javax.swing.JComboBox<>();
        jLabelGodisteObaveza = new javax.swing.JLabel();
        jLabelBrojMotora = new javax.swing.JLabel();
        jTextFieldBrojMotora = new javax.swing.JTextField();
        jLabelBrojMotoraObaveza = new javax.swing.JLabel();
        jLabelBrojSasijeObaveza = new javax.swing.JLabel();
        jLabelBojaObaveza = new javax.swing.JLabel();
        jLabelKubikazaObaveza = new javax.swing.JLabel();
        jLabelTipMenjacaObaveza = new javax.swing.JLabel();
        jTextFieldBrojSasije = new javax.swing.JTextField();
        jLabelBrojSasije = new javax.swing.JLabel();
        jComboBoxBoje = new javax.swing.JComboBox<>();
        jLabelBoja = new javax.swing.JLabel();
        jLabelKubikaza = new javax.swing.JLabel();
        jTextFieldKubikaza = new javax.swing.JTextField();
        jLabelKonjskaSnaga = new javax.swing.JLabel();
        jTextFieldKonjskaSnaga = new javax.swing.JTextField();
        jLabelKonjskaSnagaObaveza = new javax.swing.JLabel();
        jLabelMarkaObaveza = new javax.swing.JLabel();
        jLabelModelObaveza = new javax.swing.JLabel();
        jLabelTipMenjaca = new javax.swing.JLabel();
        jComboBoxTipMenjaca = new javax.swing.JComboBox<>();
        jLabelMarka = new javax.swing.JLabel();
        jComboBoxMarke = new javax.swing.JComboBox<>();
        jLabelModel = new javax.swing.JLabel();
        jComboBoxModeli = new javax.swing.JComboBox<>();
        jTextFieldVlasnik = new javax.swing.JTextField();
        jLabelVlasnik = new javax.swing.JLabel();
        jLabelVlasnikObaveza = new javax.swing.JLabel();
        jButtonNadjiVlasnika = new javax.swing.JButton();
        jButtonZapamti = new javax.swing.JButton();
        jButtonNazad = new javax.swing.JButton();
        jLabelKubikazaZnakovi = new javax.swing.JLabel();
        jLabelRegistracioniBrojPostoji = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Dodavanje automobila");

        jLabelRegistracioniBroj.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelRegistracioniBroj.setText("Registracioni broj");

        jTextFieldRegistracioniBroj.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldRegistracioniBroj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRegistracioniBrojActionPerformed(evt);
            }
        });

        jLabelRegistracioniBrojObaveza.setForeground(new java.awt.Color(255, 0, 0));
        jLabelRegistracioniBrojObaveza.setText("Obavezno polje!");

        jLabelGodiste.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelGodiste.setText("Godiste");

        jComboBoxGodista.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBoxGodista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980" }));

        jLabelGodisteObaveza.setForeground(new java.awt.Color(255, 0, 0));
        jLabelGodisteObaveza.setText("Obavezno polje!");

        jLabelBrojMotora.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelBrojMotora.setText("Broj motora");

        jTextFieldBrojMotora.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabelBrojMotoraObaveza.setForeground(new java.awt.Color(255, 0, 0));
        jLabelBrojMotoraObaveza.setText("Obavezno polje!");

        jLabelBrojSasijeObaveza.setForeground(new java.awt.Color(255, 0, 0));
        jLabelBrojSasijeObaveza.setText("Obavezno polje!");

        jLabelBojaObaveza.setForeground(new java.awt.Color(255, 0, 0));
        jLabelBojaObaveza.setText("Obavezno polje!");

        jLabelKubikazaObaveza.setForeground(new java.awt.Color(255, 0, 0));
        jLabelKubikazaObaveza.setText("Obavezno polje!");

        jLabelTipMenjacaObaveza.setForeground(new java.awt.Color(255, 0, 0));
        jLabelTipMenjacaObaveza.setText("Obavezno polje!");

        jTextFieldBrojSasije.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabelBrojSasije.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelBrojSasije.setText("Broj sasije");

        jComboBoxBoje.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabelBoja.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelBoja.setText("Boja");

        jLabelKubikaza.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelKubikaza.setText("Kubikaza (cc)");

        jTextFieldKubikaza.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabelKonjskaSnaga.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelKonjskaSnaga.setText("Snaga motora (hp)");

        jTextFieldKonjskaSnaga.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabelKonjskaSnagaObaveza.setForeground(new java.awt.Color(255, 0, 0));
        jLabelKonjskaSnagaObaveza.setText("Obavezno polje!");

        jLabelMarkaObaveza.setForeground(new java.awt.Color(255, 0, 0));
        jLabelMarkaObaveza.setText("Obavezno polje!");

        jLabelModelObaveza.setForeground(new java.awt.Color(255, 0, 0));
        jLabelModelObaveza.setText("Obavezno polje!");

        jLabelTipMenjaca.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelTipMenjaca.setText("Tip menjaca");

        jComboBoxTipMenjaca.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabelMarka.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelMarka.setText("Marka");

        jComboBoxMarke.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBoxMarke.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxMarke.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxMarkeItemStateChanged(evt);
            }
        });
        jComboBoxMarke.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jComboBoxMarkePropertyChange(evt);
            }
        });

        jLabelModel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelModel.setText("Model");

        jComboBoxModeli.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jTextFieldVlasnik.setEditable(false);
        jTextFieldVlasnik.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabelVlasnik.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelVlasnik.setText("Vlasnik");

        jLabelVlasnikObaveza.setForeground(new java.awt.Color(255, 0, 0));
        jLabelVlasnikObaveza.setText("Obavezno polje!");

        jButtonNadjiVlasnika.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonNadjiVlasnika.setText("Nadji vlasnika");
        jButtonNadjiVlasnika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNadjiVlasnikaActionPerformed(evt);
            }
        });

        jButtonZapamti.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButtonZapamti.setText("Zapamti");
        jButtonZapamti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZapamtiActionPerformed(evt);
            }
        });

        jButtonNazad.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButtonNazad.setText("Nazad");
        jButtonNazad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNazadActionPerformed(evt);
            }
        });

        jLabelKubikazaZnakovi.setForeground(new java.awt.Color(255, 0, 0));
        jLabelKubikazaZnakovi.setText("Primer unosa: 1998.45");

        jLabelRegistracioniBrojPostoji.setForeground(new java.awt.Color(255, 0, 0));
        jLabelRegistracioniBrojPostoji.setText("Vec postoji automobil sa tom registracijom!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonNazad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonZapamti))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelMarka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelRegistracioniBroj, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jLabelModel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelVlasnik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelGodiste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelModelObaveza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(202, 202, 202))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jComboBoxModeli, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabelMarkaObaveza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jComboBoxMarke, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTextFieldRegistracioniBroj, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabelVlasnikObaveza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabelGodisteObaveza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jComboBoxGodista, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTextFieldVlasnik, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonNadjiVlasnika))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelRegistracioniBrojObaveza)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelRegistracioniBrojPostoji)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelBrojSasije, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelBoja, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelKubikaza, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelKonjskaSnaga, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelTipMenjaca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelBrojMotora, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelTipMenjacaObaveza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxTipMenjaca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelKonjskaSnagaObaveza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldKonjskaSnaga)
                            .addComponent(jTextFieldKubikaza)
                            .addComponent(jLabelBojaObaveza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxBoje, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelBrojSasijeObaveza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldBrojSasije)
                            .addComponent(jLabelBrojMotoraObaveza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelKubikazaObaveza, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jLabelKubikazaZnakovi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jTextFieldBrojMotora))))
                .addGap(96, 96, 96))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldBrojMotora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelBrojMotora))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelBrojMotoraObaveza)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldBrojSasije, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelBrojSasije))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelBrojSasijeObaveza)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxBoje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelBoja))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelBojaObaveza)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldKubikaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelKubikaza))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelKubikazaObaveza)
                            .addComponent(jLabelKubikazaZnakovi))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldKonjskaSnaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelKonjskaSnaga))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelKonjskaSnagaObaveza)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxTipMenjaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTipMenjaca))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTipMenjacaObaveza))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldRegistracioniBroj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelRegistracioniBroj))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelRegistracioniBrojObaveza)
                            .addComponent(jLabelRegistracioniBrojPostoji))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxMarke, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelMarka))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelMarkaObaveza)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxModeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelModel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelModelObaveza)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxGodista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelGodiste))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelGodisteObaveza)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldVlasnik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelVlasnik)
                            .addComponent(jButtonNadjiVlasnika))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelVlasnikObaveza)))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonZapamti)
                    .addComponent(jButtonNazad))
                .addContainerGap(188, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldRegistracioniBrojActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRegistracioniBrojActionPerformed
    }//GEN-LAST:event_jTextFieldRegistracioniBrojActionPerformed

    private void jComboBoxMarkeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxMarkeItemStateChanged
        if (jComboBoxMarke.getSelectedItem() != null) {
            String nazivMarke = jComboBoxMarke.getSelectedItem().toString();
            jComboBoxModeli.setModel(new DefaultComboBoxModel<>(getNaziviModela(nazivMarke)));
        }
    }//GEN-LAST:event_jComboBoxMarkeItemStateChanged

    private void jComboBoxMarkePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jComboBoxMarkePropertyChange
    }//GEN-LAST:event_jComboBoxMarkePropertyChange

    private void jButtonNadjiVlasnikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNadjiVlasnikaActionPerformed
        FindVlasnik2Form nvf = new FindVlasnik2Form(this);
        this.setVisible(false);
        nvf.setVisible(true);
    }//GEN-LAST:event_jButtonNadjiVlasnikaActionPerformed

    private void jButtonNazadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNazadActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButtonNazadActionPerformed

    private void jButtonZapamtiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZapamtiActionPerformed
        if (isDataValid()) {
            this.automobil.setRegistracioniBroj(jTextFieldRegistracioniBroj.getText());
            this.automobil.setModel(new Model(c.getModelId((String) jComboBoxModeli.getSelectedItem()),
                    c.getMarka((String) jComboBoxMarke.getSelectedItem()), (String) jComboBoxModeli.getSelectedItem()));
            this.automobil.setGodiste(Integer.parseInt((String) jComboBoxGodista.getSelectedItem()));
            this.automobil.setBrojMotora(jTextFieldBrojMotora.getText());
            this.automobil.setBrojSasije(jTextFieldBrojSasije.getText());
            this.automobil.setBoja((Boja) jComboBoxBoje.getSelectedItem());
            this.automobil.setKubikaza(Double.parseDouble(jTextFieldKubikaza.getText()));
            this.automobil.setKonjskaSnaga(Integer.parseInt(jTextFieldKonjskaSnaga.getText()));
            this.automobil.setMenjac((TipMenjaca) jComboBoxTipMenjaca.getSelectedItem());
            if (c.saveAutomobil(this.automobil)) {
                JOptionPane.showMessageDialog(this, "Uspesno dodat novi automobil: " + this.automobil.getRegistracioniBroj());
                naf.populateTable();
                naf.setVisible(true);
                this.setVisible(false);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Greska pri unosu automobila");
            }
        }
    }//GEN-LAST:event_jButtonZapamtiActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(AddAutomobil2Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AddAutomobil2Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AddAutomobil2Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AddAutomobil2Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AddAutomobil2Form().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonNadjiVlasnika;
    private javax.swing.JButton jButtonNazad;
    private javax.swing.JButton jButtonZapamti;
    private javax.swing.JComboBox<Boja> jComboBoxBoje;
    private javax.swing.JComboBox<String> jComboBoxGodista;
    private javax.swing.JComboBox<String> jComboBoxMarke;
    private javax.swing.JComboBox<String> jComboBoxModeli;
    private javax.swing.JComboBox<TipMenjaca> jComboBoxTipMenjaca;
    private javax.swing.JLabel jLabelBoja;
    private javax.swing.JLabel jLabelBojaObaveza;
    private javax.swing.JLabel jLabelBrojMotora;
    private javax.swing.JLabel jLabelBrojMotoraObaveza;
    private javax.swing.JLabel jLabelBrojSasije;
    private javax.swing.JLabel jLabelBrojSasijeObaveza;
    private javax.swing.JLabel jLabelGodiste;
    private javax.swing.JLabel jLabelGodisteObaveza;
    private javax.swing.JLabel jLabelKonjskaSnaga;
    private javax.swing.JLabel jLabelKonjskaSnagaObaveza;
    private javax.swing.JLabel jLabelKubikaza;
    private javax.swing.JLabel jLabelKubikazaObaveza;
    private javax.swing.JLabel jLabelKubikazaZnakovi;
    private javax.swing.JLabel jLabelMarka;
    private javax.swing.JLabel jLabelMarkaObaveza;
    private javax.swing.JLabel jLabelModel;
    private javax.swing.JLabel jLabelModelObaveza;
    private javax.swing.JLabel jLabelRegistracioniBroj;
    private javax.swing.JLabel jLabelRegistracioniBrojObaveza;
    private javax.swing.JLabel jLabelRegistracioniBrojPostoji;
    private javax.swing.JLabel jLabelTipMenjaca;
    private javax.swing.JLabel jLabelTipMenjacaObaveza;
    private javax.swing.JLabel jLabelVlasnik;
    private javax.swing.JLabel jLabelVlasnikObaveza;
    private javax.swing.JTextField jTextFieldBrojMotora;
    private javax.swing.JTextField jTextFieldBrojSasije;
    private javax.swing.JTextField jTextFieldKonjskaSnaga;
    private javax.swing.JTextField jTextFieldKubikaza;
    private javax.swing.JTextField jTextFieldRegistracioniBroj;
    private javax.swing.JTextField jTextFieldVlasnik;
    // End of variables declaration//GEN-END:variables

    private void prepareForm() {
        jLabelBojaObaveza.setVisible(false);
        jLabelBrojMotoraObaveza.setVisible(false);
        jLabelBrojSasijeObaveza.setVisible(false);
        jLabelGodisteObaveza.setVisible(false);
        jLabelKonjskaSnagaObaveza.setVisible(false);
        jLabelKubikazaObaveza.setVisible(false);
        jLabelMarkaObaveza.setVisible(false);
        jLabelModelObaveza.setVisible(false);
        jLabelRegistracioniBrojObaveza.setVisible(false);
        jLabelTipMenjacaObaveza.setVisible(false);
        jLabelVlasnikObaveza.setVisible(false);
        jLabelKubikazaZnakovi.setVisible(false);
        jLabelRegistracioniBrojPostoji.setVisible(false);

        jComboBoxBoje.setModel(new DefaultComboBoxModel<>(Boja.values()));
        jComboBoxBoje.setSelectedItem(null);
        jComboBoxGodista.setSelectedItem(null);
        jComboBoxMarke.setModel(new DefaultComboBoxModel<>(getNaziviMarka()));
        jComboBoxMarke.setSelectedItem(null);
        jComboBoxTipMenjaca.setModel(new DefaultComboBoxModel<>(TipMenjaca.values()));
        jComboBoxTipMenjaca.setSelectedItem(null);
        jComboBoxModeli.setSelectedItem(null);

    }

    private String[] getNaziviMarka() {
        List<Marka> marke = c.getMarke();
        String[] naziviMarke = new String[marke.size()];
        int i = 0;
        for (Marka marka : marke) {
            naziviMarke[i] = marka.getNazivMarke();
            i++;
        }
        return naziviMarke;
    }

    private String[] getNaziviModela(String nazivMarke) {
        List<Model> modeli = c.getModeli(nazivMarke);
        String[] naziviModela = new String[modeli.size()];
        int i = 0;
        for (Model model : modeli) {
            naziviModela[i] = model.getNazivModela();
            i++;
        }
        return naziviModela;
    }

    public void setVlasnik(Musterija musterija) {
        String imeIPrezime = musterija.getImeMusterije() + " " + musterija.getPrezimeMusterije();
        jTextFieldVlasnik.setText(imeIPrezime);
        this.automobil.setMusterija(musterija);
    }

    private boolean isDataValid() {
        if (jTextFieldRegistracioniBroj == null || jTextFieldRegistracioniBroj.getText().equals("")) {
            jLabelRegistracioniBrojObaveza.setVisible(true);
            return false;
        } else {
            jLabelRegistracioniBrojObaveza.setVisible(false);
        }
        Automobil a = new Automobil();
        a.setRegistracioniBroj(jTextFieldRegistracioniBroj.getText());
        if (c.automobilExists(a)) {
            jLabelRegistracioniBrojPostoji.setVisible(true);
            return false;
        } else {
            jLabelRegistracioniBrojPostoji.setVisible(false);
        }
        if (jComboBoxMarke == null || jComboBoxMarke.getSelectedItem() == null) {
            jLabelMarkaObaveza.setVisible(true);
            return false;
        } else {
            jLabelMarkaObaveza.setVisible(false);
        }
        if (jComboBoxModeli == null || jComboBoxModeli.getSelectedItem() == null) {
            jLabelModelObaveza.setVisible(true);
            return false;
        } else {
            jLabelModelObaveza.setVisible(false);
        }
        if (jComboBoxGodista == null || jComboBoxGodista.getSelectedItem() == null) {
            jLabelGodisteObaveza.setVisible(true);
            return false;
        } else {
            jLabelGodisteObaveza.setVisible(false);
        }
        if (jTextFieldVlasnik == null || jTextFieldVlasnik.getText().equals("")) {
            jLabelVlasnikObaveza.setVisible(true);
            return false;
        } else {
            jLabelVlasnikObaveza.setVisible(false);
        }
        if (jTextFieldBrojMotora == null || jTextFieldBrojMotora.getText().equals("")) {
            jLabelBrojMotoraObaveza.setVisible(true);
            return false;
        } else {
            jLabelBrojMotoraObaveza.setVisible(false);
        }
        if (jTextFieldBrojSasije == null || jTextFieldBrojSasije.getText().equals("")) {
            jLabelBrojSasijeObaveza.setVisible(true);
            return false;
        } else {
            jLabelBrojSasijeObaveza.setVisible(false);
        }
        if (jComboBoxBoje == null || jComboBoxBoje.getSelectedItem() == null) {
            jLabelBojaObaveza.setVisible(true);
            return false;
        } else {
            jLabelBojaObaveza.setVisible(false);
        }
        if (jTextFieldKubikaza == null || jTextFieldKubikaza.getText().equals("")) {
            jLabelKubikazaObaveza.setVisible(true);
            return false;
        } else {
            jLabelKubikazaObaveza.setVisible(false);
        }
        if (!isOk()) {
            jLabelKubikazaZnakovi.setVisible(true);
            return false;
        }
        if (jTextFieldKonjskaSnaga == null || jTextFieldKonjskaSnaga.getText().equals("")) {
            jLabelKonjskaSnagaObaveza.setVisible(true);
            return false;
        } else {
            jLabelKonjskaSnagaObaveza.setVisible(false);
        }
        if (jComboBoxTipMenjaca == null || jComboBoxTipMenjaca.getSelectedItem() == null) {
            jLabelTipMenjacaObaveza.setVisible(true);
            return false;
        } else {
            jLabelTipMenjacaObaveza.setVisible(false);
        }

        return true;
    }

    public boolean isOk() {
        char[] znakovi = new char[]{'a', 'A', 'b', 'B', 'c', 'C', 'd', 'D', 'e', 'E', 'f', 'F', 'g', 'G', 'h', 'H', 'i', 'I', 'g', 'G',
            'k', 'K', 'l', 'L', 'm', 'M', 'n', 'N', 'o', 'O', 'p', 'P', 'q', 'Q', 'r', 'R', 's', 'S', 't', 'T', 'u', 'U', 'v', 'V', 'w', 'W',
            'x', 'X', 'y', 'Y', 'z', 'Z', '-', '_', '+', '=', ',', '<', '>', '/', '?', '"', '\\', '\'', '|', ':', ';', '[', '{', '}', ']',
            '!', '~', '`', '@', '#', '$', '%', '^', '&', '*', '(', ')'};
        char[] unos = jTextFieldKubikaza.getText().toCharArray();
        for (int i = 0; i < unos.length; i++) {
            for (int j = 0; j < znakovi.length; j++) {
                if (unos[i] == znakovi[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
