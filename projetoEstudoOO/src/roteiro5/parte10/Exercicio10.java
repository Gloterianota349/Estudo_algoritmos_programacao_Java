/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro5.parte10;

import java.util.Scanner;
/**
 *
 * @author 12726117983
 */
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int matriz[][] = new int[5][5];
        
        for (int i=0; i<matriz.length; i++) {
            for(int j=0; j<matriz[i].length; j++) {
                System.out.println("Insira um número: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        
        int menor = matriz[0][0];
        int linhaMenor = 0;
        int colunaMenor = 0;
        int maior = matriz[0][0];
        int linhaMaior = 0;
        int colunaMaior = 0;
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                if (matriz[i][j]>maior) {
                    maior = matriz[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
                else if (matriz[i][j]<menor) {
                    menor = matriz[i][j];
                    linhaMenor = i;
                    colunaMenor = j;
                }
            }
        }
        System.out.println("O maior valor é " + maior + ", se encontra na linha " + (linhaMaior+1) + " e na coluna " + (colunaMaior+1));
        System.out.println("O menor valor é " + menor + ", se encontra na linha " + (linhaMenor+1) + " e na coluna " + (colunaMenor+1));
    }
}
