package PracticeDay.Task1.dao.Impl;

import PracticeDay.Task1.dao.PharmacyDao;
import PracticeDay.Task1.dataBase.DataBase;
import PracticeDay.Task1.model.Pharmacy;

import java.util.ArrayList;
import java.util.List;

public class PharmacyDaoImpl implements PharmacyDao {
    private final DataBase dataBase = new DataBase();


    @Override
    public void addPharmacy(Pharmacy newPharmacy) {
        dataBase.pharmaciesList.add(newPharmacy);
        System.out.println("Successfully added.");
    }

    @Override
    public ArrayList<Pharmacy> getAllPharmacy() {
        return dataBase.pharmaciesList;
    }

    @Override
    public Pharmacy getByPharmacyID(Long id) {
        boolean isTrue = false;
        for (Pharmacy pharmacy : dataBase.pharmaciesList) {
            if(pharmacy.getId().equals(id)){
                isTrue = true;
                return pharmacy;
            }
        }
        if(!isTrue){
            System.out.println("We can't find this id " + id);
        }
        return null;
    }

    @Override
    public void updatePharmacy(Long id, Pharmacy pharmacy) {
        boolean isTrue = false;
        for (Pharmacy pharmacy1 : dataBase.pharmaciesList) {
            if(pharmacy1.getId().equals(id)){
                isTrue = true;
                pharmacy1.setAddress(pharmacy.getAddress());
                pharmacy1.setId(pharmacy.getId());
                pharmacy1.setName(pharmacy.getName());
                System.out.println("Successfully updated.");
            }
        }
        if(!isTrue){
            System.out.println(" We can't find this id.");
        }
    }

    @Override
    public void deletePharmacyByID(Long id) {
        boolean isTrue = false;
        for (Pharmacy pharmacy : dataBase.pharmaciesList) {
            if(pharmacy.getId().equals(id)){
                isTrue = true;
                dataBase.pharmaciesList.remove(pharmacy);
                System.out.println("Successfully deleted.");
                break;
            }
        }
        if(!isTrue){
            System.out.println("We can't find this id.");
        }
    }
}
