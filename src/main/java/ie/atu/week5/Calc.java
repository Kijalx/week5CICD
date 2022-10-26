package ie.atu.week5;

public class Calc {
    public int countValue;
    private double total;

    public Calc(){
        countValue = 0;
    }

    public Calc(int startingValue){
        if(startingValue >= 5){
            countValue = startingValue;
        }
        else{
            throw new IllegalArgumentException("This is not a valid number");
        }
    }

    public int returnCountValue() {
        return countValue;
    }

    public double add(int val1, int val2) {
        total = val1 + val2;
        return total;
    }
    public double subtract(int val1, int val2) {
        total = val1 - val2;
        return total;
    }
    public double multiply(double val1, double val2)
    {
        total = val1 * val2;
        return total;
    }
    public double divide(double val1, double val2)
    {
        if(val1 == 0 || val2 == 0)
        {
            throw new IllegalArgumentException("This is not a valid number");
        }
        else
        {
            total = val1 / val2;
        }
        return total;
    }
}
