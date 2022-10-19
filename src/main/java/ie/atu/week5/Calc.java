package ie.atu.week5;

public class Calc {
    private int countValue;

    public Calc(){
        countValue = 0;
    }

    public Calc(int startingValue){
        if(startingValue > 5){
            countValue = startingValue;
        }
        else{
            throw new IllegalArgumentException("This is not a valid number");
        }
    }
    public int add(int val1, int val2) {
        int total = val1 + val2;
        return total;
    }


}
