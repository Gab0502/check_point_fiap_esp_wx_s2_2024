package br.com.fiap.twoespwx.libunclepresser.output;

import java.io.*;

public class SaveFile {

    public String saveContentInFile(String conteudo, String outputFileName) {
        String outputFilePath = "OUTPUT/" + outputFileName;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath, true))) { // 'true' para anexar
            writer.write(conteudo);
            writer.newLine();
            return "Conteúdo salvo com sucesso em " + outputFilePath;
        } catch (IOException e) {
            e.printStackTrace();
            return "Erro ao salvar conteúdo: " + e.getMessage();
        }
    }

}
