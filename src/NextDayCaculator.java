public class NextDayCaculator {

    public static final String CONCATE = "/";
    public static final int LASTOFMONTH = 31;
    public static final int FISTOFMONTH = 1;

    public static String getNextDay(int day, int month, int year) {
        int dayOut = day+1;
        String result = "";
        if (day== LASTOFMONTH){
            result= FISTOFMONTH +CONCATE + (++month) + CONCATE+ year;
        }
        else {
            result = dayOut + CONCATE + month + CONCATE + year;
        }
        return result;
    }
}
