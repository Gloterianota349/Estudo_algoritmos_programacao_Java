/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro3.parte8;

import java.util.Scanner;
/**
 *
 * @author 12726117983
 */
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int idade;
        String grupoRisco, categoria;
        
        System.out.println("Insira sua idade: ");
        idade = sc.nextInt();
        System.out.println("Insira seu grupo de risco (baixo ou alto): ");
        grupoRisco = sc.next();
        
        if (idade >= 17 && idade <= 90) {
            if (grupoRisco.equalsIgnoreCase("baixo")) {
                if (idade <= 50) {
                    categoria = "C1";
                }
                else {
                    categoria = "C3";
                }
            }
            else if (grupoRisco.equalsIgnoreCase("alto")) {
                if (idade <= 50) {
                    categoria = "C2";
                }
                else {
                    categoria = "C4";
                }
            }
            else {
                System.out.println("Valor de grupo de risco inserido inválido");
                return;
            }
        }
        else {
            System.out.println("Você não possui idade para adquirir um seguro");
            return;
        }
        
        System.out.println("A categoria de seu seguro é a " + categoria);
    }
}
