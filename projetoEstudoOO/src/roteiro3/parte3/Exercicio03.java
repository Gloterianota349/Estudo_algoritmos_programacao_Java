/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro3.parte3;

import java.util.Scanner;

/**
 *
 * @author 12726117983
 */
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade, diaSemana;
        double valor;
        
        System.out.println("Insira sua idade: ");
        idade = sc.nextInt();
        System.out.println("Insira o número correspondente ao dia da semana (1 = domingo e 7 = sábado): ");
        diaSemana = sc.nextInt();
        
        if (idade <= 11) {
            valor = 15;
        }
        else if (idade <= 59) {
            valor = 30;
        }
        else {
            valor = 20;
        }
        
        if (diaSemana>0 && diaSemana<8) {
            switch (diaSemana) {
                case 4:
                    System.out.println("O valor de seu ingresso é R$" + valor/2);
                    break;
                default:
                    System.out.println("O valor de seu ingresso é R$" + valor);
                    break;
            }
        }
        else {
            System.out.println("Valor de dia da semana inválido");
        }
    }
}
