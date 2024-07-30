
package pis.projekat;
import javax.swing.JFrame;



public class Verzije_app extends JFrame {

   
    public Verzije_app() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("1.0.0 CRM model sa katalogom, prijavljivanjem, prodavnicama\n1.0.1 Dodat Meni bar sa alatima i informacijama\n1.0.2 Ubacene ikonima na tasterima\n1.1.0 Reorganizovana aplikacija, sloj klijenata i sloj preduzeca\n1.1.1 Katalog proizvoda prepravljen i ubacena opcija za pretragu po ceni\n1.1.2 Ubacena opcija dodavanja novih prodavnica \n1.1.3 Prepravka gresaka u narucivanju i garanciji proizvoda\n1.2.0 Ubacen modul nabavke proizvoda\n1.2.1 Ubacena opcija slanja emaila ka dobavljacima\n1.2.2 U informacijama su ubaceni podaci o starijim verzijama programa\n1.2.3 Povecanje performansi programa usled bolje organizacije koda i zamene strukture agloritama\n1.2.4 Dodata opcija za prebacivanje tabele prodavnica u Excel\nformat\n1.2.5 Zamenjena opcija pretrage slika proizvoda putem dugmica sa novom funkcijom, koja podrazumeva prikazivanje slike proizvoda koji se izabere u podudjenoj tabeli\n1.2.6 Preprvaljene greske u vezi Combobox-ova\n1.3.0 U porudzbenici, napravljen mehanizam za racunanje zapremine i kontrolu pravilnog unosa\n1.3.1 Ubačeni formati za unos telefona i šifri\n1.3.2 Popravljeni bagovi kod slanja porudzbenice i servisa\n1.4.0 Popravljeni razni bagovi kod porucivanja i narucivanja, poboljsana funcionalnost aplikacije");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
