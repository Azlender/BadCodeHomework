package ru.academy;

// Валидатор сотрудников
class BasicEmployeeValidator implements EmployeeValidator {
    @Override
    public boolean isValid(Employee emp) {
        return emp != null
                && isValidName(emp.getName())
                && isValidAge(emp.getAge())
                && isValidSalary(emp.getSalary());
    }

    private boolean isValidName(String name) {
        return name != null && !name.isEmpty();
    }

    private boolean isValidAge(int age) {
        return age > 18 && age < 65;
    }

    private boolean isValidSalary(double salary) {
        return salary > 0;
    }
}
