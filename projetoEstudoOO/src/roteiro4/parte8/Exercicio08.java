/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro4.parte8;

import java.util.Scanner;
/**
 *
 * @author 12726117983
 */
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int vetor[] = new int[16];
        int temporario;
        
        for (int i=0; i<vetor.length; i++) {
            System.out.println("Insira um número para a posição " + (i+1));
            vetor[i] = sc.nextInt();
        }
        
        for (int i=(vetor.length/2); i<vetor.length; i++) {
            temporario = vetor[i-8];
            vetor[i-8] = vetor[i];
            vetor[i] = temporario;
        }
        
        System.out.print("{");
        for (int i=0; i<vetor.length; i++) {
            System.out.print("[" + vetor[i] + "]");
        }
        System.out.print("}");
    }
}
