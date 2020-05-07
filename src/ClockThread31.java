/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 *
 * @author Mr Olayinka
 */
public class ClockThread31 extends Thread{
    
      String time;
    public void run(){
    try {
        while(true){
            
             LocalDateTime m = LocalDateTime.now();
              Locale locale = Locale.ENGLISH;
   DateTimeFormatter formatterOutput = DateTimeFormat.forPattern( "E" ).withLocale( locale );
          String day = formatterOutput.print( m);
          
    SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss a");
    String p = sd.format(new  Date());
        
    time = "" +day+" "+p;
      
       
           Attendance_Search.lons.setText(time);
           
             
                Thread.sleep(1000);
                
            } }
        catch (InterruptedException ex) {
                Logger.getLogger(ClockThread31.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
}
