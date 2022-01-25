package session6;

class User{ // this is the definition of User Object

    // Attributes: Property of Object and not of class i.e. they belong to object and not to class
    String name;
    String phone;
    String email;
    char gender;
    String addressLine;
    String city;
    String state;
    int zipCode;

    User(){
        name = "John";
        phone = "+11 123875649";
        email = "abcd123@gmail.com";
        gender = 'm';
        addressLine = "3195 Ontario";
        city = "Toronto";
        state = "Ontario";
        zipCode = 267543;
    }

    void updateUser(String name, String phone, String email, char gender, String addressLine, String city, String state, int zipCode) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
        this.addressLine = addressLine;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
    void showUser(){
        System.out.println("Name : "+name+
                "  phone : "+phone+
                "  email : "+ email+
                "  Gender : "+gender+
                "  AddressLine : "+addressLine+
                "  City : "+city+
                "  State : "+state+
                "  zipCode : "+zipCode);
    }
}

public class constructors {
    public static void main(String[] args) {

        User user1 = new User();
        user1.showUser();
        System.out.println();
        User user2 = new User();
        user2.updateUser("Anit","+91 9999988888","xyz999@gmail.com",'M',"M-8 IA","Jalandhar"
        ,"Punjab",144004);
        user2.showUser();

    }

}
