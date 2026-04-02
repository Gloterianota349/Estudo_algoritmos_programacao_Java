/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro1.parte5;

import java.util.Scanner;
/**
 *
 * @author 12726117983
 */
public class Exercicio04 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1, num2, num3, num4, soma1, soma2, result;
        
        System.out.println("Insira o primeiro número: ");
        num1 = sc.nextInt();
        System.out.println("Insira o segundo número: ");
        num2 = sc.nextInt();
        System.out.println("Insira o terceiro número: ");
        num3 = sc.nextInt();
        System.out.println("Insira o quarto número: ");
        num4 = sc.nextInt();
        soma1 = num1+num2;
        soma2 = num3+num4;
        result = soma1*soma2;
        
        System.out.println("O resultado do cálculo efetuado = " + result);
    }
}
