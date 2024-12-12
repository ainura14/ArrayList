package PracticeDay.Task1.dao.Impl;

import PracticeDay.Task1.dao.MedicineDao;
import PracticeDay.Task1.dataBase.DataBase;
import PracticeDay.Task1.model.Medicine;
import PracticeDay.Task1.model.Pharmacy;

import java.util.ArrayList;
import java.util.List;

public class MedicineDaoImpl implements MedicineDao {
    private final DataBase dataBase = new DataBase();


    @Override
    public void addMedicineToPharmacyByID(Long id, Medicine newMedicine) {
        boolean isTrue = false;
        for (Pharmacy pharmacy : dataBase.pharmaciesList) {
            for (Medicine medicine : pharmacy.getMedicines()) {
                if (medicine.getId() != id) {
                    isTrue = true;
                    List<Medicine> medicineList = new ArrayList<>();
                    medicineList.add(newMedicine);
                    pharmacy.setMedicines(medicineList);
                    System.out.println("Successfully added.");
                }
            }
        }
        if (!isTrue) {
            System.out.println("We can't added this medicine.");
        }
    }

    @Override
    public ArrayList<Medicine> getAllMediciens() {
        ArrayList<Medicine> allMediciens = new ArrayList<>();
        try {
            for (Pharmacy pharmacy : dataBase.pharmaciesList) {
                if (pharmacy.getMedicines() != null) {
                    for (Medicine medicine : pharmacy.getMedicines()) {
                        allMediciens.add(medicine);
                    }
                }
            }
        } catch (NullPointerException e) {
            throw new IllegalArgumentException("We can't find any medicine");
        }

        return allMediciens;
    }

    @Override
    public void addMedicine(Long id, Medicine newMedicine) {
        boolean isCheck = false;
        for (Pharmacy pharmacy : dataBase.pharmaciesList) {
            if (pharmacy.getId().equals(id)) {
                isCheck = true;
                ArrayList<Medicine> medicines = new ArrayList<>();
                medicines.add(newMedicine);
                pharmacy.setMedicines(medicines);
                System.out.println("Successfully added.");
            }
        }
        if (!isCheck) {
            System.out.println("We can't find this pharmacy with this ID " + id + " to add the medicine.");
        }
    }

    @Override
    public Medicine getMedicineByID(Long id) {
        Medicine medicine = new Medicine();
        try {
            for (Pharmacy pharmacy : dataBase.pharmaciesList) {
                if (pharmacy != null) {
                    for (Medicine m : pharmacy.getMedicines()) {
                        if (m.getId() == id && m != null) {
                            medicine = m;
                            return medicine;
                        }
                    }
                }
            }
        } catch (NullPointerException e) {
            throw new IllegalArgumentException("Pharmacy or medicine are empty.");
        }
        throw new IllegalArgumentException("We can't find medicine with ID " + id);
    }

    @Override
    public String updateMedicineByID(Long id, Medicine newMedicine) {
        boolean isCheck = false;
        try {
            for (Pharmacy pharmacy : dataBase.pharmaciesList) {
                if(pharmacy != null) {
                    for (Medicine medicine : pharmacy.getMedicines()) {
                        if (medicine.getId() == id && medicine != null) {
                            isCheck = true;
                            medicine.setName(newMedicine.getName());
                            medicine.setDescription(newMedicine.getDescription());
                            medicine.setPrice(newMedicine.getPrice());
                            medicine.setExpirationDate(newMedicine.getExpirationDate());
                            return "Successfully updated.";
                            }
                        }
                    }
                }
            } catch (NullPointerException e){
            throw new IllegalArgumentException("We can't find this medicine to update");
        }
        return "We can't find this medicine to update.";
    }

    @Override
    public String deleteMedicineByID(Long id) {
        for (Pharmacy pharmacy : dataBase.pharmaciesList) {
            for (Medicine medicine : pharmacy.getMedicines()) {
                if(medicine.getId() == id){
                    pharmacy.getMedicines().remove(medicine);
                    return "Successfully deleted.";
                }
            }
        }
        return "We can't find this medicine.";
    }
}
