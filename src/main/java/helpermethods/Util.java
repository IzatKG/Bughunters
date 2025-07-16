package helpermethods;

import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Util {
    
    private static final Logger logger = Logger.getLogger(Util.class.getName());

    public static double sumList(List<Double> numbers) {
        double sum = 0;
        for (double nums : numbers) {
            sum = sum + nums;
        }
        return sum;
    }

    public static int countWords(List<String> words){
        // Обработка null для входного параметра
        if (words == null) {
            logger.warning("Входной список слов равен null");
            System.out.println("ОШИБКА: Список слов не может быть null");
            return 0;
        }
        
        logger.info("Начинаем подсчет слов длиннее 5 символов. Размер списка: " + words.size());
        System.out.println("Обрабатываем список из " + words.size() + " слов");
        
        int count = 0;
        int nullCount = 0;
        
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            
            // Обработка null элементов в списке
            if (word == null) {
                nullCount++;
                logger.warning("Найден null элемент в позиции " + i);
                System.out.println("ПРЕДУПРЕЖДЕНИЕ: Найден null элемент в позиции " + i);
                continue;
            }
            
            if(word.length() > 5){
                count++;
                logger.fine("Найдено слово длиннее 5 символов: '" + word + "' (длина: " + word.length() + ")");
            }
        }
        
        // Логирование результатов
        logger.info("Подсчет завершен. Найдено " + count + " слов длиннее 5 символов, " + nullCount + " null элементов");
        System.out.println("РЕЗУЛЬТАТ: Найдено " + count + " слов длиннее 5 символов");
        if (nullCount > 0) {
            System.out.println("ПРЕДУПРЕЖДЕНИЕ: Пропущено " + nullCount + " null элементов");
        }
        
        return count;
    }


}

