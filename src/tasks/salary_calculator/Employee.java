package tasks.salary_calculator;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (this.salary >= 1000) return (this.salary * 3) / 100.0d;
        else return 0.0d;
    }

    double bonus() {
        if (this.workHours > 40) {
            double bonus = 0.0d;
            for (int i = 40; i < this.workHours; i++) {
                bonus += 30.0d;
            }
            return bonus;
        }
        return 0.0d;
    }

    double raiseSalary() {
        if (2021 - this.hireYear < 10) {
            return (this.salary * 5) / 100.0d;
        }
        if (2021 - this.hireYear >= 9 && 2021 - this.hireYear <= 20) {
            return (this.salary * 10) / 100.0d;
        }
        if (2021 - this.hireYear >= 19) {
            return (this.salary * 15) / 100.0d;
        }

        return this.salary;
    }

    void printEmployeeInfo() {
        System.out.println("========================");
        System.out.println("Adı: " + this.name + "\nMaaşı: " + this.salary + "\nÇalışma Saati: " + this.workHours + "\nBaşlangıç Yılı: " + this.hireYear + "\nVergi: " + tax() + "\nBonus: " + bonus() + "\nMaaş Artışı: " + raiseSalary() + "\nVergi ve Bonuslar ile birlikte maaş: " + salaryWithTaxAndBonus() + "\nToplam Maaş: " + totalSalary());
    }

    double salaryWithTaxAndBonus() {
        return salary + bonus() - tax();
    }

    double totalSalary() {
        return salary + bonus() - tax() + raiseSalary();
    }
}
