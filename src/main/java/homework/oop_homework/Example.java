package homework.oop_homework;
import java.util.Date;

public class Example {

    public static void main(String[] args) {

        Customer customer1 = new Customer("Janka");
        customer1.setMember(true);
        customer1.setMemberType("Premium biedrs");

        Customer customer2 = new Customer("Dita");
        customer2.setMember(true);
        customer2.setMemberType("Gold biedrs");

        Customer customer3= new Customer("Mārtiņš");
        customer3.setMember(true);
        customer3.setMemberType("Silver biedrs");

        Customer customer4 = new Customer("Ēriks");
        customer4.setMember(false);



        Visist v1 = new Visist(customer1, new Date());
        Visist v2 = new Visist(customer2, new Date());
        Visist v3 = new Visist(customer3, new Date());
        Visist v4 = new Visist(customer4, new Date());


        v1.setProductExpense(35);
        v1.setServiceExpense(25);
        System.out.println(v1);
        System.out.println("Kopējā cena (ar atlaidi) " + v1.getName() + " = " + v1.getTotalExpense() + " EUR ");

        v2.setProductExpense(5);
        v2.setServiceExpense(40);
        System.out.println(v2);
        System.out.println("Kopējā cena (ar atlaidi) " + v2.getName() + " = " + v2.getTotalExpense() + " EUR ");


        v3.setProductExpense(15);
        v3.setServiceExpense(20);
        System.out.println(v3);
        System.out.println("Kopējā cena (ar atlaidi) " + v3.getName() + " = " + v3.getTotalExpense() + " EUR ");

        v4.setProductExpense(45);
        v4.setServiceExpense(30);
        System.out.println(v4);
        System.out.println("Kopējā cena (ar atlaidi) " + v4.getName() + " = " + v4.getTotalExpense() + " EUR ");

    }
}
