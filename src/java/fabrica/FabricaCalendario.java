/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author ighor
 */
public class FabricaCalendario {
    private static final String barra = "/";
    
    public static Calendar getInstance(){
        Calendar hoje = Calendar.getInstance();
        return hoje;
    }
    
    public static Calendar toCalendar(String dataString){
        String dataVetor[] = dataString.split(barra);
        Calendar dataCalendar = Calendar.getInstance();
        dataCalendar.set(Integer.parseInt(dataVetor[2]),
                Integer.parseInt(dataVetor[1])-1,Integer.parseInt(dataVetor[0]));
        return dataCalendar;
    }
    
    public static Calendar toCalendar(Date dataDate){
       Calendar dataCalendar = Calendar.getInstance();
       dataCalendar.setTime(dataDate);
       return dataCalendar;
    }
    
    public static Date toDate(Calendar dataCalendar){
        Date dataDate = new Date();
        dataDate.setTime(dataCalendar.getTimeInMillis());
        return dataDate;
    }
    
    public static String toFormatString(Calendar dataCalendar){
        SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dataFormat.format(FabricaCalendario.toDate(dataCalendar));
    }
    
     public static String toFormatString(){
        SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dataFormat.format(FabricaCalendario.toDate(Calendar.getInstance()));
    }
    
    public static String toDBFormat(Calendar dataCalendar){
        SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dataFormat.format(FabricaCalendario.toDate(dataCalendar));
    }
}
