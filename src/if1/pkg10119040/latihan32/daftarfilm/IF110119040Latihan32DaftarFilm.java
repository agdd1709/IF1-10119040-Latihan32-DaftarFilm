/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119040.latihan32.daftarfilm;
import if1.pkg10119040.latihan32.daftarfilm.film;
/**
 *
 * @author Acer
 * Nama : Agus Deri Dermawan
 * Kelas: IF1
 * NIM  : 10119040
 * program menampilkan daftar film
 */
public class IF110119040Latihan32DaftarFilm {
public static void nowPlaying(){
       System.out.println("===Daftar Film Yang Sedang Tayang===");
       System.out.println("");
       film film1 = new film();
       film1.filmName = "Venom";
       film1.filmGenre = "Action, Horror, SciFi";
       film1.filmRating = 8.5;
       film1.filmDuration = 120;
       film1.nowPlaying();
       
       film film2 = new film();
       film2.filmName = "Small Foot";
       film2.filmGenre = "Animation";
       film2.filmRating = 9.0;
       film2.filmDuration = 96;
       film2.nowPlaying();
       
       film film3 = new film();
       film3.filmName = "Crarzy Rich Asian";
       film3.filmGenre = "Comedy";
       film3.filmRating = 7.8;
       film3.filmDuration = 119;
       film3.nowPlaying();
       
       film film4 = new film();
       film4.filmName = "Asih";
       film4.filmGenre = "Horror";
       film4.filmRating = 6.0;
       film4.filmDuration = 100;
       film4.nowPlaying();
     
       
   }
   
    public static void main(String[] args) {
    nowPlaying();
    }
    
}
