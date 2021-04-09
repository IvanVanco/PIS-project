
package pis.projekat.baza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import static pis.projekat.baza.Konekcija.PASSWORD;
import static pis.projekat.baza.Konekcija.URL;
import static pis.projekat.baza.Konekcija.USERNAME;



public class Manipulacije_podataka {
    
    private static Connection con;
    private static Statement s;
    private static String sql;
    
  //Metod za garanciju
    public static Boolean dodaj(String naziv, String adresa, String telefon,String email,String sifra) {
        sql = "INSERT INTO garancija(Naziv_kupca,Adresa_kupca,Kontakt_telefon_kupca,Email,Sifra_garantnog_lista) VALUES('" + naziv +"','" + adresa+ "','" + telefon + "','" + email + "','" + sifra + "')";
        try {
            con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            s = con.prepareStatement(sql);
            s.execute(sql);
            
            return true;  }
        catch (SQLException ex) {
            ex.printStackTrace();  
            return false;   } 
    }
    
  //Metod za reklamaciju proizvoda
    public static Boolean dodaj(String naziv, String adresa, String telefon,String email,String sifra,String problem) {
        sql = "INSERT INTO reklamacija2(Naziv_kupca,Adresa_kupca,Kontakt_telefon_kupca,Email,Sifra_racuna,Opis_nastalog_problema) VALUES('" + naziv +"','" + adresa+ "','" + telefon + "','" + email + "','" + sifra + "','" + problem + "')";
        try {
            con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            s = con.prepareStatement(sql);
            s.execute(sql);
            
            return true; }
        catch (SQLException ex) {
            ex.printStackTrace(); 
            return false; }
    }
  
  //Metod za prodavnice
    public static Boolean dodaj2(String sifra, String mesto, String adresa, String telefon, String vreme) {
        sql = "INSERT INTO prodajno_mesto (Sifra_prodajnog_mesta,Mesto,Adresa_prodajnog_mesta,Kontakt_prodavnice,Radno_vreme) Values ('" + sifra + "','" + mesto + "','" + adresa + "','" + telefon + "','" + vreme + "')";
        try {
            con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            s = con.prepareStatement(sql);
            s.execute(sql);
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;  }
    }  
  
  //Metod za porucivanje proizvoda
    public static Boolean dodaj(String naziv, String adresa, String telefon,String email,String visina,String precnik,String zapremina,String kolicina,String tip,String boja,String materijal) {
        sql = "INSERT INTO porudzbenica(Naziv_kupca,Adresa_kupca,Kontakt_telefon_kupca,Email,Visina,Precnik,Zapremina,Kolicina_proizvoda,Tip_proizvoda,Naziv_boje,Naziv_materijala) VALUES('" + naziv +"','" + adresa+ "','" + telefon + "','" + email + "','" + visina + "','" + precnik + "','" + zapremina + "','" + kolicina + "','" + tip + "','" + boja + "','" + materijal + "')";
        try {
            con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            s = con.prepareStatement(sql);
            s.execute(sql);
            
            return true;  }
        catch (SQLException ex) {
            ex.printStackTrace(); 
            return false; }
    }
        
  //Metod za prodavnice
    public static Boolean brisanje(String sifra){
        sql="DELETE FROM prodajno_mesto WHERE Sifra_prodajnog_mesta ='"+sifra+"'";
        try {
            con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
            s=con.prepareStatement(sql);
            s.execute(sql);
            
            return true;   }
            
        catch(SQLException ex){
            ex.printStackTrace(); 
            return false; }
    }
    
  //Metod za prodavnice
    public static Boolean azuriraj(String sifra, String mesto, String adresa, String telefon, String vreme) {
        sql = "UPDATE prodajno_mesto SET Mesto ='" + mesto + "',Adresa_prodajnog_mesta='" + adresa + "',Kontakt_prodavnice='" + telefon + "',Radno_vreme='" + vreme + "' WHERE Sifra_prodajnog_mesta='" + sifra + "'";
        try {
            con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            s = con.prepareStatement(sql);
            s.execute(sql);
            
            return true;  } 
        catch (SQLException ex) {
            ex.printStackTrace();
            return false;   }
    }
    
  
}
