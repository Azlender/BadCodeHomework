package ru.academy;

// Базовый класс сотрудника
abstract class Employee {
    private final int id;
    private final String name;
    private final int age;
    private final double salary;
    private final String email;

    protected Employee(int id, String name, int age, double salary, String email) {
        validateBaseParameters(id, name, age, salary);
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.email = email;
    }

    private void validateBaseParameters(int id, String name, int age, double salary) {
        if (id <= 0) throw new IllegalArgumentException("Invalid ID");
        if (name == null || name.trim().isEmpty()) throw new IllegalArgumentException("Invalid name");
        if (age < 18 || age > 65) throw new IllegalArgumentException("Invalid age");
        if (salary <= 0) throw new IllegalArgumentException("Invalid salary");
    }

    // Геттеры
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getEmail() {
        return email;
    }
}
