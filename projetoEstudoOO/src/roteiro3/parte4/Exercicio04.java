/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro3.parte4;

import java.util.Scanner;
/**
 *
 * @author 12726117983
 */
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double renda, imposto, valorLiquido;
        
        System.out.println("Insira sua renda anual: ");
        renda = sc.nextDouble();
        
        if (renda<=20000) {
            imposto = 0;
        }
        else if (renda<=40000) {
            imposto = (renda-20000)*0.1;
        }
        else if (renda<=80000) {
            imposto = (40000-20000)*0.1;
            imposto = imposto + ((renda-40000)*0.2);
        }
        else {
            imposto = (40000-20000)*0.1;
            imposto = imposto + ((80000-40000)*0.2);
            imposto = imposto + ((renda-80000)*0.3);
        }
        valorLiquido = renda-imposto;
        
        System.out.println("O imposto total sobre a sua renda é de R$" + imposto + ", enquanto seu valor líquido será R$" + valorLiquido);
    }
}
