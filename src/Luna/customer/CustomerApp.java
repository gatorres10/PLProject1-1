package Luna.customer;

import java.util.Scanner;

/**
 * Created by emmittluna on 2/2/16.
 */
public class CustomerApp {
    public static void main(String[] args) {

        System.out.println("Hello Dude\n");
        System.out.println("Enter Your number: ");
        Scanner sc = new Scanner(System.in);
        int customerNumber = sc.nextInt();
        System.out.println("Your ID is: " + customerNumber);


    }

}
