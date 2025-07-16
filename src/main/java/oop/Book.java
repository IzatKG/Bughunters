package oop;

import lombok.*;

@Getter // геттер
@Setter // сеттер
@ToString // возвращает строкой вид
@AllArgsConstructor // конструктор с параметрами
@NoArgsConstructor //пустой конструктор
public class Book{
    private String title;
    private String author;
    private int year;
    private int pages;
    private String genre;

    // void
    public void displayinfo(){
        System.out.println("Название :" + title);
        System.out.println("Автор :" + author);
        System.out.println("Год :" + year);
        System.out.println("Страница:" + pages);
        System.out.println("Жанр:" + genre);
    }
}
