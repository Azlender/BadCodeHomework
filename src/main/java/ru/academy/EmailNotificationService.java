package ru.academy;

// Сервис уведомлений
class EmailNotificationService implements NotificationService {
    private final Logger logger;

    public EmailNotificationService(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void sendNotification(Employee emp) {
        if (emp != null && emp.getEmail() != null && !emp.getEmail().isEmpty()) {
            logger.log("Sending email to " + emp.getEmail());
        }
    }
}
