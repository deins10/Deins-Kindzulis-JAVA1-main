package homework.oop_homework;
import java.util.Date;

public class Customer {
    private String vards;
    private boolean klients = false;
    private String klientaVeids;
    private Date date;

    public Customer(String name){
        this.vards = name;
    }

    public String getName() {
        return vards;
    }

    public boolean isMember() {
        return klients;
    }

    public String getMemberType() {
        return klientaVeids;
    }

    public void setMember(boolean member) {
        this.klients = member;
    }

    public void setMemberType(String memberType) {
        this.klientaVeids = memberType;
    }

    @Override
    public String toString() {
        return "Klients{" +
                "Vārds ='" + vards + '\'' +
                ", Biedrs =" + klients +
                ", Abonomets ='" + klientaVeids + '\'' +
                '}';
    }
}
