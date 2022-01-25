package session7;

class User{
    String name;
    String phone;
    String email;

    Address address;
    Order[] orders;

    User(){

    }

    User(String name, String phone, String email, Address address, Order[] order) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.orders = order;
    }

    void showUser(){
        System.out.println("User Details");
        System.out.println(name+" "+phone+" "+email);
        System.out.println("~~~~~~~~~~~~~~~~~~~");
        address.showAddress();
        System.out.println("Order for User "+name);
        for (Order order:orders){
            order.showOrder();
        }
    }
}

class Address{
    String AddressLine;
    String city;
    String State;
    int zipCode;
    String label;

    Address(){

    }

    Address(String addressLine, String city, String state, int zipCode, String label) {
        AddressLine = addressLine;
        this.city = city;
        State = state;
        this.zipCode = zipCode;
        this.label = label;
    }

    void showAddress(){
        System.out.println("Address Details");
        System.out.println(AddressLine+" "+city+" "+State+" "+zipCode+" "+label);
        System.out.println("~~~~~~~~~~~~~~~~~~~");
    }

}

class Order{
    int oid;
    String date;
    int amount;
    Dishes[] dishes;

    Order(){

    }

    public Order(int oid, String date, int amount, Dishes[] dishes) {
        this.oid = oid;
        this.date = date;
        this.amount = amount;
        this.dishes = dishes;
    }

    void showOrder(){
        System.out.println("Order Details : "+oid+" "+date+" amount "+amount);
        System.out.println("Dish Names : ");
        for (Dishes dish: dishes){
            dish.showDishes();
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~");
    }
}

class Dishes{
    String dname;
    int price;
    int quantity;

    Dishes(){

    }

    public Dishes(String name, int price, int quantity) {
        this.dname = name;
        this.price = price;
        this.quantity = quantity;
    }

    void showDishes(){
        System.out.println("Dishes : "+dname+" price : "+price+" quantity : "+quantity);
    }
}

public class assignmentHasARelationship {

    public static void main(String[] args) {

        //Dishes
        Dishes d1 = new Dishes("Pizza",109,2);
        Dishes d2 = new Dishes("Burger",60,1);
        Dishes d3 = new Dishes("Fries",40,4);

        Dishes[] dishes1 = {d1,d2,d3};

        Dishes d4 = new Dishes("Pizza",109,3);
        Dishes d5 = new Dishes("Burger",60,2);
        Dishes d6 = new Dishes("Fries",40,1);

        Dishes[] dishes2 = {d4,d5,d6};

        //Orders
        Order o1 = new Order(1, "22nd Jan, 2022", 200,dishes1);
        Order o2 = new Order(2, "24th Jan, 2022", 500,dishes2);
        Order o3 = new Order(3, "26th Jan, 2022", 350,dishes1);

        Order[] orders = {o1, o2, o3}; // Array of Order Objects :)


        Address aRef = new Address("Redwood Shores", "Ludhiana", "Punjab", 141001, "WORK");
        User uRef = new User("John", "+91 99999 11111", "john@example.com", aRef, orders);

        uRef.showUser();
    }

}
