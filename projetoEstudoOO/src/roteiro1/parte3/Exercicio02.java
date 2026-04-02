/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro1.parte3;
import java.util.Scanner;

/**
 *
 * @author 12726117983
 */
public class Exercicio02 {
    public static void main (String[] args) {
        int num1, num2, soma;
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Insira o primeiro número inteiro: ");
        num1 = sc.nextInt();
        System.out.println("Insira o segundo número inteiro: ");
        num2 = sc.nextInt();
        soma = num1 + num2;
        
        System.out.println("A soma dos dois números inseridos = " + soma);
    }
}
