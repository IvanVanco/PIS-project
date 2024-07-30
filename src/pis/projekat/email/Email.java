
package pis.projekat.email;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import static pis.projekat.email.Konfiguracija.host;
import static pis.projekat.email.Konfiguracija.email_od;
import static pis.projekat.email.Konfiguracija.email_od_lozinka;



public class Email {
    private static String fajl_lokacija = System.getProperty("user.home") + "/Desktop/Metalac-nabavka.pdf";
    private static String naziv_fajla = "Metalac-nabavka.pdf";
    private static Properties podesavanja;
    private static Session sesija;
    private static MimeMessage poruka;
    private static BodyPart mbp;
    private static Multipart mp;
    private static DataSource izvor_podataka;
    private static Transport transport;
    
    
    //Metod za slanje emaila sa narudzbinom ka dobavljacima
    public static boolean posalji_email(String message, String to[]) {
        podesavanja = System.getProperties();
        podesavanja.put("mail.smtp.host", host);
        podesavanja.put("mail.smtp.starttls.enable", "true");
        podesavanja.put("mail.smtp.auth", "true");
        podesavanja.put("mail.smtp.password", email_od_lozinka);
        podesavanja.put("mail.smtp.port", "587");
        podesavanja.put("mail.smtp.user", email_od);
        sesija = Session.getDefaultInstance(podesavanja);
        poruka = new MimeMessage(sesija);

        try {
            //Email adresa posaljioca
            poruka.setFrom(new InternetAddress(email_od));
            //Email adrese primalaca- prikupljanje
            InternetAddress[] toadress = new InternetAddress[to.length];
            for (int i = 0; i < to.length; i++) {
                toadress[i] = new InternetAddress(to[i]); 
            }
            for (int i = 0; i < toadress.length; i++) {
                poruka.addRecipient(Message.RecipientType.TO, toadress[i]);
            }
            //Naslovna linija email poruke
            poruka.setSubject("Narudzbenica");
            //Postavljanje poruke
            mbp = new MimeBodyPart();
            mbp.setText(message);
            //Pravljenje delova email poruke
            mp = new MimeMultipart();
            //postavljanje tekst poruke u deo email poruke
            mp.addBodyPart(mbp);
            //Dodavanje pdf fajla u poruku
            mbp = new MimeBodyPart();
            izvor_podataka = new FileDataSource(fajl_lokacija);
            mbp.setDataHandler(new DataHandler(izvor_podataka));
            mbp.setFileName(naziv_fajla);
            mp.addBodyPart(mbp);        
        
            //Ovde sklapamo multipartove u celu poruku
            poruka.setContent(mp);
            
            //Slanje kompresovane poruke
            transport = sesija.getTransport("smtp");
            transport.connect(host, email_od, email_od_lozinka);
            transport.sendMessage(poruka, poruka.getAllRecipients());
            transport.close();
            return true;
        } 
        catch (MessagingException ex) {
            ex.printStackTrace();
        }
        return false;
    } 
}

