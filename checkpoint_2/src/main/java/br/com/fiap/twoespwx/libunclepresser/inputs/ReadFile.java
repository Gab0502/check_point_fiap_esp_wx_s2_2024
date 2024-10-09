package br.com.fiap.twoespwx.libunclepresser.inputs;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

    public List<String> readWithFileInputStream() {
        String location = "INPUT/input1.txt";
       List<String> lines =  new ArrayList<String>();

        try {
            InputStream fis = new FileInputStream(location);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader reader = new BufferedReader(isr);
            String line = reader.readLine();

            while (line != null) {
                lines.add(line);
                line = reader.readLine();
            }

            reader.close();
            return lines;

        } catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
            System.out.println("Arquivo não encontrado: " + fnfe);
            return lines;
        }catch (IOException ioe) {
            ioe.printStackTrace();
            System.out.println("Linha mal formatada: " + ioe);
            return lines;
        }

    }


}


