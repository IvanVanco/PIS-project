
package pis.projekat.baza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import static pis.projekat.baza.Konekcija.PASSWORD;
import static pis.projekat.baza.Konekcija.URL;
import static pis.projekat.baza.Konekcija.USERNAME;



public class Upiti_baza {
    private Connection con;
    private Statement s;
    private ResultSet rs;
    private String sql,opis;
    private byte[] slika;
    private List<String> lista;
    private DefaultListModel DLM;
    
   //Slike proizvoda
    public byte[] slika_proizvoda(String tip,String proizvod) {
      
      sql= "Select Slika FROM proizvodi WHERE Tip_proizvoda='"+tip+"' AND Naziv_proizvoda='"+proizvod+"'";

      try {
            con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            s = con.prepareStatement(sql);
            rs= s.executeQuery(sql);
            
            
            rs.next();
            
            slika=rs.getBytes(1);
            
            return slika;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }
    }
    
   //Slike boje proizvoda
    public byte[] slika_boje(String boja) {
        
       sql="Select Slika_boje From boja WHERE Naziv_boje='"+boja+"' ORDER BY Naziv_boje";
        
       try {
            con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            s = con.prepareStatement(sql);
            rs=s.executeQuery(sql);

            rs.next();
            
            slika=rs.getBytes(1);
            
            return slika;

       } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    
    //Dobijanje opisa masina
     public String Opismasine(String naziv){
        
        sql = "Select Opis_masine FROM oprema WHERE Naziv_opreme='"+naziv+"'";
        
        try{
            
            con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            s = con.createStatement();
            
            rs = s.executeQuery(sql);
            rs.next();
            opis=rs.getString(1);
            
            return opis;
            
            }
                                  
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
            return null;
            }
            
         }
  
    // Lista podataka za dobavljace
     public List<String> lista(String dobavljac){
        
         sql="Select Adresa_dobavljaca,Grad,Kontakt_telefon_dobavljaca,Email FROM dobavljaci WHERE Naziv_dobavljaca='"+dobavljac+"'";
         
         try {
            
            con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            s = con.prepareStatement(sql);
            rs=s.executeQuery(sql);

            lista = new ArrayList<String>();

            while(rs.next())
            {
               lista.add(rs.getString(1));
               lista.add(rs.getString(2));        
               lista.add(rs.getString(3));
               lista.add(rs.getString(4));
            }
            return lista;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    } 
     
    //Popunjavanje liste za materijal
     public void Materijal(JList list){
        
        sql= "SELECT Naziv_materijala FROM zalihe_materijala WHERE Naziv_materijala NOT LIKE 'Papir' ORDER BY Naziv_materijala";
        
        try{
            
            con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            s = con.createStatement();
            
            rs = s.executeQuery(sql);
            
            DLM = new DefaultListModel();
            
            while (rs.next()) {                
                
                DLM.addElement(rs.getString(1));
            }
            
            list.setModel(DLM);
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
             
         }

    
}

