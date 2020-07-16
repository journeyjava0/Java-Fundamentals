package labs_examples.objects_classes_methods.demo;

//import labs_examples.arrays.labs.Book;

import labs_examples.arrays.labs.Book;

public class BookController {

    public static void main(String[] args) {
        Book flyFishing = new Book();
        flyFishing.setAuthor("Joseph Peterman");
        flyFishing.setTitle("First Cast to First Fish");
        flyFishing.setNumPages(80);

        Book universe = new Book("Stars & Planets", "Desmond Tutu", 580);

        Library set1 = new Library();
        set1.books.add(flyFishing);
        set1.books.add(universe);
        for (Book book : set1.books){
            System.out.println(book.toString());
        }

    }
}
