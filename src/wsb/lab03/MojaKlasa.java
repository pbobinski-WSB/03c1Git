package wsb.lab03;

public class MojaKlasa {

    private int poleLiczbowe = 12;

    @Override
    public String toString() {
        return "MojaKlasa{" +
                "poleLiczbowe=" + getPoleLiczbowe() +
                '}';
    }

    public int getPoleLiczbowe() {
        return poleLiczbowe;
    }

    public void setPoleLiczbowe(int poleLiczbowe) {
        this.poleLiczbowe = poleLiczbowe;
    }
}
