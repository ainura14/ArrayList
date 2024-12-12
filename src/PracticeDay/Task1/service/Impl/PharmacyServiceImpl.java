package PracticeDay.Task1.service.Impl;

import HomeWork.Task3.db.DataBase;
import PracticeDay.Task1.dao.Impl.PharmacyDaoImpl;
import PracticeDay.Task1.model.Pharmacy;
import PracticeDay.Task1.service.PharmacyService;

import java.util.ArrayList;

public class PharmacyServiceImpl implements PharmacyService {
//    private final DataBase dataBase = new DataBase();
    private final PharmacyDaoImpl pharmacyDaoImpl;

    public PharmacyServiceImpl(PharmacyDaoImpl pharmacyDaoImpl){
        this.pharmacyDaoImpl = pharmacyDaoImpl;
    }
    @Override
    public void addPharmacy(Pharmacy newPharmacy) {
        pharmacyDaoImpl.addPharmacy(newPharmacy);
    }

    @Override
    public ArrayList<Pharmacy> getAllPharmacy() {
        return pharmacyDaoImpl.getAllPharmacy();
    }

    @Override
    public Pharmacy getByPharmacyID(Long id) {
        return pharmacyDaoImpl.getByPharmacyID(id);
    }

    @Override
    public void updatePharmacy(Long id, Pharmacy pharmacy) {
        pharmacyDaoImpl.updatePharmacy(id, pharmacy);
    }

    @Override
    public void deletePharmacyByID(Long id) {
        pharmacyDaoImpl.deletePharmacyByID(id);
    }
}
