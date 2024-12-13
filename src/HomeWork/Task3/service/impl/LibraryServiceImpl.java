package HomeWork.Task3.service.impl;

import HomeWork.Task3.dao.Impl.BookDaoImpl;
import HomeWork.Task3.dao.Impl.LibraryDaoImpl;
import HomeWork.Task3.dao.LibraryDao;
import HomeWork.Task3.models.Library;
import HomeWork.Task3.service.LibraryService;

import java.util.List;

public class LibraryServiceImpl implements LibraryService {
    private LibraryDaoImpl libraryDao;

    public LibraryServiceImpl(LibraryDaoImpl libraryDao){
        this.libraryDao = libraryDao;
    }
    @Override
    public List<Library> saveLibrary(List<Library> libraries) {
        return libraryDao.saveLibrary(libraries);
    }

    @Override
    public List<Library> getAllLibraries() {
        return libraryDao.getAllLibraries();
    }

    @Override
    public Library getLibraryById(Long id) {
        return libraryDao.getLibraryById(id);
    }

    @Override
    public Library updateLibrary(Long id, Library library) {
        return libraryDao.updateLibrary(id, library);
    }

    @Override
    public String deleteLibrary(Long id) {
        return libraryDao.deleteLibrary(id);
    }
}
