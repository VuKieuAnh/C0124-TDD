public class NextDayCaculator {

    public static final String CONCATE = "/";

    public static String getNextDay(int day, int month, int year) {
        int dayOut = day+1;
        if (day==31){
            return 1+CONCATE + (++month) + CONCATE+ year;
        }
        return dayOut+ CONCATE + month+CONCATE+ year;
    }
}
