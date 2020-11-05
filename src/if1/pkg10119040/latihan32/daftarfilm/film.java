/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119040.latihan32.daftarfilm;

/**
 *
 * @author Acer
 */
public class film {
    public String filmName;
    public String filmGenre;
    public Double filmRating;
    public int filmDuration;
    
    public void nowPlaying(){
       
       System.out.println("Judul Film : " + this.filmName);
       System.out.println("Genre Film : " + this.filmGenre);
       System.out.println("Rating Film : " + this.filmRating);
       System.out.println("Duration Film : " + this.filmDuration + " Menit ");
       System.out.println("");
    }
    
}
