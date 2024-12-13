package HomeWork.Task3.service.impl;

import HomeWork.Task3.dao.Impl.BookDaoImpl;
import HomeWork.Task3.models.Book;
import HomeWork.Task3.service.BookService;

import java.util.List;

public class BookServiceImpl implements BookService {
    private BookDaoImpl bookDao;

    public BookServiceImpl(BookDaoImpl bookDao){
        this.bookDao = bookDao;
    }
    @Override
    public String saveBook(Long libraryId, Book book) {
        return bookDao.saveBook(libraryId, book);
    }

    @Override
    public List<Book> getAllBooks(Long libraryId) {
        return bookDao.getAllBooks(libraryId);
    }

    @Override
    public Book getBookById(Long libraryId, Long bookId) {
        return bookDao.getBookById(libraryId, bookId);
    }

    @Override
    public String deleteBook(Long libraryId, Long bookId) {
        return bookDao.deleteBook(libraryId, bookId);
    }

    @Override
    public void clearBooksByLibraryId(Long libraryId) {
        bookDao.clearBooksByLibraryId(libraryId);
    }
}
