import java.util.Scanner;

public class act {

    static Scanner sc = new Scanner(System.in);

    static String InputString() {
        return sc.nextLine();
    }

    static int InputInt() {
        return sc.nextInt();
    }

    static double InputDouble() {
        return sc.nextDouble();
    }

    static double computeSubTotal(double price, int qty, double discount) {
        return (price * qty) - discount;
    }

    static void display(int id, String name, int qty,
                        double price, double discount, double subTotal) {

        System.out.println();
        System.out.println(id + " " + name);
        System.out.println("Priced at " + price + " for " + qty + " pieces");
        System.out.println("Discounted at " + discount);
        System.out.println("Subtotal: " + subTotal);
    }

    public static void main(String[] args) {

        int iprodId;
        String strProdName, strProdDesc;
        int dQty;
        double dPrice, dDiscount, dSubTotal;

        System.out.println("Please Input the following:");

        System.out.print("ProductID: ");
        iprodId = InputInt();
        sc.nextLine();

        System.out.print("Name: ");
        strProdName = InputString();

        System.out.print("Description: ");
        strProdDesc = InputString();

        System.out.print("Quantity: ");
        dQty = InputInt();

        System.out.print("Price: ");
        dPrice = InputDouble();

        System.out.print("Discount: ");
        dDiscount = InputDouble();

        dSubTotal = computeSubTotal(dPrice, dQty, dDiscount);

        display(iprodId, strProdName, dQty, dPrice, dDiscount, dSubTotal);
    }
}