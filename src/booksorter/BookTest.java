package booksorter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class BookTest {
    public static void main(String[] args) {
        TreeSet<Book> books= new TreeSet<>();
        books.add(new Book("Sefiller",324,"Victor Hugo","23-02-1992"));
        books.add(new Book("Suc ve Ceza",234,"Fyodor Dosteyevski","23-02-1932"));
        books.add(new Book("Anna Karanina",124,"Lev Tolstoy","23-02-1992"));
        books.add(new Book("Kürk Mantolu Madonna",122,"Sebahattin Ali","23-02-1933"));
        books.add(new Book("Kasagi",82,"Ömer Seyfettin","23-02-1933"));

        for (Book b:books) {
            System.out.println(b.getTitle() + " - " + b.getAuthor() + " - " + b.getNumberOfPages());
        }


        System.out.println("========================");
        TreeSet<Book> books2 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getNumberOfPages()- o2.getNumberOfPages();
            }
        });
        books2.add(new Book("Sefiller",324,"Victor Hugo","23-02-1992"));
        books2.add(new Book("Suc ve Ceza",234,"Fyodor Dosteyevski","23-02-1932"));
        books2.add(new Book("Anna Karanina",124,"Lev Tolstoy","23-02-1992"));
        books2.add(new Book("Kürk Mantolu Madonna",122,"Sebahattin Ali","23-02-1933"));
        books2.add(new Book("Kasagi",82,"Ömer Seyfettin","23-02-1933"));
        for (Book b:books2) {
            System.out.println(b.getTitle() + " - " + b.getAuthor() + " - " + b.getNumberOfPages());
        }

    }
}
