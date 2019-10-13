/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : Program yang berisikan daftar film yang diputar  
 */

/**
 *
 * @author Fatahillah Seno
 */
public class Film {

    public String filmName;
    public String filmGenre;
    public double filmRating;
    public int filmDuration;

    public void nowPlaying(String filmName, String filmGenre, double filmRating, int filmDuration) {
        System.out.printf("%nJudul Film\t: %s%n", filmName);
        System.out.printf("Genre Film\t: %s%n", filmGenre);
        System.out.printf("Rating Film\t: %.1f%n", filmRating);
        System.out.printf("Duration Film\t: %d menit%n", filmDuration);
    }

}
