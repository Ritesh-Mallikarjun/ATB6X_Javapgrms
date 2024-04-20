package batch11April;

public class LoggingSystem {
    public void logMessage(String timestamp, String userId, String action) {
        // Construct immutable log message
        String logMessage = "[" + timestamp + "] User " + userId + " performed action: " + action;

        // Simulate logging (printing to console)
        System.out.println(logMessage);
    }

    public static void main(String[] args) {
        LoggingSystem loggingSystem = new LoggingSystem();

        // Simulate multiple concurrent requests (threads) logging messages
        new Thread(() -> {
            loggingSystem.logMessage("2022-04-25 10:30:15", "12345", "Viewed profile");
        }).start();

        new Thread(() -> {
            loggingSystem.logMessage("2022-04-25 11:15:50", "67890", "Updated settings");
        }).start();
    }
}
