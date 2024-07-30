
package pis.projekat;

import java.awt.Color;
import static java.lang.Thread.sleep;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenu;
import javax.swing.JTextField;


public class Threadovi {
    private Calendar c;
    private int god, mesec, dan, sat, minut, sekund;
    
    
    // Thread za postavljanje sata i kalendara na Meni
    public void sat_i_kalendar(JMenu sat_meni, JMenu kalendar_meni) {
        Thread clock = new Thread() {
            public void run() {
                try {
                    while(true) {
                        c = new GregorianCalendar();
                        dan = c.get(Calendar.DAY_OF_MONTH);
                        mesec = c.get(Calendar.MONTH)+1;
                        god = c.get(Calendar.YEAR);
                        sekund = c.get(Calendar.SECOND);
                        minut = c.get(Calendar.MINUTE);
                        sat = c.get(Calendar.HOUR_OF_DAY);
                         
                        sat_meni.setText(""+sat+":"+minut+":"+sekund+"   ");
                        kalendar_meni.setText(""+dan+"/"+mesec+"/"+god);
                        sleep(1000);  
                    }
                    } 
                catch (InterruptedException ex) {
                    Logger.getLogger(Garancija.class.getName()).log(Level.SEVERE, null, ex); 
                }
            }
        };
        clock.start();
    } 
    
    // Thread za postavljanje boja na Textfieldove
    public void boja(JTextField visina_txt, JTextField precnik_txt){   
        Thread t1 = new Thread() {
            public void run() {
                while(true) {
                    try {
                        sleep(500);
                        boolean prazna_visina = visina_txt.getText().isEmpty();
                        boolean prazan_precnik = precnik_txt.getText().isEmpty();
                    
                        if(prazna_visina) {
                            visina_txt.setBackground(Color.white);
                        }
                    
                        else {
                            double visina = Double.parseDouble(visina_txt.getText());
                            if(visina<=20) {
                                visina_txt.setBackground(Color.green);
                            }
                            else {
                                visina_txt.setBackground(Color.red);
                            }
                        }
                        if(prazan_precnik) {
                            precnik_txt.setBackground(Color.white);
                        }
                    
                        else {
                            double precnik = Double.parseDouble(precnik_txt.getText());
                            if(precnik<=30){
                                precnik_txt.setBackground(Color.green);
                            }
                            else {
                                precnik_txt.setBackground(Color.red);
                            }
                        }
                    } 
                    catch (InterruptedException ex) {
                      Logger.getLogger(Porudzbenica.class.getName()).log(Level.SEVERE, null, ex);
                    }   
                }
            } 
        };
        t1.start();
    }

    // Thread za postavljanje zapremine na Textfield
    public void zapremina(JTextField visina_txt, JTextField precnik_txt, JTextField zapremina_txt){
        Thread t2 = new Thread(){
            public void run(){
                while(true){
                    try {
                        sleep(800); 
                        boolean prazna_visina = visina_txt.getText().isEmpty();
                        boolean prazan_precnik = precnik_txt.getText().isEmpty();

                        if(visina_txt.getBackground()==Color.green && precnik_txt.getBackground()==Color.green && !prazan_precnik && !prazna_visina) {
                            double visina = Double.parseDouble(visina_txt.getText());
                            double precnik = Double.parseDouble(precnik_txt.getText());
                            double zapremina = (precnik/2) * (precnik/2) * 3.14 * visina/1000;    
                            zapremina_txt.setText(String.format("%.3f", zapremina));     
                        }
                        else {  
                            zapremina_txt.setText("");
                        } 
                    } 
                    catch (InterruptedException ex) {
                        Logger.getLogger(Porudzbenica.class.getName()).log(Level.SEVERE, null, ex);  
                    }   
                }
            }
        };
        t2.start();
    }
}
