/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro5.parte6;

import java.util.Scanner;
/**
 *
 * @author 12726117983
 */
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva uma palavra: ");
        String palavra = sc.next();
        palavra = palavra.toLowerCase();
        char palavraConvertida[] = palavra.toCharArray();
        char letra = 'a';
        
        while (letra != '0') {
            System.out.println("Escreva uma letra: ");
            letra = sc.next().charAt(0);
            int l = 0;

            if(letra != '0') {
                for (int i=0; i<palavraConvertida.length; i++) {
                    if (palavraConvertida[i]==letra) {
                        System.out.println("A letra inserida se encontra na palavra " + palavra);
                        l++;
                        break;
                    }
                }
                if(l==0) {
                   System.out.println("A letra inserida não se encontra na palavra " + palavra); 
                }
            }
        }
    }
}
