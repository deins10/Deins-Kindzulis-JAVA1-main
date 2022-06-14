
        package classroomThree;


        import java.util.Random;
        import java.util.Scanner;

public class Masivi {
  public static void main(String[] args) {

    Random skaitluGenerators = new Random();
    for (int i = 0; i < 1000 ; i++) {
      System.out.println(skaitluGenerators.nextInt(1000));
    }
    int nejaussSkaitlis = skaitluGenerators.nextInt(50);
    System.out.println(nejaussSkaitlis);


//        majuParbaude(1990,2000,1996);
//        majuParbaude(1,10,2);
//        majuParbaude(1,330003,1996);
//        int sakotnejs = 0;
//        while(sakotnejs<=1000){
//            System.out.println(sakotnejs);
//            sakotnejs = sakotnejs + 2;
//        }

    String pietura = "Centrālā stacija";
    //saraksts/array/masīvs
    String[] stacijas = {"Centrālā", "Torņakalns", "Majori", "Jūrmala", "Brasla", "Centrālā", "Torņakalns"};
    String[] pieturas = {"Centrālā stacija", "Marijas iela", "Bērnu pasaule", "Ziedoņdārzs", "PieturaX"};

    printetTekstaMasivu(stacijas);
    printetTekstaMasivu(pieturas);


    int[] majuNumuri = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    for (int numuri : majuNumuri) {
      System.out.println(numuri);
    }

    printetIntegerMasivu(majuNumuri);

    char[] patskani = {'a', 'e', 'u', 'i'};

    System.out.println(pieturas[0] + pieturas[1] + pieturas[2] + pieturas[3]);
    pieturas[3] = "Zemitanu  STACIJA";
    System.out.println(pieturas[0] + pieturas[1] + pieturas[2] + pieturas[3]);

    System.out.println("Cik pieturas ir masīvā? " + pieturas.length);
    System.out.println("Cik majas  ir uz ielas? " + majuNumuri.length);

    String[] hokejaCempioniTopTris = new String[3];
    System.out.println("Cik vietas ir čempionātā? " + hokejaCempioniTopTris.length);
    String pirmaVieta = "Somija";
    String otraVieta = "Kanāda";
    String tresaVieta = "Čehija";

    hokejaCempioniTopTris[0] = pirmaVieta;
    hokejaCempioniTopTris[1] = otraVieta;
    hokejaCempioniTopTris[2] = tresaVieta;

    System.out.println(hokejaCempioniTopTris[0] + "\n" + hokejaCempioniTopTris[1] + "\n" + hokejaCempioniTopTris[2]);


    System.out.println("Cikls sākās");
    int i = 0;
    while (i < 5) {
      //kods kurs izpildās, ja nosacījums ir true(patiess)
      System.out.println(i);
      i = i + 1;
    }

    System.out.println("Cikls beidzās");

    int y = 0;
    do {
      System.out.println("DO WHILE" + y);
      y = y + 1;//y++;y
    } while (y < 10);


    Scanner scanner = new Scanner(System.in);
    String parole = "Parole123";
    String lietotajaIevaditaParole;

//        do {
//            System.out.println("Ievadi paroli!");
//            lietotajaIevaditaParole = scanner.nextLine();
//            System.out.println("Notiek paroles pārbaude");
//        } while (!lietotajaIevaditaParole.equals(parole));
//        System.out.println("Pareiza parole");

    //like cilvekam ievadit pozitivu skaitli, ja ievada 0 vai negativs, likt ievadit atkal.
    // Ja ir pozitivs, beigt darbu

//        int number;
//        do {
//            System.out.println("Ievadi pozitivu skaitli");
//            number = scanner.nextInt();
//        }while(number<=0);
//        System.out.println("Derigs skatilis " + number);


    for (int j = 0; j >= -100; j--) {
      System.out.println("FOR CIKLS" + j);
    }

    for (int j = 0; j <= 10; j = j + 2) {
      System.out.println(j);
    }

    String[] mansMasivs = {"Juris", "Anna", "Peteris", "Jānis"};
    for (String xxxx : mansMasivs) {
      System.out.println("LEKCIJA MASIVI");
    }


    for (int j = 0; j < mansMasivs.length; j++) {
      System.out.println(mansMasivs[j]);
    }

    System.out.println("Cikla sakums");
    for (int j = 0; j < 10; j++) {
      if (j == 5) {
        System.out.println("J ir 5, lauzam ciklu");
        break;
      }
      System.out.println("PRINT BREAK EXAMPLE:" + j);
    }
    System.out.println("Cikla beigas");

    int[] skaitluMasivs = {3, 4, 6, 7, 2, 1, -5, 4, 2, 6, -4, -3, 3};
    //atrast masīvā pirmo negatīvo skaitli un izvadīt to un  tā indexu(poziciju) uz ekrāna

    for (int j = 0; j < skaitluMasivs.length; j++) {
      if (skaitluMasivs[j] < 0) {
        System.out.println("Pirmais negativais skaitlis: " + skaitluMasivs[j]);
        System.out.println("Indekss ir: " + j);
        break;
      }
    }

    int[] skaitluMasivs2 = {3, 4, 6, 7, 2, 1,-5, 4, 2, 6, -4, -3, 3};
    for (int j = 0; j < skaitluMasivs2.length; j++) {
      if(skaitluMasivs[j]<0){
        continue;
      }
      System.out.println("Vertiba no masiva: " + skaitluMasivs2[j]);
    }
  }

  static void printetTekstaMasivu(String[] randomMasivs) {
    int skaititajs = 0;
    while (skaititajs < randomMasivs.length) {
      System.out.println(randomMasivs[skaititajs]);
      skaititajs = skaititajs + 1;
    }
  }

  static void printetIntegerMasivu(int[] kautKo) {
    int i = 0;
    System.out.println("=========MASĪVS SĀKAS=======");
    while (i < kautKo.length) {
      System.out.println(kautKo[i]);
      i++; //i = i + 1;
    }
    System.out.println("=========MASĪVS BEIDZAS=======");
  }

  static void majuParbaude(int sakums, int beigas, int iznemums) {
    int majuNumuri = sakums;
//        while (majuNumuri <= beigas)
    for (int i = majuNumuri; i <= beigas; i++) {
      if (majuNumuri % 3 == 0 || majuNumuri % 5 == 0 || majuNumuri == iznemums) {
        System.out.println("šie māju numuri neder" + majuNumuri);
      } else {
        System.out.println("šie māju numuri DER " + majuNumuri);
      }
    }
  }

}

