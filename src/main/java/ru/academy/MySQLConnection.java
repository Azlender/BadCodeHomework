package ru.academy;

class MySQLConnection implements DatabaseConnection {
    @Override
    public boolean isConnected() {
        return true;
    }

    @Override
    public void save(Employee emp) {
        // Реализация сохранения
    }
}
