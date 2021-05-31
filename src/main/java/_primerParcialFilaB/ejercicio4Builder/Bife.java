package _primerParcialFilaB.ejercicio4Builder;

public class Bife extends BuilderParrilla{

    @Override
    public void buildTipoDeCarne() {
        parrilla.setTipoDeCarne("Bife");
    }

    @Override
    public void buildSaborRefresco() {
        parrilla.setSaborRefresco("Coca Cola");

    }

    @Override
    public void buildGuarniciones() {
        parrilla.setGuarniciones("Papas fritas");

    }

}
