import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Dvd-luokka käyttöliittymäohjelmoinnin harjoitustyöhön
 * @author Juha Kärkkäinen
 * @version 1.0 (16.4 2012)
 */
public class DVD
{ 
 private String info,genre,nimi;
 private int nro;
 
 public DVD(String nimi, String genre, String info, int nro)
 {
   this.info = info;
   this.nimi = nimi;
   this.genre = genre;
   this.nro = nro;
 }
 
 public String DVD_info(){ 
  	return this.info;
 } 	
 public String DVD_genre(){
  	return this.genre;
 } 
 public String DVD_nimi(){
  	return this.nimi;
 } 
 public int DVD_nro(){
  	return this.nro; 
 }
}