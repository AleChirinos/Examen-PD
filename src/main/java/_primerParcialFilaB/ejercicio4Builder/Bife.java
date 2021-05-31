package _primerParcialFilaB.ejercicio4Builder;

public class Bife extends BuilderParrilla{

    @Override
    public void buildTipoDeCarne() {
        parrilla.setTipoDeCarne("bife");
    }

    @Override
    public void buildSaborRefresco() {
        parrilla.setSaborRefresco("CocaCola");

    }

    @Override
    public void buildGuarniciones() {
        parrilla.setGuarniciones("papasFritas");

    }

}
