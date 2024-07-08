package com.corenetwork.modelo;

import java.time.LocalTime;

public class Process {
    private int idProceso;
    private String nombreProceso;
    private LocalTime tiempo;

    @Override
    public String toString() {
        return "Process{" +
                "idProceso=" + idProceso +
                ", nombreProceso='" + nombreProceso + '\'' +
                ", tiempo=" + tiempo +
                '}';
    }

    public Process() {
    }

    public Process(int idProceso, String nombreProceso, LocalTime tiempo) {
        this.idProceso = idProceso;
        this.nombreProceso = nombreProceso;
        this.tiempo = tiempo;
    }

    public int getIdProceso() {
        return idProceso;
    }

    public void setIdProceso(int idProceso) {
        this.idProceso = idProceso;
    }

    public String getNombreProceso() {
        return nombreProceso;
    }

    public void setNombreProceso(String nombreProceso) {
        this.nombreProceso = nombreProceso;
    }

    public LocalTime getTiempo() {
        return tiempo;
    }

    public void setTiempo(LocalTime tiempo) {
        this.tiempo = tiempo;
    }
}
