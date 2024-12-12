package PracticeDay.Task1.dao;

import PracticeDay.Task1.model.Medicine;

import java.util.ArrayList;

public interface MedicineDao {
    void addMedicineToPharmacyByID(Long id, Medicine newMedicine);

    ArrayList<Medicine> getAllMediciens();

    void addMedicine(Long id, Medicine medicine);

    Medicine getMedicineByID(Long id);

    String updateMedicineByID(Long id, Medicine newMedicine);

    String deleteMedicineByID(Long id);
}
