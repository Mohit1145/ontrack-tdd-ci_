package sit707.ontrack;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TaskStatusServiceTest {

    @Test
    public void testSubmittedStatus() {

        TaskStatusService service = new TaskStatusService();

        String result = service.getTaskStatusMessage("S123", "9.1P", "SUBMITTED");

        assertEquals("Task 9.1P for student S123 has been submitted and is waiting for review.", result); // keep wrong for failure
    }
}