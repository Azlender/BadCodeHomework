package ru.academy;

class Manager extends Employee {
    public Manager(int id, String name, int age, double salary, String email) {
        super(id, name, age, salary, email);
        validateSalary(salary);
    }

    private void validateSalary(double salary) {
        if (salary < 5000) throw new IllegalArgumentException("Manager salary too low");
    }
}
