/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro4.parte3;

import java.util.Scanner;
/**
 *
 * @author 12726117983
 */
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numeros[] = new int[10];
        double soma = 0;
        int cont = 0;
        
        for (int i=0; i<numeros.length; i++) {
            System.out.println("Insira um número inteiro");
            numeros[i] = sc.nextInt();
        }
        
        for (int i=0; i<numeros.length; i++) {
            if (numeros[i]%3==0){
                soma = soma + numeros[i];
                cont++;
            }
        }
        
        System.out.println("A média dos números inseridos múltiplos de 3 = " + soma/cont);
    }
}
