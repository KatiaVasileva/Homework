package Homework12;

//  1.  Необходимо создать класс Book, который содержит в себе данные об имени, авторе и годе публикации.
//      Типы полей должны быть String, Author (который мы создадим в п. 2) и int.
//  2.  Необходимо создать класс Author, который содержит в себе данные об имени и фамилии автора.
//  3.  Написать конструкторы для обоих классов, заполняющие все поля.
//  4.  Создать геттеры для всех полей автора и всех полей книги.
//  5.  Создать сеттер для поля «Год публикации» у книги.
//  6.  В методе main создать несколько объектов Книга (достаточно двух) и несколько объектов Автор (достаточно тоже двух)
//      и инициализировать друг друга. Учесть, что авторы являются обязательными членами книг и книги не могут создаться без авторов.
//      Метод main не должен находиться в классах Book и Author. Требуется создать отдельный класс для запуска приложения и
//      объявить метод main в нем.
//  7.  В том же методе main изменить год публикации одной из книг с помощью сеттера.

public class Main {
    public static void main(String[] args) {
        insertSeparator();
        System.out.println("Библиотечный справочник");
        insertSeparator();

        Author author1 = new Author("Алексей", "Поляринов");
        Book book1 = new Book("Центр тяжести", author1, 2018);
        book1.setPublishingYear(2020);
        System.out.println(book1.getBookName() + ", " + author1.getAuthorName() + " " + author1.getAuthorSurname()
                + ", год издания: " + book1.getPublishingYear());

        Author author2 = new Author("Адриан", "Чайковски");
        Book book2 = new Book("Дети времени", author1, 2020);
        System.out.println(book2.getBookName() + ", " + author2.getAuthorName() + " " + author2.getAuthorSurname()
                + ", год издания: " + book2.getPublishingYear());

        Author author3 = new Author("R.C.", "Sherriff");
        Book book3 = new Book("The Hopkins Manuscript", author1, 1939);
        System.out.println(book3.getBookName() + ", " + author3.getAuthorName() + " " + author3.getAuthorSurname()
                + ", год издания: " + book3.getPublishingYear());

        insertSeparator();
    }

    public static void insertSeparator() {
        System.out.println("============================================================");
    }
}
