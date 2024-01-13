package Controllers;

public class Customer {
    public String name;
    public String cid;
    public int phone;
    public String address;
    public String email;

    public Customer(String name, String cid, int phone, String address, String email) {
        this.name = name;
        this.cid = cid;
        this.phone = phone;
        this.address = address;
        this.email = email;
    }
}
