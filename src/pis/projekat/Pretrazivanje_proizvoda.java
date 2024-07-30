
package pis.projekat;
import pis.projekat.baza.Upiti_baza;
import pis.projekat.baza.Combox_podaci;
import pis.projekat.baza.Tabele_baza;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;



public class Pretrazivanje_proizvoda extends JFrame {
    private DefaultTableModel dm;
    private String cena_od, cena_do, tip_proizvoda, adresa, grad, naziv, tip;
    private int tip_index, adresa_index, grad_index;
    private ImageIcon slika_baza;
    private Image slika; 
    
    
    public Pretrazivanje_proizvoda() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        
        //Dobijanje podataka za Tip poizvoda
        new Combox_podaci(tip_combo, 1, "SELECT DISTINCT Tip_proizvoda FROM proizvodi ORDER BY Tip_proizvoda ASC");
        
        //Dobijanje podataka za Adresu
        new Combox_podaci(adresa_combo, 1, "SELECT DISTINCT Adresa_prodajnog_mesta FROM prodajno_mesto ORDER BY Adresa_prodajnog_mesta");
        
        //Dobijanje podataka za Grad
        new Combox_podaci(grad_combo, 1, "SELECT DISTINCT Grad FROM prodajno_mesto ORDER BY Grad");
    }
    
    
     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        svi_proizvodi_btn = new javax.swing.JButton();
        tip_combo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        proizvodi_tabela = new javax.swing.JTable();
        obrisi_pretragu_btn = new javax.swing.JButton();
        adresa_combo = new javax.swing.JComboBox<>();
        grad_combo = new javax.swing.JComboBox<>();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        slika_proizvoda = new javax.swing.JLabel();
        naziv_proizvoda_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tip_txt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cena_od_txt = new javax.swing.JTextField();
        cena_do_txt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        pretraga_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        svi_proizvodi_btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        svi_proizvodi_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikonice/prikazi.png"))); // NOI18N
        svi_proizvodi_btn.setText(" Prikaži sve proizvode");
        svi_proizvodi_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                svi_proizvodi_btnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("                  Elektronski pretraživač proizvoda");

        proizvodi_tabela.setAutoCreateRowSorter(true);
        proizvodi_tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Tip proizvoda", "Naziv proizvoda", "Mesto", "Adresa", "Telefon", "Radno vreme", "Količina", "Cena"
            }
        ));
        proizvodi_tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                proizvodi_tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(proizvodi_tabela);

        obrisi_pretragu_btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        obrisi_pretragu_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikonice/obrisi.png"))); // NOI18N
        obrisi_pretragu_btn.setText(" Obriši pretragu");
        obrisi_pretragu_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obrisi_pretragu_btnActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(slika_proizvoda, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(slika_proizvoda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(slika_proizvoda, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        naziv_proizvoda_txt.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Tip proizvoda");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Naziv proizvoda");

        tip_txt.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Izaberite grad prodajnog mesta");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Izaberite adresu prodajnog mesta");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Izaberite tip proizvoda");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Unesite opseg cene");

        cena_od_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cena_od_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cena_od_txtKeyTyped(evt);
            }
        });

        cena_do_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cena_do_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cena_do_txtKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Od");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("do");

        pretraga_btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pretraga_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikonice/search.png"))); // NOI18N
        pretraga_btn.setText(" Pretraži");
        pretraga_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pretraga_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(tip_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(207, 207, 207)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(adresa_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(100, 100, 100)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cena_od_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(67, 67, 67)
                                                .addComponent(jLabel10)
                                                .addGap(18, 18, 18)
                                                .addComponent(cena_do_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(grad_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pretraga_btn)
                                        .addGap(126, 126, 126))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(301, 301, 301)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(svi_proizvodi_btn)
                        .addGap(114, 114, 114)
                        .addComponent(obrisi_pretragu_btn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(tip_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(naziv_proizvoda_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tip_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adresa_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(cena_od_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(cena_do_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(grad_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(pretraga_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tip_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(naziv_proizvoda_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(svi_proizvodi_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(obrisi_pretragu_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jDesktopPane1)
                        .addGap(140, 140, 140))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Dugme Prikazi sve proizvode
    private void svi_proizvodi_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_svi_proizvodi_btnActionPerformed
        proizvodi_tabela.setModel(new Tabele_baza().Tabele(
        "SELECT r.Tip_proizvoda, r.Naziv_proizvoda, p.Grad, p.Adresa_prodajnog_mesta, p.Kontakt_prodavnice, p.Radno_vreme, m.Raspoloziva_kolicina, r.Cena_proizvoda " +
        "FROM magacin m " +
        "INNER JOIN prodajno_mesto p ON m.sifra_prodajnog_mesta = p.sifra_prodajnog_mesta " +
        "INNER JOIN proizvodi r ON m.sifra_proizvoda = r.sifra_proizvoda "+
        "ORDER BY Tip_proizvoda"));
    }//GEN-LAST:event_svi_proizvodi_btnActionPerformed
        
    //Dugme Obrisi pretragu
    private void obrisi_pretragu_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obrisi_pretragu_btnActionPerformed
       proizvodi_tabela.setModel(new Tabele_baza().Tabele());
       tip_combo.setSelectedIndex(0);
       adresa_combo.setSelectedIndex(0);
       grad_combo.setSelectedIndex(0);
       cena_od_txt.setText("");
       cena_do_txt.setText("");
       tip_txt.setText("");
       naziv_proizvoda_txt.setText("");
       slika_proizvoda.setIcon(null);
    }//GEN-LAST:event_obrisi_pretragu_btnActionPerformed
   
  
    //!!!!!!!!!!!!!!DUGME ZA PRETRAZIVANJE!!!!!!!!!!!!!!!!!!!!
    private void pretraga_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pretraga_btnActionPerformed
        tip_index = tip_combo.getSelectedIndex();
        adresa_index = adresa_combo.getSelectedIndex();
        grad_index = grad_combo.getSelectedIndex();
        tip_proizvoda = tip_combo.getSelectedItem().toString();
        adresa = adresa_combo.getSelectedItem().toString();
        grad = grad_combo.getSelectedItem().toString();
        cena_od = cena_od_txt.getText();
        cena_do = cena_do_txt.getText();
    
        if(cena_od.isEmpty() && cena_do.isEmpty() && tip_index<2 && adresa_index<2 && grad_index<2) {
            proizvodi_tabela.setModel(new Tabele_baza().Tabele());
        } 
        else if(cena_od.isEmpty() && cena_do.isEmpty() && adresa_index<2 && grad_index<2) {
            dm = new Tabele_baza().Tabele("SELECT r.Tip_proizvoda,r.Naziv_proizvoda,p.Grad,p.Adresa_prodajnog_mesta,p.Kontakt_prodavnice,p.Radno_vreme,m.Raspoloziva_kolicina,r.Cena_proizvoda FROM magacin m INNER JOIN prodajno_mesto p ON m.sifra_prodajnog_mesta=p.sifra_prodajnog_mesta INNER JOIN proizvodi r ON m.sifra_proizvoda=r.sifra_proizvoda WHERE (Tip_proizvoda='"+tip_proizvoda+"') ORDER BY Tip_proizvoda");
            proizvodi_tabela.setModel(dm);
        }
        else if(cena_od.isEmpty() && cena_do.isEmpty() && tip_index<2 && grad_index<2) {
            dm = new Tabele_baza().Tabele("SELECT r.Tip_proizvoda,r.Naziv_proizvoda,p.Grad,p.Adresa_prodajnog_mesta,p.Kontakt_prodavnice,p.Radno_vreme,m.Raspoloziva_kolicina,r.Cena_proizvoda FROM magacin m INNER JOIN prodajno_mesto p ON m.sifra_prodajnog_mesta=p.sifra_prodajnog_mesta INNER JOIN proizvodi r ON m.sifra_proizvoda=r.sifra_proizvoda WHERE (Adresa_prodajnog_mesta='"+adresa+"') ORDER BY Tip_proizvoda");
            proizvodi_tabela.setModel(dm);
        }
        else if(tip_index<2 && adresa_index<2 && grad_index<2) {
            dm = new Tabele_baza().Tabele("SELECT r.Tip_proizvoda,r.Naziv_proizvoda,p.Grad,p.Adresa_prodajnog_mesta,p.Kontakt_prodavnice,p.Radno_vreme,m.Raspoloziva_kolicina,r.Cena_proizvoda FROM magacin m INNER JOIN prodajno_mesto p ON m.sifra_prodajnog_mesta=p.sifra_prodajnog_mesta INNER JOIN proizvodi r ON m.sifra_proizvoda=r.sifra_proizvoda WHERE (Cena_proizvoda BETWEEN "+cena_od+" AND "+cena_do+") ORDER BY Tip_proizvoda");
            proizvodi_tabela.setModel(dm);
        }
        else if(cena_od.isEmpty() && cena_do.isEmpty() && tip_index<2 && adresa_index<2) {
            dm = new Tabele_baza().Tabele("SELECT r.Tip_proizvoda,r.Naziv_proizvoda,p.Grad,p.Adresa_prodajnog_mesta,p.Kontakt_prodavnice,p.Radno_vreme,m.Raspoloziva_kolicina,r.Cena_proizvoda FROM magacin m INNER JOIN prodajno_mesto p ON m.sifra_prodajnog_mesta=p.sifra_prodajnog_mesta INNER JOIN proizvodi r ON m.sifra_proizvoda=r.sifra_proizvoda WHERE (Grad='"+grad+"') ORDER BY Tip_proizvoda");
            proizvodi_tabela.setModel(dm);
        }
        else if(cena_od.isEmpty() && cena_do.isEmpty() && grad_index<2) {
            dm = new Tabele_baza().Tabele("SELECT r.Tip_proizvoda,r.Naziv_proizvoda,p.Grad,p.Adresa_prodajnog_mesta,p.Kontakt_prodavnice,p.Radno_vreme,m.Raspoloziva_kolicina,r.Cena_proizvoda FROM magacin m INNER JOIN prodajno_mesto p ON m.sifra_prodajnog_mesta=p.sifra_prodajnog_mesta INNER JOIN proizvodi r ON m.sifra_proizvoda=r.sifra_proizvoda WHERE (Tip_proizvoda='"+tip_proizvoda+"')AND(Adresa_prodajnog_mesta='"+adresa+"') ORDER BY Tip_proizvoda");
            proizvodi_tabela.setModel(dm);
        }
        else if(tip_index<2 && adresa_index<2) {
            dm = new Tabele_baza().Tabele("SELECT r.Tip_proizvoda,r.Naziv_proizvoda,p.Grad,p.Adresa_prodajnog_mesta,p.Kontakt_prodavnice,p.Radno_vreme,m.Raspoloziva_kolicina,r.Cena_proizvoda FROM magacin m INNER JOIN prodajno_mesto p ON m.sifra_prodajnog_mesta=p.sifra_prodajnog_mesta INNER JOIN proizvodi r ON m.sifra_proizvoda=r.sifra_proizvoda WHERE (Cena_proizvoda BETWEEN "+cena_od+" AND "+cena_do+")AND(Grad='"+grad+"') ORDER BY Tip_proizvoda");
            proizvodi_tabela.setModel(dm);
        }
        else if(cena_od.isEmpty() && cena_do.isEmpty() && adresa_index<2) {
            dm = new Tabele_baza().Tabele("SELECT r.Tip_proizvoda,r.Naziv_proizvoda,p.Grad,p.Adresa_prodajnog_mesta,p.Kontakt_prodavnice,p.Radno_vreme,m.Raspoloziva_kolicina,r.Cena_proizvoda FROM magacin m INNER JOIN prodajno_mesto p ON m.sifra_prodajnog_mesta=p.sifra_prodajnog_mesta INNER JOIN proizvodi r ON m.sifra_proizvoda=r.sifra_proizvoda WHERE (Tip_proizvoda='"+tip_proizvoda+"')AND(Grad='"+grad+"') ORDER BY Tip_proizvoda");
            proizvodi_tabela.setModel(dm);
        }
        else if(tip_index<2 && grad_index<2){
            dm = new Tabele_baza().Tabele("SELECT r.Tip_proizvoda,r.Naziv_proizvoda,p.Grad,p.Adresa_prodajnog_mesta,p.Kontakt_prodavnice,p.Radno_vreme,m.Raspoloziva_kolicina,r.Cena_proizvoda FROM magacin m INNER JOIN prodajno_mesto p ON m.sifra_prodajnog_mesta=p.sifra_prodajnog_mesta INNER JOIN proizvodi r ON m.sifra_proizvoda=r.sifra_proizvoda WHERE (Cena_proizvoda BETWEEN "+cena_od+" AND "+cena_do+")AND(Adresa_prodajnog_mesta='"+adresa+"') ORDER BY Tip_proizvoda");
            proizvodi_tabela.setModel(dm);
        }
        else if(cena_od.isEmpty() && cena_do.isEmpty()&& tip_index<2){
            dm = new Tabele_baza().Tabele("SELECT r.Tip_proizvoda,r.Naziv_proizvoda,p.Grad,p.Adresa_prodajnog_mesta,p.Kontakt_prodavnice,p.Radno_vreme,m.Raspoloziva_kolicina,r.Cena_proizvoda FROM magacin m INNER JOIN prodajno_mesto p ON m.sifra_prodajnog_mesta=p.sifra_prodajnog_mesta INNER JOIN proizvodi r ON m.sifra_proizvoda=r.sifra_proizvoda WHERE (Adresa_prodajnog_mesta='"+adresa+"')AND(Grad='"+grad+"') ORDER BY Tip_proizvoda");
            proizvodi_tabela.setModel(dm);
        }
        else if(adresa_index<2 && grad_index<2){
            dm = new Tabele_baza().Tabele("SELECT r.Tip_proizvoda,r.Naziv_proizvoda,p.Grad,p.Adresa_prodajnog_mesta,p.Kontakt_prodavnice,p.Radno_vreme,m.Raspoloziva_kolicina,r.Cena_proizvoda FROM magacin m INNER JOIN prodajno_mesto p ON m.sifra_prodajnog_mesta=p.sifra_prodajnog_mesta INNER JOIN proizvodi r ON m.sifra_proizvoda=r.sifra_proizvoda WHERE (Cena_proizvoda BETWEEN "+cena_od+" AND "+cena_do+")AND(Tip_proizvoda='"+tip_proizvoda+"') ORDER BY Tip_proizvoda");
            proizvodi_tabela.setModel(dm);
        }
        else if(cena_od.isEmpty() && cena_do.isEmpty()){
            dm = new Tabele_baza().Tabele("SELECT r.Tip_proizvoda,r.Naziv_proizvoda,p.Grad,p.Adresa_prodajnog_mesta,p.Kontakt_prodavnice,p.Radno_vreme,m.Raspoloziva_kolicina,r.Cena_proizvoda FROM magacin m INNER JOIN prodajno_mesto p ON m.sifra_prodajnog_mesta=p.sifra_prodajnog_mesta INNER JOIN proizvodi r ON m.sifra_proizvoda=r.sifra_proizvoda WHERE (Tip_proizvoda='"+tip_proizvoda+"')AND(Adresa_prodajnog_mesta='"+adresa+"')AND(Grad='"+grad+"') ORDER BY Tip_proizvoda");
            proizvodi_tabela.setModel(dm);
        }
        else if(grad_index<2){
            dm = new Tabele_baza().Tabele("SELECT r.Tip_proizvoda,r.Naziv_proizvoda,p.Grad,p.Adresa_prodajnog_mesta,p.Kontakt_prodavnice,p.Radno_vreme,m.Raspoloziva_kolicina,r.Cena_proizvoda FROM magacin m INNER JOIN prodajno_mesto p ON m.sifra_prodajnog_mesta=p.sifra_prodajnog_mesta INNER JOIN proizvodi r ON m.sifra_proizvoda=r.sifra_proizvoda WHERE (Cena_proizvoda BETWEEN "+cena_od+" AND "+cena_do+")AND(Tip_proizvoda='"+tip_proizvoda+"')AND(Adresa_prodajnog_mesta='"+adresa+"') ORDER BY Tip_proizvoda");
            proizvodi_tabela.setModel(dm);
        }
        else if(adresa_index<2){
            dm = new Tabele_baza().Tabele("SELECT r.Tip_proizvoda,r.Naziv_proizvoda,p.Grad,p.Adresa_prodajnog_mesta,p.Kontakt_prodavnice,p.Radno_vreme,m.Raspoloziva_kolicina,r.Cena_proizvoda FROM magacin m INNER JOIN prodajno_mesto p ON m.sifra_prodajnog_mesta=p.sifra_prodajnog_mesta INNER JOIN proizvodi r ON m.sifra_proizvoda=r.sifra_proizvoda WHERE (Cena_proizvoda BETWEEN "+cena_od+" AND "+cena_do+")AND(Tip_proizvoda='"+tip_proizvoda+"')AND(Grad='"+grad+"') ORDER BY Tip_proizvoda");
            proizvodi_tabela.setModel(dm);
        }
        else if(tip_index<2){
            dm = new Tabele_baza().Tabele("SELECT r.Tip_proizvoda,r.Naziv_proizvoda,p.Grad,p.Adresa_prodajnog_mesta,p.Kontakt_prodavnice,p.Radno_vreme,m.Raspoloziva_kolicina,r.Cena_proizvoda FROM magacin m INNER JOIN prodajno_mesto p ON m.sifra_prodajnog_mesta=p.sifra_prodajnog_mesta INNER JOIN proizvodi r ON m.sifra_proizvoda=r.sifra_proizvoda WHERE (Cena_proizvoda BETWEEN "+cena_od+" AND "+cena_do+")AND(Adresa_prodajnog_mesta='"+adresa+"')AND(Grad='"+grad+"') ORDER BY Tip_proizvoda");
            proizvodi_tabela.setModel(dm);
        }
        else {
            dm = new Tabele_baza().Tabele("SELECT r.Tip_proizvoda,r.Naziv_proizvoda,p.Grad,p.Adresa_prodajnog_mesta,p.Kontakt_prodavnice,p.Radno_vreme,m.Raspoloziva_kolicina,r.Cena_proizvoda FROM magacin m INNER JOIN prodajno_mesto p ON m.sifra_prodajnog_mesta=p.sifra_prodajnog_mesta INNER JOIN proizvodi r ON m.sifra_proizvoda=r.sifra_proizvoda WHERE (Cena_proizvoda BETWEEN "+cena_od+" AND "+cena_do+")AND(Tip_proizvoda='"+tip_proizvoda+"')AND(Adresa_prodajnog_mesta='"+adresa+"')AND(Grad='"+grad+"') ORDER BY Tip_proizvoda");
            proizvodi_tabela.setModel(dm);
        } 
    }//GEN-LAST:event_pretraga_btnActionPerformed
   
    // Da ne dozvolimo unos stringova
    private void cena_od_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cena_od_txtKeyTyped
      new Key_blokade().cena_blokada(evt, getToolkit());
    }//GEN-LAST:event_cena_od_txtKeyTyped

    private void cena_do_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cena_do_txtKeyTyped
       new Key_blokade().cena_blokada(evt, getToolkit());
    }//GEN-LAST:event_cena_do_txtKeyTyped

    //Prikazivanje tipa, naziva i slike proizvoda kada kliknemo na tabelu
    private void proizvodi_tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proizvodi_tabelaMouseClicked
        int red = proizvodi_tabela.getSelectedRow();
        tip = proizvodi_tabela.getValueAt(red, 0).toString();
        naziv = proizvodi_tabela.getValueAt(red, 1).toString();
        naziv_proizvoda_txt.setText(naziv);
        tip_txt.setText(tip);
        slika_baza = new ImageIcon(new Upiti_baza().slika_proizvoda(tip, naziv));
        slika = slika_baza.getImage().getScaledInstance(slika_proizvoda.getWidth(), slika_proizvoda.getHeight(), Image.SCALE_SMOOTH);
        slika_proizvoda.setIcon(new ImageIcon(slika));    
    }//GEN-LAST:event_proizvodi_tabelaMouseClicked
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> adresa_combo;
    private javax.swing.JTextField cena_do_txt;
    private javax.swing.JTextField cena_od_txt;
    private javax.swing.JComboBox<String> grad_combo;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField naziv_proizvoda_txt;
    private javax.swing.JButton obrisi_pretragu_btn;
    private javax.swing.JButton pretraga_btn;
    private javax.swing.JTable proizvodi_tabela;
    private javax.swing.JLabel slika_proizvoda;
    private javax.swing.JButton svi_proizvodi_btn;
    private javax.swing.JComboBox<String> tip_combo;
    private javax.swing.JTextField tip_txt;
    // End of variables declaration//GEN-END:variables
   
}
