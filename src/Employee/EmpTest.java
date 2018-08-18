package Employee;

public class EmpTest {
    public static void main(String[] args) {
        Employee empOne = new Employee("Juan Dela Cruz");
        empOne.empAge(26);
        empOne.empSalary(10000);
        empOne.printDetails();

        Employee empTwo = new Employee("Jose Angelo De Vera");
        empTwo.empAge(19);
        empTwo.empSalary(20000);
        empTwo.printDetails();

    }
}
