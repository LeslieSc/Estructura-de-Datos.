public class SalesCalculator {
    /**
     * Calcula la sumatoria de todas las ventas con IVA.
     */
    public void execute() {
        double[] sales = {100, 250, 320, 150, 90};
        double totalSalesWithTax = 0;

        for (double sale : sales) {
            totalSalesWithTax += sale * 1.16; // Aplicar IVA del 16%
        }

        System.out.println("Total de ventas con IVA: " + totalSalesWithTax);
    }
}
