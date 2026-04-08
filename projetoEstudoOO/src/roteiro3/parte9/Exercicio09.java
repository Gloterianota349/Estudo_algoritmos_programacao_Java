/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro3.parte9;

import java.util.Scanner;
/**
 *
 * @author 12726117983
 */
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numDependentes;
        double imposto;
        double salario;
        char classe;
        
        System.out.println("Insira seu salário: ");
        salario = sc.nextDouble();
        System.out.println("Insira o número de dependentes que você possui: ");
        numDependentes = sc.nextInt();
        System.out.println("Insira sua classe: ");
        classe = sc.next().charAt(0);
        classe = Character.toUpperCase(classe);
        
        switch(classe) {
            case 'A': 
                imposto = 0;
                break;
            case 'B': 
                imposto = salario*0.05;
                break;
            case 'C': 
                imposto = salario*0.1;
                break;
            case 'D': 
                imposto = salario*0.15;
                break;
            default:
                System.out.println("Entrada de classe inválida");
                return;
        }
        
        if (classe != 'A') {
            imposto = imposto - (15*numDependentes);
        }
        
        if (imposto > 0) {
            System.out.println("Você pagará R$" + imposto + " de imposto");
        }
        else {
            System.out.println("Imposto isento");
        }
    }
}
