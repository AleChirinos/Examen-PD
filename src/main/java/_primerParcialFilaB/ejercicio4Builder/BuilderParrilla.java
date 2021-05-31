package _primerParcialFilaB.ejercicio4Builder;

public abstract class BuilderParrilla {
    protected Parrilla parrilla;

    public Parrilla getParrilla() {
        return parrilla;
    }

    public void createParrilla() {
        parrilla = new Parrilla();
    }

    public abstract void buildTipoDeCarne();
    public abstract void buildSaborRefresco();
    public abstract void buildGuarniciones();
}
