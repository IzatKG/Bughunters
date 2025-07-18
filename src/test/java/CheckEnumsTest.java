import enums.Day;
import enums.Season;
import map.Practice2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class CheckEnumsTest {

    @Test
    @DisplayName("Первый тест")
    public void checkDaysTest() {
        Day today = Day.FRIDAY;
        System.out.println(today);
    }

    @Test
    @DisplayName("Проверка")
    public void checkSeasonsTest() {
        Season season = Season.SUMMER;
        Season season1 = Season.AUTUMN;
        System.out.println(season);
        System.out.println(season1);
        System.out.println(season.getDescription());
    }

    @Test
    public void checkMapTest(){
        Map<String,Integer> persons = new HashMap<>();
        persons.put("Mira", 39);
        persons.put("Dana", 17);
        persons.put("Ulan", 40);
        persons.put("Akyl", 19);
        persons.put("Rinat", 50);
        System.out.println(Practice2.filterPersonAge(persons));
    }

    @Test
    @DisplayName("Test urok po vetku")
    public  void testUrok(){
        System.out.println("Uchim vetku");
        System.out.println("Sdelali novyiy stroku");
    }
}
