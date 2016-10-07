package strangereons;

import org.junit.Test;
import ui.UI;

import static org.junit.Assert.assertEquals;

public class AcceptanceTest {
    @Test
    public void testLeeting() throws Exception {
        UI ui = new UI(new StrangerEonsApplication());
        assertEquals("Leeted: 5ecret", ui.leetMessage("Secret"));
    }
}