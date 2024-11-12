package br.com.fiap.twoespwx.libunclepresser;

import br.com.fiap.twoespwx.libunclepresser.output.SaveFile;
import br.com.fiap.twoespwx.libunclepresser.random.NucleotidioRandom;

public class App {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Uso: java -jar <path/to/jar/file> size:<numero-inteiro-maior-que-zero> output:<nome-do-arquivo-de-saida>.txt");
            return;
        }

        int quantidade = 0;
        String fileName = null;

        for (String arg : args) {
            if (arg.startsWith("size:")) {
                try {
                    quantidade = Integer.parseInt(arg.substring(5));
                    if (quantidade <= 0) {
                        System.out.println("Erro: 'size' deve ser um número inteiro maior que zero.");
                        return;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Erro: 'size' deve ser um número inteiro.");
                    return;
                }
            } else if (arg.startsWith("output:")) {
                fileName = arg.substring(7);
                if (!fileName.endsWith(".txt")) {
                    System.out.println("Erro: 'output' deve terminar com '.txt'.");
                    return;
                }
            } else {
                System.out.println("Erro: Parâmetro desconhecido " + arg);
                return;
            }
        }

        if (quantidade > 0 && fileName != null) {
            NucleotidioRandom random = new NucleotidioRandom();
            SaveFile saveFile = new SaveFile();

            StringBuilder sequenceBuilder = new StringBuilder();
            sequenceBuilder.append(random.randomSequenceGenerator(quantidade));

            System.out.println("Sequência gerada: " + sequenceBuilder.toString());

            String resultado = saveFile.saveContentInFile(sequenceBuilder.toString(), fileName);
            System.out.println(resultado);
        } else {
            System.out.println("Erro: Parâmetros inválidos.");
        }
    }
}
    