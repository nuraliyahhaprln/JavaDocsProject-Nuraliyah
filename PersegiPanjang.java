/**
 * Kelas persegi panjang digunakan untuk menghitung luas dan keliling persegi panjang
 * @author Nuraliyah Apriliani
 * NIM : 10122439
 * @version 1.0
 * @since 2025
 */

public class PersegiPanjang {
    private double panjang;
    private double lebar;

    /**
     * Membuat objek persegi panjang
     * @param panjang panjang persegi panjang dalam cm
     * @param lebar lebar persegi panjang dalam cm
     */

    public PersegiPanjang (double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    /** 
     * Menghitung luas persegi panjang
     * @return nilai luas dalam cm^2
     */
    public double hitungLuas() {
        return panjang * lebar;
    }

    /**
     * Menghitung keliling persegi panjang
     * @return nilai kelilingg dalam cm^2
     */

     public double hitungKeliling() {
        return 2 * (panjang + lebar);
     }
}
