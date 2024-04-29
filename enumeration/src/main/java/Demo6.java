public class Demo6 {

    public static void main(String[] args) {
        Month month = Month.NOV;
        System.out.println(month.name());
        System.out.println(month.ordinal());
        System.out.println(month.fullName());
    }
}

enum Month{
    JAN("January"),
    FEB("February"),
    MAR("March"),
    APR("April"),
    MAY("May"),
    JUN("June"),
    JUL("July"),
    AUG("August"),
    SEP("September"),
    OCT("October"),
    NOV("November"),
    DEC("December");

    private String fullName;

    Month(String fullName){
        this.fullName = fullName;
    }

    public String fullName(){
        return fullName;
    }
}

/* final class MyMonth{
    public static final MyMonth JAN = new MyMonth("January");
    public static final MyMonth FEB = new MyMonth("February");
    private String fullName;

    private MyMonth(String fullName) {
        this.fullName = fullName;
    }

    public String fullName(){
        return fullName;
    }
} */
