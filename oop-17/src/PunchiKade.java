import java.math.BigDecimal;

public class AppInitializer {
}

class Customer {
    String nic;
    String name;
    String address;
    String contact;
    public Customer(String nic, String name) {
        this.nic = nic;
        this.name = name;
    }
    public Customer(String nic, String name, String address) {
        this.nic = nic;
        this.name = name;
        this.address = address;
    }
    public Customer(String nic, String name, String address, String contact) {
        this.nic = nic;
        this.name = name;
        this.address = address;
        this.contact = contact;
    }
}

class Item{
    String barcode;
    String description;
    BigDecimal price;
    int stock;

    public Item(String barcode, String description, BigDecimal price) {
        this.barcode = barcode;
        this.description = description;
        this.price = price;
    }

    public Item(String barcode, String description, BigDecimal price, int stock) {
        this.barcode = barcode;
        this.description = description;
        this.price = price;
        this.stock = stock;
    }
}

class Order {
   int orderId;
   String dateTime;
   Customer customer;
   OrderItem[] orderItems;

    public Order(int orderId, String dateTime, Customer customer, OrderItem[] orderItems) {
        this.orderId = orderId;
        this.dateTime = dateTime;
        this.customer = customer;
        this.orderItems = orderItems;
    }
}

class OrderItem {
    String barcode;
    int qty;
    BigDecimal unitPrice;

    public OrderItem(String barcode, int qty, BigDecimal unitPrice) {
        this.barcode = barcode;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
}