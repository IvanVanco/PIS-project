
package pis.projekat;
import pis.projekat.email.Email;
import pis.projekat.baza.Upiti_baza;
import pis.projekat.baza.Combox_podaci;
import pis.projekat.baza.Tabele_baza;
import pis.projekat.dokumenti.Pdf_dokument;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class Narudzbenica extends JFrame {
    private DefaultTableModel dm;
    private String dobavljaci;
    private int dobavljaci_index;
   
    
    public Narudzbenica() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        
        //Dobijanje imena dobavljaca
        new Combox_podaci(dobavljaci_combo, 1, "Select DISTINCT Naziv_dobavljaca FROM dobavljaci ORDER BY Naziv_dobavljaca");
    }
    

 
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        materijal_check = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        oprema_check = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        delovi_check = new javax.swing.JCheckBox();
        dobavljaci_combo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        adresa_txt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        grad_txt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        telefon_txt = new javax.swing.JTextField();
        email_txt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        oprema_tabela = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        materijal_tabela = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        delovi_tabela = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        opis_masine = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        pdf_btn = new javax.swing.JButton();
        email_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("        Nabavka");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Izaberite dobavljača");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Izaberite vrstu narudzbine");

        materijal_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materijal_checkActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("            Materijal");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Proizvodna oprema");

        oprema_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oprema_checkActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("                Delovi");

        delovi_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delovi_checkActionPerformed(evt);
            }
        });

        dobavljaci_combo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dobavljaci_combo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                dobavljaci_comboItemStateChanged(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Adresa");

        adresa_txt.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Grad");

        grad_txt.setEditable(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Telefon");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Email");

        telefon_txt.setEditable(false);

        email_txt.setEditable(false);

        oprema_tabela.setAutoCreateRowSorter(true);
        oprema_tabela.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        oprema_tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Proizvodna oprema", "Unesite količinu"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        oprema_tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oprema_tabelaMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(oprema_tabela);

        materijal_tabela.setAutoCreateRowSorter(true);
        materijal_tabela.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        materijal_tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Materijal", "Unesite količinu"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(materijal_tabela);

        delovi_tabela.setAutoCreateRowSorter(true);
        delovi_tabela.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        delovi_tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Delovi", "Unesite količinu"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(delovi_tabela);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Opis masine");

        opis_masine.setColumns(20);
        opis_masine.setRows(5);
        opis_masine.setWrapStyleWord(true);
        jScrollPane1.setViewportView(opis_masine);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel12.setText("Izaberite mašinu iz liste da vidite opis");

        pdf_btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pdf_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikonice/pdf.png"))); // NOI18N
        pdf_btn.setText(" PDF");
        pdf_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdf_btnActionPerformed(evt);
            }
        });

        email_btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        email_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikonice/email.png"))); // NOI18N
        email_btn.setText(" Pošalji Email");
        email_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(materijal_check)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(48, 48, 48)
                        .addComponent(oprema_check)
                        .addGap(249, 249, 249)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(delovi_check)
                        .addGap(174, 174, 174))))
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dobavljaci_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adresa_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(grad_txt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(telefon_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(pdf_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(email_btn)
                .addGap(273, 273, 273))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dobavljaci_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(adresa_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(grad_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(telefon_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(oprema_check)
                            .addComponent(jLabel5))
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(123, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(materijal_check)
                            .addComponent(jLabel6)
                            .addComponent(delovi_check)
                            .addComponent(jLabel4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pdf_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(email_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void dobavljaci_comboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_dobavljaci_comboItemStateChanged
        dobavljaci_index = dobavljaci_combo.getSelectedIndex();
        dobavljaci = dobavljaci_combo.getSelectedItem().toString();
        if(dobavljaci_index!=0 && dobavljaci_index!=1) {
            adresa_txt.setText(new Upiti_baza().lista_dobavljaca(dobavljaci).get(0));
            grad_txt.setText(new Upiti_baza().lista_dobavljaca(dobavljaci).get(1));
            telefon_txt.setText(new Upiti_baza().lista_dobavljaca(dobavljaci).get(2));
            email_txt.setText(new Upiti_baza().lista_dobavljaca(dobavljaci).get(3));
        }
        else {
            adresa_txt.setText("");grad_txt.setText("");telefon_txt.setText("");email_txt.setText("");
        }
     
        if(oprema_check.isSelected()) {
             oprema_tabela.setModel(new Tabele_baza().Oprema(dobavljaci));
        }
                
        if(delovi_check.isSelected()) {
             delovi_tabela.setModel(new Tabele_baza().Delovi(dobavljaci));
        }
        
        if(materijal_check.isSelected()) {
             materijal_tabela.setModel(new Tabele_baza().Materijal(dobavljaci));
        }  
    }//GEN-LAST:event_dobavljaci_comboItemStateChanged

    private void oprema_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oprema_checkActionPerformed
        dobavljaci = dobavljaci_combo.getSelectedItem().toString();
        if(oprema_check.isSelected()) {
           oprema_tabela.setModel(new Tabele_baza().Oprema(dobavljaci));
        }
        else {
           dm = new DefaultTableModel();
           dm.addColumn("Proizvodna oprema");
           dm.addColumn("Unesite količinu");
           oprema_tabela.setModel(dm);
        }
    }//GEN-LAST:event_oprema_checkActionPerformed
     
    private void materijal_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materijal_checkActionPerformed
        dobavljaci = dobavljaci_combo.getSelectedItem().toString();
        if(materijal_check.isSelected()) {
           materijal_tabela.setModel(new Tabele_baza().Materijal(dobavljaci));}
        else {
            dm = new DefaultTableModel();
            dm.addColumn("Materijal");
            dm.addColumn("Unesite količinu");
            materijal_tabela.setModel(dm);
         }
    }//GEN-LAST:event_materijal_checkActionPerformed

    private void delovi_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delovi_checkActionPerformed
        dobavljaci = dobavljaci_combo.getSelectedItem().toString();
        if(delovi_check.isSelected()) {
            delovi_tabela.setModel(new Tabele_baza().Delovi(dobavljaci));
        }
        else {
            dm = new DefaultTableModel();
            dm.addColumn("Delovi");
            dm.addColumn("Unesite količinu");
            delovi_tabela.setModel(dm);
        }
    }//GEN-LAST:event_delovi_checkActionPerformed
    
    private void oprema_tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oprema_tabelaMouseClicked
        int column = 0;
        int row = oprema_tabela.getSelectedRow();
        String naziv = oprema_tabela.getModel().getValueAt(row, column).toString();
        opis_masine.setText(new Upiti_baza().opis_masine(naziv));
    }//GEN-LAST:event_oprema_tabelaMouseClicked
   
    private void pdf_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdf_btnActionPerformed
        String[] opcija = {"Da", "Ne"};
        int odgovor = JOptionPane.showOptionDialog(null, "Da li ste sigurni da želite da napravite PDF dokument?", "PDF", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcija, opcija[1]);
        if(odgovor==0) {
            new Pdf_dokument(dobavljaci_combo, adresa_txt, grad_txt, materijal_tabela, oprema_tabela, delovi_tabela);
            JOptionPane.showMessageDialog(null, "Uspešno ste napravili dokument pod imenom Metalac-nabavka.pdf.\nDokument se nalazi na vašem Desktopu.");
        } 
    }//GEN-LAST:event_pdf_btnActionPerformed
    
    private void email_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_btnActionPerformed
        String[] to = {email_txt.getText()};
        String[] opcija = {"Da", "Ne"};
        int odgovor = JOptionPane.showOptionDialog(null, "Da li ste sigurni da želite da pošaljete email poruku sa PDF dokumentom dobavljaču "+dobavljaci_combo.getSelectedItem().toString()+"?", "Email", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcija, opcija[1]);
        if(odgovor==0) {
            if(Email.posalji_email("Poštovani,\nU prilogu vam šaljemo PDF dokument.\n\nSrdačan pozdrav\n\nMetalac Posuđe", to)) {
                JOptionPane.showMessageDialog(null, "Uspešno ste poslali email poruku vašem dobavljaču.\n");
            }
            else {
                JOptionPane.showMessageDialog(null, "Došlo je do problema.Proverite da li ste izabrali dobavljača.\nPokušajte ponovo.");
            }
        }
    }//GEN-LAST:event_email_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adresa_txt;
    private javax.swing.JCheckBox delovi_check;
    private javax.swing.JTable delovi_tabela;
    private javax.swing.JComboBox<String> dobavljaci_combo;
    private javax.swing.JButton email_btn;
    private javax.swing.JTextField email_txt;
    private javax.swing.JTextField grad_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JCheckBox materijal_check;
    private javax.swing.JTable materijal_tabela;
    private javax.swing.JTextArea opis_masine;
    private javax.swing.JCheckBox oprema_check;
    private javax.swing.JTable oprema_tabela;
    private javax.swing.JButton pdf_btn;
    private javax.swing.JTextField telefon_txt;
    // End of variables declaration//GEN-END:variables
}

