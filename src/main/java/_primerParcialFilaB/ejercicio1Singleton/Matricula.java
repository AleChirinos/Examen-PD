package _primerParcialFilaB.ejercicio1Singleton;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Matricula {
    private static Matricula instance = null;
    private Map<String, String> matricularse = new HashMap<String, String>();
    private Map<String, Integer> monto = new HashMap<String, Integer>();
    private List<Estudiante> estudiantes = new LinkedList<>();

    public Matricula(){}

    public static synchronized void makeInstance(){
        if(instance==null){
            instance = new Matricula();
        }
    }

    public static synchronized Matricula getInstance(){
        if(instance==null)
            makeInstance();
        return instance;
    }

    public synchronized void pagar (Estudiante e, String hora, int monto){
        if (!matricularse.containsKey(e.nombre)){
            this.monto.put(e.nombre,monto);
            estudiantes.add(e);
        }else{
            this.monto.put(e.nombre, monto+this.monto.get(e.nombre));
        }
        matricularse.put(e.nombre, "Hora del deposito: "+hora);
    }

    public synchronized void showInfo(){
        for(Estudiante e :estudiantes){
            System.out.println("Nombre: "+ e.getNombre());
            System.out.println("Carnet de identidad: "+ e.ci);
            System.out.println(matricularse.get(e.nombre));
            System.out.println("Monto: "+ monto.get(e.nombre));
        }
    }
}
