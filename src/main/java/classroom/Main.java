package classroom;

public class Main {
    public static void main (String[] args) {
        //(mainīgā tips) (mainīgā nosaukums) = (vērtība);
        int vecumsSuns = 3; //Vesels skaitlis
        String vardsSuns = "Reksis"; //teksts
        double svarsSuns = 15.8; //Daļskaitlis
        float augumsSuns = 60.2F; //Dalskaitlis
        boolean isHungry=true; //true vai false vērtība var būt;true=1; false=0

        //(mainīgā tips) (mainiga nosaukums) = (vērtība);
        int gadaApgrozijumsDolaros = 2147483647;
        byte monthsInYear = 12;
        short autoPrice = 12312;
        long netIncome = 2147483699L;
        System.out.println(gadaApgrozijumsDolaros + "\n" + monthsInYear + "\n" + autoPrice + "\n" + netIncome);
        char dzimums = 'V';
        char vadītājaKategorija = 'B';

        System.out.println("Mans suns");
        System.out.println("Vards");
        System.out.println(vardsSuns);
        System.out.println("Vecums");
        System.out.println(vecumsSuns);
        System.out.println("mana suņa svars");
        System.out.println(svarsSuns + "kg" + "\n");
        System.out.println("mana suņa augstums" + "" + augumsSuns + "cm");
        System.out.println ("Vai mans sun ir izsalcis?");
        System.out.println(isHungry);

        int vecumsKakis = 10;
        String vardsKakis = "Asajs";

        System.out.println("Mans kakis");
        System.out.println("Vards");
        System.out.println(vardsKakis);
        System.out.println("Vecums");
        System.out.println(vecumsKakis);

        System.out.println("Kaķa un suņā kopējais vecums ir:");
        System.out.println(vecumsKakis+vecumsSuns);

        System.out.println(vardsSuns+" " + vardsKakis);


        System.out.println("Hello Agnese");
    //aritmetiskie operatori
        int summa;
        int starpiba;
        int reizinajums;
        double dalijums;
        int atlikums;
        int x = 5;
        int y = 10;
        double z= 5;
        double q= 10;
        summa = x + y;
        starpiba = x - y;
        reizinajums = x * y;
        dalijums = z / q;
        atlikums = 12%5;

        System.out.println("SUMMA" + summa);
        System.out.println("starpiba" + starpiba);
        System.out.println("reizinajums" + reizinajums);
        System.out.println("Dalījums" + dalijums);
        System.out.println("Atlikums" + atlikums);

        double lowestTemperature = -20.4;
        float highestTemperature = 40.65512312F;
        System.out.println("Augstaka temp ir " + highestTemperature + "zemaka temp ir " + lowestTemperature);
        String teikums = String.format("Augstākā temperatūra ir %.2f Zemākā temperatūra ir %s",highestTemperature,lowestTemperature);
        System.out.println(teikums);



    }

}