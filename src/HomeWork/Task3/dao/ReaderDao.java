package HomeWork.Task3.dao;

import HomeWork.Task3.models.Reader;

import java.util.List;

public interface ReaderDao{
    void saveReader(Long libraryID, Reader reader);

    List<Reader> getAllReaders();

    Reader getReaderById(Long id);

    Reader updateReader(Long libraryID, Long id, Reader reader);
}
