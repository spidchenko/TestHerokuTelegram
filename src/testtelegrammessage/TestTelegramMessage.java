/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtelegrammessage;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Calendar;
import java.util.TimeZone;

/**
 *
 * @author spidchenko.d
 */
public class TestTelegramMessage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException, IOException, InterruptedException {
        
        String SendString = "https://api.telegram.org/bot526308619:AAHg--iymGkDr4fPiGtsgqzEztMA4_Oq0gQ/sendMessage?chat_id=-1001338127855&text=";
 
        String time = Calendar.getInstance(TimeZone.getTimeZone("GMT+3")).toString();

        URLConnection conn = null;
        BufferedReader br = null;
        
        for (int i = 1; i <= 5; i++){
            
            String message = time;
            URL url = new URL(SendString+message);    
            conn = url.openConnection();
            br = new BufferedReader(new InputStreamReader(new BufferedInputStream(conn.getInputStream())));
            Thread.sleep(1000*2);
         
        }
        
//        StringBuilder sb = new StringBuilder();
//        String inputLine = "";
//        while ((inputLine = br.readLine()) != null) {
//            sb.append(inputLine);
//        }
//        String response = sb.toString();
//        
//        System.out.println(response);
        
        
    }
    
}
