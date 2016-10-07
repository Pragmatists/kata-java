package mastercrupt;

public class UI {
    private ApplicationInterface applicationInterface;
    private String leeted;

    public UI(Application applicationInterface) {
        this.applicationInterface = applicationInterface;
    }

    public String leetMessage(String unLeeted) {
        applicationInterface.leet(unLeeted, this);
        return "Leeted: " + leeted;
    }

    public void setLeeted(String leeted) {
        this.leeted = leeted;
    }
}