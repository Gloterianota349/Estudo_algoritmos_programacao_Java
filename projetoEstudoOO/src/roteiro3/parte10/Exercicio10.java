/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro3.parte10;

import java.util.Scanner;
/**
 *
 * @author 12726117983
 */
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double tempoCompetidor, tempoMinimo, x;
        int pontos;
        
        System.out.println("Insira o tempo do competidor (em minutos)");
        tempoCompetidor = sc.nextDouble();
        System.out.println("Insira o tempo mínimo para a etapa (em minutos)");
        tempoMinimo = sc.nextDouble();
        x = tempoCompetidor - tempoMinimo;
        
        if (x < 3) {
            pontos = 100;
        }
        else if (x <= 5) {
            pontos = 80;
        }
        else {
            pontos = (int) (80-(x-5));
        }
        
        System.out.println("O competidor conseguiu " + pontos + " pontos");
    }
}
