
package pis.projekat;
import pis.projekat.baza.Tabele_baza;
import pis.projekat.baza.Manipulacije_podataka;
import pis.projekat.dokumenti.Excel_dokument;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class Prodavnica extends JFrame {
    private DefaultTableModel dm;
    private final String[] opcija = {"Da", "Ne"};
    private int pitanje;
    private int sifra_index;
    private String sifra;
 
    
    public Prodavnica() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        prodavnica_tabela = new javax.swing.JTable();
        prodavnice_btn = new javax.swing.JButton();
        azuriraj_btn = new javax.swing.JButton();
        obrisi_btn = new javax.swing.JButton();
        grad_txt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        telefon_txt = new javax.swing.JTextField();
        adresa_txt = new javax.swing.JTextField();
        vreme_txt = new javax.swing.JTextField();
        dodaj_btn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        sifra_txt = new javax.swing.JTextField();
        excel_btn = new javax.swing.JButton();

        prodavnica_tabela.setAutoCreateRowSorter(true);
        prodavnica_tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Sifra", "Mesto", "Adresa", "Telefon", "Radno vreme"
            }
        ));
        prodavnica_tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prodavnica_tabelaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(prodavnica_tabela);

        prodavnice_btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        prodavnice_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikonice/store.png"))); // NOI18N
        prodavnice_btn.setText("Prodavnice");
        prodavnice_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodavnice_btnActionPerformed(evt);
            }
        });

        azuriraj_btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        azuriraj_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikonice/slika.png"))); // NOI18N
        azuriraj_btn.setText(" Ažuriraj");
        azuriraj_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                azuriraj_btnActionPerformed(evt);
            }
        });

        obrisi_btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        obrisi_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikonice/obrisi.png"))); // NOI18N
        obrisi_btn.setText(" Obriši");
        obrisi_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obrisi_btnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Grad");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Adresa");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Telefon");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Radno vreme");

        dodaj_btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dodaj_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikonice/dodaj.png"))); // NOI18N
        dodaj_btn.setText(" Dodaj");
        dodaj_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodaj_btnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Sifra");

        excel_btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        excel_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikonice/excel.png"))); // NOI18N
        excel_btn.setText("Sačuvaj tabelu");
        excel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excel_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(azuriraj_btn)
                                .addGap(60, 60, 60)
                                .addComponent(obrisi_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(prodavnice_btn)
                                .addGap(44, 44, 44)
                                .addComponent(dodaj_btn))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(excel_btn))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(grad_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefon_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adresa_txt)
                            .addComponent(vreme_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sifra_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sifra_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(grad_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adresa_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefon_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vreme_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(excel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prodavnice_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dodaj_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(obrisi_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(azuriraj_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void uzimanje(){
        dm = new Tabele_baza().Prodavnice();
        prodavnica_tabela.setModel(dm); 
    }


    //Dugme prodavnice
    private void prodavnice_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodavnice_btnActionPerformed
       uzimanje();
    }//GEN-LAST:event_prodavnice_btnActionPerformed

    //Prebacivanje obelezene vrednosti iz tabele u textfield
    private void prodavnica_tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prodavnica_tabelaMouseClicked
        String grad = prodavnica_tabela.getValueAt(prodavnica_tabela.getSelectedRow(), 1).toString();
        String adresa = prodavnica_tabela.getValueAt(prodavnica_tabela.getSelectedRow(), 2).toString();
        String telefon = prodavnica_tabela.getValueAt(prodavnica_tabela.getSelectedRow(), 3).toString();
        String vreme = prodavnica_tabela.getValueAt(prodavnica_tabela.getSelectedRow(), 4).toString();
        grad_txt.setText(grad);
        adresa_txt.setText(adresa);
        telefon_txt.setText(telefon);
        vreme_txt.setText(vreme);
    }//GEN-LAST:event_prodavnica_tabelaMouseClicked
   
    //Brisanje dugme
    private void obrisi_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obrisi_btnActionPerformed
        pitanje = JOptionPane.showOptionDialog(null, "Da li ste sigurni da želite da obrišete polje?", "Pažnja", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcija, opcija[1]);
        if (pitanje == 0) {
            sifra_index = prodavnica_tabela.getSelectedRow();
            sifra = prodavnica_tabela.getValueAt(sifra_index, 0).toString();
            if (new Manipulacije_podataka().obrisi_prodavnicu(sifra)) {
                JOptionPane.showMessageDialog(null, "Uspešno ste obrisali podatak.");
                grad_txt.setText("");
                adresa_txt.setText("");
                telefon_txt.setText("");
                vreme_txt.setText("");
                uzimanje(); }
            else {
                  JOptionPane.showMessageDialog(null, "Došlo je do greške.\nNiste izbrisali podatak.","",JOptionPane.ERROR_MESSAGE);
            } 
        }   
    }//GEN-LAST:event_obrisi_btnActionPerformed
    
    //Dodaj dugme
    private void dodaj_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dodaj_btnActionPerformed
        pitanje = JOptionPane.showOptionDialog(null, "Da li ste sigurni da želite da unesete nove podatke u bazu podataka?", "Pažnja", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcija, opcija[1]);
        if (pitanje == 0) {
            if (new Manipulacije_podataka().dodaj_prodavnicu(sifra_txt.getText(), grad_txt.getText(), adresa_txt.getText(),
                                                             telefon_txt.getText(), vreme_txt.getText())) {
                JOptionPane.showMessageDialog(null, "Uspešno ste uneli podatke.");
                sifra_txt.setText("");
                grad_txt.setText("");
                adresa_txt.setText("");
                telefon_txt.setText("");
                vreme_txt.setText("");
                uzimanje(); }
            else {
                JOptionPane.showMessageDialog(null, "Došlo je do greške.\nNiste uneli podatke.","",JOptionPane.ERROR_MESSAGE);
            } 
        }   
    }//GEN-LAST:event_dodaj_btnActionPerformed
   
    //Azuriraj dugme
    private void azuriraj_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_azuriraj_btnActionPerformed
        pitanje = JOptionPane.showOptionDialog(null, "Da li ste sigurni da želite da ažurirate polje?", "Pažnja", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcija, opcija[1]);
        if (pitanje == 0) {
            sifra_index = prodavnica_tabela.getSelectedRow();
            sifra = prodavnica_tabela.getValueAt(sifra_index, 0).toString();
            if (new Manipulacije_podataka().azuriraj_prodavnicu(sifra,grad_txt.getText(),adresa_txt.getText(),telefon_txt.getText(),vreme_txt.getText())) {
                JOptionPane.showMessageDialog(null, "Uspešno ste ažurirali podatke.");
                grad_txt.setText("");
                adresa_txt.setText("");
                telefon_txt.setText("");
                vreme_txt.setText("");
                uzimanje(); } 
            else {
                JOptionPane.showMessageDialog(null, "Došlo je do greške.\nNiste ažurirali podatke.","",JOptionPane.ERROR_MESSAGE);
            } 
        }
    }//GEN-LAST:event_azuriraj_btnActionPerformed
   

    //Excel dokument
    private void excel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excel_btnActionPerformed
        pitanje = JOptionPane.showOptionDialog(null, "Da li ste sigurni da želite da napravite excel dokument sa spiskom prodavnica iz tabele?\nDokument ćete naći na vašem desktopu pod nazivom Metalac-prodavnice.xls", "Pažnja", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcija, opcija[1]);
        if (pitanje == 0) {
            new Excel_dokument(prodavnica_tabela);   
        }
    }//GEN-LAST:event_excel_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adresa_txt;
    private javax.swing.JButton azuriraj_btn;
    private javax.swing.JButton dodaj_btn;
    private javax.swing.JButton excel_btn;
    private javax.swing.JTextField grad_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton obrisi_btn;
    private javax.swing.JTable prodavnica_tabela;
    private javax.swing.JButton prodavnice_btn;
    private javax.swing.JTextField sifra_txt;
    private javax.swing.JTextField telefon_txt;
    private javax.swing.JTextField vreme_txt;
    // End of variables declaration//GEN-END:variables
}
