package _primerParcialFilaB.ejercicio4Builder;

public class Tira extends BuilderParrilla{

    @Override
    public void buildTipoDeCarne() {
        parrilla.setTipoDeCarne("Tira de carne");
    }

    @Override
    public void buildSaborRefresco() {
        parrilla.setSaborRefresco("Coca Cola");

    }

    @Override
    public void buildGuarniciones() {
        parrilla.setGuarniciones("Fideo");

    }

}
