package ru.academy;

// Интерфейсы разделения ответственностей
interface EmployeeRepository {
    boolean employeeExists(int id);

    void saveEmployee(Employee emp);
}
