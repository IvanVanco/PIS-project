
package pis.projekat.baza;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import static pis.projekat.baza.Konekcija.URL;



public class Manipulacije_podataka {
    private Connection con;
    private Statement s;
    private ResultSet rs;
    private int sifra_kupca;
    private String sql, kupac_sql, boja_sql, sifra_boje, materijal_sql, sifra_materijala;
    


    public Boolean posalji_reklamaciju(boolean ima_garanciju, String naziv, String adresa, String telefon, String email, String sifra, String problem) {
        try {
            con = DriverManager.getConnection(URL);
            s = con.createStatement();
            sifra_kupca(naziv, adresa, telefon, email);
            if(ima_garanciju)
                sql = "INSERT INTO reklamacija(Sifra_kupca, Sifra_garantnog_lista, Opis_problema) " +
                      "VALUES(" + sifra_kupca +",'" + sifra + "','" + problem + "')";
            else
                sql = "INSERT INTO reklamacija(Sifra_kupca, Sifra_racuna, Opis_problema) " +
                      "VALUES(" + sifra_kupca +",'" + sifra + "','" + problem + "')";
            s.execute(sql);
            return true;  
        }
        catch (SQLException ex) {
            ex.printStackTrace();  
            return false;   
        }
        finally {
            try {
                con.close();
                s.close();
                rs.close();
            } 
            catch (SQLException ex) {
                Logger.getLogger(Manipulacije_podataka.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    }

    public Boolean dodaj_prodavnicu(String sifra, String grad, String adresa, String telefon, String vreme) {
        sql = "INSERT INTO prodajno_mesto(Sifra_prodajnog_mesta, Grad, Adresa_prodajnog_mesta, Kontakt_prodavnice, Radno_vreme) " +
              "VALUES ('" + sifra + "','" + grad + "','" + adresa + "','" + telefon + "','" + vreme + "')";
        try {
            con = DriverManager.getConnection(URL);
            s = con.createStatement();
            s.execute(sql);
            return true;
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
            return false;  
        }
        finally {
            try {
                con.close();
                s.close();
                rs.close();
            } 
            catch (SQLException ex) {
                Logger.getLogger(Manipulacije_podataka.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    }  
  
    public Boolean kreiraj_porudzbinu(String naziv, String adresa, String telefon, String email, String visina, String precnik, String zapremina,
                                      String kolicina, String tip, String boja, String materijal) {
        try {
            sifra_kupca(naziv, adresa, telefon, email);
            sifra_boje(boja);
            sifra_materijala(materijal);
            
            con = DriverManager.getConnection(URL);    
            s = con.createStatement();
            
            //sifra_kupca = 1;
            //sifra_boje = "SB01";
            //sifra_materijala = "SM01";
            
            sql = "INSERT INTO porudzbenica(Sifra_kupca, Visina, Precnik, Zapremina, Kolicina_proizvoda, Tip_proizvoda, Sifra_boje, Sifra_materijala) " +
                  "VALUES(" + sifra_kupca +",'" + visina + "','" + precnik + "','" + zapremina + "','" + kolicina + "','" + tip + "','" + sifra_boje + "','" + sifra_materijala + "');"; 
            s.execute(sql);
            return true;  
        }
        catch (SQLException ex) {
            ex.printStackTrace(); 
            return false; 
        }
        finally {
            try {
                con.close();
                s.close();
                rs.close();
            } 
            catch (SQLException ex) {
                Logger.getLogger(Manipulacije_podataka.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    }
        
    public Boolean obrisi_prodavnicu(String sifra) {
        sql = "DELETE FROM prodajno_mesto " +
              "WHERE Sifra_prodajnog_mesta ='"+sifra+"'";
        try {
            con = DriverManager.getConnection(URL);
            s = con.createStatement();
            s.execute(sql);
            return true;   
        }
        catch(SQLException ex) {
            ex.printStackTrace(); 
            return false; 
        }
        finally {
            try {
                con.close();
                s.close();
                rs.close();
            } 
            catch (SQLException ex) {
                Logger.getLogger(Manipulacije_podataka.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    }
    
    public Boolean azuriraj_prodavnicu(String sifra, String grad, String adresa, String telefon, String vreme) {
        sql = "UPDATE prodajno_mesto " +
              "SET Grad ='" + grad + "',Adresa_prodajnog_mesta='" + adresa + "',Kontakt_prodavnice='" + telefon + "',Radno_vreme='" + vreme + "' " +
              "WHERE Sifra_prodajnog_mesta='" + sifra + "'";
        try {
            con = DriverManager.getConnection(URL);
            s = con.prepareStatement(sql);
            s.execute(sql);
            return true;  
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
            return false;   
        }
        finally {
            try {
                con.close();
                s.close();
                rs.close();
            } 
            catch (SQLException ex) {
                Logger.getLogger(Manipulacije_podataka.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    }
    
    //Helper methoda za dobijanje sifre kupca na osnovu unetih podataka
    public void sifra_kupca(String naziv, String adresa, String telefon, String email) {
        kupac_sql = "SELECT Sifra_kupca " +
                    "FROM kupac " +
                    "WHERE (Naziv_kupca = '"+naziv+"' AND Adresa_kupca = '"+adresa+"') OR Kontakt_telefon_kupca = '"+telefon+"' OR Email = '"+email+"'";
        try {
            con = DriverManager.getConnection(URL);
            s = con.createStatement();
            rs = s.executeQuery(kupac_sql);
            if(rs.next())
                sifra_kupca = rs.getInt(1);
        } 
        catch (SQLException ex) {
            Logger.getLogger(Manipulacije_podataka.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            try {
                con.close();
                s.close();
                rs.close();
            } 
            catch (SQLException ex) {
                Logger.getLogger(Manipulacije_podataka.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    }
    
    //Helper methoda za dobijanje sifre boje na osnovu unetih podataka
    public void sifra_boje(String boja) {
        boja_sql = "SELECT Sifra_boje " +
                   "FROM boja " +
                   "WHERE Naziv_boje = '"+boja+"'";
        try {
            con = DriverManager.getConnection(URL);
            s = con.createStatement();
            rs = s.executeQuery(boja_sql);
            if(rs.next())
                sifra_boje = rs.getString(1);
        } 
        catch (SQLException ex) {
            Logger.getLogger(Manipulacije_podataka.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            try {
                con.close();
                s.close();
                rs.close();
            } 
            catch (SQLException ex) {
                Logger.getLogger(Manipulacije_podataka.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    }
    
    //Helper methoda za dobijanje sifre materijala na osnovu unetih podataka
    public void sifra_materijala(String materijal) {
        materijal_sql = "SELECT Sifra_materijala " +
                        "FROM materijal " +
                        "WHERE Naziv_materijala = '"+materijal+"'";
        try {
            con = DriverManager.getConnection(URL);
            s = con.createStatement();
            rs = s.executeQuery(materijal_sql);
            if(rs.next())
                sifra_materijala = rs.getString(1);
        } 
        catch (SQLException ex) {
            Logger.getLogger(Manipulacije_podataka.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            try {
                con.close();
                s.close();
                rs.close();
            } 
            catch (SQLException ex) {
                Logger.getLogger(Manipulacije_podataka.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    }
}
