/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordenacao;

import static Ordenacao.Principal.marcacao;

/**
 *
 * @author RAFAEL
 */
public class selectionSort {

    public static int[] selectionSort(int[] vet) {
        int aux;
      
       
        for (int i = 0; i < vet.length - 1; i++) {
            //Variavel para armazenar o menor indice
            int menor = i;

            //Esse laço de repetição procura o indice onde está o menor elemento
            for (int j = i + 1; j < vet.length; j++) {
                if (vet[menor] > vet[j]) {
                    menor = j;
                }
            }
            //Troca com o ultimo elemento verificado e o menor à sua direita
            aux = vet[menor];
            vet[menor] = vet[i];
            vet[i] = aux;
        }

       

        return vet;
    }
}
