/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : Program yang berisikan daftar film yang diputar  
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Film nonton = new Film();

        System.out.println("===Daftar Film Sedang Tayang===");
        nonton.nowPlaying("Venom", "Action, Horror, Scifi", 8.5, 120);
        nonton.nowPlaying("Small Foot", "Animation", 9.0, 96);
        nonton.nowPlaying("Crazy Rich Asian", "Comedy", 7.8, 119);
        nonton.nowPlaying("Asih", "Horror", 6.0, 100);
    }

}
