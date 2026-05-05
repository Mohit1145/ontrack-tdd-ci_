package sit707.ontrack;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TaskStatusServiceTest {

    @Test
    public void testSubmittedStatus() {

        TaskStatusService service = new TaskStatusService();

        String result = service.getTaskStatusMessage("S123", "9.1P", "SUBMITTED");

        assertEquals("Wrong output", result); // keep wrong for failure
    }
}