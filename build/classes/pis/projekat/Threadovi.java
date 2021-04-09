
package pis.projekat;

import java.awt.Color;
import java.awt.event.MouseEvent;
import static java.lang.Thread.sleep;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;


public class Threadovi {
    
    private Calendar c;
    private int god,mesec,dan,sat,minut,sekund;
    
    // Thread za postavljanje sata i kalendara na Meni
     public void Sat_i_kalendar(JMenu meni1,JMenu meni2){

       Thread clock=new Thread(){
                public void run(){
                     try {
                         while(true){
                         c= new GregorianCalendar();
                         dan=c.get(Calendar.DAY_OF_MONTH);
                         mesec=c.get(Calendar.MONTH)+1;
                         god=c.get(Calendar.YEAR);
                         sekund=c.get(Calendar.SECOND);
                         minut=c.get(Calendar.MINUTE);
                         sat=c.get(Calendar.HOUR_OF_DAY);
                         
                         meni1.setText(""+sat+":"+minut+":"+sekund+"   ");
                         meni2.setText(""+dan+"/"+mesec+"/"+god);
                         sleep(1000);
                         }
                     } catch (InterruptedException ex) {
                         Logger.getLogger(Garancija.class.getName()).log(Level.SEVERE, null, ex);
                     }
                 }};
                     

     clock.start();

} 
    
    // Thread za postavljanje boja na Textfieldove
     public void Boja(JTextField polje1, JTextField polje2){   

        Thread t1=new Thread(){
            public void run(){
                while(true){
                 try {
                      sleep(500);
                      boolean prazna_visina=polje1.getText().isEmpty();
                      boolean prazan_precnik=polje2.getText().isEmpty();
                    
                      if(prazna_visina){
                          polje1.setBackground(Color.white);
                      }
                    
                      else {
                          double visina=Double.parseDouble(polje1.getText());
                          if(visina<=20){
                              polje1.setBackground(Color.green);
                          }
                          else {
                              polje1.setBackground(Color.red);
                          }
                      }
                      if(prazan_precnik){
                          polje2.setBackground(Color.white);
                      }
                    
                      else {
                          double precnik=Double.parseDouble(polje2.getText());
                          if(precnik<=30){
                              polje2.setBackground(Color.green);
                          }
                          else {
                              polje2.setBackground(Color.red);
                          }
                      }
                  
                  } 
                  catch (InterruptedException ex) {
                      Logger.getLogger(Porudzbenica.class.getName()).log(Level.SEVERE, null, ex);
                      }   
                  }} };
        t1.start();
}

    // Thread za postavljanje zapremine na Textfield
     public void Zapremina(JTextField polje1,JTextField polje2,JTextField postavka){
       
        Thread t2=new Thread(){
          public void run(){
              while(true){
                  try {
                      sleep(800); 
                      boolean prazna_visina=polje1.getText().isEmpty();
                      boolean prazan_precnik=polje2.getText().isEmpty();
                   
                      if(polje1.getBackground()==Color.green && polje2.getBackground()==Color.green && !prazan_precnik && !prazna_visina){
                            double visina=Double.parseDouble(polje1.getText());
                            double precnik=Double.parseDouble(polje2.getText());
                            double zapremina=(precnik/2)*(precnik/2)*3.14*visina/1000;    
                            postavka.setText(String.format("%.3f",zapremina));     
                      }
                      else {  
                           postavka.setText("");
                      }
                      } 
                  catch (InterruptedException ex) {
                      Logger.getLogger(Porudzbenica.class.getName()).log(Level.SEVERE, null, ex);
                      }   
                  }} };
        t2.start();

}}
