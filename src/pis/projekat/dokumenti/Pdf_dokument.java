
package pis.projekat.dokumenti;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;



public class Pdf_dokument {
   private Document doc; 
   private Font preduzece_font, nabavka_font;
   private String fajl_lokacija = System.getProperty("user.home") + "/Desktop/Metalac-nabavka.pdf";
   private Paragraph naslov_preduzece, naslov_nabavka, info_preduzece, info_nabavka, naslov_materijal, naslov_oprema, naslov_delovi;
   private String dobavljac, adresa, grad;
   private PdfPTable materijal_tabela, oprema_tabela, delovi_tabela;
   private PdfPCell materijal_celija, oprema_celija, delovi_celija;
   
   
   public Pdf_dokument(JComboBox combo, JTextField text1, JTextField text2, JTable tabela1, JTable tabela2, JTable tabela3) { 
        doc = new Document();
        preduzece_font = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD, new BaseColor(250,0,0));
        nabavka_font = new Font(Font.FontFamily.TIMES_ROMAN, 14, Font.BOLD, new BaseColor(250,0,0));


     
        try {
            PdfWriter.getInstance(doc,new FileOutputStream(fajl_lokacija));
            doc.open();
            naslov_preduzece = new Paragraph("Informacije o preduzeću", preduzece_font);
            info_preduzece = new Paragraph();
            naslov_nabavka = new Paragraph("Informacije o nabavci proizvoda", preduzece_font);
            info_nabavka = new Paragraph();
                      
            dobavljac = combo.getSelectedItem().toString();
            adresa = text1.getText();
            grad = text2.getText();
            info_preduzece.add("\n\n\nNaziv preduzeca                    Metalac Posudje");                        
            info_preduzece.add("\nAdresa                                   Kneza Aleksandra 212, Gornji Milanovac, Srbija");
            info_preduzece.add("\nKontakt                                  Nabavka: +381 32 770 325, +381 32 770 388\n\n\n");
            info_nabavka.add("\n\n\nNaziv dobavljaca                   "+dobavljac);
            info_nabavka.add("\nAdresa                                  "+adresa+", "+grad+"\n\n");
            
            doc.add(naslov_preduzece);doc.add(info_preduzece);doc.add(naslov_nabavka);doc.add(info_nabavka);  
        
            //Pravljenje za Materijal 
            naslov_materijal = new Paragraph("Materijal\n\n",nabavka_font);
            materijal_tabela = new PdfPTable(2);
            materijal_celija = new PdfPCell(new Phrase("Materijal"));
            materijal_celija.setHorizontalAlignment(Element.ALIGN_CENTER);
            materijal_tabela.addCell(materijal_celija);
            materijal_celija = new PdfPCell(new Phrase("Kolicina"));
            materijal_celija.setHorizontalAlignment(Element.ALIGN_CENTER);
            materijal_tabela.addCell(materijal_celija);
            materijal_tabela.setHeaderRows(1);
       
            //Ovo je uslov za Materijal
            for(int x=0;x<tabela1.getRowCount();x++) {
                if(tabela1.getModel().getValueAt(x, 1)==null || tabela1.getModel().getValueAt(x, 1).toString().isEmpty()) {
                }
                else {
                    materijal_tabela.addCell(tabela1.getModel().getValueAt(x,0).toString());
                    materijal_tabela.addCell(tabela1.getModel().getValueAt(x,1).toString());
                }
            }
            
            //Za prikazivanje naslova materijala samo prvi put
            int zbir = 0;
            for(int x=0;x<tabela1.getRowCount();x++) {
                if(tabela1.getModel().getValueAt(x, 1)==null || tabela1.getModel().getValueAt(x, 1).toString().isEmpty()) {
                }
                else {
                    zbir++;
                    if(zbir==1)
                       doc.add(naslov_materijal);
               }
            }
            doc.add(materijal_tabela);
        
            //Pravljenje za Proizvodnu opremu
            naslov_oprema = new Paragraph("Proizvodna oprema\n\n",nabavka_font);
            oprema_tabela = new PdfPTable(2);
            oprema_celija = new PdfPCell(new Phrase("Proizvodna oprema"));
            oprema_celija.setHorizontalAlignment(Element.ALIGN_CENTER);
            oprema_tabela.addCell(oprema_celija);
            oprema_celija = new PdfPCell(new Phrase("Kolicina"));
            oprema_celija.setHorizontalAlignment(Element.ALIGN_CENTER);
            oprema_tabela.addCell(oprema_celija);
            oprema_tabela.setHeaderRows(1);
       
            //Ovo je uslov za Proizvodnu opremu
            for(int x=0;x<tabela2.getRowCount();x++) {
                if(tabela2.getModel().getValueAt(x, 1)==null || tabela2.getModel().getValueAt(x, 1).toString().isEmpty()) {
                }
                else {
                    oprema_tabela.addCell(tabela2.getModel().getValueAt(x,0).toString());
                    oprema_tabela.addCell(tabela2.getModel().getValueAt(x,1).toString());
                }
            }
            //Uslov za postavljanje naslova Proizvodna oprema samo na prvi rezultat
            int zbir2 = 0;
            for(int x=0;x<tabela2.getRowCount();x++) {
                if(tabela2.getModel().getValueAt(x, 1)==null || tabela2.getModel().getValueAt(x, 1).toString().isEmpty()) {
                }
                else {
                    zbir2++;
                    if(zbir2==1)
                       doc.add(naslov_oprema);
                }
            }
            doc.add(oprema_tabela);
        
            //Odavde krece za Delove
            naslov_delovi = new Paragraph("Delovi\n\n",nabavka_font);
            delovi_tabela = new PdfPTable(2);
            delovi_celija = new PdfPCell(new Phrase("Delovi"));
            delovi_celija.setHorizontalAlignment(Element.ALIGN_CENTER);
            delovi_tabela.addCell(delovi_celija);
            delovi_celija = new PdfPCell(new Phrase("Kolicina"));
            delovi_celija.setHorizontalAlignment(Element.ALIGN_CENTER);
            delovi_tabela.addCell(delovi_celija);
            delovi_tabela.setHeaderRows(1);
        
            //Ovo je uslov za Delove
            for(int x=0;x<tabela3.getRowCount();x++) {
                if(tabela3.getModel().getValueAt(x, 1)==null || tabela3.getModel().getValueAt(x, 1).toString().isEmpty()) {
                }
                else {
                    delovi_tabela.addCell(tabela3.getModel().getValueAt(x,0).toString());
                    delovi_tabela.addCell(tabela3.getModel().getValueAt(x,1).toString());
                }
            }
            //Uslov za postavljanje naslova Delovi samo na prvi rezultat
            int zbir3 = 0;
            for(int x=0;x<tabela3.getRowCount();x++) {
                if(tabela3.getModel().getValueAt(x, 1)==null || tabela3.getModel().getValueAt(x, 1).toString().isEmpty()) {
                }
                else {
                   zbir3++;
                   if(zbir3==1)
                     doc.add(naslov_delovi);
                }
            }
            doc.add(delovi_tabela);
            
            doc.close();
            } 
        catch (Exception ex) {
            ex.printStackTrace(); 
        }  
   }
    
    
    
    
    
    
    
    
}
