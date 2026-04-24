/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro5.parte1;

import java.util.Scanner;
/**
 *
 * @author 12726117983
 */
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int vetor[] = new int[10];
        
        for (int i=0; i<vetor.length; i++) {
            System.out.println("Insira o " + (i+1) + "º número:");
            vetor[i] = sc.nextInt();
        }
        
        for (int i=0; i<vetor.length; i++) {
            int menor = vetor[i];
            for (int j=i; j<vetor.length; j++) {
               if (vetor[j] < menor) {
                   int temp = menor;
                   menor = vetor[j];
                   vetor[j] = temp;
               }
            }
            vetor[i] = menor;
        }
        
        for (int i=0; i<vetor.length; i++) {
            System.out.println((i+1) + "º: " + vetor[i]);
        }
    }
}
