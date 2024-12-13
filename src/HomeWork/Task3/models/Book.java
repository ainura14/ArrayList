package HomeWork.Task3.models;

import HomeWork.Task3.enums.Genre;

public class Book {
//    Book(id, name, author, Genre genre)

    private Long id;
    private String author;
    private Genre genre;

    public Book(Long id, String author, Genre genre) {
        this.id = id;
        this.author = author;
        this.genre = genre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
