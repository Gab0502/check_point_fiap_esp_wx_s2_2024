/* 
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 *
 * Grupo: ScriptFlow
 * Autores: 
 *      - Enricco Rosse de Souza Carvalho     -   rm551717@fiap.com.br
 *      - Gabriel Marquez Trevisan     -   rm99227@fiap.com.br
 *      - Guilherme Silva dos Santos    -   rm551168@fiap.com.br
 *      - Samuel Ramos de Almeida   -   rm991134@fiap.com.br
 */

package br.com.fiap.twoespwx.libunclepresser;

import br.com.fiap.twoespwx.libunclepresser.inputs.ReadFile;

import java.util.List;

public class App {

    public static void main(String[] args) {
        ReadFile arquivo = new ReadFile();

        List<String> lines = arquivo.readWithFileInputStream();
        System.out.println(lines);
        for (String line : lines) {
            int A =0;
            int C =0;
            int T =0;
            int G= 0;
            System.out.println(line);
            if(line.length() == 0){
                break;
            }
            for (int i = 0; i < line.length(); i++) {
                char caracter = line.charAt(i);
                switch(caracter){
                    case 'A':
                        A+=1;
                    case 'C':
                        C+=1;
                    case 'T':
                        T+=1;
                    case 'G':
                        G+=1;
                }
            }
            System.out.println("proxima linha");
            String numerado = "A"+A+"C"+C+"T"+T+"G"+G;
            System.out.println(numerado);
        }
    }
}



