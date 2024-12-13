package HomeWork.Task3.dao.Impl;

import HomeWork.Task3.dao.ReaderDao;
import HomeWork.Task3.db.DataBase;
import HomeWork.Task3.models.Library;
import HomeWork.Task3.models.Reader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ReaderDaoImpl implements ReaderDao {
    @Override
    public void saveReader(Long libraryID, Reader reader) {
        boolean isCheck = false;
        for (Library library : DataBase.libraries) {
            if(library.getId() == libraryID){
                isCheck = true;
                List<Reader> readers = library.getReaders();
                if (readers == null) {
                    readers = new ArrayList<>();
                }
                readers.add(reader);
                library.setReaders(readers);
                System.out.println("Successfully saved reader.");
            }
        }
        if(!isCheck){
            System.out.println("Don't saved the reader.");
        }
    }

    @Override
    public List<Reader> getAllReaders() {
        List<Reader> readers = new ArrayList<>();
        for (Library library : DataBase.libraries) {
            List<Reader> readers1 = library.getReaders();
            for (Reader reader : readers1) {
                readers.add(reader);
            }
        }
        return readers;
    }

    @Override
    public Reader getReaderById(Long id) {
        for (Reader reader : getAllReaders()) {
            if(reader.getId() == id){
                return reader;
            }
        }
        return null;
    }

    @Override
    public Reader updateReader(Long libraryID, Long id, Reader reader) {
//        List<Reader> readers = getAllReaders();
        for (int i = 0; i < DataBase.libraries.size(); i++) {
            if(DataBase.libraries.get(i).getId() == libraryID){
                List<Reader> readers = DataBase.libraries.get(i).getReaders();
                for (Reader reader1 : readers) {
                    if(reader1.getId() == id){
                        reader1.setFullName(reader.getFullName());
                        reader1.setEmail(reader.getEmail());
                        reader1.setGender(reader.getGender());
                        reader1.setPhoneNumber(reader.getPhoneNumber());
                        DataBase.libraries.get(i).setReaders(readers);
                        return reader1;
                    }
                }
            }
        }
        return null;
    }
}
