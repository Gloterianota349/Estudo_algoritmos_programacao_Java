/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro4.parte4;

import java.util.Scanner;
/**
 *
 * @author 12726117983
 */
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int votos[] = {0, 0, 0, 0};
        double total = 0;
        
        for (int i=0; i<12; i++) {
            System.out.println("Insira o seu voto (1-Candidato 1; 2-Candidato 2; 3-Branco; Outro valor-Nulo): ");
            int voto = sc.nextInt();
            switch(voto) {
                case 1:
                   votos[0] = votos[0]+1;
                   break;
                case 2:
                   votos[1] = votos[1]+1;
                   break;
                case 3:
                   votos[2] = votos[2]+1;
                   break;
                default:
                   votos[3] = votos[3]+1;
                   break;
            }
        }
        
        for (int i=0; i<votos.length; i++) {
            total = total + votos[i];
        }
        
        System.out.println("Houveram " + votos[0] + " votos para o candidato 1 e " + votos[1] + " votos para o candidato 2.");
        System.out.println("Houveram " + ((votos[2]/total)*100) + "% de votos em branco.");
        System.out.println("Houveram " + ((votos[3]/total)*100) + "% de votos nulos.");
    }
}
