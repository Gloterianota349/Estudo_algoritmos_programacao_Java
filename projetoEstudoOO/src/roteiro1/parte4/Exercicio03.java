/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro1.parte4;

import java.util.Scanner;
/**
 *
 * @author 12726117983
 */
public class Exercicio03 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        double base, altura, area;
        
        System.out.println("Insira a base do triângulo: ");
        base = sc.nextDouble();
        System.out.println("Insira a altura do triângulo: ");
        altura = sc.nextDouble();
        area = base*altura;
        
        System.out.println("A área do triângulo = " + area);
    }
}