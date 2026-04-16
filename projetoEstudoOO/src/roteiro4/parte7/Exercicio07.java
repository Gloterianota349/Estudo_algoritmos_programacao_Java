/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro4.parte7;

import java.util.Scanner;
/**
 *
 * @author 12726117983
 */
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int idade[] = new int[8];
        char sexo[] = new char[8];
        int menores18 = 0;
        double somaIdadeMulheres = 0;
        double mulheres = 0;
        double homens = 0;
        double homensAcima22 = 0;
        
        for (int i=0; i<idade.length; i++) {
            System.out.println("Qual a sua idade?");
            idade[i] = sc.nextInt();
            if (idade[i]<0) {
                System.out.println("Você inseriu uma idade inválida");
                i--;
                continue;
            }
            System.out.println("Qual o seu sexo (F ou M)?");
            sexo[i] = sc.next().charAt(0);
            if (sexo[i]!='M' && sexo[i]!='F') {
                System.out.println("Você inseriu um valor inválido para sexo");
                i--;
            }
        }
        
        for (int i=0; i<idade.length; i++) {
            if (idade[i]<18) {
                menores18++;
            }
            if (sexo[i]=='F') {
                somaIdadeMulheres = somaIdadeMulheres + idade[i];
                mulheres++;
            } else {
                homens++;
            }
            if (sexo[i]=='M' && idade[i]>22) {
                homensAcima22++;
            }
        }
        
        System.out.println("Há " + menores18 + " pessoas com menos de 18 anos.\nA média de idade das mulheres = " + (somaIdadeMulheres/mulheres) + ".\nA porcentagem de homens acima de 22 anos sobre o total de homens = " + ((homensAcima22/homens)*100));
    }
}
