/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro3.parte1;

import java.util.Scanner;
/**
 *
 * @author 12726117983
 */
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo, valorSolicitado;
        
        System.out.println("Por favor, insira seu saldo disponível: ");
        saldo = sc.nextDouble();
        System.out.println("Agora, insira o valor que você deseja sacar: ");
        valorSolicitado = sc.nextDouble();
        
        if (valorSolicitado % 10 == 0 && valorSolicitado > 0) {
            if (valorSolicitado <= saldo) {
                saldo = saldo - valorSolicitado;
                System.out.println("Você agora possui R$" + saldo + " de saldo disponível");
            }
            else {
                System.out.println("Saldo insuficiente");
            }
        }
        else {
            System.out.println("Valor inválido");
        }
    }
}
