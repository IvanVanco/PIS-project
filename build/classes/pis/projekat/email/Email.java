
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


public class Email {
    
    private static final String host = "smtp.live.com";
    private static String fajl=System.getProperty("user.home") + "/Desktop/Metalac-nabavka.pdf";
    private static String naziv_fajla="Metalac-nabavka.pdf";
    private static Properties properties;
    private static Session session;
    private static MimeMessage mimemessage;
    private static BodyPart mbp;
    private static Multipart mp;
    private static DataSource source;
    private static Transport transport;
    
    //Metod za slanje emaila
    public static boolean posaljiemail(String from, String password, String message, String to[]) {

        properties = System.getProperties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.password", password);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.user", from);

        session = Session.getDefaultInstance(properties);
        mimemessage = new MimeMessage(session);

        try {
            //Email adresa posaljioca
            mimemessage.setFrom(new InternetAddress(from));
            //Email adrese primalaca- prikupljanje
            InternetAddress[] toadress = new InternetAddress[to.length];
                for (int i = 0; i < to.length; i++) {
                     toadress[i] = new InternetAddress(to[i]); }
                for (int i = 0; i < toadress.length; i++) {
                     mimemessage.addRecipient(Message.RecipientType.TO, toadress[i]);
            }
            //Naslovna linija email poruke
            mimemessage.setSubject("Narudzbenica");
            //Postavljanje poruke
            mbp=new MimeBodyPart();
            mbp.setText(message);
            //Pravljenje delova email poruke
            mp=new MimeMultipart();
            //postavljanje tekst poruke u deo email poruke
            mp.addBodyPart(mbp);
            
            
            //Dodavanje pdf fajla u poruku
            mbp = new MimeBodyPart();
            source=new FileDataSource(fajl);
            mbp.setDataHandler(new DataHandler(source));
            mbp.setFileName(naziv_fajla);
            mp.addBodyPart(mbp);        
        
            //Ovde sklapamo multipartove u celu poruku
            mimemessage.setContent(mp);
            
            //Slanje kompresovane poruke
            transport = session.getTransport("smtp");
            transport.connect(host, from, password);
            transport.sendMessage(mimemessage, mimemessage.getAllRecipients());
            transport.close();
            return true;
        } catch (MessagingException ex) {
            ex.printStackTrace();
            
        }

        return false;

    }
    
}

