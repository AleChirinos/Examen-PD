package _primerParcialFilaB.ejercicio3FactoryMethod;

public class CreatorShort extends CreatorElementosDeportivos{
    @Override
    public Short create() {
        Short shorte = new Short();
        shorte.setColor("negro");
        shorte.setTalla("M");
        return shorte;
    }
}
