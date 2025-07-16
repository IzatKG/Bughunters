package oop;

public class BookMain {
    public static void main(String[] args) {

        Book book = new Book("Преступление и наказание",
                "Достоевский",
                1900,
                350,
                "Роман");

        System.out.println(book);
        book.displayinfo();

        Ebook ebook = new Ebook("Преступление и наказание",
                "Достоевский",
                1900,
                350,
                "Роман",
                40,
                "PDF");

        System.out.println(ebook);
        ebook.displayinfo();
        System.out.println("====================");

        ebook.setFileSizeMB(4);
        ebook.displayEbookInfo();

        ebook.checkFileSize();

    }
}
