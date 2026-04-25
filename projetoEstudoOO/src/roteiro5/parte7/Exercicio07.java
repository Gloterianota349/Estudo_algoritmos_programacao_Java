/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro5.parte7;

import java.util.Scanner;
/**
 *
 * @author 12726117983
 */
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escreva uma frase: ");
        String frase = sc.nextLine();
        char fraseConvertida[] = frase.toCharArray();
        
        int j=0;
        for (int i=0; i<fraseConvertida.length; i++) {
            if (fraseConvertida[i]==' ') {
                int fim = i-1;
                for (j=j; j<=fim; j++) {
                    char temp = fraseConvertida[j];
                    fraseConvertida[j] = fraseConvertida[fim];
                    fraseConvertida[fim] = temp;
                    fim--;
                }
                j=i+1;
            }
            if ((i+1)==fraseConvertida.length) {
                int fim = fraseConvertida.length-1;
                for (j=j; j<=fim; j++) {
                    char temp = fraseConvertida[j];
                    fraseConvertida[j] = fraseConvertida[fim];
                    fraseConvertida[fim] = temp;
                    fim--;
                }
            }
        }
        
        String fraseInvertida = new String(fraseConvertida);
        System.out.println(fraseInvertida);
    }
}
