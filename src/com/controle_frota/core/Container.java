package com.controle_frota.core;

public class Container implements iTransportador {
    private String modelo;
    private String capacidade;

    public Container(String modelo, String capacidade) {
        super();
        this.modelo = modelo;
        this.capacidade = capacidade;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String transportar(System origem, String destino) {
        return String.format("Este Container sera utilizado para transportar a carga de %s para %s"
                , origem, destino);    }
}
