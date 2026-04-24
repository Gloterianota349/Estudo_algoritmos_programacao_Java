/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro5.parte2;

import java.util.Scanner;
/**
 *
 * @author 12726117983
 */
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int vetor[] = new int[10];
        
        for (int i=0; i<vetor.length; i++) {
            System.out.println("Insira o " + (i+1) + "º número:");
            vetor[i] = sc.nextInt();
        }
        
        int menor = 0;
        int posicao = 0;
        for (int i=1; i<vetor.length; i++) {
            if (vetor[i] < menor) {
                   menor = vetor[i];
                   posicao = i;
            }
        }
        
        System.out.println("O menor valor é " + menor + ", e se encontra na posição " + (posicao+1));
    }
}
