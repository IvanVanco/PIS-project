
package pis.projekat.baza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import static pis.projekat.baza.Konekcija.PASSWORD;
import static pis.projekat.baza.Konekcija.URL;
import static pis.projekat.baza.Konekcija.USERNAME;



public class Combox_podaci {
    
    private String element;
    private Connection con;
    private Statement s;
    private ResultSet rs;
    private DefaultComboBoxModel DLM;

 
    public Combox_podaci(JComboBox kombo, int slucaj, String query){
        try{
        
            con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            s = con.createStatement();
            rs = s.executeQuery(query);
            
            DLM = new DefaultComboBoxModel();
            
            //Dodatne opcije
            if(slucaj==1){
            DLM.addElement("--Niste izabrali--");
            DLM.addElement(""); 
            }
            else {
            }
        
            while (rs.next()) {                
                
            for(int i=1;i<2;i++)
            element=rs.getString(i);
            DLM.addElement(element);
            }
            
            kombo.setModel(DLM); }
            
                               
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
             
         }

 
}
