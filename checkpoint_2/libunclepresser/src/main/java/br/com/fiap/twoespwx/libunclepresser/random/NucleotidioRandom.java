package br.com.fiap.twoespwx.libunclepresser.random;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class NucleotidioRandom {
    Random random = new Random();
    public StringBuilder randomSequenceGenerator(int quantidade) {
        List<String> nucleotidio = new ArrayList<>();

        nucleotidio.add("A");
        nucleotidio.add("C");
        nucleotidio.add("T");
        nucleotidio.add("G");

        StringBuilder sequencia = new StringBuilder();

        for (int i = 0; i < quantidade; i++) {
            int indice = random.nextInt(nucleotidio.size());

            sequencia.append(nucleotidio.get(indice));


        }

        return sequencia;
    }
}
