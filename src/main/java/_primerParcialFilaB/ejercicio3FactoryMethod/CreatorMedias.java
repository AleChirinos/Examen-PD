package _primerParcialFilaB.ejercicio3FactoryMethod;

public class CreatorMedias extends CreatorElementosDeportivos{
    @Override
    public Medias create() {
        Medias medias = new Medias();
        medias.setTamano("Large");
        medias.setDeporte("Volley-Ball");
        return medias;
    }
}
