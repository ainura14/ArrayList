package PracticeDay.Task1;

import PracticeDay.Task1.dao.Impl.EmployeeDaoImpl;
import PracticeDay.Task1.dao.Impl.MedicineDaoImpl;
import PracticeDay.Task1.dao.Impl.PharmacyDaoImpl;
import PracticeDay.Task1.dao.MedicineDao;
import PracticeDay.Task1.dao.PharmacyDao;
import PracticeDay.Task1.dataBase.Generator;
import PracticeDay.Task1.enums.Gender;
import PracticeDay.Task1.enums.Position;
import PracticeDay.Task1.model.Employee;
import PracticeDay.Task1.model.Medicine;
import PracticeDay.Task1.model.Pharmacy;
import PracticeDay.Task1.service.Impl.EmployeeServiceImpl;
import PracticeDay.Task1.service.Impl.MedicineServiceImpl;
import PracticeDay.Task1.service.Impl.PharmacyServiceImpl;
import PracticeDay.Task1.service.MedicineService;
import PracticeDay.Task1.service.PharmacyService;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static PharmacyDaoImpl pharmacyDao = new PharmacyDaoImpl();
    static PharmacyService pharmacyService = new PharmacyServiceImpl(pharmacyDao);
    static MedicineDaoImpl medicineDao = new MedicineDaoImpl();
    static MedicineService medicineService = new MedicineServiceImpl(medicineDao);
    static EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();
    static EmployeeServiceImpl employeeService = new EmployeeServiceImpl(employeeDao);

    public static void main(String[] args) {
        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerStr = new Scanner(System.in);
        while(true){
            System.out.println("""
                    1. Pharmacy
                    2. Medicine
                    3. Employee
                    """);
            int num = scannerInt.nextInt();
            scannerStr.nextLine();
            switch (num){
                case 1->{
                    workWithPharmacy();
                }
                case 2->{
                    workWithMedicine();
                }
                case 3->{
                    workWithEmployee();
                }
            }
        }

    }

    public static void workWithPharmacy() {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);
        boolean isTrue = true;
        while (isTrue) {
            System.out.println("""
                    ----- Pharmacy -----
                    1. add 
                    2. get all 
                    3. get by ID
                    4. update1
                    5. delete
                    6. log out
                    """);
            int word = scannerInt.nextInt();
            scanner.nextLine();
            switch (word) {
                case 1 -> {
                    pharmacyService.addPharmacy(new Pharmacy(Generator.setPharmacyID(), "Aibolit", "Bishkek"));
                    pharmacyService.addPharmacy(new Pharmacy(Generator.setPharmacyID(), "Neman", "Naryn"));
                }
                case 2 -> {
                    System.out.println(pharmacyService.getAllPharmacy());
                }
                case 3 -> {
                    System.out.println("Write the id: ");
                    System.out.println(pharmacyService.getByPharmacyID(scanner.nextLong()));
                }
                case 4 -> {
                    System.out.println("Write the id: ");
                    Long id = scanner.nextLong();
                    System.out.println("Write the name of pharmacy: ");
                    String name = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Write the address of pharmacy: ");
                    String address = scanner.nextLine();
                    pharmacyService.updatePharmacy(id, new Pharmacy(Generator.setPharmacyID(), name, address));
                }
                case 5 -> {
                    System.out.println("Write the id: ");
                    pharmacyService.deletePharmacyByID(scanner.nextLong());
                }
                case 6->{
                    isTrue = false;
                }
            }
        }
    }
    public static void workWithMedicine(){
        Scanner scanner = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);
        boolean isTrue = true;
        while(isTrue){
            System.out.println("""
                    ----- Medicine -----
                    1. add 
                    2. get all 
                    3. get by ID
                    4. update
                    5. delete
                    6. log out
                    """);
            int num = scannerInt.nextInt();
            switch (num){
                case 1->{
//                    System.out.println("Write the name: ");
//                    String name = scanner.nextLine();
//                    System.out.println("Write the price: ");
//                    int price = scannerInt.nextInt();
//                    scanner.nextLine();
//                    System.out.println("Write the description: ");
//                    String desc = scanner.nextLine();
//                    System.out.println("Write the expiration data: ");
//                    LocalDate localDate = LocalDate.parse(scanner.nextLine());
//                    medicineService.addMedicineToPharmacyByID(Generator.setMedicineID(), new Medicine(name, price, desc, localDate));
                    System.out.println("Write the id of pharmacy to add medicine: ");
                    Long id = scannerInt.nextLong();
                    scanner.nextLine();
                    medicineService.addMedicine(id, new Medicine(Generator.setMedicineID(), "Tailol Hot", 120, "Asigned flu", LocalDate.of(2021, 12, 9)));

                }
                case 2->{
                    System.out.println(medicineService.getAllMediciens());
                }
                case 3->{
                    System.out.println("Write the id of medicine: ");
                    Long id = scannerInt.nextLong();
                    scanner.nextLine();
                    System.out.println(medicineService.getMedicineByID(id));
                }
                case 4->{
                    System.out.println("Write the ID of medicine to update.");
                    Long id = scannerInt.nextLong();
                    System.out.println(medicineService.updateMedicineByID(id, new Medicine("Mukaltin", 1200, "Protiv kashlya", LocalDate.of(2024, 12, 9))));
                }
                case 5->{
                    System.out.println("Write the ID of medicine to delete.");
                    Long id = scannerInt.nextLong();
                    System.out.println(medicineService.deleteMedicineByID(id));
                }
                case 6->{
                    isTrue = false;
                }
            }
        }
    }
    public static void workWithEmployee(){
        Scanner scanner = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);

        boolean isCheck = true;
        while (isCheck){
            System.out.println("""
                    ----- Employee -----
                    1. add 
                    2. get all 
                    3. get by ID
                    4. update
                    5. delete
                    6. log out
                    """);
            int num = scannerInt.nextInt();
            scanner.nextLine();

            switch (num){
                case 1->{
                    System.out.println("Write the id of pharmacy to add the employee: ");
                    Long id = scannerInt.nextLong();
                    scanner.nextLine();
                    System.out.println(employeeService.addEmployee(id, new Employee(Generator.setEmployeeID(), "Aijamal", "Aija@gmail.com", "990877677", Position.TELLER, 12.3, Gender.FEMALE)));
                }
                case 2->{
                    System.out.println("Write the id of pharmacy to get all employee:");
                    Long id = scannerInt.nextLong();
                    scanner.nextLine();
                    System.out.println(employeeService.getAllEmployees(id));
                }
                case 3->{
                    System.out.println("Write the name of pharmacy to get the employee: ");
                    String name = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Write the id to get employee: ");
                    Long id = scannerInt.nextLong();
                    scanner.nextLine();
                    System.out.println(employeeService.getEmployeeByID(id, name));
                }
                case 4->{
                    System.out.println("Write the name of pharmacy: ");
                    String name = scanner.nextLine();
                    System.out.println("Write the id of employee to update: ");
                    Long id = scannerInt.nextLong();
                    System.out.println(employeeService.updateTheEmployee(name, id, new Employee("Akmaral", "akma@gmail.com", "990087098", 12.3, Position.PHARMACIST, Gender.FEMALE)));
                }
                case 5->{
                    try {
                        System.out.println("Write the name of pharmacy: ");
                        String name = scanner.nextLine();
                        System.out.println("Write the id of employee: ");
                        Long id = scannerInt.nextLong();
                        System.out.println(employeeService.deleteTheEmployee(name, id));
                    }catch (InputMismatchException e){
                        throw new IllegalArgumentException("Plase enter the number");
                    }
                }
                case 6->{
                    isCheck = false;
                }
            }
        }
    }
}
