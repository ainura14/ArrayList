package HomeWork.Task3;

import HomeWork.Task3.dao.Impl.BookDaoImpl;
import HomeWork.Task3.dao.Impl.LibraryDaoImpl;
import HomeWork.Task3.dao.Impl.ReaderDaoImpl;
import HomeWork.Task3.db.Generator;
import HomeWork.Task3.enums.Gender;
import HomeWork.Task3.enums.Genre;
import HomeWork.Task3.models.Book;
import HomeWork.Task3.models.Library;
import HomeWork.Task3.models.Reader;
import HomeWork.Task3.service.impl.BookServiceImpl;
import HomeWork.Task3.service.impl.LibraryServiceImpl;
import HomeWork.Task3.service.impl.ReaderServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scannerINT = new Scanner(System.in);
    static Scanner scannerSTR = new Scanner(System.in);

    static BookDaoImpl bookDao = new BookDaoImpl();
    static BookServiceImpl bookService = new BookServiceImpl(bookDao);

    static LibraryDaoImpl libraryDao = new LibraryDaoImpl();
    static LibraryServiceImpl libraryService = new LibraryServiceImpl(libraryDao);

    static ReaderDaoImpl readerDao = new ReaderDaoImpl();
    static ReaderServiceImpl readerService = new ReaderServiceImpl(readerDao);

    public static void main(String[] args) {

        while (true) {
            System.out.println("""
                    1. book
                    2. library
                    3. reader
                    """);
            int num = scannerINT.nextInt();
            scannerSTR.nextLine();
            switch (num) {
                case 1 -> {
                    command1();
                }
                case 2 -> {
                    command2();
                }
                case 3->{
                    command3();
                }

            }
        }
    }

    public static void command1() {
        boolean isCheck = true;
        while (isCheck) {
            System.out.println("""
                    ---------- Book ---------
                    1. add
                    2. get all
                    3. get by ID
                    4. clear books from Library
                    5 delete
                    6. log out
                    """);
            int n = scannerINT.nextInt();
            scannerSTR.nextLine();
            switch (n) {
                case 1 -> {
                    System.out.println(bookService.saveBook(1L, new Book(Generator.setBookID(), "C.Aitmatov", Genre.ROMANCE)));
                    bookService.saveBook(1L, new Book(Generator.setBookID(), "A.Osmonov", Genre.ROMANCE));
                    bookService.saveBook(1L, new Book(Generator.setBookID(), "S.Kasimov", Genre.DRAMA));
                    bookService.saveBook(1L, new Book(Generator.setBookID(), "G.Aitiev", Genre.HUMOR));
                }
                case 2 -> {
                    System.out.println(bookService.getAllBooks(1L));
                }
                case 3 -> {
                    System.out.println(bookService.getBookById(1L, 1L));
                }
                case 4 -> {
                    bookService.clearBooksByLibraryId(1L);
                }
                case 5 -> {
                    System.out.println(bookService.deleteBook(1L, 1L));
                }
                case 6 -> {
                    isCheck = false;
                }
            }
        }
    }
    public static void command2(){
        boolean isCheck = true;
        while (isCheck) {
            System.out.println("""
                                ---------- Library ---------
                                1. add
                                2. get all
                                3. get by ID
                                4. update
                                5  delete
                                6. log out
                                """);
            int n = scannerINT.nextInt();
            scannerSTR.nextLine();
            switch (n) {
                case 1 -> {
                    System.out.println("Method add: ");
                    Library library = new Library(Generator.setLibraryID(), "Bayalinov", "Chuy");
                    List<Library> libraryList = new ArrayList<>();
                    libraryList.add(library);
                    System.out.println(libraryService.saveLibrary(libraryList));
                }
                case 2 -> {
                    System.out.println("Method get all: ");
                    System.out.println(libraryService.getAllLibraries());
                }
                case 3 -> {
                    System.out.println("Method get by ID: ");
                    System.out.println(libraryService.getLibraryById(1L));
                }
                case 4 -> {
                    System.out.println("Method update: ");
                    System.out.println(libraryService.updateLibrary(1L, new Library("Online Library", "Raritet")));
                }
                case 5 -> {
                    System.out.println("Method delete: ");
                    System.out.println(libraryService.deleteLibrary(2L));
                }
                case 6 -> {
                    isCheck = false;
                }
            }
        }
    }
    public static void command3(){
        boolean isCheck = true;
        while (isCheck){
            System.out.println("""
                    ---------- Reader ---------
                    1. save 
                    2. get all
                    3. get by ID
                    4. update 
                    5. log out
                    """);
            int n = scannerINT.nextInt();
            scannerSTR.nextLine();
            switch (n){
                case 1->{
                    System.out.println("Method add: ");
                    readerService.saveReader(1L, new Reader(Generator.setReaderID(), "Ainura", "aika@gmail.com", 990987789, Gender.FEMALE));
                    readerService.saveReader(2L, new Reader(Generator.setReaderID(), "Akamara;", "akma@gmail.com", 990987789, Gender.FEMALE));
                    readerService.saveReader(1L, new Reader(Generator.setReaderID(), "Mirgul", "mika@gmail.com", 990987789, Gender.FEMALE));
                    readerService.saveReader(2L, new Reader(Generator.setReaderID(), "Janylai", "jaku@gmail.com", 990987789, Gender.FEMALE));
                    readerService.saveReader(1L, new Reader(Generator.setReaderID(), "Leisan", "leisan@gmail.com", 990987789, Gender.FEMALE));
                }
                case 2->{
                    System.out.println("Method get all: ");
                    System.out.println(readerService.getAllReaders());
                }
                case 3->{
                    System.out.println("Method get by ID: ");
                    System.out.println(readerService.getReaderById(3L));
                }
                case 4->{
                    System.out.println("Method update: ");
                    System.out.println(readerService.updateReader(1L, 2L, new Reader("KKKKKKKKK", "KK@gmail.com", 000000000, Gender.MALE)));
                }
                case 5->{
                    isCheck = false;
                }
            }
        }
    }
}
