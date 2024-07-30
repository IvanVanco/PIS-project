
package pis.projekat;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class Pocetna_stranica extends JFrame {
    private Runtime rt;
    
    
    public Pocetna_stranica() {
        initComponents();
        setLocationRelativeTo(null);//centrira aplikaciju na ekranu pri pokretanju
        new Threadovi().sat_i_kalendar(sat_meni, kalendar_meni);
    }
  
     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        preduzece_btn = new javax.swing.JButton();
        servis_btn = new javax.swing.JButton();
        katalog_btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        porudzbina_btn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        alat_meni = new javax.swing.JMenu();
        kalkulator_meni = new javax.swing.JMenuItem();
        beleska_meni = new javax.swing.JMenuItem();
        paint_meni = new javax.swing.JMenuItem();
        optimizator_meni = new javax.swing.JMenuItem();
        pomoc_meni = new javax.swing.JMenu();
        onama_meni = new javax.swing.JMenuItem();
        kontakt_meni = new javax.swing.JMenuItem();
        problem_meni = new javax.swing.JMenuItem();
        sat_meni = new javax.swing.JMenu();
        kalendar_meni = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pocetna strana/metal.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel4.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Kvalitet koji nas pokreće");

        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        preduzece_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        preduzece_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikonice/administrator.png"))); // NOI18N
        preduzece_btn.setText(" Za preduzeće");
        preduzece_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preduzece_btnActionPerformed(evt);
            }
        });

        servis_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        servis_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikonice/fix.png"))); // NOI18N
        servis_btn.setText(" Servis");
        servis_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servis_btnActionPerformed(evt);
            }
        });

        katalog_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        katalog_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikonice/catalog-icon.png"))); // NOI18N
        katalog_btn.setText(" Katalog");
        katalog_btn.setToolTipText("Proveri da li posedujemo odgovarajuće proizvode i na kojim prodajnim mestima ih mozete naći.");
        katalog_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                katalog_btnActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pocetna strana/handshake1.jpg"))); // NOI18N
        jLabel2.setToolTipText("");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pocetna strana/handshake2.png"))); // NOI18N

        porudzbina_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        porudzbina_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikonice/poruciti.png"))); // NOI18N
        porudzbina_btn.setText(" Poruči izradu");
        porudzbina_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porudzbina_btnActionPerformed(evt);
            }
        });

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        alat_meni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikonice/alati.png"))); // NOI18N
        alat_meni.setText("Alati    ");
        alat_meni.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        kalkulator_meni.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        kalkulator_meni.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kalkulator_meni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikonice/calculator.png"))); // NOI18N
        kalkulator_meni.setText("Kalkulator");
        kalkulator_meni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kalkulator_meniActionPerformed(evt);
            }
        });
        alat_meni.add(kalkulator_meni);

        beleska_meni.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        beleska_meni.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        beleska_meni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikonice/notepad.png"))); // NOI18N
        beleska_meni.setText("Napravi belešku");
        beleska_meni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beleska_meniActionPerformed(evt);
            }
        });
        alat_meni.add(beleska_meni);

        paint_meni.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        paint_meni.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        paint_meni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikonice/paint.png"))); // NOI18N
        paint_meni.setText("Napravi sliku");
        paint_meni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paint_meniActionPerformed(evt);
            }
        });
        alat_meni.add(paint_meni);

        optimizator_meni.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        optimizator_meni.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        optimizator_meni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikonice/defragment.jpg"))); // NOI18N
        optimizator_meni.setText("Optimizator hard diska");
        optimizator_meni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optimizator_meniActionPerformed(evt);
            }
        });
        alat_meni.add(optimizator_meni);

        jMenuBar1.add(alat_meni);

        pomoc_meni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikonice/help.png"))); // NOI18N
        pomoc_meni.setText("Pomoć    ");
        pomoc_meni.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        onama_meni.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_DOWN_MASK));
        onama_meni.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        onama_meni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikonice/about.png"))); // NOI18N
        onama_meni.setText("O nama");
        onama_meni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onama_meniActionPerformed(evt);
            }
        });
        pomoc_meni.add(onama_meni);

        kontakt_meni.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.ALT_DOWN_MASK));
        kontakt_meni.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kontakt_meni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikonice/kontakt.png"))); // NOI18N
        kontakt_meni.setText("Kontakt");
        kontakt_meni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kontakt_meniActionPerformed(evt);
            }
        });
        pomoc_meni.add(kontakt_meni);

        problem_meni.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_DOWN_MASK));
        problem_meni.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        problem_meni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikonice/imate_pomoc.jpg"))); // NOI18N
        problem_meni.setText("Imate problem?");
        problem_meni.setToolTipText("U slučaju da imate problem sa našim proizvodima, prijavite nam ili nas kontaktirajte u najkraćem mogućem periodu");
        problem_meni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                problem_meniActionPerformed(evt);
            }
        });
        pomoc_meni.add(problem_meni);

        jMenuBar1.add(pomoc_meni);

        sat_meni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikonice/Clock.png"))); // NOI18N
        sat_meni.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenuBar1.add(sat_meni);

        kalendar_meni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikonice/calendar.png"))); // NOI18N
        kalendar_meni.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenuBar1.add(kalendar_meni);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(katalog_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(porudzbina_btn)
                        .addGap(45, 45, 45)
                        .addComponent(servis_btn)
                        .addGap(46, 46, 46)
                        .addComponent(preduzece_btn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                        .addGap(6, 6, 6))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(preduzece_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(katalog_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(servis_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(porudzbina_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kontakt_meniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kontakt_meniActionPerformed
         JOptionPane.showMessageDialog(null,"Ivan Mitrović \nEmail: ivke1993@hotmail.com\nTelefon: 060/4512225","",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_kontakt_meniActionPerformed

    private void kalkulator_meniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kalkulator_meniActionPerformed
        rt = Runtime.getRuntime();
        try {
            rt.exec("c:/WINDOWS/system32/calc.exe");
        } 
        catch (IOException ex) {
            Logger.getLogger(Pocetna_stranica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_kalkulator_meniActionPerformed

    private void paint_meniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paint_meniActionPerformed
        rt = Runtime.getRuntime();
        try {
            rt.exec("c:/WINDOWS/system32/mspaint.exe");
        } 
        catch (IOException ex) {
            Logger.getLogger(Pocetna_stranica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_paint_meniActionPerformed

    private void onama_meniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onama_meniActionPerformed
        Onama o = new Onama();
        jDesktopPane1.add(o);
        o.setVisible(true);
    }//GEN-LAST:event_onama_meniActionPerformed

    private void optimizator_meniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optimizator_meniActionPerformed
       rt = Runtime.getRuntime();
        try {
            rt.exec("c:/WINDOWS/system32/dfrgui.exe");
        } 
        catch (IOException ex) {
            Logger.getLogger(Pocetna_stranica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_optimizator_meniActionPerformed

    private void preduzece_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preduzece_btnActionPerformed
        new Login().setVisible(true);
    }//GEN-LAST:event_preduzece_btnActionPerformed

    private void problem_meniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_problem_meniActionPerformed
        new Garancija().setVisible(true);
    }//GEN-LAST:event_problem_meniActionPerformed

    private void servis_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servis_btnActionPerformed
        new Garancija().setVisible(true);
    }//GEN-LAST:event_servis_btnActionPerformed

    private void katalog_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_katalog_btnActionPerformed
        Pretrazivanje_proizvoda p = new Pretrazivanje_proizvoda();
        p.setVisible(true);
    }//GEN-LAST:event_katalog_btnActionPerformed

    private void porudzbina_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porudzbina_btnActionPerformed
        new Porudzbenica().setVisible(true);
    }//GEN-LAST:event_porudzbina_btnActionPerformed

    private void beleska_meniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beleska_meniActionPerformed
        rt = Runtime.getRuntime();
        try {
            rt.exec("c:/WINDOWS/system32/notepad.exe");
        } 
        catch (IOException ex) {
            Logger.getLogger(Pocetna_stranica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_beleska_meniActionPerformed
       
    //!!!!!!!!!MAIN!!!!!!!!!!!!!!!
    public static void main(String[] args) {
        {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pocetna_stranica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pocetna_stranica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pocetna_stranica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pocetna_stranica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pocetna_stranica().setVisible(true);
            }
        });
    }
       }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu alat_meni;
    private javax.swing.JMenuItem beleska_meni;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu kalendar_meni;
    private javax.swing.JMenuItem kalkulator_meni;
    private javax.swing.JButton katalog_btn;
    private javax.swing.JMenuItem kontakt_meni;
    private javax.swing.JMenuItem onama_meni;
    private javax.swing.JMenuItem optimizator_meni;
    private javax.swing.JMenuItem paint_meni;
    private javax.swing.JMenu pomoc_meni;
    private javax.swing.JButton porudzbina_btn;
    private javax.swing.JButton preduzece_btn;
    private javax.swing.JMenuItem problem_meni;
    private javax.swing.JMenu sat_meni;
    private javax.swing.JButton servis_btn;
    // End of variables declaration//GEN-END:variables
}
