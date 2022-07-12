public class Employee {
    String name;
    double salary, tax, bonus, raiseSalary;
    int workHours, hireYear;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    void tax (){
        if(this.salary <= 1000){
            this.tax = 0;
        }else{
            this.tax = this.salary * 0.03;
        }
    }
    void bonus(){
        if (workHours > 40){
            this.bonus = (this.workHours - 40) * 30;
        }
    }
    void raiseSalary(){
        int year = 2021;
        if (year - hireYear < 10){
            this.raiseSalary = this.salary * 0.05;
        }else if (year - hireYear > 9 && year - hireYear < 20){
            this.raiseSalary = this.salary * 0.10;
        }else if (year -hireYear > 19){
            this.raiseSalary = this.salary * 0.15;
        }else {
            this.raiseSalary = 0;
        }
    }
    void printEmployee(){
        System.out.println("Calisanin ismi : " + this.name);
        System.out.println("Calisanin maasi : " +this.salary);
        System.out.println("Calisanin calisma saati : " +this.workHours);
        System.out.println("Ise basladigi yil : " +this.hireYear);
        System.out.println("Odeyecegi vergi : " +this.tax);
        System.out.println("Aldigi bonus : " +this.bonus);
        System.out.println("Maas artisi : " + this.raiseSalary);
        System.out.println("Vergiler ve bonuslar ile maas : " + (this.salary + this.bonus - this.tax));
        System.out.println("Toplam maas : " + (this.salary - this.tax + this.bonus + this.raiseSalary));
    }
}
