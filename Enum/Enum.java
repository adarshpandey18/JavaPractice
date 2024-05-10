package JavaPractice.Enum;

enum Days {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRISDAY,
    SATURDAY;

    public boolean isWeekend(Days d) {
        if(d == SUNDAY || d == SATURDAY)
            return true;
        return false;

    }
}
public class Enum{
    public static void main(String[] args) {
        Days d = Days.SUNDAY;
        System.out.println("is it weekend ? : " + d.isWeekend(d));   
    }
}
