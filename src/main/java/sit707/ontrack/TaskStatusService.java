package sit707.ontrack;

public class TaskStatusService {

    private static final String SUBMITTED = "SUBMITTED";

    public String getTaskStatusMessage(String studentId, String taskId, String status) {

        if (isBlank(studentId)) {
            return "Invalid student ID.";
        }

        if (isBlank(taskId)) {
            return "Invalid task ID.";
        }

        if (isBlank(status)) {
            return "Task status is unknown.";
        }

        if (SUBMITTED.equals(status.trim().toUpperCase())) {
            return "Task " + taskId + " for student " + studentId
                    + " has been submitted and is waiting for review.";
        }

        return "Task status is unknown.";
    }

    private boolean isBlank(String value) {
        return value == null || value.trim().isEmpty();
    }
}