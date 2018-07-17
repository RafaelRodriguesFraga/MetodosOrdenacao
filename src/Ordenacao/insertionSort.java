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
public class insertionSort {

    /**
     *
     * @param vet
     * @return
     */
    public static int[] insertionSort(int[] vet) {
       int aux;      
        //Percorrer todo o vetor
         for (int i = 0; i < vet.length; i++) {
            // vai ser armazenado o valor para ser realizado a troca
            //depois
            int a = vet[i];
            
            //Aqui ele vai sempre comparando de trás pra frente no vetor
            // e se o vetor na posição da direita for maior do que o da esquerda,
            //troca
            for (int j = i - 1; j >= 0 && vet[j] > a; j--) {
                vet[j + 1] = vet[j];
                vet[j] = a;
            }       
             
        }         
        
        return vet;

    }
}
