package PracticeDay.Task1.service;

import PracticeDay.Task1.dao.MedicineDao;
import PracticeDay.Task1.model.Medicine;

import java.util.ArrayList;

public interface MedicineService {
    void addMedicineToPharmacyByID(Long id, Medicine newMedicine);
    // TODO get all
    ArrayList<Medicine> getAllMediciens();
    // TODO add
    void addMedicine(Long id, Medicine medicine);
    //TODO get by ID
    Medicine getMedicineByID(Long id);
    //TODO update
    String updateMedicineByID(Long id, Medicine newMedicine);
    //TODO delete
    String deleteMedicineByID(Long id);
}
