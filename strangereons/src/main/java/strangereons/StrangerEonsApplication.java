package strangereons;

import ui.ApplicationInterface;
import ui.UI;

public class StrangerEonsApplication implements ApplicationInterface {
    @Override
    public void leet(String string, UI ui) {
        ui.setLeeted(string.replace("S", "5"));
    }
}
