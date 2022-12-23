package Homework12;

//  Задание (базовый уровень):
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
//  Дополнительно
//  Реализуйте методы toString, equals и hashCode в классах Author и Book, которые вы создали на прошлом уроке.
//  Обратите внимание, что toString книги не должен дублировать код из toString автора,
//  а должен делегировать (вызывать) его версию метода.

//  Средний уровень
//  1.	Необходимо в классе с методом main создать массив объектов типа Book и положить туда созданные книги.
//  2.	Написать статические методы для работы с массивом в классе, где располагается метод main:
//  a. Добавить книгу (найти свободную ячейку массива и положить туда книгу).
//  Учесть, что этот метод может быть вызван любое количество раз (от 1 до 5) и каждая новая книга должна успешно укладываться в массив.
//  b.   Напечатать в консоль все книги из массива в следующем формате: “Stephen King: The Stand: 1978”

public class Main {
    public static void main(String[] args) {
        insertSeparator();
        System.out.println("Библиотечный справочник");
        insertSeparator();

        Book[] books = new Book[10];

        Author author1 = new Author("Алексей", "Поляринов");
        Book book1 = new Book("Центр тяжести", author1, 2018);
        book1.setPublishingYear(2020);
        books[0] = book1;
        System.out.println(book1);

        Author author2 = new Author("Адриан", "Чайковски");
        Book book2 = new Book("Дети времени", author2, 2020);
        books[1] = book2;
        System.out.println(book2);

        Author author3 = new Author("R.C.", "Sherriff");
        Book book3 = new Book("The Hopkins Manuscript", author3, 1939);
        books[2] = book3;
        System.out.println(book3);

        Author author4 = new Author("Эмили", "Сент-Джон Мантел");
        Book book4 = new Book("Станция одиннадцать", author4, 2014);
        books[3] = book4;
        System.out.println(book4);

        Author author5 = new Author("Якуб", "Малецкий");
        Book book5 = new Book("Дрожь", author5, 2021);
        books[4] = book5;
        System.out.println(book5);

        insertSeparator();

        addBook(books, "Искатель", "Тана", "Френч", 2021);
        insertSeparator();
        printAllBooks(books);
        insertSeparator();

//  Проверка объектов на равенство. Книги являются одинаковыми, если имеют одинаковое название и одинаковое ФИО автора.
        if (book3.equals(book4)) {
            System.out.println("Это одна и та же книга");
        } else {
            System.out.println("Это разные книги");
        }

        insertSeparator();
    }

    public static void addBook(Book[] books, String bookName, String authorName, String authorSurname, int publishingYear) {
        if (books[books.length - 1] != null) {
            System.out.println("Невозможно добавить книгу, все ячейки заняты.");
        }
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if (book == null) {
                Author author = new Author(authorName, authorSurname);
                book = new Book(bookName, author, publishingYear);
                books[i] = book;
                System.out.println("Добавлена новая книга:\n" + book);
                break;
            }
        }
    }

    public static void printAllBooks(Book[] books) {
        for (Book book : books) {
            if (book != null) {
                System.out.println(book);
            }
        }
    }

    public static void insertSeparator() {
        System.out.println("============================================================");
    }
}
