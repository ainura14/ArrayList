package HomeWork.Task3.service.impl;

import HomeWork.Task3.dao.Impl.ReaderDaoImpl;
import HomeWork.Task3.models.Reader;
import HomeWork.Task3.service.ReaderService;

import java.util.List;

public class ReaderServiceImpl implements ReaderService {
    private final ReaderDaoImpl readerDao;

    public ReaderServiceImpl(ReaderDaoImpl readerDao){
        this.readerDao = readerDao;
    }
    @Override
    public void saveReader(Long libraryID, Reader reader) {
        readerDao.saveReader(libraryID, reader);
    }

    @Override
    public List<Reader> getAllReaders() {
        return readerDao.getAllReaders();
    }

    @Override
    public Reader getReaderById(Long id) {
        return readerDao.getReaderById(id);
    }

    @Override
    public Reader updateReader(Long libraryID, Long id, Reader reader) {
        return readerDao.updateReader(libraryID, id, reader);
    }
}
