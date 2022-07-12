public class MaasHesabi {
    public static void main(String[] args) {
    Employee e1 = new Employee("Churchill", 4000, 45, 2000);
    e1.tax();
    e1.raiseSalary();
    e1.bonus();
    e1.printEmployee();
    }
}
