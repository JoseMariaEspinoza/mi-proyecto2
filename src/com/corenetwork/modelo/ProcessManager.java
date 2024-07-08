package com.corenetwork.modelo;

import java.time.LocalTime;
import java.util.ArrayDeque;
import java.util.Queue;

public class ProcessManager {
    private Queue<Process> processQueue = new ArrayDeque<>(50);

    public void crearProceso(int id, String nombre, LocalTime tiempo) {
        processQueue.add(new Process(id,nombre,tiempo));
    }
    public String ejecutaProceso () {
        String resultado= processQueue.element().toString() ;
        processQueue.poll();
        return resultado+ "Ejecutado";
    }
    public String ejecutarTodo(){
        processQueue.clear();
        return "Se han ejecutado todos los procesos";
    }

    @Override
    public String toString() {
        return "ProcessManager{" +
                "cola=" + processQueue +
                '}' + "\n";
    }
}
