package com.corenetwork.modelo;

public class CalcularTPagina {
    public int tamanoArchivo;
    public int tamanoPagina;

    public int paginasNecesarias () {
        int resultado = tamanoArchivo/tamanoPagina;
        return resultado;
    }

    @Override
    public String toString() {
        return "CalcularTPagina{" +
                "tamanoArchivo=" + tamanoArchivo +
                ", tamanoPagina=" + tamanoPagina +
                '}';
    }

    public CalcularTPagina() {
    }

    public CalcularTPagina(int tamanoArchivo, int tamanoPagina) {
        this.tamanoArchivo = tamanoArchivo;
        this.tamanoPagina = tamanoPagina;
    }

    public int getTamanoArchivo() {
        return tamanoArchivo;
    }

    public void setTamanoArchivo(int tamanoArchivo) {
        this.tamanoArchivo = tamanoArchivo;
    }

    public int getTamanoPagina() {
        return tamanoPagina;
    }

    public void setTamanoPagina(int tamanoPagina) {
        this.tamanoPagina = tamanoPagina;
    }
}
