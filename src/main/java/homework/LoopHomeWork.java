package homework;

import java.util.Arrays;
import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {

        //1.UZD

        int result = 0;
        while (result < 100) {
            Scanner scanner = new Scanner(System.in);
            int number;
            System.out.println("1.UZD. Ievadi veselu skaitli:");
            number = scanner.nextInt();
            result += number;
        }

        System.out.println("1.UZD. Gatavs");

        //2.UZD

        int a = 5;
        boolean vaiIrPirmskaitlis = (a > 1);
        {

            if (a % 2 == 0 && a != 2) {
                vaiIrPirmskaitlis = false;
                System.out.println("Skaitlis " + a + " ir pirmskaitlis " + vaiIrPirmskaitlis);

            } else if (a % 3 == 0 && a != 3) {
                vaiIrPirmskaitlis = false;
                System.out.println("Skaitlis " + a + " ir pirmskaitlis " + vaiIrPirmskaitlis);

            } else if (a % 5 == 0 && a != 5) {
                vaiIrPirmskaitlis = false;
                System.out.println("Skaitlis " + a + " ir pirmskaitlis " + vaiIrPirmskaitlis);
            } else {
                vaiIrPirmskaitlis = true;
                System.out.println("Skaitlis " + a + " ir pirmskaitlis " + vaiIrPirmskaitlis);

            }

        }




        //3.UZD

        int[] numuri = {5345, 54358, 2354, 54345, 21234, 8765364, 3674, 43522};
        String[] krasas = {"zila", "zaļa","balta", "melna", "dzeltena", "sarkana", "violeta", "oranža"};
        char[] burti = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        int x = 0;
        System.out.println("3.UZD. WHILE METODE:");
        while (x < numuri.length) {
            System.out.println("Numurs: " + numuri[x]);
            x = x + 1;
        }


        int y = 0;
        while (y < krasas.length) {
            System.out.println("Krāsa: " + krasas[y]);
            y = y + 1;
        }


        int u = 0;
        while (u < burti.length) {
            System.out.println("Burti: " + burti[u]);
            u = u + 1;
        }


        int o = 0;
        System.out.println("3.UZ. WHILE DO METODE:");
        do {
            System.out.println("Krāsa: " + krasas[o]);
            o++;
        } while (o < krasas.length);


        int p = 0;
        do {
            System.out.println("Numuri: " + numuri[p]);
            p++;
        } while (p < numuri.length);


        int s = 0;
        do {
            System.out.println("Burti: " + burti[s]);
            s++;
        } while (s < burti.length);


        System.out.println("3.UZD. FOR LOOP:");
        for (int j = 0; j < numuri.length; j++) {
            System.out.println("Numuri: " + numuri[j]);
        }


        for (int k = 0; k < krasas.length; k++) {
            System.out.println("Krāsa: " + krasas[k]);
        }


        for (int l = 0; l < burti.length; l++) {
            System.out.println("Burti: " + burti[l]);
        }


        System.out.println("3.UZD. FOR EACH:");
        for (int m : numuri) {
            System.out.println("Numuri: " + m);
        }


        for (String n : krasas) {
            System.out.println("Krāsa: " + n);
        }


        for (char b : burti) {
            System.out.println("Burti: " + b);
        }


        // 4.UZD
        System.out.println("4.UZD");
        int[] masivs = new int[100];
        int paraSkaitlis = 2;
        for (int v = 0; v < 100; v = v + 1) {
            masivs[v] = paraSkaitlis;
            paraSkaitlis += 2;
        }
        System.out.println("Pāra skaitļi ir: " + Arrays.toString(masivs));




        //6.UZD
        System.out.println("6.UZD");
        final int PIN = 3389;
        int z;
        System.out.println("Ievadiet PIN!");
        for (int q = 0; q < 3; q++) {
            Scanner scanner = new Scanner(System.in);
            z = scanner.nextInt();
            if (z == PIN) {
                System.out.println("PIN ir pieņemts, laipni lūdzam atpakaļ");
                break;
            } else if (z != PIN && q<2) {
                System.out.println("Nepareizs PIN, mēģiniet vēlreiz");
            } else {
                System.out.println("Atvainojiet, bet jūs esat bloķēts");
            }
        }



        // 5.UZD
        System.out.println("5.UZD");
        System.out.println("Faktoriāls = " + faktorials(4));
    }

    // 5.UZD
    public static int faktorials(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }


}


