package homework.oop_homework;

public class DiscountRate {

    private static double serviceDiscountPremium = 0.2;
    private static double serviceDiscountGold = 0.15;
    private static double serviceDiscountSilver = 0.1;
    private static double productDiscountPremium = 0.1;
    private static double productDiscountGold = 0.1;
    private static double productDiscountSilver = 0.1;

    public static double getServiceDiscountRate(String type) {
        switch (type) {
            case "Premium biedrs":
                return serviceDiscountPremium;
            case "Gold biedrs":
                return serviceDiscountGold;
            case "Silver biedrs":
                return serviceDiscountSilver;
            default:
                throw new IllegalArgumentException("Norādīts neatbilstošs pakalpojums");
        }
    }

    public static double getProductDiscountRate(String type) {
        switch (type) {
            case "Premium biedrs":
                return productDiscountPremium;
            case "Gold biedrs":
                return productDiscountGold;
            case "Silver biedrs":
                return productDiscountSilver;
            default:
                throw new IllegalArgumentException("Norādīts neatbilstošs produkts");
        }
    }
}
