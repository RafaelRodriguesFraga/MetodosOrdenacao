/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordenacao;

import static Ordenacao.Principal.marcacao;
import static Ordenacao.Principal.nomeArq;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author RAFAEL
 */
public class geraArquivo {

    public static void geraArquivo(int[] vet, int tam) {

        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o nome do arquivo de saida: ");
        nomeArq = sc.next();

        try {
            PrintStream ps = new PrintStream(nomeArq);
            for (int i = 0; i < tam; i++) {
                ps.println(vet[i]);
           }

            ps.println();
            ps.println("Ordenação concluída em " + marcacao + " milisegundo(s)");

        } catch (IOException ex) {
            System.out.println("Erro ao criar o arquivo '" + nomeArq + "'");
        }
    }
}
