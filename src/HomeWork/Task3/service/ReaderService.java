package HomeWork.Task3.service;

import HomeWork.Task3.models.Reader;

import java.util.List;

public interface ReaderService {
    void saveReader(Reader reader);

    List<Reader> getAllReaders();

    Reader getReaderById(Long id);

    Reader updateReader(Long id, Reader reader);

    void assignReaderToLibrary(Long readerId,Long libraryId);
}