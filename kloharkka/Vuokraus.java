import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*; //tarvitaan datea varten

/**
 * Vuokraus-luokka käyttöliittymäohjelmoinnin harjoitustyöhön
 * @author Juha Kärkkäinen
 * @version 1.0 (16.4 2012)
 */
public class Vuokraus
{ 
 private int AS_nro,DVD_nro,VuokrausID;
 private Date Vuokrauspaiva,Palautuspaiva;
 private boolean Palautettu;
 
 public Vuokraus(int AS_nro, int DVD_nro, Date Vuokrauspaiva, Date Palautuspaiva, boolean Palautettu)	
 {
   this.AS_nro = AS_nro;
   this.DVD_nro = DVD_nro;
   this.Vuokrauspaiva = Vuokrauspaiva;
   this.Palautuspaiva = Palautuspaiva;
   this.Palautettu = Palautettu;
 }
 public int VuokrausID(){ 
  	return this.VuokrausID;
 }
 public int DVD_nro(){ 
  	return this.DVD_nro;
 } 
  public int AS_nro(){ 
  	return this.AS_nro;
 }	
 public Date Vuokrauspaiva(){ 
  	return this.Vuokrauspaiva;
 }
  public Date Palautuspaiva(){ 
  	return this.Palautuspaiva;
 }
   public boolean Palautettu(){ 
  	return this.Palautettu;
 }
}