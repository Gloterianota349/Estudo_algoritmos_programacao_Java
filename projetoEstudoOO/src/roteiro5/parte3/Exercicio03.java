/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro5.parte3;

import java.util.Scanner;

/**
 *
 * @author 12726117983
 */
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escreva uma palavra: ");
        String palavra = sc.next();
        
        char letras[] = palavra.toCharArray();
        
        int fim = letras.length-1;
        for (int i=0; i<fim; i++) {
            char temp = letras[i];
            letras[i] = letras[fim];
            letras[fim] = temp;
            fim--;
        }
        
        String palavraInvertida = new String(letras);
        
        System.out.println(palavraInvertida);
    }
}
