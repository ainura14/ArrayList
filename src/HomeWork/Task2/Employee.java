package HomeWork.Task2;

public class Employee {
    private String name;
    private int age;
    private String job;

    public Employee() {
    }

    public Employee(String name, int age, String job)throws InvalidAgeException {
        this.name = name;
        this.age = age;
        this.job = job;
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) throws InvalidAgeException{
        if(age < 0){
            throw new InvalidAgeException("The age must be positive.");
        }
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
