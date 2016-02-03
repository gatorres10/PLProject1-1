package Luna.customer;

import java.util.Scanner;


public class CustomerApp {
    public static void main(String[] args) {


        System.out.println("Welcome to the Customer Viewer\n");

        boolean keepGoing = true;
        Scanner sc = new Scanner(System.in);

        while (keepGoing){
            System.out.println("Enter a customer number: ");
            int customerNumber = sc.nextInt();

            CustomerDB targetCustomer = new CustomerDB();
            String data = targetCustomer.getCustomer(customerNumber);
            System.out.println(data);

            System.out.println("\nDisplay another customer? (y/n): ");
            String inPut = sc.next();
            if (inPut.equals("n")){
                keepGoing = false;

            }

        }
    }
}
