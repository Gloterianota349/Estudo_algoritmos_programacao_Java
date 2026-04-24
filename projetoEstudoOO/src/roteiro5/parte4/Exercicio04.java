/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro5.parte4;

import java.util.Scanner;
/**
 *
 * @author 12726117983
 */
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escreva uma palavra: ");
        String palavra = sc.next();
        
        char letras[] = palavra.toCharArray();
        int ordenamento[] = new int[letras.length];
        
        char alfabeto[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        
        for (int i=0; i<letras.length; i++) {
            for (int j=0; j<alfabeto.length; j++) {
                if(letras[i]==alfabeto[j]) {
                    ordenamento[i] = j;
                }
            }
        }
        
        for (int i=0; i<ordenamento.length; i++) {
            int menor = ordenamento[i];
            for (int j=i; j<ordenamento.length; j++) {
               if (ordenamento[j] < menor) {
                   int temp = menor;
                   menor = ordenamento[j];
                   ordenamento[j] = temp;
               }
            }
            ordenamento[i] = menor;
        }
        
        for (int i=0; i<letras.length; i++) {
            for (int j=0; j<alfabeto.length; j++) {
                if(ordenamento[i]==j) {
                    letras[i] = alfabeto[j];
                }
            }
        }
        
        String palavraOrdenada = new String(letras);
        System.out.println(palavraOrdenada);
    }
}
