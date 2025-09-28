//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double initialPrice = 0;
        double taxRate = 0.02;
        double totalPrice = 0;
        System.out.print("What is the price of the item?");

        if(in.hasNextDouble())
        {
            initialPrice = in.nextDouble();
            if(initialPrice >= 100)
            {
                System.out.println("Your shipping is free!");
            }
            else
            {
                totalPrice = initialPrice * taxRate;}
                System.out.println("Your shipping will cost $" + totalPrice);
            }
        }


    }