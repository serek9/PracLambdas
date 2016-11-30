public class Animal {
    boolean potSaltar;
    boolean potVolar;
    boolean potNadar;
    boolean potCaminar;

    public Animal(boolean potSaltar, boolean potVolar, boolean potNadar, boolean potCaminar) {
        this.potSaltar = potSaltar;
        this.potVolar = potVolar;
        this.potNadar = potNadar;
        this.potCaminar = potCaminar;
    }

    public boolean isPotSaltar() {
        return potSaltar;
    }
    public void setPotSaltar(boolean potSaltar) {
        this.potSaltar = potSaltar;
    }

    public boolean isPotVolar() {
        return potVolar;
    }
    public void setPotVolar(boolean potVolar) {
        this.potVolar = potVolar;
    }

    public boolean isPotNadar() {
        return potNadar;
    }
    public void setPotNadar(boolean potNadar) {
        this.potNadar = potNadar;
    }

    public boolean isPotCaminar() {
        return potCaminar;
    }
    public void setPotCaminar(boolean potCaminar) {
        this.potCaminar = potCaminar;
    }

}
