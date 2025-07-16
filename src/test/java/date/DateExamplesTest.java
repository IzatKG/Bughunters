package date;

import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

/**
 * Базовые примеры работы с датами
 */
public class DateExamplesTest {

    @Test
    @DisplayName("Показ текущей даты")
    public void getDate() {
        showCurrentDate();
    }

    @Test
    @DisplayName("Создание и вывод заданный даты")
    public void createDate() {
        showSpecificDate();
    }

    @Test
    @DisplayName("Вывод текущего времени")
    public void getTime() {
        showTimes();
    }

    @Step("Создание текущей даты")
    public static void showCurrentDate() {
        LocalDate today = LocalDate.now();
        System.out.println("Сегодня: " + today);
        System.out.println("Год: " + today.getYear());
        System.out.println("Месяц: " + today.getMonth());
        System.out.println("День месяца: " + today.getDayOfMonth());
        System.out.println("День недели: " + today.getDayOfWeek());
    }

    @Step("Создание конкретной даты")
    private static void showSpecificDate() {
        System.out.println("СОЗДАНИЕ КОНКРЕТНОЙ ДАТЫ");
        LocalDate newYear = LocalDate.of(2024, 12, 31);
        System.out.println("Новый год: " + newYear);

        LocalDate nooruz = LocalDate.of(2025, Month.MARCH, 21);
        System.out.println("НООРУЗ :" + nooruz);
    }

    @Step("Работа с временем")
    private static void showTimes() {
        LocalTime now = LocalTime.now();
        System.out.println("Текущее время : " + now);
    }
}
