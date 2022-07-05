package homework.classHomework;

public class Main {

    public static void main(String[] args) {
        trīsstūris trissturisPirmais = new trīsstūris();
        trissturisPirmais.malaA = 3;
        trissturisPirmais.malaB = 4;
        trissturisPirmais.malaC = 5;
        System.out.println(trissturisPirmais.aprekinatLaukumu());
        System.out.println(trissturisPirmais.vienadmalu());
        System.out.println(trissturisPirmais.vienadsanu());



        trīsstūris trissturisOtrais = new trīsstūris(18, 17, 13);
        System.out.println(trissturisOtrais.laukums);
        System.out.println(trissturisOtrais.vienadmalu());
        System.out.println(trissturisOtrais.vienadsanu());

    }
}
