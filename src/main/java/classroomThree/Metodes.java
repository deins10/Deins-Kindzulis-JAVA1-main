package classroomThree;
import java.util.Scanner;
public class Metodes {
    public static void main(String[] args) {
        Scanner skeneris = new Scanner(System.in);
        kvadrataLaukums(3);
        int b = 9;
        int a = kvadrataLaukums(3);
        float c = taisnturaLaukums(3,5);
        System.out.println("Kvadrata Laukums" + a);
        System.out.println("Taisntūra Laukums" +c);
        printetTekstu(a,c);
        printetTekstu(a,c);

    }
    static int kvadrataLaukums(int mala) {
        int laukums = mala * mala;
        return laukums;
    }

    static float taisnturaLaukums(float a, float b) {
        float s = a*b;
        return s;
    }

    static void printetTekstu(int a, float c) {
        System.out.println("Kvadrata Laukums" + a);
        System.out.println("Taisntūra Laukums" +c);

    }


}
