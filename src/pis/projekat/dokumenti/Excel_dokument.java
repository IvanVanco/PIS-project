
package pis.projekat.dokumenti;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;


public class Excel_dokument {
    private Workbook knjiga;
    private String fajl_lokacija = System.getProperty("user.home") + "/Desktop/Metalac-prodavnice.xls";
    private Sheet strana;
    private Row naslov_redova;
    private FileOutputStream fajl;
    private ArrayList<Row> lista;
    
    
    //Metod za Otvaranje excela, pravljenje stranice i kopiranja sadrzaja iz tabele u nju 
    public Excel_dokument(JTable tabela){
        knjiga = new HSSFWorkbook();
        strana = knjiga.createSheet("Prva strana");
        lista = new ArrayList<Row>();
        naslov_redova = strana.createRow(0);
            for(int j=0;j<tabela.getRowCount();j++) {
                lista.add(strana.createRow(j+1));
                for(int i=0;i<tabela.getColumnCount();i++) {
                    naslov_redova.createCell(i).setCellValue(tabela.getColumnName(i));
                    lista.get(j).createCell(i).setCellValue((String) tabela.getValueAt(j,i));
                }
            }   
        try {
            fajl = new FileOutputStream(fajl_lokacija);
            knjiga.write(fajl); 
            fajl.close(); 
        }
        catch (IOException ex) {
            Logger.getLogger(Excel_dokument.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
    

