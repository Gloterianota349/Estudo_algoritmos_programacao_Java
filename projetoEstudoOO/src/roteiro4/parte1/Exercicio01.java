/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro4.parte1;

import java.util.Scanner;
/**
 *
 * @author 12726117983
 */
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numeros[] = new int[10];
        
        for (int i=0; i<numeros.length; i++) {
            System.out.println("Insira um número inteiro");
            numeros[i] = sc.nextInt();
        }
        
        for (int i=0; i<numeros.length; i++) {
            if (numeros[i]%2==0) {
                System.out.println(numeros[i] + " é par");
            }
            else {
                System.out.println(numeros[i] + " é ímpar");
            }
        }
    }
}
