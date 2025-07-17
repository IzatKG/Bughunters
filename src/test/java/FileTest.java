
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

public class FileTest {

    public static void main(String[] args) {
        File file = new File("myFile.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("Файл создан: " + file.getName());
            } else {
                System.out.println("Файл уже существует.");
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка при создании файла.");
            e.printStackTrace();
        }
    }
}


