package br.com.fiap.twoespwx.libunclepresser.output;

import java.io.*;


public class SaveFile {

    public String saveContentInFile(String conteudo) {
        String outputFilePath = "OUTPUT/OUTPUT1.TXT";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath, true))) { // 'true' para anexar
            writer.write(conteudo);
            writer.newLine();
            return "Conteúdo salvo com sucesso";
        } catch (IOException e) {
            e.printStackTrace();
            return "Erro ao salvar conteúdo: " + e.getMessage();
        }
    }


}


