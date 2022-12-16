package Homework12;

//      Реализуйте методы toString, equals и hashCode в классах Author и Book, которые вы создали на прошлом уроке.
//      Обратите внимание, что toString книги не должен дублировать код из toString автора,
//      а должен делегировать (вызывать) его версию метода.

//  Прошлое задание:
//  (1.  Необходимо создать класс Book, который содержит в себе данные об имени, авторе и годе публикации.
//      Типы полей должны быть String, Author (который мы создадим в п. 2) и int.
//  2.  Необходимо создать класс Author, который содержит в себе данные об имени и фамилии автора.
//  3.  Написать конструкторы для обоих классов, заполняющие все поля.
//  4.  Создать геттеры для всех полей автора и всех полей книги.
//  5.  Создать сеттер для поля «Год публикации» у книги.
//  6.  В методе main создать несколько объектов Книга (достаточно двух) и несколько объектов Автор (достаточно тоже двух)
//      и инициализировать друг друга. Учесть, что авторы являются обязательными членами книг и книги не могут создаться без авторов.
//      Метод main не должен находиться в классах Book и Author. Требуется создать отдельный класс для запуска приложения и
//      объявить метод main в нем.
//  7.  В том же методе main изменить год публикации одной из книг с помощью сеттера.)

public class Main {
    public static void main(String[] args) {
        insertSeparator();
        System.out.println("Библиотечный справочник");
        insertSeparator();

        Author author1 = new Author("Алексей", "Поляринов");
        Book book1 = new Book("Центр тяжести", author1, 2018);
        book1.setPublishingYear(2020);
        System.out.println(book1);

        Author author2 = new Author("Адриан", "Чайковски");
        Book book2 = new Book("Дети времени", author2, 2020);
        System.out.println(book2);

        Author author3 = new Author("R.C.", "Sherriff");
        Book book3 = new Book("The Hopkins Manuscript", author3, 1939);
        System.out.println(book3);

        Author author4 = new Author("R.C.", "Sherriff");
        Book book4 = new Book("The Hopkins Manuscript", author4, 1956);
        System.out.println(book4);

        Book book5 = new Book("Библия", 1995);
        System.out.println(book5);

        insertSeparator();

//  Проверка объектов на равенство. Книги являются одинаковыми, если имеют одинаковое название и одинаковое ФИО автора.
        if (book3.equals(book4)) {
            System.out.println("Это одна и та же книга");
        } else {
            System.out.println("Это разные книги");
        }

        insertSeparator();
    }

    public static void insertSeparator() {
        System.out.println("============================================================");
    }
}