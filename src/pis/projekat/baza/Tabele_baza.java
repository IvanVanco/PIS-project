
package pis.projekat.baza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static pis.projekat.baza.Konekcija.PASSWORD;
import static pis.projekat.baza.Konekcija.URL;
import static pis.projekat.baza.Konekcija.USERNAME;



public class Tabele_baza {
    
    private Connection con;
    private Statement s;
    private ResultSet rs;
    private DefaultTableModel dm;
    private String tip,naziv,mesto,adresa,telefon,vreme,kolicina,cena,oprema,materijal,delovi,sifra;
  
    
    //Pretrazivanje proizvoda tabela
    public DefaultTableModel Tabele(String sql) {
 
        dm = new DefaultTableModel();
        
        dm.addColumn("Tip proizvoda");
        dm.addColumn("Naziv proizvoda");
        dm.addColumn("Mesto");
        dm.addColumn("Adresa");
        dm.addColumn("Telefon");
        dm.addColumn("Radno vreme");
        dm.addColumn("Količina");
        dm.addColumn("Cena");
        
        
        try {
            con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            s = con.prepareStatement(sql);
            rs = s.executeQuery(sql);
            
            while (rs.next()) {
                tip = rs.getString(1);
                naziv = rs.getString(2);
                mesto = rs.getString(3);
                adresa = rs.getString(4);
                telefon = rs.getString(5);
                vreme = rs.getString(6);
                kolicina = rs.getString(7);
                cena = rs.getString(8);
           
                dm.addRow(new String[]{tip,naziv, mesto, adresa,telefon,vreme,kolicina,cena});
            }
            return dm;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    //Prazna tabela (bez rezultata) za proizvode
    public DefaultTableModel Tabele() {
        dm = new DefaultTableModel();
        
        dm.addColumn("Tip proizvoda");
        dm.addColumn("Naziv proizvoda");
        dm.addColumn("Mesto");
        dm.addColumn("Adresa");
        dm.addColumn("Telefon");
        dm.addColumn("Radno vreme");
        dm.addColumn("Količina");
        dm.addColumn("Cena");
        
        return dm;
        
    }
    
    //Naruzbenica-Popunjavanje tabele za delove
    public DefaultTableModel Delovi(String naziv) {
        
        dm = new DefaultTableModel();
        dm.addColumn("Delovi");
        dm.addColumn("Unesite količinu");
              
        String sql = "SELECT o.Naziv_dela FROM zalihe_delova o INNER JOIN dobavljaci_proizvodi dp ON o.Sifra_dela=dp.Sifra_dela INNER JOIN dobavljaci d ON dp.Sifra_dobavljaca=d.Sifra_dobavljaca WHERE d.Naziv_dobavljaca='"+naziv+"' ORDER BY o.Naziv_dela";
        try {
             con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
             s = con.prepareStatement(sql);
             rs = s.executeQuery(sql);

            while (rs.next()) {
                   
                delovi = rs.getString(1);
                dm.addRow(new String[]{delovi});
            }
            return dm;
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    //Narudzbenica-Popunjavanje tabele1 za proizvodnu opremu
    public DefaultTableModel Oprema(String naziv) {

        dm = new DefaultTableModel();
        dm.addColumn("Proizvodna oprema");
        dm.addColumn("Unesite količinu");
              
        String sql = "SELECT o.Naziv_opreme FROM oprema o INNER JOIN dobavljaci_proizvodi dp ON o.Sifra_opreme=dp.Sifra_opreme INNER JOIN dobavljaci d ON dp.Sifra_dobavljaca=d.Sifra_dobavljaca WHERE d.Naziv_dobavljaca='"+naziv+"' ORDER BY o.Naziv_opreme";
        try {
      
            con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            s = con.prepareStatement(sql);
            rs = s.executeQuery(sql);

            while (rs.next()) {

                oprema = rs.getString(1);    
                dm.addRow(new String[]{oprema});
            }
            return dm;
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    //Narudzbenica-Popunjavanje tabele za materijal
    public DefaultTableModel Materijal(String naziv){
        
        dm = new DefaultTableModel();
        dm.addColumn("Materijal");
        dm.addColumn("Unesite količinu");     
        
        String sql = "SELECT z.Naziv_materijala FROM zalihe_materijala z INNER JOIN dobavljaci_proizvodi dp ON z.Sifra_materijala=dp.Sifra_materijala INNER JOIN dobavljaci d ON dp.Sifra_dobavljaca=d.Sifra_dobavljaca WHERE d.Naziv_dobavljaca='"+naziv+"' ORDER BY z.Naziv_materijala";
        try{
           
            con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            s = con.createStatement();
            rs = s.executeQuery(sql);
           
            while (rs.next()) {                
                materijal = rs.getString(1);
                dm.addRow(new String[]{materijal});
            }
           
            return dm;
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
         return null;    
         }

    //Prodavnice-Popunjavanje tabele
    public DefaultTableModel Prodavnice() {
        dm = new DefaultTableModel();
        dm.addColumn("Sifra");
        dm.addColumn("Mesto");
        dm.addColumn("Adresa");
        dm.addColumn("Telefon");
        dm.addColumn("Radno vreme");

        String sql = "SELECT * FROM prodajno_mesto";
        try {
            con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            s = con.prepareStatement(sql);
            rs = s.executeQuery(sql);
  
            while (rs.next()) {
   
                sifra = rs.getString(1);
                mesto = rs.getString(3);
                adresa = rs.getString(2);
                telefon = rs.getString(4);
                vreme = rs.getString(5);
                dm.addRow(new String[]{sifra, mesto, adresa, telefon,vreme});
            }
            return dm; }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
