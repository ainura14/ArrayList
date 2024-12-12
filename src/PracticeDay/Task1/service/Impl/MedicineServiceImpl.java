package PracticeDay.Task1.service.Impl;

import PracticeDay.Task1.dao.Impl.MedicineDaoImpl;
import PracticeDay.Task1.dao.MedicineDao;
import PracticeDay.Task1.model.Medicine;
import PracticeDay.Task1.service.MedicineService;

import java.util.ArrayList;

public class MedicineServiceImpl implements MedicineService {
    private final MedicineDaoImpl medicineDao;

    public MedicineServiceImpl(MedicineDaoImpl medicineDao){
        this.medicineDao = medicineDao;
    }

    @Override
    public void addMedicine(Long id, Medicine medicine) {
        medicineDao.addMedicine(id, medicine);
    }

    @Override
    public Medicine getMedicineByID(Long id) {
        return medicineDao.getMedicineByID(id);
    }

    @Override
    public String updateMedicineByID(Long id, Medicine newMedicine) {
        return medicineDao.updateMedicineByID(id, newMedicine);
    }

    @Override
    public String deleteMedicineByID(Long id) {
        return medicineDao.deleteMedicineByID(id);
    }

    @Override
    public void addMedicineToPharmacyByID(Long id, Medicine newMedicine) {

    }

    @Override
    public ArrayList<Medicine> getAllMediciens() {
        return medicineDao.getAllMediciens();
    }
}
