
package pis.projekat.baza;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import static pis.projekat.baza.Konekcija.URL;



public class Upiti_baza {
    private Connection con;
    private Statement s;
    private ResultSet rs;
    private String sql, opis;
    private byte[] slika;
    private List<String> lista;
    private DefaultListModel dlm;
    
    //Slike proizvoda
    public byte[] slika_proizvoda(String tip,String proizvod) {
        sql = "SELECT Slika " +
              "FROM proizvodi " +
              "WHERE Tip_proizvoda='"+tip+"' AND Naziv_proizvoda='"+proizvod+"'";

        try {
            con = DriverManager.getConnection(URL);
            s = con.createStatement();
            rs = s.executeQuery(sql);
            rs.next();
            slika = rs.getBytes(1);
          
            return slika;
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }
        finally {
            try {
                con.close();
                s.close();
                rs.close();
            } 
            catch (SQLException ex) {
                Logger.getLogger(Upiti_baza.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    }
    
    //Slike boje proizvoda
    public byte[] slika_boje(String boja) {
        sql = "SELECT Slika_boje " +
              "FROM boja " +
              "WHERE Naziv_boje='"+boja+"' " +
              "ORDER BY Naziv_boje";
        
        try {
            con = DriverManager.getConnection(URL);
            s = con.createStatement();
            rs = s.executeQuery(sql);
            rs.next();
            slika = rs.getBytes(1);
            
            return slika;
        } 
        catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        finally {
            try {
                con.close();
                s.close();
                rs.close();
            } 
            catch (SQLException ex) {
                Logger.getLogger(Upiti_baza.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    }
    
    
    //Dobijanje opisa masina
    public String opis_masine(String naziv){
        sql = "SELECT Opis_masine " +
              "FROM oprema " +
              "WHERE Naziv_opreme='"+naziv+"'";
        
        try {
            con = DriverManager.getConnection(URL);
            s = con.createStatement();
            rs = s.executeQuery(sql);
            rs.next();
            opis = rs.getString(1);
            
            return opis; 
        }                        
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
            return null;
        }
        finally {
            try {
                con.close();
                s.close();
                rs.close();
            } 
            catch (SQLException ex) {
                Logger.getLogger(Upiti_baza.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    }
  
    // Lista podataka za dobavljace
    public List<String> lista_dobavljaca(String dobavljac){
        sql = "SELECT Adresa_dobavljaca, Grad, Kontakt_telefon_dobavljaca, Email " +
              "FROM dobavljaci " +
              "WHERE Naziv_dobavljaca='"+dobavljac+"'";
         
        try {
            con = DriverManager.getConnection(URL);
            s = con.createStatement();
            rs = s.executeQuery(sql);
            lista = new ArrayList<String>();

            while(rs.next()) {
               lista.add(rs.getString(1));
               lista.add(rs.getString(2));        
               lista.add(rs.getString(3));
               lista.add(rs.getString(4));
            }
            return lista;
        } 
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        finally {
            try {
                con.close();
                s.close();
                rs.close();
            } 
            catch (SQLException ex) {
                Logger.getLogger(Upiti_baza.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    } 
     
    //Popunjavanje liste za materijal
    public void materijal(JList list){
        sql = "SELECT Naziv_materijala " +
              "FROM zalihe_materijala " +
              "WHERE Naziv_materijala NOT LIKE 'Papir' " +
              "ORDER BY Naziv_materijala";
        
        try {
            con = DriverManager.getConnection(URL);
            s = con.createStatement();
            rs = s.executeQuery(sql);
            dlm = new DefaultListModel();
            
            while (rs.next()) {                
                dlm.addElement(rs.getString(1));
            }
            list.setModel(dlm);
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        finally {
            try {
                con.close();
                s.close();
                rs.close();
            } 
            catch (SQLException ex) {
                Logger.getLogger(Upiti_baza.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    }
}

