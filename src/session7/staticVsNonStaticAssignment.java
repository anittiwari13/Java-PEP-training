package session7;

//Task 1 - Alter the Code to make totalPrices reflect to correct amount
//Task 2 - Sort the dish array to show the dishes in ascending order as per price
//				  dish with lowest price comes first and highest in last       ~~~~~ Not completed !!!!!!

import java.util.Arrays;

class Dish{

    // non static attributes -> property of object | resides inside the object as storage container
    String name;
    int price;
    int quantity;

    // static attributes -> property of class | resides inside the class as storage container
    static int totalQuantity;
    static int totalPrice;
    static int numOfDishes;

    // static variables can be accessed by property of object :)

    Dish(){
        numOfDishes++;
    }

    Dish(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;

        totalQuantity += quantity;
        numOfDishes++;
        totalPrice += (price*quantity);
    }

    void showDish() {
        System.out.println("Dish: "+name+" "+price+" "+quantity);
    }

    void increment() {
        quantity++;
        totalPrice += price;
        totalQuantity++;
    }

    void decrement() {
        quantity--;
        totalPrice -=price;
        totalQuantity--;
    }

    // Property of Class
    // inside the static method we cannot access non static properties
    static void showDishData() {
        System.out.println("Number of Dishes: "+numOfDishes);
        System.out.println("Total Quantity: "+totalQuantity);
        System.out.println("Total Price: "+totalPrice);
        //decrement(); // error
        //System.out.println("name is: "+name); // error
    }

}

public class staticVsNonStaticAssignment {
    public static void main(String[] args) {

        Dish dish1 = new Dish("Noodles", 200, 1);
        Dish dish2 = new Dish("Burger", 100, 1);

       // Dish dish3 = new Dish();
        Dish dish3 = new Dish("Fries", 80, 2);
        //Dish dish5 = new Dish();
        dish1.increment();
        dish1.increment();

        dish2.increment();
        dish2.increment();
        dish2.increment();

        dish1.decrement();

        dish1.showDish();
        dish2.showDish();


        Dish.showDishData();


        // Array of Integers
        //int[] array = {10, 20, 30, 40, 50};
        //int[] array = new int[5];

        // Array of Objects - Array of Dish Objects
        // Hence, after the discussion, it is basically array of references for the Dish Objects :)
        //Dish[] array = {dish1, dish2, dish3, dish4, dish5};
        Dish[] array = new Dish[3];
        array[0] = dish1;
        array[1] = dish2;
        array[2] = dish3;
        //array[3] = new Dish(); // :) rather than copying the reference, you can create directly the object
       // array[4] = dish5;

        System.out.println("array is: "+array);

        System.out.println("Dishes:");
        for(int i=0;i<array.length;i++) {
            array[i].showDish();
        }
    }
}
