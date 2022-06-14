package homeworkTwo;

public class HomeWorkTwo {
    public static void main(String[] args) {
        // 1.UZDEVUMS
        // a.vai x ir pozitīvs (iegūt rezultātu true)
        int x = 5;
        System.out.println("Vai x ir pozitīvs?: " + (x > 0)); //true

        // b.vai x ir negatīvs (iegūt rezultātu false)
        System.out.println("Vai x ir negatīvs?: " + (x < 0)); //false

        // c.vai x ir lielāks par 5 un x ir mazāks vai vienāds par 10(iegūt rezultātu true)
        x = 6;
        System.out.println("Vai x ir lielāks par 5 un x ir mazāks vai vienāds par 10?: " + (x > 5 && x <= 10)); //true

        // d.vai x NAV mazāks vai vienāds par 5 un x ir mazāks par 10(iegūt rezultātu true)
        x = 6;
        System.out.println("Vai x NAV mazāks vai vienāds par 5 un x ir mazāks par 10?: " + (!(x <= 5) && x < 10));//true

        // e.vai x ir vienāds 0 vai x ir vienāds 10(rezultāts false)
        System.out.println("Vai x ir vienāds 0 vai x ir vienāds 10?: " + (x == 0 || x == 10)); //false

        // f. vai x * x reizinājums ir lielāks par 10 (rezultātus true)
        System.out.println("Vai x * x reizinājums ir lielāks par 10?: " + ((x * x) > 10)); //true

        // 2.UZDEVUMS (programma,kas pieņem Mēneša numuru(vesels skaitlis) un izvada uz ekrāna mēneša nosaukumu ar vārdu.)
        int menesaNumurs = 6;
        String menesaNosaukums;

        switch (menesaNumurs) {
            case 1:
                menesaNosaukums = "Janvāris";
                break;
            case 2:
                menesaNosaukums = "Feabruāris";
                break;
            case 3:
                menesaNosaukums = "Marts";
                break;
            case 4:
                menesaNosaukums = "Aprīlis";
                break;
            case 5:
                menesaNosaukums = "Maijs";
                break;
            case 6:
                menesaNosaukums = "Jūnijs";
                break;
            case 7:
                menesaNosaukums = "Jūlijs";
                break;
            case 8:
                menesaNosaukums = "Augusts";
                break;
            case 9:
                menesaNosaukums = "Septembris";
                break;
            case 10:
                menesaNosaukums = "Oktobris";
                break;
            case 11:
                menesaNosaukums = "Novembris";
                break;
            case 12:
                menesaNosaukums = "Decembris";
                break;
            default:
                menesaNosaukums = "Nezināmais mēnesis";
        }
        System.out.println("Mēneša nosaukums ir: " + (menesaNosaukums));

        // 3.UZDEVUMS(programma, kas pieņem trīs veselus skaitļus un izvada uz ekrāna kurš ir lielākais no šiem trīs skaitļiem)
        int skaitlisViens = 10;
        int skaitlisDivi = 15;
        int skaitlisTris = 20;
        int lielakaisSkaitlis = 0;

        if (skaitlisViens > skaitlisDivi && skaitlisViens > skaitlisTris) lielakaisSkaitlis = skaitlisViens;
        if (skaitlisDivi > skaitlisViens && skaitlisDivi > skaitlisTris) lielakaisSkaitlis = skaitlisDivi;
        if (skaitlisTris > skaitlisViens && skaitlisTris > skaitlisDivi) lielakaisSkaitlis = skaitlisTris;
        System.out.println("Lielākais skaitlis ir: " + lielakaisSkaitlis);

        //4.UZDEVUMS(programma, kas nolasa krāsu(String) sarkans/dzeltens/zaļš un izvada uz ekrāna, gājēja darbības pie luksofora.
        // Uzrakstīt arī ko darīt, ja nedeg ne zaļa/dzeltena/sarkana gaisma.)
        String krasa = "";
        if (krasa.equals("Dzeltens")) {
            System.out.println("Deg Dzeltena krāsa - gaidam!");
        } else if (krasa.equals("Sarkans")) {
            System.out.println("Deg Sarkana krāsa - gaidam!");
        } else if (krasa.equals("Zaļš")) {
            System.out.println("Deg Zaļa krāsa - ejam!");
        } else {
            System.out.println("Nedeg ne zaļa/dzeltena/sarkana gaisma - skaties vai ir brīvs ceļš!");
        }

        //5.UZDEVUMS
        printBusinessCard();
        printBusinessCard();
        printBusinessCard();

        //6.UZDEVUMS
        printBusinessCardTwo("Agnese", "Antonova", "+371 22222222", 1992);
        printBusinessCardTwo("Jānis", "Bērziņš", "+371 20000000", 1990);

        //7.UZDEVUMS
        int summa = sum(4, 10);
        System.out.println("Summa=" + (summa));

        //8.UZDEVUMS
        System.out.println("Average=" + (average(10, 2, 4)));

    }

    //5.UZDEVUMS
    static void printBusinessCard() {
        String vizitkarte = "Vizītkarte";
        String hash = "##########";
        String vards = "Agnese";
        String uzvards = "Antonova";
        String telefonaNumurs = "+371 22222222";
        int dzimsanasGads = 1992;
        System.out.println(vizitkarte + "\n" + hash + "\n" + "Vārds: " + vards + "\n" + "Uzvārds: " + uzvards + "\n"
                + "Telefona numurs: " + telefonaNumurs + "\n" + "Dzimšanas gads: " + dzimsanasGads + "\n" + hash);
    }

    //6.UZDEVUMS

    static void printBusinessCardTwo(String vards, String uzvards, String telefonaNumurs, int dzimsanasGads) {
        System.out.println("Vizītkarte" + "\n" + "##########" + "\n" + "Vārds: " + vards + "\n" + "Uzvārds: " +
                uzvards + "\n" + "Telefona numurs: " + telefonaNumurs + "\n" + "Dzimšanas gads: " + dzimsanasGads + "\n" + "##########");
    }

    //7.UZDEVUMS

    static int sum(int a, int b) {
        return a + b;
    }
    //8.UZDEVUMS

    static double average(double a, double b, double c) {
        return (a + b + c) / 3;
    }


}
