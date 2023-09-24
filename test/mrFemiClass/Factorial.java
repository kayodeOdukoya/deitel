package mrFemiClass;

public class Factorial {

    public int calculateFactorial(int number) {
        int factorial = 1;
//        boolean isNumberNegative = number < 0;
//        if(isNumberNegative) return 0;
        for (int count = number; count >= 1; count --){
            factorial *= count;
        }
        return factorial;
    }

    public double calculateExponential(int number) {
        double exponential = 1;
        int numerator = 1;
        for(int count = 1; count <= number; count++){
            int denominator = calculateFactorial(count);
            double divided = (double) numerator/denominator;
            exponential += divided;
        }
        double apprpximation = approximteExponentialToThreeDecimalPlaces(exponential);
        return apprpximation;
    }
    private static double approximteExponentialToThreeDecimalPlaces(double exponential){
        String res = String.format("%.3f", exponential);
        return  Double.valueOf(res);
    }
}
