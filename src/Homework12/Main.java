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

//  Сложный уровень
//  1.	Создать класс Library, который будет иметь своим полем массив из прошлого уровня.
//  Учесть, что доступ к нему должен быть только из Library (private поле), а сеттеры и геттеры отсутствуют.
//  Работать с массивом можно только через внутренние нестатические методы класса Library.
//  2. Конструктор класса должен получать в качестве параметра размер массива и инициализировать в себе поле массива тем размером,
//  что пришел параметром.
//  3. Перенести методы из прошлого уровня в класс Library, сделать их нестатическими.
//  4. Создать новые нестатические методы в классе Library:
//  - Напечатать информацию о книге по ее названию, которое приходит в метод в качестве параметра.
//    Формат: “The Stand by Stephen King was published in 1978”
//  - Изменить год публикации книги по ее названию.
//    В метод подаются два параметра, а именно: название и новый год публикации. Нужно найти книгу и изменить ее год публикации.

public class Main {
    public static void main(String[] args) {
        Library library = new Library(10);

        library.addBook("The Crow Trap", library.addAuthor("Anne", "Cleeves"), 1999);
        library.addBook("The Woman Who Went To Bed For A Year", library.addAuthor("Sue", "Townsend"),
                2012);
        library.addBook("The Hopkins Manuscript", library.addAuthor("R.C.", "Sherriff"), 1939);
        library.addBook("My Evil Mother", library.addAuthor("Margaret", "Atwood"), 2022);
        library.addBook("Crossroads", library.addAuthor("Jonathan", "Franzen"), 2021);
        library.addBook("Homegoing", library.addAuthor("Yaa", "Gyasi"), 2016);

        insertSeparator();
        System.out.println("List of Books");
        insertSeparator();
        library.printAllBooks();
        insertSeparator();
        library.printInfoAboutBook("My Evil Mother");
        insertSeparator();
        library.changePublishingYear("The Hopkins Manuscript", 1956);
        insertSeparator();
        System.out.println("Updated List of Books\n");
        library.printAllBooks();
        insertSeparator();

//  Отладка
        System.out.println("Authors");
        Author anneCleeves = new Author("Anne", "Cleeves");
        Author anneCleeves2 = new Author("Anne", "Cleeves");
        Author sueTownsend = new Author("Sue", "Townsend");
        System.out.println("Author copies are equal: " + anneCleeves.equals(anneCleeves2));
        System.out.println("Author copies are equal by hashCode: " + (anneCleeves.hashCode() == anneCleeves2.hashCode()));
        System.out.println("Author copies are equal: " + anneCleeves.equals(sueTownsend));
        System.out.println("Author copies are equal by hashCode: " + (anneCleeves.hashCode() == sueTownsend.hashCode()));
        System.out.println(anneCleeves);
        System.out.println(sueTownsend);
        insertSeparator();
        System.out.println("Books");
        Book theCrow = new Book("The Crow", anneCleeves, 1999);
        Book theCrow2 = new Book("The Crow", anneCleeves, 1999);
        Book theWomanWhoWentToBed = new Book("The Woman Who Went To Bed For A Year", sueTownsend, 2012);
        System.out.println("Book copies are equal: " + theCrow.equals(theCrow2));
        System.out.println("Book copies are equal by hashCode: " + (theCrow.hashCode() == theCrow2.hashCode()));
        System.out.println("Book copies are equal: " + theCrow.equals(theWomanWhoWentToBed));
        System.out.println("Book copies are equal by hashCode: " + (theCrow.hashCode() == theWomanWhoWentToBed.hashCode()));
        System.out.println(theCrow);
        System.out.println(theWomanWhoWentToBed);
        insertSeparator();
        System.out.println("Library");
        System.out.println(library);
    }

    public static void insertSeparator() {
        System.out.println("============================================================");
    }

}
