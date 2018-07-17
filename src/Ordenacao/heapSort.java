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
public class heapSort {
    static void constroiHeap(int vet[], int inicio, int fim) {
        
        int aux = vet[inicio]; //Primeira posição da partição do Vetor
        int filho = inicio * 2 + 1; //Calcular um dos filhos
        while (filho <= fim) { // Enquanto o filho for menor que o final do vetor
            if (filho < fim) { // Se o filho for menor que o final do vetor

                //Verifica se o pai tem dois filhos e quem é o maior
                if (vet[filho] < vet[filho + 1]) {
                    filho = filho + 1;
                }
            }

            /*
               Verifica se o pai é menor que o filho. Se ela for, então ela nao
                ta na posição completa da Heap já que o pai tem que ser
                maior que seus filhos.
            */           
            if (aux < vet[filho]) { 
                vet[inicio] = vet[filho]; // Filho vai pra cima da Heap como pai
                inicio = filho; //  o Filho se torna o pai
                
                // Repete o processo para saber quem são seus filhos
                filho = 2 * inicio + 1; 
            } else {
                filho = fim + 1;
            }
        }
        vet[inicio] = aux; //Antigo pai ocupa o lugar do ultimo filho analisado
    }

    static void heapSort(int vet[], int n) {
        int aux;
        
         
         
        //Cria a Heap a partir dos dados inseridos
        //Da metade do vetor até a primeira posição
        for (int i = (n - 1) / 2; i >= 0; i--) {
            constroiHeap(vet, i, n - 1);

        }

        for (int i = n - 1; i >= 1; i--) {
            /* 
            Linhas 59, 60 e 61: 
            Pega o maior elemento da Heap e coloca
                na posição correspondente no vetor           
             */
            aux = vet[0];
            vet[0] = vet[i];
            vet[i] = aux;
            constroiHeap(vet, 0, i - 1); // Reconstroi a Heap quebrada
        }
       
    }

}
