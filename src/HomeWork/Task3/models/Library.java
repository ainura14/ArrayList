package HomeWork.Task3.models;

import java.util.List;

public class Library {
//    Library(id, name, address, List<Book>books, List<Reader>readers)
    private Long id;
    private String name;
    private String address;
    private List<Book> books;
    private List<Reader>readers;

    public Library() {
    }

    public Library(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public Library(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Library(Long id, String name, String address, List<Book> books, List<Reader> readers) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.books = books;
        this.readers = readers;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Reader> getReaders() {
        return readers;
    }

    public void setReaders(List<Reader> readers) {
        this.readers = readers;
    }

    @Override
    public String toString() {
        return "Library{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", books=" + books +
                '}';
    }
}
