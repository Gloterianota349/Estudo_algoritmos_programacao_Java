/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro1.parte6;

import java.util.Scanner;
/**
 *
 * @author 12726117983
 */
public class Exercicio05 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double a, b, c, delta, raizDelta = 0, x1, x2;
        
        System.out.println("Insira o coeficiente a: ");
        a = sc.nextDouble();
        System.out.println("Insira o coeficiente b: ");
        b = sc.nextDouble();
        System.out.println("Insira o coeficiente c: ");
        c = sc.nextDouble();
        delta = ((b*b)-4*(a)*(c));
        if (delta < 0) {
            System.out.println("Equação quadrática não possui raízes reais");
        }
        else {
            raizDelta = Math.sqrt(delta);
        }
        x1 = (-b + raizDelta)/(2*a);
        x2 = (-b - raizDelta)/(2*a);
        
        System.out.println("O resultado da equação de que x1 = " + x1 + ", e x2 = " + x2);
    }
}
