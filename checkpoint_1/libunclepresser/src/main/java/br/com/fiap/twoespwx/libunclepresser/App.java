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


public class App 
{
    public static void main( String[] args )
    {
        String inputFilename = "checkpoint_1/libunclepresser/inputs/input1.txt";
        String outputFilename = "checkpoint_1/libunclepresser/outputs/OUTPUT1.TXT";

        NucleotidioInputReader nir = new NucleotidioInputReader();
        NucletidioOutputWriter now = new NucletidioOutputWriter();

        List<String> lines = nir.readWithScanner(inputFilename);

        for (String line : lines){
            System.out.println(line);
        }


    }
}


