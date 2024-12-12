package PracticeDay.Task1.dataBase;

public class Generator {
    private static Long pharmacyID = 1L;
    private static Long medicineID = 1L;
    private static Long employeeID = 1L;

    public static Long setPharmacyID(){
        return pharmacyID++;
    }

    public static Long setMedicineID(){
        return medicineID++;
    }

    public static Long setEmployeeID(){
        return employeeID++;
    }
}
