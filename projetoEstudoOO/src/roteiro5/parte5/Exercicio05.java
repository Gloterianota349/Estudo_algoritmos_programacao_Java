/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro5.parte5;

import java.util.Scanner;

/**
 *
 * @author 12726117983
 */
public class Exercicio05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String palavra = "";

        while (!palavra.equals("fim")) {
            System.out.println("Escreva uma palavra (fim para parar): ");
            palavra = sc.next();
            palavra = palavra.toLowerCase();

            if(!palavra.equals("fim")) {
                char letras[] = palavra.toCharArray();

                int vogais = 0;

                for (int i = 0; i < letras.length; i++) {
                    if (letras[i] == 'a' || letras[i] == 'e' || letras[i] == 'i' || letras[i] == 'o' || letras[i] == 'u') {
                        vogais++;
                    }
                }

                System.out.println("A palavra inserida possui " + vogais + " vogais");
            }
        }
    }
}
