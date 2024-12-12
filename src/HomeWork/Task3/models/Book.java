package HomeWork.Task3.models;

import HomeWork.Task3.enums.Genre;

public class Book {
//    Book(id, name, author, Genre genre)

    private long id;
    private static int incrementedID = 0;
    private String author;
    private Genre genre;

    public Book(long id, String author, Genre genre) {
        this.id = incrementedID++;
        this.author = author;
        this.genre = genre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", genre=" + genre +
                '}';
    }
}
