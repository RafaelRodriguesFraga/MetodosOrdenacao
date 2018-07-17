/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordenacao;

import java.util.Scanner;

/**
 *
 * @author RAFAEL
 */
public class Principal extends lerNumeros {

    static int[] vet = null;
    static String nomeArq;
    static long marcacao;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //leitura
        int op;
        long comeco, fim;

        System.out.println("Ecolha o método que queira ordenar os números");
        System.out.println("0 - Sair");
        System.out.println("1 - BubbleSort");
        System.out.println("2 - InsertionSort");
        System.out.println("3 - SelectionSort");
        System.out.println("4 - MergeSort");
        System.out.println("5 - QuickSort");
        System.out.println("6 - HeapSort");
        System.out.println("7 - Counting Sort");

        System.out.println("Informe uma opção: ");
        op = sc.nextInt();

        switch (op) {
            case 1:

                lerNumeros.lerNumeros();
                 System.out.println("Entrou no BubbleSort");
                marcacao = System.currentTimeMillis();
                bubbleSort.bubbleSort(vet);
                marcacao = System.currentTimeMillis() - marcacao;
                geraArquivo ga = new geraArquivo();
                int tamBubble = vet.length;
                geraArquivo.geraArquivo(vet, tamBubble);

                break;

            case 2:

                lerNumeros.lerNumeros();
                 System.out.println("Entrou no Insertion");
                marcacao = System.currentTimeMillis();
                insertionSort.insertionSort(vet);
                marcacao = System.currentTimeMillis() - marcacao;
                int tamInsertion = vet.length;
                geraArquivo.geraArquivo(vet, tamInsertion);
                break;

            case 3:
                lerNumeros.lerNumeros();
                 System.out.println("Entrou no SelectionSort");
                marcacao = System.currentTimeMillis();
                selectionSort.selectionSort(vet);
                marcacao = System.currentTimeMillis() - marcacao;
                int tamSelection = vet.length;
                geraArquivo.geraArquivo(vet, tamSelection);
                break;

            case 4:
                lerNumeros.lerNumeros();
                System.out.println("Entrou no MergeSort");
                marcacao = System.currentTimeMillis();
                mergeSort.mergeSort(vet, 0, vet.length - 1);
                marcacao = System.currentTimeMillis() - marcacao;
                int tamMerge = vet.length;
                geraArquivo.geraArquivo(vet, tamMerge);
                break;

            case 5:
                lerNumeros.lerNumeros();
                marcacao = System.currentTimeMillis();
                System.out.println("Entrou no QuickSort");
                quickSort.sort(vet);
                marcacao = System.currentTimeMillis() - marcacao;
                int tamQuick = vet.length;
                geraArquivo.geraArquivo(vet, tamQuick);
                break;

            case 6:
                lerNumeros.lerNumeros();
                 System.out.println("Entrou no HeapSort");
                marcacao = System.currentTimeMillis();
                heapSort.heapSort(vet, vet.length);
                marcacao = System.currentTimeMillis() - marcacao;
                int tamHeap = vet.length;
                geraArquivo.geraArquivo(vet, tamHeap);
                break;

            case 7:
                 
                lerNumeros.lerNumeros();
              
                int max = 0;//aqui a variável max recebe o valor do primeiro item do array  
                for (int i = 1; i < vet.length; i++) {//aqui a iteração irá ocorrer  
                    if (vet[i] > max) { //caso o valor da posição i seja maior que o valor de max, max será substituído pelo valor da i-ésima posição.  
                        max = vet[i];
                    }
                }
                
                marcacao = System.currentTimeMillis();
                 System.out.println("Entrou no CountingSort");
                countingSort.countingSort(vet, max);
                marcacao = System.currentTimeMillis() - marcacao;
                int tamCounting = vet.length;
                geraArquivo.geraArquivo(vet, tamCounting);
                break;

            default:
                System.out.println("Opção inválida. Escolha uma opção válida!");
        }

    }
}
