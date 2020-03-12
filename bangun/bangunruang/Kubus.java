package bangun.bangunruang;

import bangun.bangundatar.Persegi;

public class Kubus extends Persegi {
    public static double volumeKubus;
    public static double luasKubus;

    public void hitungVolume(){
        super.hitungLuas();
        volumeKubus = super.getLuasPersegi() * Persegi.sisi ;
    }

    @Override
    public void hitungLuas() {
        super.hitungLuas();
        luasKubus = super.getLuasPersegi() * 6 ;
    }
}
