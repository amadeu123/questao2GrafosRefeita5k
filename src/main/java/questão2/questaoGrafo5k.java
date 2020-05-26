/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Amadeu Martim
 */
public class questaoGrafo5k {

    static int numeroVertices3 = 5000;

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String line = null;
        Scanner in;
        int indice = 0;
        String[] numb = new String[5000];

        LinkedList[] lista = new LinkedList[numeroVertices3];
        ligarLista(lista); // obrigatório para pode ligar a lsita, caso contrario o elemento é null

        try {
            in = new Scanner(new FileReader("C:\\Users\\Dinopc\\Desktop\\coisas aleatorias\\file.txt"));

            while (in.hasNextLine()) {
                line = in.nextLine();
                String array[] = line.split("\t");
                numb[indice] = array[0];
                for (int y = 0; y < array.length - 1; y++) {
                    lista[indice].add(array[y + 1]);
                }
                indice++;
                //System.out.println(line);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();;

        }

        print(lista, numb);
    }

    static void ligarLista(LinkedList[] lista) {
        for (int i = 0; i < numeroVertices3; i++) {
            lista[i] = new LinkedList();
        }
    }

    static void print(LinkedList[] lista, String numb[]) {
        for (int i = 0; i < numeroVertices3; i++) {
            System.out.print(numb[i] + ": ");
            for (int j = 0; j < lista[i].size(); j++) {
                System.out.print(lista[i].get(j) + " ");
            }
            System.out.println();
        }
    }

}
