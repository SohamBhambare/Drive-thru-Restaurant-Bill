import java.util.Scanner;

public class Project2_RestaurantBill
{
    public static void main (String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.println();
        System.out.println("Drive-thru Restaurant Bill");

        final double sales_tax = 0.06;
        String response;
        String item_name;
        String blank =" ";
        double item_price;
        double item_subtotal;
        double order_subtotal = 0;
        double tax = 0;
        double total_bill = 0;
        int count = 1;
        int quantity;

        do {
            System.out.println();
            System.out.print("Enter the name for item " + count + " : ");
            item_name = kb.nextLine();

            System.out.print("Price of " + item_name + " : $");
            item_price = kb.nextDouble();

            System.out.print("Quantity ordered: ");
            quantity = kb.nextInt();

            item_subtotal = item_price * (double)quantity;
            System.out.printf("Item Subtotal: $%.2f\n", item_subtotal);

            order_subtotal += item_subtotal;
            count++;

            System.out.print("\nMore items? [y/n] ");
            response = kb.next();
            blank = kb.nextLine();
        } while(response.equalsIgnoreCase("y"));

        tax = sales_tax * order_subtotal;
        total_bill = order_subtotal + tax;

        System.out.printf("\nOrder Subtotal: $%.2f\n", order_subtotal);
        System.out.printf("6%% Sales Tax: $%.2f\n", tax);
        System.out.printf("Total Bill: $%.2f\n", total_bill);
    }
}
