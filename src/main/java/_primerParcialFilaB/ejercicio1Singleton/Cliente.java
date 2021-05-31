package _primerParcialFilaB.ejercicio1Singleton;

import singleton.basic.Singleton3;

public class Cliente {
    public static void main(String[]args){

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Matricula matricula = Matricula.getInstance();
                Estudiante estudiante = new Estudiante();
                estudiante.setCi(1637826);
                estudiante.setNombre("Jose");
                matricula.pagar(estudiante, "08:00", 7000);
                matricula.showInfo();
                System.out.println("");
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Matricula matricula = Matricula.getInstance();
                Estudiante estudiante = new Estudiante();
                estudiante.setCi(1234567);
                estudiante.setNombre("Maria");
                matricula.pagar(estudiante, "09:00", 5000);
                matricula.showInfo();
                System.out.println("");
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                Matricula matricula = Matricula.getInstance();
                Estudiante estudiante = new Estudiante();
                estudiante.setCi(7865439);
                estudiante.setNombre("Adriana");
                matricula.pagar(estudiante, "10:00", 3000);
                matricula.showInfo();
                System.out.println("");
            }
        });

        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                Matricula matricula = Matricula.getInstance();
                Estudiante estudiante = new Estudiante();
                estudiante.setCi(1637826);
                estudiante.setNombre("Jose");
                matricula.pagar(estudiante, "08:00", 7000);
                matricula.showInfo();
                System.out.println("");
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
