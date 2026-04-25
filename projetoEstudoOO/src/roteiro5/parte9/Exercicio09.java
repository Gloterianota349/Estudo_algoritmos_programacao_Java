/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro5.parte9;

import java.util.Scanner;
/**
 *
 * @author 12726117983
 */
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int vetor[] = new int[15];
        
        int escolha = 0;
        while(escolha!=4) {
            for (int i=0; i<vetor.length; i++) {
                System.out.println("Insira o " + (i+1) + "º número: ");
                vetor[i] = sc.nextInt();
            }

            System.out.println("Insira a opção que deseja\n1 - Exibir todos os números pares\n2 - Exibir todos os números ímpares\n3 - Informar a média dos valores\n4 - Encerrar");
            escolha = sc.nextInt();

            switch(escolha) {
                case 1:
                    for (int i=0; i<vetor.length; i++) {
                        if(vetor[i]%2==0) {
                            System.out.print(vetor[i] + " ");
                        }
                    }
                    System.out.println("");
                    break;
                case 2:
                    for (int i=0; i<vetor.length; i++) {
                        if(vetor[i]%2!=0) {
                            System.out.print(vetor[i] + " ");
                        }
                    }
                    System.out.println("");
                    break;
                case 3:
                    double soma = 0;
                    for (int i=0; i<vetor.length; i++) {
                        soma += vetor[i];
                    }
                    double media = soma/vetor.length;
                    System.out.println("A média dos valores = " + media);
                    break;
                case 4:
                    System.out.println("Você decidiu encerrar o programa");
                    break;
                default:
                    System.out.println("Você inseriu uma opção inválida");
                    break;
            }
        }
    }
}
