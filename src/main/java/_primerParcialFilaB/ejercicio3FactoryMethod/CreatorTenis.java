package _primerParcialFilaB.ejercicio3FactoryMethod;

public class CreatorTenis extends CreatorElementosDeportivos{
    @Override
    public Tenis create() {
        Tenis tenis = new Tenis();
        tenis.setTipo("Para correr");
        tenis.setTalla("37");
        return tenis;
    }
}
