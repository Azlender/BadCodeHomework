package ru.academy;

// Интерфейс подключения к БД
interface DatabaseConnection {
    boolean isConnected();

    void save(Employee emp);
}
