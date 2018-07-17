/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordenacao;

/**
 *
 * @author RAFAEL
 */
public class mergeSort {
    static int[] mergeSort(int[] array, int low, int high){        
	if(low < high){
		int middle = (low + high) / 2;
		mergeSort(array, low, middle);
		mergeSort(array, middle+1, high);
		merge(array, low, middle, high);
	}	
    return array;
    
}

static void merge(int[] array, int low, int middle, int high){
	int[] helper = new int[array.length];
	for (int i = low; i <= high; i++) {
		helper[i] = array[i];
	}
	
	int helperLeft = low;
	int helperRight = middle+1;
	int current = low;
	
	while (helperLeft <= middle && helperRight <=high) {
		if(helper[helperLeft] <= helper[helperRight]){
			array[current] = helper[helperLeft];
			helperLeft++;
			
		}else{
			array[current] = helper[helperRight];
			helperRight++;
		}
		current ++;		
	}
	
	int remaining = middle - helperLeft;
	for (int i = 0; i <= remaining; i++) {
		array[current+i] = helper[helperLeft+ i];
	}
}
    
//    public static int[] intercala(int[] vet, int inicio, int meio, int fim) {
//        int i = inicio;
//        int j = meio;
//        int aux[] = new int[fim - inicio];
//        int k = 0;
//
//        while (i < meio && j < fim) {
//            if (vet[i] <= vet[j]) {
//                aux[k++] = vet[i++];
//            } else {
//                aux[k++] = vet[j++];
//            }
//        }
//
//        while (i < meio) {
//            aux[k++] = vet[i++];
//        }
//
//        while (j < fim) {
//            aux[k++] = vet[j++];
//        }
//
//        for (i = inicio; i < fim; i++) {
//            vet[i] = aux[i - inicio];
//        }
//
//        return vet;
//    }
//
//    public static void  mergesort(int[] vet, int inicio, int fim) {
//        if (inicio < fim - 1) {
//            int meio = (inicio - fim) / 2;
//            mergesort(vet, inicio, meio);
//            mergesort(vet, meio, fim);
//            intercala(vet, inicio, meio, fim);
//        }
//    }
    
}
