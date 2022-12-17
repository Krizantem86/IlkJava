package day18_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C10_Soru {
    public static void main(String[] args) {
//  2- Kullanicidan istedigi kadar isim alip, Q’ya bastiginda girdigi isimleri bize
 //liste olarak dondurecek bir method olusturun.


        List<String> isimlerListesi =   isimListesiOlustur();
        System.out.println(isimlerListesi);
    }


    public static List<String> isimListesiOlustur(){

        List<String> isimListesi= new ArrayList<>();
        String girilenIsim="";
        Scanner scan = new Scanner(System.in);


        while(!girilenIsim.equalsIgnoreCase("q")){

            System.out.println("Listeye eklemek icin bir isim girin\nBitirmek icin Q'ya basin");
            girilenIsim= scan.nextLine();
            if (!girilenIsim.equalsIgnoreCase("q")){//q yu 2. kez kontrol cunku kullanici tekrer isim girecek

                isimListesi.add(girilenIsim);
            }

        }
        return isimListesi;
    }
}



