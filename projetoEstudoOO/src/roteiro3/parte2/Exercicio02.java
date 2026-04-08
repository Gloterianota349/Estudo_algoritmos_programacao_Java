/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro3.parte2;

import java.util.Scanner;
/**
 *
 * @author 12726117983
 */
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double peso, altura, imc;
        
        System.out.println("Insira seu peso: ");
        peso = sc.nextDouble();
        System.out.println("Insira sua altura: ");
        altura = sc.nextDouble();
        imc = peso/(altura*altura);
        
        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso");
        }
        else if (imc < 25) {
            System.out.println("Você está com o peso normal");
        }
        else if (imc < 30) {
            System.out.println("Você está com sobrepeso");
        }
        else {
            System.out.println("Você está com obesidade");
        }
    }
}
