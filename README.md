# Homework13

Задание 

Реализуйте методы toString, equals и hashCode в классах Author и Book, которые вы создали на прошлом уроке. 
Обратите внимание, что toString книги не должен дублировать код из toString автора, а должен делегировать (вызывать) его версию метода.

Выполнение

В классах Author и Book созданы классы toString, equals и hashCode. 

toString()
Метод toString автора вызывается в методе toString книги.

equals
Условием равенства книг является равенство их названий и авторов. Метод equals книги вызывает метод equals автора.

Метод main вызывает метод toString для вывода в консоль строки, содержащей название книги, имя и фамилию автора и год публикации. 
Кроме того, с помощью вызова метода equals и условного оператора проверяется равенство книг по названию и имени/фамилии автора.
