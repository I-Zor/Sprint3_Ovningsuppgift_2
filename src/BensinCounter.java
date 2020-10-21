public class BensinCounter {

    public double countedMileage(double amountOfGasThen, double amountOfGasNow){
        return amountOfGasNow-amountOfGasThen;
    }

    public double usagePerMil(double averageGasUsage, double milPerYear){
        return averageGasUsage/milPerYear;
    }
}
