public class Demo7 {
    public static void main(String[] args) {

    }
}

interface MyDay{
    String getFullName();
    int getNumber();
}

enum Day implements MyDay {
    MON(){
        @Override
        public String getFullName() {
            return "Monday";
        }
        @Override
        public int getNumber() {
            return 1;
        }
    }, TUE(){
        @Override
        public String getFullName() {
            return "Tuesday";
        }

        @Override
        public int getNumber() {
            return 2;
        }
    }, WED(){
        @Override
        public String getFullName() {
            return "Wednesday";
        }

        @Override
        public int getNumber() {
            return 3;
        }
    };
}
