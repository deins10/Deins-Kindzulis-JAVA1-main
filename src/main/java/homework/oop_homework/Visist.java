package homework.oop_homework;
import java.util.Date;

public class Visist {

    private Customer klients;
    private Date datums;
    private double pakalpojumaIzmaksas;
    private double produktaIzmaksas;

    public Visist(Customer klients, Date datums) {
        this.klients = klients;
        this.datums = datums;
    }

    public String getName() {
        return klients.getName();
    }

    public double getServiceExpense() {
        if (!klients.isMember()) {
            return pakalpojumaIzmaksas;
        } else {
            return pakalpojumaIzmaksas - (pakalpojumaIzmaksas * DiscountRate.getServiceDiscountRate(klients.getMemberType()));
        }
    }

    public void setServiceExpense(double serviceExpense) {
        this.pakalpojumaIzmaksas = this.pakalpojumaIzmaksas + serviceExpense;
    }

    public double getProductExpense() {
        if (!klients.isMember()) {
            return produktaIzmaksas;
        } else {
            return produktaIzmaksas - (produktaIzmaksas * DiscountRate.getProductDiscountRate(klients.getMemberType()));
        }
    }

    public void setProductExpense(double productExpense) {
        this.produktaIzmaksas = this.produktaIzmaksas + productExpense;
    }

    public double getTotalExpense() {
        return getProductExpense() + getServiceExpense();
    }

    @Override
    public String toString() {
        return "Visit{" +
                "Klienta vārds = " + klients.getName() +
                ", Biedrs = " + klients.isMember() +
                ", Abonoments = " + klients.getMemberType() +
                ", Datums = " + datums +
                ", Pakalpojuma izmaksas = " + pakalpojumaIzmaksas +
                ", Produkta izmaksas = " + produktaIzmaksas +
                '}';
    }
}
