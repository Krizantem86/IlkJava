package day13_methodOverloading_whileLoop.ekCalisma;

import java.util.Scanner;

public class krediKarti2 {

    public static void main(String[] args) {
        /* 11)Kullanıcıya Adını, Soyadını ve kredi kartı numaralarını sorup bunları özel forma dönüştürün.
        Ad ve soyadın baş harfleri büyük olmalıdır
        Kredi kartı numarasını kontrol edin, 16 hane yoksa "Geçersiz kredi kartı numarası" yazdırın.
                Kredi Kartı 16 Hane ise aşagıda belirtilen şekilde çıktı alın.
                Ipucu: IF ile çözebilirsiniz. Baş harfleri alın gerisi zaten * işareti ;-)
        Giriş :
		 > Gandalf Grey 563245879632
        Çıktı :
		 > İsim : G****** G***
		 > CCN : **** **** 9632 */


        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen aralarinda entera basarak adinizi soyadinizi ve kredi karti numaranizi giriniz");
        String ad=sc.next();
        String soyad=sc.next();
        String kartNo= sc.next();

        String Gizliad=ad.substring(0,1).toUpperCase();

        for (int i = 1; i <ad.length() ; i++) {

            Gizliad+="*";

        }System.out.println("> Isim : "+Gizliad);


        String Gizlisoyad=soyad.substring(0,1).toUpperCase();

        for (int i = 1; i <soyad.length() ; i++) {
            Gizlisoyad+="*";

        }System.out.println("> soyIsim : "+Gizlisoyad);

        if(kartNo.length()!=16){

            System.out.println("Gecersiz kart numarasi");
        }else {
            System.out.println("> KartNo : **** **** "+kartNo.substring(kartNo.length()-4));
        }
    }
}
/*Scanner scan=new Scanner(System.in);

        System.out.println("Please text your name: ");
        String name=scan.next();

        System.out.println("Please text your surname: ");
        String surname =scan.next();

        System.out.println("Please give your credit card number without any space: ");
        String ccn=scan.next().trim();

        String nameFormat=name.substring(0,1).toUpperCase() + name.substring(1).replaceAll("\\w", "*");
        String surnameFormat=surname.substring(0,1).toUpperCase()+surname.substring(1).replaceAll("\\w", "*");
        String ccFormat= "**** **** **** " + ccn.substring(12);

        System.out.println("Name : " + nameFormat + " " + surnameFormat);
        System.out.println("CCN : " + ccFormat);

        scan.close();*/