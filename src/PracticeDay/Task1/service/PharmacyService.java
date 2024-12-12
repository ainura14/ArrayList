package PracticeDay.Task1.service;

import PracticeDay.Task1.model.Pharmacy;

import java.util.ArrayList;

public interface PharmacyService {
    //TODO add
    void addPharmacy(Pharmacy newPharmacy);

    //TODO get all
    ArrayList<Pharmacy> getAllPharmacy();

    //TODO get by ID
    Pharmacy getByPharmacyID(Long id);

    //TODO update
    void updatePharmacy(Long id, Pharmacy pharmacy);

    //TODO delete
    void deletePharmacyByID(Long id);
}
