import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class NextDayCaculatorTest {
    @Test
    @DisplayName("case 1/1/2018")
    public void testDay1Month1Year2018(){
//        chuan bi du lieu
        int day=1;
        int month = 1;
        int year = 2018;
        String expected = "2/1/2018";
//        Thuc thi phuong thuc
        String result = NextDayCaculator.getNextDay(day, month, year);
//        Kiem tra ket qua
        assertEquals(expected, result);
    }

}