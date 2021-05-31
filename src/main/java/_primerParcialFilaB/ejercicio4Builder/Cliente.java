package _primerParcialFilaB.ejercicio4Builder;

public class Cliente {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();

        System.out.println("Bife:");
        Bife bife = new Bife();
        restaurante.setBuilderParrilla(bife);
        restaurante.cocinarParrilla();
        restaurante.getParrilla().showData();
        System.out.println("");

        System.out.println("Lomito");
        Lomito lomito= new Lomito();
        restaurante.setBuilderParrilla(lomito);
        restaurante.cocinarParrilla();
        restaurante.getParrilla().showData();
        System.out.println("");

        System.out.println("Tira");
        Tira tira = new Tira();
        restaurante.setBuilderParrilla(tira);
        restaurante.cocinarParrilla();
        restaurante.getParrilla().showData();
        System.out.println("");
    }
}
