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


import br.com.fiap.twoespwx.libunclepresser.random.NucleotidioRandom;

import java.util.List;


public class App {

    public static void main(String[] args) {

        NucleotidioRandom random = new NucleotidioRandom();

        System.out.println(random.randomSequenceGenerator(4));

    }
}



