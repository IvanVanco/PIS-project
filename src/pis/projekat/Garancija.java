
package pis.projekat;
import pis.projekat.baza.Manipulacije_podataka;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;



public class Garancija extends JFrame {
    private String naziv, adresa, telefon, email;
    private String garancija, racun, problem;
    private final String[] opcija = {"Da", "Ne"};
    private int pitanje;
    
    
    public Garancija() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        naziv_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        adresa_txt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        email_txt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        opis_problema = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        ima_garanciju = new javax.swing.JRadioButton();
        nema_garanciju = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        posalji_btn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        telefon_txt = new javax.swing.JFormattedTextField();
        racun_txt = new javax.swing.JFormattedTextField();
        garancija_txt = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Ukoliko imate problem sa našim proizvodima usled kvara ili tehničke neispravnosti,");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("molimo  Vas popunite sledeći obrazac sa detaljnim informacijama.");

        naziv_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                naziv_txtKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Naziv");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Adresa");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Telefon");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Email");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Šifra garantnog lista");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Opis problema");
        jLabel8.setToolTipText("Po mogućnosti što detaljniji");

        opis_problema.setEditable(false);
        opis_problema.setColumns(20);
        opis_problema.setLineWrap(true);
        opis_problema.setRows(5);
        jScrollPane1.setViewportView(opis_problema);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("    Da li posedujete garanciju?");

        buttonGroup1.add(ima_garanciju);
        ima_garanciju.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ima_garanciju.setText("Da");
        ima_garanciju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ima_garancijuActionPerformed(evt);
            }
        });

        buttonGroup1.add(nema_garanciju);
        nema_garanciju.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nema_garanciju.setText("Ne");
        nema_garanciju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nema_garancijuActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Šifra računa");

        posalji_btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        posalji_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikonice/send.png"))); // NOI18N
        posalji_btn.setText(" Pošalji");
        posalji_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posalji_btnActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 51, 51));
        jLabel11.setText("        Podaci o kupcu");

        try {
            MaskFormatter maska= new javax.swing.text.MaskFormatter("0##/####-###");
            maska.setPlaceholderCharacter('X');
            telefon_txt = new javax.swing.JFormattedTextField(maska);
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            MaskFormatter maska= new javax.swing.text.MaskFormatter("##-####");
            maska.setPlaceholderCharacter('_');
            racun_txt = new javax.swing.JFormattedTextField(maska);
            racun_txt.setEditable(false);
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            MaskFormatter maska= new javax.swing.text.MaskFormatter("##-###");
            maska.setPlaceholderCharacter('_');
            garancija_txt = new javax.swing.JFormattedTextField(maska);
            garancija_txt.setEditable(false);
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(telefon_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(adresa_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(naziv_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(garancija_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(293, 293, 293)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jScrollPane1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(racun_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 33, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(ima_garanciju)
                .addGap(58, 58, 58)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(nema_garanciju)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(posalji_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(323, 323, 323))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(naziv_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(adresa_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(telefon_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(ima_garanciju)
                    .addComponent(nema_garanciju))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10)
                    .addComponent(racun_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(garancija_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(posalji_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void ima_garancijuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ima_garancijuActionPerformed
        garancija_txt.setEditable(true);
        racun_txt.setText("");
        racun_txt.setEditable(false);
        opis_problema.setText("");
        opis_problema.setEditable(true);
    }//GEN-LAST:event_ima_garancijuActionPerformed

    private void nema_garancijuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nema_garancijuActionPerformed
        racun_txt.setEditable(true);
        opis_problema.setEditable(true);
        garancija_txt.setText("");
        garancija_txt.setEditable(false);
    }//GEN-LAST:event_nema_garancijuActionPerformed
   
    private void posalji_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posalji_btnActionPerformed
       naziv = naziv_txt.getText();
       adresa = adresa_txt.getText();
       telefon = telefon_txt.getText();
       email = email_txt.getText(); 
       garancija = garancija_txt.getText();
       racun = racun_txt.getText();
       problem = opis_problema.getText();
        
        if(naziv.isEmpty() || adresa.isEmpty() || telefon.charAt(1)=='X' || email.isEmpty())
           JOptionPane.showMessageDialog(null, "Popunite sve lične podatke i pokušajte ponovo."); 
        
        else if(!(ima_garanciju.isSelected()) && !(nema_garanciju.isSelected())) {
           pitanje = JOptionPane.showOptionDialog(null, "Da li imate važeći garantni list?", "Pažnja", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcija, opcija[1]); 
           if(pitanje==0)
               ima_garanciju.doClick();
           else
               nema_garanciju.doClick();
        }
        
        else if(ima_garanciju.isSelected() && garancija.charAt(1)=='_')
           JOptionPane.showMessageDialog(null, "Unesite šifru garantnog lista i pokušajte ponovo."); 
        
        else if(ima_garanciju.isSelected() && garancija.charAt(1)!='_') {
            if(new Manipulacije_podataka().posalji_reklamaciju(true, naziv, adresa, telefon, email, garancija, problem)) {
               JOptionPane.showMessageDialog(null,"Uspešno ste poslali podatke.\nNaš tim će Vas kontaktirati u najkraćem mogućem roku.\nHvala.","",JOptionPane.INFORMATION_MESSAGE);
               naziv_txt.setText("");
               adresa_txt.setText("");
               telefon_txt.setText("");
               email_txt.setText("");
               garancija_txt.setText(""); 
            }
            else {
               JOptionPane.showMessageDialog(null, "Nije poslato.\nProverite internet konekciju.");
            }
        }
        
        else if(nema_garanciju.isSelected() && racun.charAt(1)=='_')
           JOptionPane.showMessageDialog(null, "Unesite šifru računa i pokušajte ponovo."); 
   
        else {
            if (new Manipulacije_podataka().posalji_reklamaciju(false, naziv, adresa, telefon, email, racun, problem)) {
               JOptionPane.showMessageDialog(null,"Uspešno ste poslali podatke.\nNaš tim će Vas kontaktirati u najkraćem mogućem roku.\nHvala.","",JOptionPane.INFORMATION_MESSAGE);
               naziv_txt.setText(""); 
               adresa_txt.setText("");
               telefon_txt.setText(""); 
               email_txt.setText("");
               racun_txt.setText(""); 
               opis_problema.setText(""); 
            }
            else {
               JOptionPane.showMessageDialog(null, "Nije poslato.\nProverite internet konekciju.");
            }
        }
    }//GEN-LAST:event_posalji_btnActionPerformed

    private void naziv_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_naziv_txtKeyTyped
        new Key_blokade().naziv_blokada(evt, getToolkit());
    }//GEN-LAST:event_naziv_txtKeyTyped

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adresa_txt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField email_txt;
    private javax.swing.JFormattedTextField garancija_txt;
    private javax.swing.JRadioButton ima_garanciju;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField naziv_txt;
    private javax.swing.JRadioButton nema_garanciju;
    private javax.swing.JTextArea opis_problema;
    private javax.swing.JButton posalji_btn;
    private javax.swing.JFormattedTextField racun_txt;
    private javax.swing.JFormattedTextField telefon_txt;
    // End of variables declaration//GEN-END:variables
}
