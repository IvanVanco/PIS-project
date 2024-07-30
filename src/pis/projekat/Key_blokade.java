
package pis.projekat;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;



public class Key_blokade {
    private char c;
    private static int visina_broj = 0, precnik_broj = 0, visina_txt_max = 2, precnik_txt_max = 2;
    

    public void visina_blokada(KeyEvent evt, JTextField polje, Toolkit kit) {
        c = evt.getKeyChar();
        if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)||(c==KeyEvent.VK_PERIOD))) {
            evt.consume();       //Zabrana unosa svega osim brojeva,tacke,delete i backspace
            kit.beep(); 
        }
        if(polje.getText().length()<1) {    
            if(c==KeyEvent.VK_0) { 
                evt.consume();  //Zabrana unosa nule na prvu poziciju
                kit.beep();
            }
        }
        if(polje.getText().length()<1) { 
            if(c==KeyEvent.VK_PERIOD) {
                evt.consume();  //Zabrana unosa tacke na prvu poziciju
                visina_broj--;       //Limit i broj tacaka opada zbog sledeceg if-a
                visina_txt_max-=3;
                kit.beep(); 
            }   
        }
        if(c==KeyEvent.VK_PERIOD){
            visina_broj++;               // Promenljiva koja broji unos tacaka
            visina_txt_max=visina_txt_max + 3;  // Ako se unese tacka,limit raste za 2 pozicije   
        } 
        if(polje.getText().length()>=visina_txt_max){
            evt.consume();      // Ovde stavljamo limit unosa na 2 cifre
            kit.beep();
        }
        if(visina_broj==2) {   
            if(c==KeyEvent.VK_PERIOD){
                evt.consume();  //Zabrana unosa druge tacke
                visina_broj--;
                visina_txt_max-=3;
                kit.beep(); 
            }   
        }
        if(c==KeyEvent.VK_BACK_SPACE){
            if(!(polje.getText().contains(Character.toString('.')))){
                visina_broj=0;      //Da dopustimo unos tacke ako je izbrisana backspacom    
            }    
        }
    }

    public void precnik_blokada(KeyEvent evt, JTextField polje, Toolkit kit) {
        c = evt.getKeyChar();
        if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)||(c==KeyEvent.VK_PERIOD))) {
            evt.consume();       //Zabrana unosa svega osim brojeva,tacke,delete i backspace
            kit.beep(); 
        }
        if(polje.getText().length()<1) {    
            if(c==KeyEvent.VK_0) { 
                evt.consume();  //Zabrana unosa nule na prvu poziciju
                kit.beep();
            }
        }
        if(polje.getText().length()<1) { 
            if(c==KeyEvent.VK_PERIOD) {
                evt.consume();  //Zabrana unosa tacke na prvu poziciju
                precnik_broj--;       //Limit i broj tacaka opada zbog sledeceg if-a
                precnik_txt_max-=3;
                kit.beep(); 
            }     
        }
        if(c==KeyEvent.VK_PERIOD) {
            precnik_broj++;               // Promenljiva koja broji unos tacaka
            precnik_txt_max=precnik_txt_max + 3;  // Ako se unese tacka,limit raste za 2 pozicije      
        } 

        if(polje.getText().length()>=precnik_txt_max) {
            evt.consume();      // Ovde stavljamo limit unosa na 2 cifre
            kit.beep();
        }
        if(precnik_broj==2) {   
            if(c==KeyEvent.VK_PERIOD){
                evt.consume();  //Zabrana unosa druge tacke
                precnik_broj--;
                precnik_txt_max-=3;
                kit.beep(); 
            }   
        }
        if(c==KeyEvent.VK_BACK_SPACE) {
            if(!(polje.getText().contains(Character.toString('.')))) {
                precnik_broj=0;      //Da dopustimo unos tacke ako je izbrisana backspacom   
            }  
        }   
    }    
    
    public void kolicina_blokada(KeyEvent evt, JTextField polje, Toolkit kit) {
        c = evt.getKeyChar();
        if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))) {
            evt.consume();  //Zabrana unosa svega osim brojeva,tacke,delete i backspace
            kit.beep(); 
        } 
    }

    // Username field- Enter-om se prebacujemo na password field
    public void username_shortcut(KeyEvent evt, JTextField polje) {
        c = evt.getKeyChar();
        if(c==KeyEvent.VK_ENTER) {
            polje.grabFocus();
        }   
    }

    public void cena_blokada(KeyEvent evt, Toolkit kit) {
        c = evt.getKeyChar();
        if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)||(c==KeyEvent.VK_PERIOD))) {
            evt.consume();
            kit.beep();      
        }     
    }
   
    public void naziv_blokada(KeyEvent evt, Toolkit kit) {
        c = evt.getKeyChar();
        if(Character.isDigit(c)) {
            evt.consume();
            kit.beep();       
        }        
    }
}
