package com.controle_frota.core;

public class Main {
    public static void main(String[] args) {

        Carro c1 = new Carro("ABC 2345", 2017);
        Caminhao c2 = new Caminhao("TRR 4567", 2015);

        c1.abastecer("Posto 1", "Marcos", 250);
        c1.abastecer("Posto 2", "Mateus", 150);
        c1.abastecer("Posto 3", "Carlos", 400);

        c2.abastecer("Posto 1", "Andre", 300);
        c2.abastecer("Posto 2", "Paulo", 100);
        c2.abastecer("Posto 3", "Lucas", 450);

        c1.listaAbastecimentos();
        c2.listaAbastecimentos();
    }
}
