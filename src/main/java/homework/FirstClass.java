package homework;

public class FirstClass {
public static void main (String[] args){

    String nosaukums = "Vācija";


    int iedzivotajuSkaits = 81757600;


    int platiba = 357021;


    String galvaspilseta = "Berlīne";


    String oficialaValoda = "Vācu valoda";


    boolean vaiIrESdalibvalsts = true;


    char valuta = '€';


    System.out.println("Valsts nosaukums : " + nosaukums);
    System.out.println("Iedzīvotāju skaits valstī : " + iedzivotajuSkaits + " iedzīvotāji");
    System.out.println("Teritoriālā platība : " + platiba + " km²");
    System.out.println("Galvaspilsēta : " + galvaspilseta);
    System.out.println("Oficiālā valoda šeit : " + oficialaValoda);
    System.out.println("Vai ir ES dalībvalsts? : " + vaiIrESdalibvalsts);
    System.out.println("Valūta : " + valuta);


    System.out.println("Nosaukums:" + " " + nosaukums + "\n" + "Iedzīvotāju skaits: " + " " + iedzivotajuSkaits + "\n" +
            "Platība:" + " " + platiba + " " + "km²" + "\n" +
            "Galvaspilsēta:" + " " + galvaspilseta + "\n" + "Oficiālā valoda:" + " " + oficialaValoda +
            "\n" + "Valūta:" + " " + valuta + "\n" + "Vai ir ES dalībvalsts?" + " " + vaiIrESdalibvalsts);




    System.out.println("Vācijas teritoriālā platība ir" + platiba + "km², kas ir viena no centrālajām Eiropas valstīm." + "" + nosaukums +
            "" + " kaimiņvalstis ir Francija, Polija u.c. ");




    int saskaitisana;
    double saskaitisanaDouble;
    int atnemsana;
    double atnemsanaDouble;
    int reizinasana;
    double reizinasanaDouble;
    int dalisana;
    double dalisanaDouble;
    double atlikums;
    char g, h;


    int a = 6;
    double b = 16.65;
    int c = 5;
    double d = 5.45;
    int e = 8;
    int f = 9;
    atlikums = 14%2;
    g = 22;
    h = 33;


    saskaitisana = a + c + e + f;
    saskaitisanaDouble = b + d + g;
    atnemsana = a - c - e - f;
    atnemsanaDouble = b - d - g;
    reizinasana = a * c * e * f;
    reizinasanaDouble = b * d * g;
    dalisana = a / c;
    dalisanaDouble = b / d / g;


    System.out.println("Saskaitīšana=" + " " + saskaitisana);
    System.out.println("SaskaitīšanaDouble=" + " " + saskaitisanaDouble);
    System.out.println(g + h);


    System.out.println("Atņemšana=" + " " + atnemsana);
    System.out.println("AtņemšanaDouble=" + " " + atnemsanaDouble);
    System.out.println(g - h);


    System.out.println("Reizināšana=" + " " + reizinasana);
    System.out.println("ReizināšanaDouble=" + " " + reizinasanaDouble);
    System.out.println(g * h);


    System.out.println("Dalīšana=" + " " + dalisana);
    System.out.println("DalīšanaDouble=" + " " + dalisanaDouble);
    System.out.println(g/h);



    System.out.println("Atlikums=" + atlikums);
    System.out.println(a+c+b +e-d*g/h + atlikums);
    System.out.println((a+c) + (b -d) - d*g/h + atlikums);
    System.out.println(a+c+e-d*g/h);
}
}
