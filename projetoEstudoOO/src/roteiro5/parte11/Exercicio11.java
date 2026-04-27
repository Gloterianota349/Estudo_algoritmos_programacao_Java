/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro5.parte11;

import java.util.Scanner;
/**
 *
 * @author 12726117983
 */
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int vetor[] = new int[0];
        int entrada = 1;
        
        while (entrada!=0) {
            System.out.println("Insira um número inteiro (0 para parar):");
            entrada = sc.nextInt();
            if (entrada!=0) {
                int novoVetor[] = new int[vetor.length+1];
                for (int i=0; i<vetor.length; i++) {
                    novoVetor[i] = vetor[i];
                }
                novoVetor[novoVetor.length-1] = entrada;
                vetor = novoVetor;
            }
        }
        
        System.out.println("Escolha o que você deseja exibir:\n1 - Quantidade de números positivos\n2 - Quantidade de números negativos\n3 - Soma total dos números\n4 - Exibir todos os valores na ordem inversa, ou seja, o que está na linha vire coluna.\n5 - Encerrar");
        int escolha = sc.nextInt();
        
        switch (escolha) {
            case 1:
                int qtdPositivo = 0;
                for (int i=0; i<vetor.length; i++) {
                    if (vetor[i]>0) {
                        qtdPositivo++;
                    }
                }
                System.out.println("Houveram " + qtdPositivo + " números positivos inseridos");
                break;
            case 2:
                int qtdNegativo = 0;
                for (int i=0; i<vetor.length; i++) {
                    if (vetor[i]<0) {
                        qtdNegativo++;
                    }
                }
                System.out.println("Houveram " + qtdNegativo + " números negativos inseridos");
                break;
            case 3:
                int soma = 0;
                for (int i=0; i<vetor.length; i++) {
                    soma+=vetor[i];
                }
                System.out.println("A soma total dos números inseridos = " + soma);
                break;
            case 4:
                int fim = vetor.length-1;
                for (int i=0; i<fim; i++) {
                    int temp = vetor[i];
                    vetor[i] = vetor[fim];
                    vetor[fim] = temp;
                    fim--;
                }
                for (int i=0; i<vetor.length; i++) {
                    System.out.println(vetor[i]);
                }
                break;
            case 5:
                System.out.println("Você decidiu encerrar o programa");
                break;
            default:
                System.out.println("Valor inválido");
                break;
        }
    }
}
