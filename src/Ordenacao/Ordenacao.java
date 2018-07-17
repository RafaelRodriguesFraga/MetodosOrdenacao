/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacao;

/**
 *
 * @author fabrica
 */
public class Ordenacao {

    public static void main(String[] args) {
        int aux;
        int vet[] = {5, 3, 4, 2, 1};

        //ALGORITMO DO BUBBLE  SORT   
        for (int i = 0; i < vet.length - 1; i++) {          
            for (int j = 1; j < vet.length - i; j++) {
                  
                if (vet[j-1] > vet[j]) {
                    aux = vet[j-1];
                    vet[j-1] = vet[j];
                    vet[j] = aux;
                    

                }
                for (int k = 0; k < vet.length; k++) {
                    
            System.out.print(+vet[k]+" | ");
                    
        }
                System.out.println("");
            }  
            
           
        }
        //BUBBLE SORT EXERCICIO 6
//        for (int i = 0; i < vet.length - 1; i++) {          
//            for (int j = vet.length-1; j > i ; j--) {
//                  
//                //if (vet[j-1] > vet[j]) {
//                if (vet[j] < vet[j - 1]) {               
//                    aux = vet[j-1];
//                    vet[j-1] = vet[j];
//                    vet[j] = aux;
//                    
//                }
//            }
//                for (int k = 0; k < vet.length; k++) {
//                    
//            System.out.print(+vet[k]+" | ");
//                    
//        }
//                System.out.println("");
//            }  
//            
//           
//        }
        //ALGORITMO DO INSERTION SORT         
//        for (int i = 0; i < vet.length; i++) {
//            int a = vet[i];
//            for (int j = i - 1; j >= 0 && vet[j] > a; j--) {
//                vet[j + 1] = vet[j];
//                vet[j] = a;
//            }
//             System.out.println("");
//            for (int k = 0; k < vet.length; k++) {
//                System.out.print(vet[k] + " | ");
//            }
//        }
//        
//
//    }
        //INSERTION SORT EXERCICIO 7
//        for (int i = vet.length - 2; i >= 0; i--) {
//            System.out.println("");
//            for (int j = i; j < vet.length - 1; j++) {
//                if (vet[j] > vet[j+1]) {
//                    aux = vet[j];
//                    vet[j] = vet[j+1];
//                    vet[j+1] = aux;
//                }else {
//                    break;
//                }
//
//            }
//
//            for (int k = 0; k < vet.length; k++) {
//                System.out.print(vet[k] + " | ");
//            }
//        }
//        
//          for (int i = vet.length - 1; i > 0; i--) {
//            System.out.println("");
//            for (int j = i; j > 0 ; j--) {
//
//                if (vet[j] < vet[j-1]) {
//                    aux = vet[j-1];
//                    vet[j-1] = vet[j];
//                    vet[j] = aux;
//                }
//
//            }
//
//            for (int k = 0; k < vet.length; k++) {
//                System.out.print(vet[k] + " | ");
//            }
//        }

//ALGORITMO DO SELECTION SORT
//        for (int i = 0; i < vet.length - 1; i++) {
//            //Variavel para armazenar o menor indice
//            int menor = i;
//
//            //Esse laço de repetição procura o indice onde está o menor elemento
//            for (int j = i + 1; j < vet.length; j++) {
//                if (vet[menor] > vet[j]) {
//                    menor = j;
//                }
//            }
//            System.out.println("");
//            //Troca com o ultimo elemento verificado e o menor à sua direita
//            aux = vet[menor];
//            vet[menor] = vet[i];
//            vet[i] = aux;
//
//            for (int k = 0; k < vet.length; k++) {
//                System.out.print(vet[k] + " | ");
//            }
//        }
//        
    }
}
