package ru.academy;

// Конкретные реализации сотрудников
class RegularEmployee extends Employee {
    public RegularEmployee(int id, String name, int age, double salary, String email) {
        super(id, name, age, salary, email);
        validateSalary(salary);
    }

    private void validateSalary(double salary) {
        if (salary < 0) throw new IllegalArgumentException("Invalid salary");
    }
}
