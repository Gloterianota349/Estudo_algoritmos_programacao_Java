/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro3.parte6;

import java.util.Scanner;
/**
 *
 * @author 12726117983
 */
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1, num2, result;
        char operacao;
        
        System.out.println("Informe o primeiro número: ");
        num1 = sc.nextInt();
        System.out.println("Informe o segundo número: ");
        num2 = sc.nextInt();
        System.out.println("Informe a operação a ser efetuada (+, - ou *): ");
        operacao = sc.next().charAt(0);
        
        switch (operacao) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            default:
                System.out.println("Operação Inválida");
                return;
        }
        
        System.out.println(num1 + " " + operacao + " " + num2 + " = " + result);
    }
}
