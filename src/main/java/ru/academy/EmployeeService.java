package ru.academy;

// Главный сервис
class EmployeeService {
    private final EmployeeRepository repository;
    private final EmployeeValidator validator;
    private final NotificationService notificationService;
    private final Logger logger;

    public EmployeeService(EmployeeRepository repository,
                           EmployeeValidator validator,
                           NotificationService notificationService,
                           Logger logger) {
        this.repository = repository;
        this.validator = validator;
        this.notificationService = notificationService;
        this.logger = logger;
    }

    public void processEmployee(Employee emp) {
        if (!validator.isValid(emp)) {
            logger.log("Invalid employee data");
            return;
        }

        if (repository.employeeExists(emp.getId())) {
            logger.log("Employee exists");
            return;
        }

        repository.saveEmployee(emp);
        notificationService.sendNotification(emp);
        logger.log("Added: " + emp.getName());
    }
}
