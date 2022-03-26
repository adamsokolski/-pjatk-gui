package wyklady.w0304.ex02;

public class Main {
    public enum Day {
        SATURDAY, SUNDAY;
    }

    public static void main(String[] args) {
        Day[] daysOfClasses = Day.values();
        for(Day day : daysOfClasses) {
            System.out.println(
                    day + switch (day) {
                        case SATURDAY -> " wyklad z GUI zaczyna sie o 9:40";
                        case SUNDAY -> " nie ma wykladu z GUI";
                    }
            );
        }
    }
}
