package homework;

import java.util.Arrays;
import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {

        //1.UZDEVUMS

        int result = 0;
        while (result < 100) {
            Scanner scanner = new Scanner(System.in);
            int number;
            System.out.println("1.UZDEVUMS. Ievadi veselu skaitli:");
            number = scanner.nextInt();
            result += number;//result=result+number
        }

        System.out.println("Gatavs");
        //////////////////////////////////////////////////////////

        //2.UZDEVUMS
        Scanner scanner = new Scanner(System.in);
        int skaitlis;
        boolean irParaSkaitlis = true;
        System.out.println("2.UZDEVUMS. Ievadi veselu skaitli!");
        skaitlis = scanner.nextInt();
        int i = 2;
        if (skaitlis <2){
            irParaSkaitlis=false;
        }
        else {
            while (i <= skaitlis / 2) {
                if (skaitlis % i == 0) {
                    irParaSkaitlis = false;
                    break;
                }
                i++;
            }
        }
        if (irParaSkaitlis) {
            System.out.println(skaitlis + ": ir pirmskaitlis");
        } else {
            System.out.println(skaitlis + ": nav pirmskaitlis");
        }

        //3.UZDEVUMS

        int[] telefonaNumuri = {28799264, 20093420, 20084212, 26854978, 20023454, 20067898, 20092123, 20086743};
        String[] krasas = {"zila", "melna", "balta", "dzeltena", "sarkana", "zaļa", "oranža", "violeta"};
        char[] energoEfektivitatesKlases = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};

        //WHILE int
        int e = 0;
        System.out.println("3.UZDEVUMS. WHILE METODE:");
        while (e < telefonaNumuri.length) {
            System.out.println("Telefona numurs: " + telefonaNumuri[e]);
            e = e + 1;
        }

        //WHILE String
        int q = 0;
        while (q < krasas.length) {
            System.out.println("Krāsa: " + krasas[q]);
            q = q + 1;
        }

        //WHILE char
        int w = 0;
        while (w < energoEfektivitatesKlases.length) {
            System.out.println("Energoefektivitātes klase: " + energoEfektivitatesKlases[w]);
            w = w + 1;
        }

        // DO WHILE String
        int y = 0;
        System.out.println("3.UZDEVUMS. WHILE DO METODE:");
        do {
            System.out.println("Krāsa: " + krasas[y]);
            y++;
        } while (y < krasas.length);

        // DO WHILE int
        int u = 0;
        do {
            System.out.println("Telefona numuri: " + telefonaNumuri[u]);
            u++;
        } while (u < telefonaNumuri.length);

        // DO WHILE char
        int s = 0;
        do {
            System.out.println("Energoefektivitātes klase: " + energoEfektivitatesKlases[s]);
            s++;
        } while (s < energoEfektivitatesKlases.length);

        //FOR LOOP int
        System.out.println("3.UZDEVUMS. FOR LOOP:");
        for (int j = 0; j < telefonaNumuri.length; j++) {
            System.out.println("Telefona numuri: " + telefonaNumuri[j]);
        }

        //FOR LOOP String
        for (int f = 0; f < krasas.length; f++) {
            System.out.println("Krāsa: " + krasas[f]);
        }

        //FOR LOOP char
        for (int m = 0; m < energoEfektivitatesKlases.length; m++) {
            System.out.println("Energoefektivitātes klase: " + energoEfektivitatesKlases[m]);
        }

        //FOR EACH int
        System.out.println("3.UZDEVUMS. FOR EACH:");
        for (int t : telefonaNumuri) {
            System.out.println("Telefona numuri: " + t);
        }

        //FOR EACH String
        for (String z : krasas) {
            System.out.println("Krāsa: " + z);
        }

        //FOR EACH char
        for (char v : energoEfektivitatesKlases) {
            System.out.println("Energoefektivitātes klase: " + v);
        }
        ///////////////////////////////////

        // 4.UZDEVUMS
        System.out.println("4.UZDEVUMS");
        int[] masivsArizmeruSimts = new int[100];
        int paraSkaitlis = 2;
        for (int d = 0; d < 100; d = d + 1) {
            masivsArizmeruSimts[d] = paraSkaitlis;
            paraSkaitlis += 2;
        }
        System.out.println("Pāra skaitļi ir: " + Arrays.toString(masivsArizmeruSimts));

        //6.UZDEVUMS
        System.out.println("6.UZDEVUMS");
        final int PIN = 1234;
        int a;
        System.out.println("Ievadi PIN!");
        for (int j = 0; j < 3; j++) {
            a = scanner.nextInt();
            if (a == PIN) {
                System.out.println("PIN ir pieņemts, laipni lūdzam atpakaļ");
                break;
            } else if (a != PIN && j<2) {
                System.out.println("Nepareizs PIN, mēģiniet vēlreiz");
            } else {
                System.out.println("Atvainojiet, bet jūs esat bloķēt");
            }
        }


        ///////////////////////////////////
        // 5.UZDEVUMS IZVADE
        System.out.println("5.UZDEVUMS");
        System.out.println("Faktoriāls = " + aprekinatFaktorialu(8));
    }

    // 5.UZDEVUMS
    public static int aprekinatFaktorialu(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }


}


