package booksorter;

import java.util.Date;

public class Book implements Comparable<Book>{
    String id;
    String title;
    int numberOfPages;
    String author;
    String publicationDate;

    public Book(String title, int numberOfPages, String author, String publicationDate) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.publicationDate = publicationDate;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", author='" + author + '\'' +
                ", publicationDate=" + publicationDate +
                '}';
    }

    public int compareTo(Book b) {
        return this.getTitle().compareTo(b.getTitle());
    }

}
