
package pis.projekat;

import pis.projekat.baza.Upiti_baza;
import pis.projekat.baza.Combox_podaci;
import pis.projekat.baza.Tabele_baza;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;


public class PretrazivanjeProizvoda extends JFrame {
    private DefaultTableModel dm;
    private String text1,text2,kombo1,kombo2,kombo3,naziv,tip;
    private int kombo1_index,kombo2_index,kombo3_index;
    private ImageIcon icon;
    private Image slika; 
    
        public PretrazivanjeProizvoda() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        
        //Dobijanje podataka za Tip poizvoda
        new Combox_podaci(jComboBox1, 1, "Select DISTINCT Tip_proizvoda FROM proizvodi ORDER BY Tip_proizvoda ASC");
        
        //Dobijanje podataka za Adresu
        new Combox_podaci(jComboBox2, 1, "Select DISTINCT Adresa_prodajnog_mesta FROM prodajno_mesto ORDER BY Adresa_prodajnog_mesta");
        
        //Dobijanje podataka za Mesto
        new Combox_podaci(jComboBox3, 1, "Select DISTINCT Mesto FROM prodajno_mesto ORDER BY Mesto");
    }
    
    
     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikonice/prikazi.png"))); // NOI18N
        jButton1.setText(" Prikaži sve proizvode");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("                  Elektronski pretraživač proizvoda");

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikonice/obrisi.png"))); // NOI18N
        jButton2.setText(" Obriši pretragu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTextField2.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Tip proizvoda");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Naziv proizvoda");

        jTextField1.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Izaberite grad prodajnog mesta");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Izaberite adresu prodajnog mesta");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Izaberite tip proizvoda");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Unesite opseg cene");

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Od");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("do");

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikonice/search.png"))); // NOI18N
        jButton3.setText(" Pretraži");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
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
                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(207, 207, 207)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(100, 100, 100)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(67, 67, 67)
                                                .addComponent(jLabel10)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton3)
                                        .addGap(126, 126, 126))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(301, 301, 301)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jButton1)
                        .addGap(114, 114, 114)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jDesktopPane1)
                        .addGap(140, 140, 140))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Dugme Prikazi sve proizvode
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTable1.setModel(new Tabele_baza().Tabele("SELECT r.Tip_proizvoda,r.Naziv_proizvoda,p.Mesto,p.Adresa_prodajnog_mesta,p.Kontakt_prodavnice,p.Radno_vreme,m.Raspoloziva_kolicina,r.Cena_proizvoda FROM magacin2 m INNER JOIN prodajno_mesto p ON m.sifra_prodajnog_mesta=p.sifra_prodajnog_mesta INNER JOIN proizvodi r ON m.sifra_proizvoda=r.sifra_proizvoda ORDER BY Tip_proizvoda"));
    }//GEN-LAST:event_jButton1ActionPerformed
        
    //Dugme Obrisi pretragu
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       jTable1.setModel(new Tabele_baza().Tabele());
       jComboBox1.setSelectedIndex(0);
       jComboBox2.setSelectedIndex(0);
       jComboBox3.setSelectedIndex(0);
       jTextField3.setText("");
       jTextField4.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed
   
  
    //!!!!!!!!!!!!!!DUGME ZA PRETRAZIVANJE!!!!!!!!!!!!!!!!!!!!
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        kombo1_index= jComboBox1.getSelectedIndex();
        kombo2_index= jComboBox2.getSelectedIndex();
        kombo3_index= jComboBox3.getSelectedIndex();
        kombo1= jComboBox1.getSelectedItem().toString();
        kombo2= jComboBox2.getSelectedItem().toString();
        kombo3= jComboBox3.getSelectedItem().toString();
        text1=jTextField3.getText();
        text2=jTextField4.getText();
    
            if(text1.isEmpty() && text2.isEmpty() && kombo1_index<2 && kombo2_index<2 && kombo3_index<2){
                 jTable1.setModel(new Tabele_baza().Tabele());} 
            
            else if(text1.isEmpty() && text2.isEmpty() && kombo2_index<2 && kombo3_index<2){
                 dm = new Tabele_baza().Tabele("SELECT r.Tip_proizvoda,r.Naziv_proizvoda,p.Mesto,p.Adresa_prodajnog_mesta,p.Kontakt_prodavnice,p.Radno_vreme,m.Raspoloziva_kolicina,r.Cena_proizvoda FROM magacin2 m INNER JOIN prodajno_mesto p ON m.sifra_prodajnog_mesta=p.sifra_prodajnog_mesta INNER JOIN proizvodi r ON m.sifra_proizvoda=r.sifra_proizvoda WHERE (Tip_proizvoda='"+kombo1+"') ORDER BY Tip_proizvoda");
                 jTable1.setModel(dm);}
          
            else if(text1.isEmpty() && text2.isEmpty() && kombo1_index<2 && kombo3_index<2){
                 dm = new Tabele_baza().Tabele("SELECT r.Tip_proizvoda,r.Naziv_proizvoda,p.Mesto,p.Adresa_prodajnog_mesta,p.Kontakt_prodavnice,p.Radno_vreme,m.Raspoloziva_kolicina,r.Cena_proizvoda FROM magacin2 m INNER JOIN prodajno_mesto p ON m.sifra_prodajnog_mesta=p.sifra_prodajnog_mesta INNER JOIN proizvodi r ON m.sifra_proizvoda=r.sifra_proizvoda WHERE (Adresa_prodajnog_mesta='"+kombo2+"') ORDER BY Tip_proizvoda");
                 jTable1.setModel(dm);}
            
            else if(kombo1_index<2 && kombo2_index<2 && kombo3_index<2){
                 dm = new Tabele_baza().Tabele("SELECT r.Tip_proizvoda,r.Naziv_proizvoda,p.Mesto,p.Adresa_prodajnog_mesta,p.Kontakt_prodavnice,p.Radno_vreme,m.Raspoloziva_kolicina,r.Cena_proizvoda FROM magacin2 m INNER JOIN prodajno_mesto p ON m.sifra_prodajnog_mesta=p.sifra_prodajnog_mesta INNER JOIN proizvodi r ON m.sifra_proizvoda=r.sifra_proizvoda WHERE (Cena_proizvoda BETWEEN "+text1+" AND "+text2+") ORDER BY Tip_proizvoda");
                 jTable1.setModel(dm);}
            
            else if(text1.isEmpty() && text2.isEmpty() && kombo1_index<2 && kombo2_index<2){
                 dm = new Tabele_baza().Tabele("SELECT r.Tip_proizvoda,r.Naziv_proizvoda,p.Mesto,p.Adresa_prodajnog_mesta,p.Kontakt_prodavnice,p.Radno_vreme,m.Raspoloziva_kolicina,r.Cena_proizvoda FROM magacin2 m INNER JOIN prodajno_mesto p ON m.sifra_prodajnog_mesta=p.sifra_prodajnog_mesta INNER JOIN proizvodi r ON m.sifra_proizvoda=r.sifra_proizvoda WHERE (Mesto='"+kombo3+"') ORDER BY Tip_proizvoda");
                 jTable1.setModel(dm);}
            
            else if(text1.isEmpty() && text2.isEmpty() && kombo3_index<2){
                 dm = new Tabele_baza().Tabele("SELECT r.Tip_proizvoda,r.Naziv_proizvoda,p.Mesto,p.Adresa_prodajnog_mesta,p.Kontakt_prodavnice,p.Radno_vreme,m.Raspoloziva_kolicina,r.Cena_proizvoda FROM magacin2 m INNER JOIN prodajno_mesto p ON m.sifra_prodajnog_mesta=p.sifra_prodajnog_mesta INNER JOIN proizvodi r ON m.sifra_proizvoda=r.sifra_proizvoda WHERE (Tip_proizvoda='"+kombo1+"')AND(Adresa_prodajnog_mesta='"+kombo2+"') ORDER BY Tip_proizvoda");
                 jTable1.setModel(dm);}
            
            else if(kombo1_index<2 && kombo2_index<2){
                 dm = new Tabele_baza().Tabele("SELECT r.Tip_proizvoda,r.Naziv_proizvoda,p.Mesto,p.Adresa_prodajnog_mesta,p.Kontakt_prodavnice,p.Radno_vreme,m.Raspoloziva_kolicina,r.Cena_proizvoda FROM magacin2 m INNER JOIN prodajno_mesto p ON m.sifra_prodajnog_mesta=p.sifra_prodajnog_mesta INNER JOIN proizvodi r ON m.sifra_proizvoda=r.sifra_proizvoda WHERE (Cena_proizvoda BETWEEN "+text1+" AND "+text2+")AND(Mesto='"+kombo3+"') ORDER BY Tip_proizvoda");
                 jTable1.setModel(dm);}
            
            else if(text1.isEmpty() && text2.isEmpty() && kombo2_index<2){
                 dm = new Tabele_baza().Tabele("SELECT r.Tip_proizvoda,r.Naziv_proizvoda,p.Mesto,p.Adresa_prodajnog_mesta,p.Kontakt_prodavnice,p.Radno_vreme,m.Raspoloziva_kolicina,r.Cena_proizvoda FROM magacin2 m INNER JOIN prodajno_mesto p ON m.sifra_prodajnog_mesta=p.sifra_prodajnog_mesta INNER JOIN proizvodi r ON m.sifra_proizvoda=r.sifra_proizvoda WHERE (Tip_proizvoda='"+kombo1+"')AND(Mesto='"+kombo3+"') ORDER BY Tip_proizvoda");
                 jTable1.setModel(dm);}
            
            else if(kombo1_index<2 && kombo3_index<2){
                 dm = new Tabele_baza().Tabele("SELECT r.Tip_proizvoda,r.Naziv_proizvoda,p.Mesto,p.Adresa_prodajnog_mesta,p.Kontakt_prodavnice,p.Radno_vreme,m.Raspoloziva_kolicina,r.Cena_proizvoda FROM magacin2 m INNER JOIN prodajno_mesto p ON m.sifra_prodajnog_mesta=p.sifra_prodajnog_mesta INNER JOIN proizvodi r ON m.sifra_proizvoda=r.sifra_proizvoda WHERE (Cena_proizvoda BETWEEN "+text1+" AND "+text2+")AND(Adresa_prodajnog_mesta='"+kombo2+"') ORDER BY Tip_proizvoda");
                 jTable1.setModel(dm);}
            
            else if(text1.isEmpty() && text2.isEmpty()&& kombo1_index<2){
                 dm = new Tabele_baza().Tabele("SELECT r.Tip_proizvoda,r.Naziv_proizvoda,p.Mesto,p.Adresa_prodajnog_mesta,p.Kontakt_prodavnice,p.Radno_vreme,m.Raspoloziva_kolicina,r.Cena_proizvoda FROM magacin2 m INNER JOIN prodajno_mesto p ON m.sifra_prodajnog_mesta=p.sifra_prodajnog_mesta INNER JOIN proizvodi r ON m.sifra_proizvoda=r.sifra_proizvoda WHERE (Adresa_prodajnog_mesta='"+kombo2+"')AND(Mesto='"+kombo3+"') ORDER BY Tip_proizvoda");
                 jTable1.setModel(dm);}
            
            else if(kombo2_index<2 && kombo3_index<2){
                 dm = new Tabele_baza().Tabele("SELECT r.Tip_proizvoda,r.Naziv_proizvoda,p.Mesto,p.Adresa_prodajnog_mesta,p.Kontakt_prodavnice,p.Radno_vreme,m.Raspoloziva_kolicina,r.Cena_proizvoda FROM magacin2 m INNER JOIN prodajno_mesto p ON m.sifra_prodajnog_mesta=p.sifra_prodajnog_mesta INNER JOIN proizvodi r ON m.sifra_proizvoda=r.sifra_proizvoda WHERE (Cena_proizvoda BETWEEN "+text1+" AND "+text2+")AND(Tip_proizvoda='"+kombo1+"') ORDER BY Tip_proizvoda");
                 jTable1.setModel(dm);}
            
            else if(text1.isEmpty() && text2.isEmpty()){
                 dm = new Tabele_baza().Tabele("SELECT r.Tip_proizvoda,r.Naziv_proizvoda,p.Mesto,p.Adresa_prodajnog_mesta,p.Kontakt_prodavnice,p.Radno_vreme,m.Raspoloziva_kolicina,r.Cena_proizvoda FROM magacin2 m INNER JOIN prodajno_mesto p ON m.sifra_prodajnog_mesta=p.sifra_prodajnog_mesta INNER JOIN proizvodi r ON m.sifra_proizvoda=r.sifra_proizvoda WHERE (Tip_proizvoda='"+kombo1+"')AND(Adresa_prodajnog_mesta='"+kombo2+"')AND(Mesto='"+kombo3+"') ORDER BY Tip_proizvoda");
                 jTable1.setModel(dm);}
            
            else if(kombo3_index<2){
                 dm = new Tabele_baza().Tabele("SELECT r.Tip_proizvoda,r.Naziv_proizvoda,p.Mesto,p.Adresa_prodajnog_mesta,p.Kontakt_prodavnice,p.Radno_vreme,m.Raspoloziva_kolicina,r.Cena_proizvoda FROM magacin2 m INNER JOIN prodajno_mesto p ON m.sifra_prodajnog_mesta=p.sifra_prodajnog_mesta INNER JOIN proizvodi r ON m.sifra_proizvoda=r.sifra_proizvoda WHERE (Cena_proizvoda BETWEEN "+text1+" AND "+text2+")AND(Tip_proizvoda='"+kombo1+"')AND(Adresa_prodajnog_mesta='"+kombo2+"') ORDER BY Tip_proizvoda");
                 jTable1.setModel(dm);}
            
            else if(kombo2_index<2){
                 dm = new Tabele_baza().Tabele("SELECT r.Tip_proizvoda,r.Naziv_proizvoda,p.Mesto,p.Adresa_prodajnog_mesta,p.Kontakt_prodavnice,p.Radno_vreme,m.Raspoloziva_kolicina,r.Cena_proizvoda FROM magacin2 m INNER JOIN prodajno_mesto p ON m.sifra_prodajnog_mesta=p.sifra_prodajnog_mesta INNER JOIN proizvodi r ON m.sifra_proizvoda=r.sifra_proizvoda WHERE (Cena_proizvoda BETWEEN "+text1+" AND "+text2+")AND(Tip_proizvoda='"+kombo1+"')AND(Mesto='"+kombo3+"') ORDER BY Tip_proizvoda");
                 jTable1.setModel(dm);}
            
            else if(kombo1_index<2){
                 dm = new Tabele_baza().Tabele("SELECT r.Tip_proizvoda,r.Naziv_proizvoda,p.Mesto,p.Adresa_prodajnog_mesta,p.Kontakt_prodavnice,p.Radno_vreme,m.Raspoloziva_kolicina,r.Cena_proizvoda FROM magacin2 m INNER JOIN prodajno_mesto p ON m.sifra_prodajnog_mesta=p.sifra_prodajnog_mesta INNER JOIN proizvodi r ON m.sifra_proizvoda=r.sifra_proizvoda WHERE (Cena_proizvoda BETWEEN "+text1+" AND "+text2+")AND(Adresa_prodajnog_mesta='"+kombo2+"')AND(Mesto='"+kombo3+"') ORDER BY Tip_proizvoda");
                 jTable1.setModel(dm);}
            else  {
                 dm = new Tabele_baza().Tabele("SELECT r.Tip_proizvoda,r.Naziv_proizvoda,p.Mesto,p.Adresa_prodajnog_mesta,p.Kontakt_prodavnice,p.Radno_vreme,m.Raspoloziva_kolicina,r.Cena_proizvoda FROM magacin2 m INNER JOIN prodajno_mesto p ON m.sifra_prodajnog_mesta=p.sifra_prodajnog_mesta INNER JOIN proizvodi r ON m.sifra_proizvoda=r.sifra_proizvoda WHERE (Cena_proizvoda BETWEEN "+text1+" AND "+text2+")AND(Tip_proizvoda='"+kombo1+"')AND(Adresa_prodajnog_mesta='"+kombo2+"')AND(Mesto='"+kombo3+"') ORDER BY Tip_proizvoda");
                 jTable1.setModel(dm);} 
    }//GEN-LAST:event_jButton3ActionPerformed
   
    // Da ne dozvolimo unos stringova
    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
      new Key_blokade().Interval(evt, getToolkit());
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
       new Key_blokade().Interval(evt, getToolkit());
    }//GEN-LAST:event_jTextField4KeyTyped

    //Prikazivanje tipa,naziva i slike proizvoda kada kliknemo na tabelu
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int red=jTable1.getSelectedRow();
        tip=jTable1.getValueAt(red, 0).toString();
        naziv=jTable1.getValueAt(red, 1).toString();
        
        jTextField2.setText(naziv);
        jTextField1.setText(tip);
        
        icon = new ImageIcon(new Upiti_baza().slika_proizvoda(tip,naziv));
        slika = icon.getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_SMOOTH);
        
        jLabel2.setIcon(new ImageIcon(slika));    
    }//GEN-LAST:event_jTable1MouseClicked
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
   
}
