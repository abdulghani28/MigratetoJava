package bangun.bangunruang;

import bangun.bangundatar.PersegiPanjang;

public class LimasPersegiPanjang extends PersegiPanjang {
    public static double luasPermukaan, volume, tinggi;

    @Override
    public void hitungLuas() {
        super.hitungLuas();
        luasPermukaan = super.getLuas() + (PersegiPanjang.panjang * tinggi) + (PersegiPanjang.lebar * tinggi);
    }

    public void hitungVolume() {
        super.hitungLuas();
        volume = super.getLuas() * tinggi / 3;
    }
}
