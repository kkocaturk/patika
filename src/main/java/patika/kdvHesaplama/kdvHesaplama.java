package patika.kdvHesaplama;

import java.util.Scanner;

public class kdvHesaplama {
    public static void main(String[] args) {
        double fiyat;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lutfen Kdv hesaplanacak Tutari giriniz : ");
        fiyat = inp.nextDouble();

        if(fiyat >=0 && fiyat <= 1000){
            fiyatHesapla(fiyat, 0.18);
        }else
            fiyatHesapla(fiyat, 0.10);



    }
    public static void fiyatHesapla(Double fiyat,double kdv){
        double kdvTutari= kdv * fiyat;
        double kdvliTutar= fiyat+kdvTutari;

        System.out.println("KDV'siz Fiyat = " + fiyat);
        System.out.println("KDV Orani = " + kdv);
        System.out.println("KDV'li Fiyat = " + kdvliTutar);
        System.out.println("KDV tutari = " + kdvTutari);
    }
}