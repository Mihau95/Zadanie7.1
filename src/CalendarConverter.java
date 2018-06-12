public class CalandarConverter {

    static final int Monday = 1;
    static final int Tuesday = 2;
    static final int Wednesday = 3;
    static final int Thursday = 4;
    static final int Friday = 5;
    static final int Saturday = 6;
    static final int Sunday = 7;


    public static String convertDayToString(int dayNumber) {
        switch (dayNumber) {

            case Monday:
                return "Poniedziałek";
            case Tuesday:
                return "Wtorek";
            case Wednesday:
                return "Środa";
            case Thursday:
                return "Czwartek";
            case Friday:
                return "Piątek";
            case Saturday:
                return "Sobota";
            case Sunday:
                return "Niedziela";
            default:
                return "Brak";

        }
    }
}

