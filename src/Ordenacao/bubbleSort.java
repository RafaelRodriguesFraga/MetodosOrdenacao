/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordenacao;

import static Ordenacao.Principal.marcacao;
import java.util.Scanner;

/**
 *
 * @author RAFAEL
 */
public class bubbleSort {
    
    /**
     *
     * @param vet
     * @return
     */
   
    public static int[] bubbleSort(int[] vet) {        
        int aux;            
   
        
        //Vai percorrer todo o vetor
        for (int i = 0; i < vet.length - 1; i++) {
            //Vai começar de 1 e percorrer todo o vetor
            for (int j = 1; j < vet.length - i; j++) {
                
                //Se o numero anterior for maior que o seu sucessor
                if (vet[j-1] > vet[j]) {
                    //armazena ele num vetor auxiliar só para
                    //realizar a troca depois
                    aux = vet[j-1];            
                    vet[j-1] = vet[j];                    
                    vet[j] = aux;
                }
            }
        } 
        
               
        return vet;
    }

}
