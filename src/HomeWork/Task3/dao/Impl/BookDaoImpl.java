package HomeWork.Task3.dao.Impl;

import HomeWork.Task3.dao.BookDao;
import HomeWork.Task3.models.Book;
import HomeWork.Task3.db.DataBase;
import HomeWork.Task3.models.Library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookDaoImpl implements BookDao {
//    private final DataBase dataBase = new DataBase();

    @Override
    public String saveBook(Long libraryId, Book book) {
        for (Library library : DataBase.libraries) {
            if (library.getId() == libraryId) {
                List<Book> books = library.getBooks();
                if (books == null) {
                    books = new ArrayList<>();
                }
                books.add(book);
                library.setBooks(books);
                return "Successfully added";
            }
        }
        return "We can't add this book.";
    }

    @Override
    public List<Book> getAllBooks(Long libraryId) {
        for (int i = 0; i < DataBase.libraries.size(); i++) {
            if(DataBase.libraries.get(i).getId() == libraryId){
                return DataBase.libraries.get(i).getBooks();
            }
        }
        return Collections.emptyList();
    }

    @Override
    public Book getBookById(Long libraryId, Long bookId) {
        for (int i = 0; i < DataBase.libraries.size(); i++) {
            if(DataBase.libraries.get(i).getId() == libraryId){
                List<Book> books = DataBase.libraries.get(i).getBooks();
                for (Book book : books) {
                    if(book.getId() == bookId){
                        return book;
                    }
                }
            }
        }
        return null;
    }

    @Override
    public String deleteBook(Long libraryId, Long bookId) {
        for (int i = 0; i < DataBase.libraries.size(); i++) {
            if(DataBase.libraries.get(i).getId() == libraryId){
                List<Book> books = DataBase.libraries.get(i).getBooks();
                for (int j = 0; j < books.size(); j++) {
                    if((books.get(j).getId()).equals(bookId)){
                        books.remove(j);
                        DataBase.libraries.get(i).setBooks(books);
                        return "Successfully daleted.";
                    }
                }
            }
        }
        return "We can't deleted this book.";
    }

    @Override
    public void clearBooksByLibraryId(Long libraryId) {
        boolean isCheck = false;
        for (int i = 0; i < DataBase.libraries.size(); i++) {
            if(DataBase.libraries.get(i).getId() == libraryId){
                DataBase.libraries.get(i).getBooks().clear();
                isCheck = true;
                System.out.println("Successfully cleared.");
            }
        }
        if(!isCheck){
            System.out.println("We can't clear this library.");
        }
    }
}
