public class Demo9 {

    public static void main(String[] args) {
        WeekDay monday1 = WeekDay.MON;
        WeekDay monday2 = WeekDay.valueOf("MON");
        // int value = Integer.parseInt("10");
        System.out.println(monday1 == monday2);
    }

    enum WeekDay{
        MON, TUE, WED, THU, FRI, SAT, SUN
    }
}
