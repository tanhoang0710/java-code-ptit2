/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author DELL
 */
public class FirstProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
//        System.out.println("Xin chao cac ban!!!");
//        String st = "Hom nay bot nang! \nHoc o nha";
//        System.out.println(st);
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        Date date1 = format.parse("23:00");
        Date date2 = format.parse("01:00");
        long diff = 0;
        if(date1.getHours() > date2.getHours()){
            diff = date2.getTime() + 86400000 - date1.getTime();
        }else {
            diff = date2.getTime() - date1.getTime();
        }
        
        
        
        long diffMinutes = diff / (60 * 1000) % 60;
        long diffHours = diff / (60 * 60 * 1000) % 24;

        System.out.println(diffHours);
    }
    
}
