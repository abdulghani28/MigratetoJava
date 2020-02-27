package bangun.bangunruang;

import bangun.bangundatar.Segitiga;

public class PrismaSegitiga extends Segitiga {
    public static double volume, tinggi;
    public static double luas;

    public void hitungVolume() {
        super.hitungLuas();
        volume = super.getLuas() * tinggi;
    }

    @Override
    public void hitungLuas() {
        super.hitungLuas();
        luas = super.getLuas() * 2 + super.getKeliling() * tinggi;
    }
}
