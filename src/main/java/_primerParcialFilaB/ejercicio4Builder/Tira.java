package _primerParcialFilaB.ejercicio4Builder;

public class Tira extends BuilderParrilla{

    @Override
    public void buildTipoDeCarne() {
        parrilla.setTipoDeCarne(": tira de carne");
    }

    @Override
    public void buildSaborRefresco() {
        parrilla.setSaborRefresco("CocaCola");

    }

    @Override
    public void buildGuarniciones() {
        parrilla.setGuarniciones("fideo");

    }

}
