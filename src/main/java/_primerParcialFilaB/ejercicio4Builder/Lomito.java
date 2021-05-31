package _primerParcialFilaB.ejercicio4Builder;

public class Lomito extends BuilderParrilla {

    @Override
    public void buildTipoDeCarne() {
        parrilla.setTipoDeCarne("lomo");
    }

    @Override
    public void buildSaborRefresco() {
        parrilla.setSaborRefresco("pepsi");

    }

    @Override
    public void buildGuarniciones() {
        parrilla.setGuarniciones("arroz");

    }

}
