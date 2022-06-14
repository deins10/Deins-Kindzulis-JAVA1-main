package classroomTwo;

import java.util.Scanner;

public class PracticalTaskTwo {



    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        //     System.out.println("Ievadi savu vārdu!");
        //    String name = scanner.nextLine();
        //   System.out.println("Ievadi savu vecumu" );
        //   int age = scanner.nextInt();
        //        System.out.println(String.format("Esi sveicināts: %s !" ,name));
        //    System.out.println("Jūsu vecums ir:" + age);

        //       System.out.println("Ievadi pirmo skaitli!");
        //      int pirmaisSkaitlis = scanner.nextInt();
        //       System.out.println("Ievadi otro skaitli!");
        //      int otraisSkaitlis = scanner.nextInt();
        //       System.out.println("Skaitļu summa ir:" + (pirmaisSkaitlis+otraisSkaitlis));


        int a = 5;
        int b = 10;
        int c = 5;
        int d = 11;

        //Lielāks >
        System.out.println(b > a); // true
        System.out.println(a > b); // false
        //Mazaks <
        System.out.println(a < b); // true
        System.out.println(b < a); // false
        //vienāds ==
        System.out.println(a == c); // true
        System.out.println(a == b); // false
        System.out.println(b == c); // false
        // nav vienāds !=
        System.out.println(a != b); // true
        System.out.println(a != c); // false
        // mazāks vienāds <=
        System.out.println(a <= c); // true
        //lielāks vienāds >=
        System.out.println(b >= d); // true

        int vecums = 18;
        boolean vaiDrikstBalsot = (vecums >= 18);
        System.out.println("Vai cilvēks drīkst balsot" + vaiDrikstBalsot);


        String name = "Agnese";
        String secondName = "Agnese";
        //String salidzinasana
        boolean vaiVardiSakrīt = (name.equals(secondName));
        System.out.println("vai vardi sakrit? " + vaiVardiSakrīt);


        //Loģiskie operatori

        int e = 4;
        boolean vaiIrPatiess = ((e < 5) && (e < 10));
        System.out.println(vaiIrPatiess);

        e = 5;
        vaiIrPatiess = ((e < 5) && (e < 10));
        System.out.println(vaiIrPatiess);

        vaiIrPatiess = ((e < 5) || (e < 10));
        System.out.println(vaiIrPatiess);

        e = 5;
        vaiIrPatiess = (!(e < 5));
        System.out.println(vaiIrPatiess);

        System.out.println(!(false == true));

        int vecumsDivi = 17;
        if (vecumsDivi >= 18) {
            System.out.println("Cilvēks drīkst balsot");

        } else {
            System.out.println("Cilvēks nedrīkst balsot");
        }

        System.out.println("Ievadi savu vecumu...");
        int vecumsTris = scanner.nextInt();
        if (vecumsTris >= 18) {
            System.out.println("Cilvēks drīkst balsot");
        } else {
            System.out.println("Cilvēks nedrīkst balsot");
        }

        System.out.println("Koda turpinājums");


        System.out.println("Ievadi skaitli..");
        int skaitlisViens = scanner.nextInt();
        if (skaitlisViens == 10) {
            System.out.println("Printejam Skaitlis 10");
        } else if (skaitlisViens == 15) {
            System.out.println("Printejam Skaitlis 15");
        } else if (skaitlisViens == 20) {
            System.out.println("Printejam Skaitlis 20");
        } else {
            System.out.println("Skaitlis ir nezināms");
        }

        //Janodefine cilveks
        //Cilveka vecums
        //cilveka dzimums - V vai S
        // Sieviete drikst doties pensija no 60 gadiem
        // Virietis drikst doties pensija no 65 gadiem

        int cilvekaVecums = 63;
        char cilvekaDzimums = 'S';

        boolean drikstDotiespensija = false;

        if ((cilvekaDzimums == 'S') && (cilvekaVecums >= 60)) {
            drikstDotiespensija = true;

        } else if ((cilvekaDzimums == 'V') && (cilvekaVecums >= 65)) {
            drikstDotiespensija = true;
        }
        if (drikstDotiespensija) {
            System.out.println("Cilvēks drīkst doties pensijā!");
        }
        //      if((cilvekaDzimums == 'S')&&(cilvekaVecums >= 60)) {
        //          System.out.println("Sieviete - drīkst doeties pensijā");
        //      } else if((cilvekaDzimums == 'S')&&(cilvekaVecums < 60)){
        //     } else if((cilvekaDzimums == 'V')&&(cilvekaVecums >= 63)){
        //         System.out.println("Virietis - drīkst doeties pensijā");
        //     } else {
        //        System.out.println("Virietis - nedrīkst doeties pensijā");


        // Switch
        int diena = 3;
        String dienasVards;

        switch (diena) {
            case 1:
                dienasVards = "Pirmdiena";
                break;
            case 2:
                dienasVards = "Otrdiena";
                break;
            case 3:
                dienasVards = "Trešdiena";
                break;
            case 4:
                dienasVards = "Ceturdiena";
                break;
            case 5:
                dienasVards = "Piektdiena";
                break;
            case 6:
                dienasVards = "Sestdiena";
                break;
            case 7:
                dienasVards = "Svētdiena";
                break;
            default:
                dienasVards = "Nezināma diena";
        }

        System.out.println(dienasVards);
        //uzdevumi

        System.out.println("Ievadi veselu skaitli!");
        int veselsSkaitlis = scanner.nextInt();
        if (veselsSkaitlis == 0) {
            System.out.println("Skaitlis ir 0");
        } else if (veselsSkaitlis < 0) {
            System.out.println("Skaitlis ir lielāks par 0");
        } else {
            System.out.println("Skaitlis ir mazāks par 0");
        }


        int skaitlis = 4;
        if(skaitlis%2==0) {
            System.out.println("Skaitlis ir para skaitlis");
        } else{
            System.out.println("Skaitlis ir nepara skaitlis");
        }
    }
}





