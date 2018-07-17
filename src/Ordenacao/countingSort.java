/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordenacao;

/**
 *
 * @author fabrica
 */
public class countingSort {

     static int[] countingSort(int[] A, int maior) {   
    
        int[] aux = new int[maior + 1];
        int[] resp = new int[A.length];
        //preenche aux com zeros (java já faz isso automaticamente)
        for (int i = 0; i < A.length; i++) {
            aux[A[i]]++;
        }
        
        for (int i = 1; i < aux.length; i++) {
            aux[i] += aux[i - 1];
        }
       
        for (int i = A.length - 1; i >= 0; i--) {
            resp[aux[A[i]]-1] = A[i];
            aux[A[i]]--;
        }
        for (int i = 0; i < A.length; i++) {
            A[i] = resp[i];
        }
           return A;
    }


}