package _primerParcialFilaB.ejercicio4Builder;

public class Restaurante {
    private BuilderParrilla builderParrilla;

    public void setBuilderParrilla(BuilderParrilla builderParrilla){
        this.builderParrilla=builderParrilla;
    }

    public Parrilla getParrilla(){
        return builderParrilla.getParrilla();
    }

    public void cocinarParrilla() {
        this.builderParrilla.createParrilla();
        this.builderParrilla.buildTipoDeCarne();
        this.builderParrilla.buildSaborRefresco();
        this.builderParrilla.buildGuarniciones();
    }
}
