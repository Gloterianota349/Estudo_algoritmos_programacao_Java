/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro4.parte6;

import java.util.Scanner;
/**
 *
 * @author 12726117983
 */
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int voto[] = new int[8];
        char sexo[] = new char[8];
        int contra = 0;
        double homensFavor = 0;
        
        for (int i=0; i<voto.length; i++) {
            System.out.println("Qual o seu sexo (M ou F)?");
            sexo[i] = sc.next().charAt(0);
            if (sexo[i]!='M' && sexo[i]!='F') {
                System.out.println("Você inseriu um valor inválido para sexo");
                i--;
                continue;
            }
            System.out.println("Informe seu voto (1 = contra, 2 = a favor, 3 = não sabe):");
            voto[i] = sc.nextInt();
            if (voto[i]<1 || voto[i]>3) {
                System.out.println("Você inseriu um valor inválido para o voto");
                i--;
            }
        }
        
        for (int i=0; i<voto.length; i++) {
            if (voto[i]==1) {
                contra++;
            }
            if (sexo[i]=='M' && voto[i]==2) {
                homensFavor++;
            }
        }
        
        System.out.println("Houveram " + contra + " votos contra, e " + ((homensFavor/8)*100) + "% de homens a favor.");
    }
}
