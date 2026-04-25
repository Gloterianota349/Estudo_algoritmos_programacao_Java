/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro5.parte8;

import java.util.Scanner;
/**
 *
 * @author 12726117983
 */
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int escolha=0;
        String entrada;
        while(escolha!=3) {
            System.out.println("Escreva a mensagem: ");
            entrada = sc.nextLine();
            char entradaConvertida[] = entrada.toCharArray();
            System.out.println("O que você deseja fazer? (1 - Codificar mensagem, 2 - Decodificar mensagem, 3 - Sair do programa)");
            escolha = sc.nextInt();
            
            switch(escolha) {
                case 1:
                    for (int i=0; i<entradaConvertida.length; i++) {
                        if(entradaConvertida[i]!=' ') {
                            int temp = (int) entradaConvertida[i];
                            temp+=8;
                            entradaConvertida[i]= (char) temp;
                        }
                    }
                    String mensagemCodificada = new String(entradaConvertida);
                    System.out.println(mensagemCodificada);
                    break;
                case 2:
                    for (int i=0; i<entradaConvertida.length; i++) {
                        if(entradaConvertida[i]!=' ') {
                            int temp = (int) entradaConvertida[i];
                            temp-=8;
                            entradaConvertida[i]= (char) temp;
                        }
                    }
                    String mensagemDecodificada = new String(entradaConvertida);
                    System.out.println(mensagemDecodificada);
                    break;
                case 3:
                    System.out.println("Programa finalizado");
                    break;
                default:
                    System.out.println("Insira uma opção válida");
                    break;
            }
        }
    }
}
