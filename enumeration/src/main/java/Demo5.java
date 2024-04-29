public class Demo5 {

    /*
    * What is an enum? Why do we need enums?
    * What is an enum in Java? How are they special?
    * */
    public static void main(String[] args) {
        MyStreamType streamType = MyStreamType.FILE;
    }
}

enum MyStreamType{
    STDOUT, STDERR, FILE;
}

/*
final class MyStreamType */
/* extends Enum *//*
 {
    public static final MyStreamType STDOUT = new MyStreamType();
    public static final MyStreamType STDERR = new MyStreamType();
    public static final MyStreamType FILE = new MyStreamType();
    private static final MyStreamType[] VALUES = {STDOUT, STDERR, FILE};
    private MyStreamType(){
        super();
    }
    public static MyStreamType[] values(){
        return VALUES;
    }
    public static MyStreamType valueOf(String value){
        if (value.equals("STDOUT")) return STDOUT;
        else if (value.equals("STDERR")) return STDERR;
        else if (value.equals("FILE")) return FILE;
        else return null;
    }
}
*/
