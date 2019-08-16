package by.epam.javatraining.TarlikouskiDzmitri.task04.exception;

public class NotAvailableTypeOfEmployee extends Exception {

    public NotAvailableTypeOfEmployee(String msg) {
        super(msg);
    }

    public NotAvailableTypeOfEmployee(String msg, Throwable throwable) {
        super(msg, throwable);
    }
}
