public class FinancialForecast {

    public static double predictFutureValue(double presentValue, double growthRate, int years) {

        if (years == 0) {
            return presentValue;
        }
        return predictFutureValue(presentValue, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {

        double presentValue = 10000;  
        double growthRate = 0.10;    
        int years = 2;
        double result = predictFutureValue(presentValue, growthRate, years);
        System.out.println("Future Value: " + result);
    }
}
/*output: Future Value: 12100.0 
Time Complexity = O(n)
we can use dynamic programming to optimize the recursive solution.
*/