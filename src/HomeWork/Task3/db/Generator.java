package HomeWork.Task3.db;

public class Generator {
    private static Long bookID = 1L;
    private static Long libraryID = 1L;
    private static Long readerID = 1L;

    public static Long setBookID(){
        return bookID++;
    }

    public static Long setLibraryID(){
        return libraryID++;
    }

    public static Long setReaderID(){
        return readerID++;
    }
}
