package HomeWork.Task3.dao.Impl;

import HomeWork.Task3.dao.LibraryDao;
import HomeWork.Task3.db.DataBase;
import HomeWork.Task3.db.Generator;
import HomeWork.Task3.models.Library;

import java.util.List;


public class LibraryDaoImpl implements LibraryDao {

    private void addFirstLibrary(){
        Library library = new Library(Generator.setLibraryID(), "Manas", "Tynalieva");
        DataBase.libraries.add(library);
    }
    @Override
    public List<Library> saveLibrary(List<Library> libraries) {
        addFirstLibrary();
        for (int i = 0; i < DataBase.libraries.size(); i++) {
            if(DataBase.libraries.get(i).getId() != libraries.get(i).getId()){
                DataBase.libraries.add(libraries.get(i));
                return DataBase.libraries;
            }
        }
        return null;
    }

    @Override
    public List<Library> getAllLibraries() {
        return DataBase.libraries;
    }

    @Override
    public Library getLibraryById(Long id) {
        for (int i = 0; i < DataBase.libraries.size(); i++) {
            if(DataBase.libraries.get(i).getId() == id){
                return DataBase.libraries.get(i);
            }
        }
        return null;
    }

    @Override
    public Library updateLibrary(Long id, Library library) {
        for (int i = 0; i < DataBase.libraries.size(); i++) {
            if(DataBase.libraries.get(i).getId() == id){
                for (Library library1 : DataBase.libraries) {
                    library1.setAddress(library.getAddress());
                    library1.setName(library.getName());
                    library1.setBooks(library.getBooks());
                    return library1;
                }
            }
        }
        return null;
    }

    @Override
    public String deleteLibrary(Long id) {
        for (Library library : DataBase.libraries) {
            if(library.getId() == id){
                DataBase.libraries.remove(library);
                return "Successfully deleted library.";
            }
        }
        return "We can't deleted this library.";
    }
}
