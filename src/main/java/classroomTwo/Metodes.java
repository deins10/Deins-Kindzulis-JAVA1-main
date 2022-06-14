package classroomTwo;
import java.util.Scanner;

public class Metodes {
    public static void main(String[] args) {
        System.out.println("Sākās koda izpilde");
    checkPersonAge();
        checkPersionPension2(65,'V');
        int manaKvadrataLaukums = aprekinatKvadrataLaukumu(5);
        System.out.println("Kvadrata laukums ir:" + manaKvadrataLaukums);
        System.out.println("Beidzās koda izpilde");
    }

    static void checkPersonAge() {
        System.out.println("Sākās metodes izpilde");
       System.out.println("Ievadi vecumu...");
        Scanner scanner = new Scanner(System.in);
        int vecumsTris = scanner.nextInt();
        if (vecumsTris >= 18) {
           System.out.println("Cilvēks drīkst balsot");
        } else {
            System.out.println("Cilvēks nedrīkst balsot");
        }
        System.out.println("Beidzās metodes izpilde");
    }

    static void checkPersionPension2(int vecums,char dzimums){
        boolean drikstDotiesPensija = false;
        if (vecums >= 65 && dzimums == 'V') {
            drikstDotiesPensija = true;
        } else if (vecums >= 60 && dzimums == 'S') {
            drikstDotiesPensija = true;
        }
        if (drikstDotiesPensija) {
            System.out.println(String.format("Dzimums: %s, Vecums: %s",dzimums,vecums));
            System.out.println("Cilveks drikst doties pensija!");
        }else{
            System.out.println(String.format("Dzimums: %s, Vecums: %s",dzimums,vecums));
            System.out.println("Cilveks nedrikst doties pensija!");
        }
    }



    static int aprekinatKvadrataLaukumu(int mala){
        int laukums = mala * mala;
        return laukums;
    }


    static void checkPersonPension() {
        int cilvekaVecums = 65;
        char cilvekaDzimums = 'V';
        boolean drikstDotiesPensija = false;

        if (cilvekaVecums >= 65 && cilvekaDzimums == 'V') {
            drikstDotiesPensija = true;
        } else if (cilvekaVecums >= 60 && cilvekaDzimums == 'S') {
            drikstDotiesPensija = true;
        }

        if (drikstDotiesPensija) {
            System.out.println("Cilveks drikst doties pensija!");
        }
    }

}
