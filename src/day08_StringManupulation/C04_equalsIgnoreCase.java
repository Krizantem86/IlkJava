package day08_StringManupulation;

public class C04_equalsIgnoreCase {
    public static void main(String[] args) {


String str1="Pazar";
String str2= "PAZAR";
String str3= "pazar";
String str4= "PaZaR";
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1==str4);
        System.out.println("=============");
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));

        /*
          Eger iki metni KARSILASTIRIRKEN buyuk harf-kucuk harf duyurliligi (case sensitive)
          onemsiz ise o zaman
          equalsIgnoreCase() kullanilir
         */


        System.out.println("=================");

        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.equalsIgnoreCase(str4));




    }

}
