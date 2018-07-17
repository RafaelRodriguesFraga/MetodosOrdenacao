package Ordenacao;

import static Ordenacao.Principal.vet;
import java.io.*;
import java.util.Scanner;

public class lerNumeros {
    
   public static int[] lerNumeros() {
        
    
        int i, j = 0;
        
        
        Scanner ler = new Scanner(System.in);

        System.out.printf("Informe o nome de arquivo texto:\n");
        String nome = ler.nextLine();
        System.out.println("Informe a quantidade de numeros a serem lidos:\n");
        i = (int) ler.nextInt();
        vet = new int[i];
        System.out.printf("\nConteúdo do arquivo texto:\n");
        try {
            try (FileReader arq = new FileReader(nome)) {
                BufferedReader lerArq = new BufferedReader(arq);
                
                String linha = lerArq.readLine(); 
                while (j < i) {
                    System.out.printf("%s\n", linha);
                    vet[j] = Integer.parseInt(linha);
                    linha = lerArq.readLine();
                    j++;
                }
                
                System.out.printf("%d\n", vet[0]);
            }
            return vet;
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }

        System.out.println();
        return vet;
    }
   
}
