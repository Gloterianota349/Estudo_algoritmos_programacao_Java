/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro3.parte5;

import java.util.Scanner;
/**
 *
 * @author 12726117983
 */
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double saldo, valorSolicitado, resto;
        int notas100, notas50, notas20, notas10;
        
        System.out.println("Por favor, insira seu saldo disponível: ");
        saldo = sc.nextDouble();
        System.out.println("Agora, insira o valor que você deseja sacar: ");
        valorSolicitado = sc.nextDouble();
        
        if (valorSolicitado % 10 == 0 && valorSolicitado > 0) {
            if (valorSolicitado <= saldo) {
                notas100 = (int) valorSolicitado/100;
                valorSolicitado = valorSolicitado - (notas100*100);
                notas50 = (int) valorSolicitado/50;
                valorSolicitado = valorSolicitado - (notas50*50);
                notas20 = (int) valorSolicitado/20;
                valorSolicitado = valorSolicitado - (notas20*20);
                notas10 = (int) valorSolicitado/10;
                valorSolicitado = valorSolicitado - (notas10*10);
                System.out.println("Você sacou " + notas100 + " notas de 100, " + notas50 + " notas de 50, " + notas20 + " notas de 20 e " + notas10 + " notas de 10.");
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
