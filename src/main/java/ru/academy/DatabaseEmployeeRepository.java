package ru.academy;

import java.util.ArrayList;
import java.util.List;

// Реализация репозитория
class DatabaseEmployeeRepository implements EmployeeRepository {
    private final DatabaseConnection dbConnection;
    private final List<Employee> employees = new ArrayList<>();

    public DatabaseEmployeeRepository(DatabaseConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    @Override
    public boolean employeeExists(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void saveEmployee(Employee emp) {
        if (dbConnection.isConnected()) {
            dbConnection.save(emp);
            employees.add(emp);
        }
    }
}
