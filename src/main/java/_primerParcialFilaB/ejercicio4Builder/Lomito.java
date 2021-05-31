package _primerParcialFilaB.ejercicio4Builder;

public class Lomito extends BuilderParrilla {

    @Override
    public void buildTipoDeCarne() {
        parrilla.setTipoDeCarne("Lomito");
    }

    @Override
    public void buildSaborRefresco() {
        parrilla.setSaborRefresco("Pepsi");

    }

    @Override
    public void buildGuarniciones() {
        parrilla.setGuarniciones("Arroz");

    }

}
