package _primerParcialFilaB.ejercicio2Prototype;

public class Cliente {
    public static void main(String[]args){
        Celular celular = new Celular();
        celular.setModelo("A1");
        celular.setTamano("10");
        celular.setPeso("60");
        celular.setOrigen("Bolivia");
        celular.setImei("10001");
        celular.setCamara(new Camara("10", "15"));

        System.out.println("Celular 1");
        Celular celular1 = (Celular) celular.clone();
        celular1.setImei("10001");

        System.out.println("Celular 2");
        Celular celular2 = (Celular) celular.clone();
        celular2.setImei("10002");

        System.out.println("Celular 3");
        Celular celular3 = (Celular) celular.clone();
        celular3.setImei("10003");

        System.out.println("Celular 4");
        Celular celular4 = (Celular) celular.clone();
        celular4.setImei("10004");

        System.out.println("Celular 5");
        Celular celular5 = (Celular) celular.clone();
        celular5.setImei("10005");

        celular1.showInformation();
        celular2.showInformation();
        celular3.showInformation();
        celular4.showInformation();
        celular5.showInformation();
    }

}
