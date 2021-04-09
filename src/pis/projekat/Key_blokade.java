
package pis.projekat;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

public class Key_blokade {
    private char c;
    private static int count1=0,count2=0,maxtext1=2,maxtext2=2;
    
       
    //Blokada unosa pogresnih slova Visina
        public void Visina(KeyEvent evt,JTextField polje, Toolkit kit){
      
            c=evt.getKeyChar();

            if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)||(c==KeyEvent.VK_PERIOD))) {
                  evt.consume();       //Zabrana unosa svega osim brojeva,tacke,delete i backspace
                  kit.beep(); }

            if(polje.getText().length()<1){    
                  if(c==KeyEvent.VK_0){ 
                      evt.consume();  //Zabrana unosa nule na prvu poziciju
                      kit.beep();}
            }

            if(polje.getText().length()<1){ 
                  if(c==KeyEvent.VK_PERIOD){
                      evt.consume();  //Zabrana unosa tacke na prvu poziciju
                      count1--;       //Limit i broj tacaka opada zbog sledeceg if-a
                      maxtext1-=3;
                      kit.beep(); }
                }

            if(c==KeyEvent.VK_PERIOD){
                  count1++;          // Promenljiva koja broji unos tacaka
                  maxtext1=maxtext1 + 3;  // Ako se unese tacka,limit raste za 2 pozicije
                } 

            if(polje.getText().length()>=maxtext1){
                  evt.consume();      // Ovde stavljamo limit unosa na 2 cifre
                  kit.beep();
                }

            if(count1==2) {   
                  if(c==KeyEvent.VK_PERIOD){
                      evt.consume();  //Zabrana unosa druge tacke
                      count1--;
                      maxtext1-=3;
                      kit.beep(); }
                }

            if(c==KeyEvent.VK_BACK_SPACE){
                  if(!(polje.getText().contains(Character.toString('.')))){
                      count1=0;      //Da dopustimo unos tacke ako je izbrisana backspacom
                   }

                }


         }

    //Blokada unosa pogresnih slova Precnik
        public void Precnik(KeyEvent evt,JTextField polje, Toolkit kit){
      
            c=evt.getKeyChar();

            if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)||(c==KeyEvent.VK_PERIOD))) {
                  evt.consume();       //Zabrana unosa svega osim brojeva,tacke,delete i backspace
                  kit.beep(); }

            if(polje.getText().length()<1){    
                  if(c==KeyEvent.VK_0){ 
                      evt.consume();  //Zabrana unosa nule na prvu poziciju
                      kit.beep();}
            }

            if(polje.getText().length()<1){ 
                  if(c==KeyEvent.VK_PERIOD){
                      evt.consume();  //Zabrana unosa tacke na prvu poziciju
                      count2--;       //Limit i broj tacaka opada zbog sledeceg if-a
                      maxtext2-=3;
                      kit.beep(); }
                }

            if(c==KeyEvent.VK_PERIOD){
                  count2++;          // Promenljiva koja broji unos tacaka
                  maxtext2=maxtext2 + 3;  // Ako se unese tacka,limit raste za 2 pozicije
                } 

            if(polje.getText().length()>=maxtext2){
                  evt.consume();      // Ovde stavljamo limit unosa na 2 cifre
                  kit.beep();
                }

            if(count2==2) {   
                  if(c==KeyEvent.VK_PERIOD){
                      evt.consume();  //Zabrana unosa druge tacke
                      count2--;
                      maxtext2-=3;
                      kit.beep(); }
                }

            if(c==KeyEvent.VK_BACK_SPACE){
                  if(!(polje.getText().contains(Character.toString('.')))){
                      count2=0;      //Da dopustimo unos tacke ako je izbrisana backspacom
                   }

                }


         }    
    
    //Blokada unosa pogresnih slova Kolicina
        public void Kolicina(KeyEvent evt,JTextField polje,Toolkit kit){

            c=evt.getKeyChar();

            if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))) {
                    evt.consume();  //Zabrana unosa svega osim brojeva,tacke,delete i backspace
                    kit.beep(); 
            }


          }

    // Username field- Enter-om se prebacujemo na password field
        public void Username(KeyEvent evt,JTextField polje){
            c=evt.getKeyChar();
            if(c==KeyEvent.VK_ENTER){
                polje.grabFocus();
            }
            }

    // Blokada unosa stringova u pretrazivanju proizvoda
        public void Interval(KeyEvent evt,Toolkit kit){
             c=evt.getKeyChar();
             if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)||(c==KeyEvent.VK_PERIOD))){
                  evt.consume();
                  kit.beep();
                 }
             }
   
    //Blokada unosa brojeva kod imena i prezimena
        public void Ime(KeyEvent evt,Toolkit kit){
            c=evt.getKeyChar();
             if(Character.isDigit(c)){
                  evt.consume();
                  kit.beep();
                 }
             }
}
