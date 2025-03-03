public class SalesWithDiscount {
    public void totalWithDiscount(){
        double[] sales = {100.0, 200.0, 150.0, 300.0};
        double salesWithDiscount = 0;

        for (double sale: sales) {
            salesWithDiscount += sale * 0.9;
        }

        System.out.println("La suma total de ventas con el 10% de descuento es: " + salesWithDiscount);
    }
}
