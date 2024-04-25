public class CoinConverter implements FinancialConversion {

    @Override
    public void dollarToRealConverter(double dollarValue) {
        double conversionRate = 5.17;
        double realValue = dollarValue * conversionRate;
        System.out.println("The value in reais is: " + realValue);
    }
}
