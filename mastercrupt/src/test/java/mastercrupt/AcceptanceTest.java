package mastercrupt;

import org.junit.Test;
import ui.UI;

import static org.junit.Assert.assertEquals;
public class AcceptanceTest {
    @Test
    public void testLeeting() throws Exception {
        UI ui = new UI(new Application());
        assertEquals("Leeted: S3cr3t", ui.leetMessage("Secret"));
    }
}