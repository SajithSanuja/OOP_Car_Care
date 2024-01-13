package Controllers;

public class Employee {
    public String eid;
    public String name;
    public int phone;
    public String email;
    public String address;
    public String availability;

    public Employee(String eid, String name, int phone, String email, String address, String availability) {
        this.eid = eid;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.availability = availability;
    }
}
