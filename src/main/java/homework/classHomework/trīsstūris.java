package homework.classHomework;

public class trīsstūris {

    int malaA;
    int malaB;
    int malaC;
    double laukums;




    trīsstūris() {
        System.out.println("Veido trisstūri!!!");
    }


    public trīsstūris(int malaA, int malaB, int malaC) {
        this.malaA = malaA;
        this.malaB = malaB;
        this.malaC = malaC;
        laukums = aprekinatLaukumu();


    }

    public double aprekinatLaukumu() {
        double S = (malaA + malaB + malaC) / 2;
        return Math.sqrt (S * (S - malaA) * (S - malaB) * (S - malaC));


    }

    public boolean vienadmalu() {

        if ((malaA == malaB) && (malaA==malaB))
            return true;
        else return false;
    }
    public boolean vienadsanu() {

        if ((malaA == malaB) || (malaA == malaC) || (malaB == malaC))
            return true;
        else return false;

    }


}
