package HomeWork.Task3.service;

import HomeWork.Task3.models.Book;

import java.util.List;

public interface BookService {
    // add
    String saveBook(Long libraryId, Book book);

    // get all
    List<Book> getAllBooks(Long libraryId);

    // get by ID
    Book getBookById(Long libraryId, Long bookId);

    // delete
    String deleteBook(Long libraryId,Long bookId);

    // delete by ID
    void clearBooksByLibraryId(Long libraryId);
}
