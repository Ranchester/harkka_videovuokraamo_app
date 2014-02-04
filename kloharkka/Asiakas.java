import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Asiakas-luokka käyttöliittymäohjelmoinnin harjoitustyöhön
 * @author Juha Kärkkäinen
 * @version 1.0 (16.4 2012)
 */
public class Asiakas
{ 
 private String AS_etunimi,AS_sukunimi,AS_katuosoite,AS_postinumero,AS_postitoimipaikka,AS_puh,AS_sotu;
 private int AS_nro;
 
 public Asiakas(String AS_etunimi,String AS_sukunimi,String AS_katuosoite,String AS_postinumero,String AS_postitoimipaikka,String AS_puh,String AS_sotu, int AS_nro)
 {
   this.AS_nro = AS_nro;
   this.AS_etunimi = AS_etunimi;
   this.AS_etunimi = AS_sukunimi;
   this.AS_katuosoite = AS_katuosoite;
   this.AS_postinumero = AS_postinumero;
   this.AS_postitoimipaikka = AS_postitoimipaikka;
   this.AS_puh = AS_puh;
   this.AS_sotu = AS_sotu;
 }
 public int AS_nro(){ 
  	return this.AS_nro;
 } 	
  public String AS_etunimi(){ 
  	return this.AS_etunimi;
 } 
 	 public String AS_sukunimi(){ 
  	return this.AS_sukunimi;
 } 
  public String AS_katuosoite(){ 
  	return this.AS_katuosoite;
 } 
  public String AS_postinumero(){ 
  	return this.AS_postinumero;
 } 
  public String AS_postitoimipaikka(){ 
  	return this.AS_postitoimipaikka;
 } 
  public String AS_puh(){ 
  	return this.AS_puh;
 } 
  public String AS_sotu(){ 
  	return this.AS_sotu;
 } 
}