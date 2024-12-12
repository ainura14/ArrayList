package HomeWork.Task3.service;

import HomeWork.Task3.models.Library;

import java.util.List;

public interface LibraryService {
    List<Library>saveLibrary(List<Library>libraries);
    List<Library> getAllLibraries();
    Library getLibraryById(Long id);
    Library updateLibrary(Long id, Library library);
    String deleteLibrary(Long id);


}
