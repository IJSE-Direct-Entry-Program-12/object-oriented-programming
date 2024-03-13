import java.util.List;

public class Customer {
    private int id;
    private String name;
    protected static String address = "Panadura";
    private String contact;
    private List<Order> orderList;

    public Customer(int id, String name, String contact){
        this.id = id;
        this.name = name;
        this.contact = contact;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public static String getAddress(){
        return address;
    }

    public String getContact(){
        return contact;
    }
}
