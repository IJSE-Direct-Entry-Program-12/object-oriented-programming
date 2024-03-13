import java.util.Date;

public class Order {
    private final int id;
    private final Date date;
    private final Customer customer;

    public Order(int id, Date date, Customer customer) {
        this.id = id;
        this.date = date;
        this.customer = customer;
    }
}
