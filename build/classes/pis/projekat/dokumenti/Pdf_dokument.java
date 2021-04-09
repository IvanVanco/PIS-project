
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
   private Font font2,font3;
   private String ime=System.getProperty("user.home") + "/Desktop/Metalac-nabavka.pdf";
   private Paragraph par,pa,p,paa,materijal,oprema,delovi;
   private String dobavljac,adresa,grad;
   private PdfPTable table,table2,table3;
   private PdfPCell celija,celija2,celija3;
   
   
   public Pdf_dokument(JComboBox combo,JTextField text1,JTextField text2,JTable tabela1,JTable tabela2,JTable tabela3){ 
         doc=new Document();
         font2=new Font(Font.FontFamily.TIMES_ROMAN,18,Font.BOLD,new BaseColor(250,0,0));
         font3=new Font(Font.FontFamily.TIMES_ROMAN,14,Font.BOLD,new BaseColor(250,0,0));
     
        try {
            PdfWriter.getInstance(doc,new FileOutputStream(ime));
            doc.open();
            par= new Paragraph();
            pa=new Paragraph("Informacije o preduzecu",font2);
            p=new Paragraph("Informacije o nabavci proizvoda",font2);
            paa= new Paragraph();
                               
       
            dobavljac=combo.getSelectedItem().toString();
            adresa=text1.getText();
            grad=text2.getText();
            par.add("\n\n\nNaziv preduzeca                    Metalac Posudje");                        
            par.add("\nAdresa                                   Kneza Aleksandra 212, Gornji Milanovac, Srbija");
            par.add("\nKontakt                                  Nabavka: +381 32 770 325, +381 32 770 388\n\n\n");
            paa.add("\n\n\nNaziv dobavljaca                   "+dobavljac);
            paa.add("\nAdresa                                  "+adresa+", "+grad+"\n\n");
            
            doc.add(pa);doc.add(par);doc.add(p);doc.add(paa);  
        
         //Pravljenje za Materijal 
            materijal=new Paragraph("Materijal\n\n",font3);
            table=new PdfPTable(2);
            
            celija = new PdfPCell(new Phrase("Materijal"));
            celija.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(celija);

            celija = new PdfPCell(new Phrase("Kolicina"));
            celija.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(celija);
        
            table.setHeaderRows(1);
       
            //Ovo je uslov za Materijal
            for(int x=0;x<tabela1.getRowCount();x++) {
                if(tabela1.getModel().getValueAt(x, 1)==null || tabela1.getModel().getValueAt(x, 1).toString().isEmpty()){
                   }
                else {
                     table.addCell(tabela1.getModel().getValueAt(x,0).toString());
                     table.addCell(tabela1.getModel().getValueAt(x,1).toString());
               }}
            
            //Za prikazivanje naslova materijala samo prvi put
            int zbir=0;
            for(int x=0;x<tabela1.getRowCount();x++) {
                if(tabela1.getModel().getValueAt(x, 1)==null || tabela1.getModel().getValueAt(x, 1).toString().isEmpty()){
                   }
                else {
                     zbir++;
                     if(zbir==1)
                        doc.add(materijal);
               }}
        
            doc.add(table);
        
       
         //Pravljenje za Proizvodnu opremu
            oprema=new Paragraph("Proizvodna oprema\n\n",font3);
            table2=new PdfPTable(2);
            
            celija2 = new PdfPCell(new Phrase("Proizvodna oprema"));
            celija2.setHorizontalAlignment(Element.ALIGN_CENTER);
            table2.addCell(celija2);

            celija2 = new PdfPCell(new Phrase("Kolicina"));
            celija2.setHorizontalAlignment(Element.ALIGN_CENTER);
            table2.addCell(celija2);
        
            table2.setHeaderRows(1);
       
            //Ovo je uslov za Proizvodnu opremu
            for(int x=0;x<tabela2.getRowCount();x++){
                if(tabela2.getModel().getValueAt(x, 1)==null || tabela2.getModel().getValueAt(x, 1).toString().isEmpty()){
                  }
                else {
                    table2.addCell(tabela2.getModel().getValueAt(x,0).toString());
                    table2.addCell(tabela2.getModel().getValueAt(x,1).toString());
            }}
            //Uslov za postavljanje naslova Proizvodna oprema samo na prvi rezultat
            int zbir2=0;
            for(int x=0;x<tabela2.getRowCount();x++){
                if(tabela2.getModel().getValueAt(x, 1)==null || tabela2.getModel().getValueAt(x, 1).toString().isEmpty()){
                  }
                else {
                    zbir2++;
                    if(zbir2==1)
                       doc.add(oprema);
                   }}
            doc.add(table2);
        
         //Odavde krece za Delove
            delovi=new Paragraph("Delovi\n\n",font3);
            table3=new PdfPTable(2);
          
            celija3 = new PdfPCell(new Phrase("Delovi"));
            celija3.setHorizontalAlignment(Element.ALIGN_CENTER);
            table3.addCell(celija3);

            celija3 = new PdfPCell(new Phrase("Kolicina"));
            celija3.setHorizontalAlignment(Element.ALIGN_CENTER);
            table3.addCell(celija3);
        
            table3.setHeaderRows(1);
        
        
            //Ovo je uslov za Delove
            for(int x=0;x<tabela3.getRowCount();x++){
                if(tabela3.getModel().getValueAt(x, 1)==null || tabela3.getModel().getValueAt(x, 1).toString().isEmpty()){
                   }
                else {
                    table3.addCell(tabela3.getModel().getValueAt(x,0).toString());
                    table3.addCell(tabela3.getModel().getValueAt(x,1).toString());
        
                 }}
            //Uslov za postavljanje naslova Delovi samo na prvi rezultat
            int zbir3=0;
            for(int x=0;x<tabela3.getRowCount();x++){
                if(tabela3.getModel().getValueAt(x, 1)==null || tabela3.getModel().getValueAt(x, 1).toString().isEmpty()){
                  }
                else {
                   zbir3++;
                   if(zbir3==1)
                      doc.add(delovi);
               }}
            doc.add(table3);
        
        
            doc.close();
       
            } 
        catch (Exception ex) {
            ex.printStackTrace();
            }  
   }
    
    
    
    
    
    
    
    
}
