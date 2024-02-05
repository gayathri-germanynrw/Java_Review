package week05_review;

public class Pizza {

    public String size;
    public int quantity,
            numberOfCheeseTopping,
            numberOfPepperoniTopping;

    public void setInfo(String size, int quantity, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size; // Assigns the argument size to the instance variable size of pizza object
        this.quantity = quantity;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public String toString() { // Now we are able to print the Pizza object by using print statement
        return "Pizza{" +
                "size='" + size + '\'' +
                ", quantity=" + quantity +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                '}';
    }


    public double calcCost(){
        double totalCost = 0;

        double startingPrice = (size.equalsIgnoreCase("small")) ? 10
                :(size.equalsIgnoreCase("medium")) ? 14 : 16;

        double toppings = (numberOfCheeseTopping * 0.8) + (numberOfPepperoniTopping * 1.5);

        totalCost = (startingPrice + toppings) * quantity;

        return totalCost;
    }


}

/*
Create a custom Java class named Pizza with the following specifications:

    Attributes:
        size: Indicates the size of the pizza (small, medium, or large).
        quantity: Indicates the quantity of pizza
        numberOfCheeseTopping: Indicates the number of cheese toppings.
        numberOfPepperoniTopping: Indicates the number of pepperoni toppings.

    Actions:
        setInfo: Sets all the fields of the pizza object.
        calcCost(): Returns the total cost of the pizza.
        toString(): Returns a string containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost().


        The pizza cost is determined by:
            Small: Starts at $10.
            Medium: Starts at $14.
            Large: Starts at $16.

            Per pepperoni topping: $1.5
            Per cheese topping: $0.8
 */