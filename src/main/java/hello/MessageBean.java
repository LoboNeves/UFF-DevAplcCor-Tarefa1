package hello;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.beans.*;
import java.io.Serializable;
import java.util.Calendar;
import org.joda.time.DateTime;

/**
 *
 * @author viter
 */
public class MessageBean implements Serializable {
     
    private String aut;
    private String lang;
    private String msg;
    private String msg2;
    private String cumprimento;
        
    public MessageBean() {
    }
    
    public String getAut() {
        return "José Viterbo";
    }
    
    public void setLang(String value) {
        lang = value;
    }
    public String getMsg() {
        switch (this.lang){
            case "pt":
                return "Alô";
            case "en":
                return "Hello";
            case "de":
                return "Hallo";
            case "fr":
                return "Bonjour";
        }
        return "";
    }
    public String getMsg2() {
        switch (this.lang){
            case "pt":
                return "Elaborado por";
            case "en":
                return "Created by";
            case "de":
                return "Erstellt von";
            case "fr":
                return "Créé par";
        }
        return "";
    }

    public String getCumprimento() {
        DateTime dt = new DateTime();
        int horas = dt.getHourOfDay();
        horas = horas-3;
        String bomdia  = "Bom dia";
        String boatarde = "Boa tarde";
        String boanoite =  "Boa noite";

        switch (this.lang){
            case "pt":
            bomdia = "Bom dia";
            boatarde = "Boa tarde";
            boanoite =  "Boa noite";
            break;
            case "en":
            bomdia = "Good morning";
            boatarde = "Good afternoon";
            boanoite =  "Good Evening";
            break;
            case "de":
            bomdia = "Guten Morgen";
            boatarde = "Guten Nachmittag";
            boanoite =  "Guten Abend";
            break;
            case "fr":
            bomdia = "Bonjour";
            boatarde = "Bon Après-midi";
            boanoite =  "Bonsoir";
            break;
        }

        if(horas > 0 && horas <= 12) return bomdia;
        else if(horas >=12 && horas < 18) return boatarde;
        else if(horas >=18 && horas <= 24 || horas < 0) return boanoite;
        return "";    
    }
}
