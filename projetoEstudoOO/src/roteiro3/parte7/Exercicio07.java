/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro3.parte7;

import java.util.Scanner;
/**
 *
 * @author 12726117983
 */
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int dia, mes, ano, result;
        String tipoPersonalidade;
        
        System.out.println("Insira seu dia de nascimento: ");
        dia = sc.nextInt();
        System.out.println("Insira seu mês de nascimento: ");
        mes = sc.nextInt();
        System.out.println("Insira seu ano de nascimento: ");
        ano = sc.nextInt();
        result = (dia+mes+ano)%4;
        
        switch (result) {
            case 0:
                tipoPersonalidade = "Discreto";
                break;
            case 1:
                tipoPersonalidade = "Amoroso";
                break;
            case 2:
                tipoPersonalidade = "Tímido";
                break;
            case 3:
                tipoPersonalidade = "Namorador";
                break;
            default:
                return;
        }
        
        System.out.println("Seu tipo de personalidade é " + tipoPersonalidade);
    }
}
