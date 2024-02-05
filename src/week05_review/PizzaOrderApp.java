package week05_review;
import java.util.Scanner;
public class PizzaOrderApp {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("would you like to order Pizza?");
        String answer=input.nextLine().toLowerCase();

        while(!(answer.equals("yes")||answer.equals("no"))){
            System.err.println("Invalid entry , Please try again later. ");
            return;
        }

        if(answer.equals("no")){
            System.out.println("Thanks for using our service.");
            return;
        }

        //Step 2
        System.out.println("Enter the size of pizza  (small,medium,large):");
        String size=input.nextLine().toLowerCase();

        while(!(size.equals("small")||size.equals("medium")||size.equals("large"))){
            System.err.println("Invalid entry , Please  re-enter the size of pizza (small,medium,large ): ");
            size=input.nextLine().toLowerCase();
        } //Making sure that user will enter either small, medium or large

        //Step 3

        System.out.println("Enter the number of cheese toppings (0-10):");
        int cheeseTopping=input.nextInt();

        while(cheeseTopping<0 || cheeseTopping>10){
            System.out.println("\"Invalid entry , Please  re-enter the thr number of cheese topping (0-10):");
            cheeseTopping=input.nextInt();
        }

        System.out.println("Enter the number of Pepperoni toppings (0-20):");
        int PepperoniTopping=input.nextInt();

        while(PepperoniTopping<0 || PepperoniTopping>20){
            System.out.println("\"Invalid entry , Please  re-enter the thr number of Pepperoni topping (0-20):");
            PepperoniTopping=input.nextInt();
        }
        //Step 4
        System.out.println("Enter the Quantity :");
        int quantity=input.nextInt();
        while(quantity<0 || quantity>100){
            System.out.println("\"Invalid entry , Please  re-enter the thr number of Pepperoni topping (0-20):");
            quantity=input.nextInt();
        }

        // Step 5

        Pizza pizza=new Pizza();
        pizza.setInfo(size,cheeseTopping,PepperoniTopping,quantity);
        System.out.println("Your total cost is: $"+pizza.calcCost());



    }
}
