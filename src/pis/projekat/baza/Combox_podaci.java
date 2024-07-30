
package pis.projekat.baza;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import static pis.projekat.baza.Konekcija.URL;



public class Combox_podaci {
    private String element;
    private Connection con;
    private Statement s;
    private ResultSet rs;
    private DefaultComboBoxModel dlm;

 
    public Combox_podaci(JComboBox kombo, int slucaj, String query) {
        try {
            con = DriverManager.getConnection(URL);
            s = con.createStatement();
            rs = s.executeQuery(query);
            dlm = new DefaultComboBoxModel();
            
            //Dodatne opcije
            if(slucaj==1) {
                dlm.addElement("--Niste izabrali--");
                dlm.addElement(""); 
            }
   
            while (rs.next()) {                
                for(int i=1;i<2;i++)
                    element = rs.getString(i);
                dlm.addElement(element);
            }
            kombo.setModel(dlm);
        }           
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        finally {
            try {
                con.close();
                s.close();
                rs.close();
            } 
            catch (SQLException ex) {
                Logger.getLogger(Combox_podaci.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    }
}
