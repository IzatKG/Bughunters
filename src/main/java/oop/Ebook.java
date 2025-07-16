package oop;

import lombok.*;

@Getter // геттер
@Setter // сеттер
@ToString (callSuper = true)// возвращает строкой вид
// конструктор с параметрами
@NoArgsConstructor //пустой конструктор
public class Ebook extends Book{
    private double fileSizeMB;
    private String format;

    public Ebook(String title, String author, int year, int pages, String genre, double fileSizeMB, String format) {
        super(title, author, year, pages, genre);
        this.fileSizeMB =fileSizeMB;
        this.format= format;
    }

    public void displayEbookInfo(){
        displayinfo();
        System.out.println("Размер :" + fileSizeMB);
        System.out.println("Формат:" + format);
    }

    public boolean isSmallFile(){
     return fileSizeMB < 5.0;
    }

    public void checkFileSize(){
        if (isSmallFile()){
            System.out.println("Файл небольшой - можно быстро скачать");
        }else {
            System.out.println("Файл большой- потребуется много времени на загрузку");
        }
    }
}
