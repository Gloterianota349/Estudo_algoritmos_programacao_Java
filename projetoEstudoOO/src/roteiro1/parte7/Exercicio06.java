/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro1.parte7;

import java.util.Scanner;
/**
 *
 * @author 12726117983
 */
public class Exercicio06 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int altura, largura, latasTinta;
        
        System.out.println("Insira a altura da parede: ");
        altura = sc.nextInt();
        System.out.println("Insira a largura da parede: ");
        largura = sc.nextInt();
        latasTinta = (int)Math.ceil((double)((altura*largura)/4)/5);
        
        System.out.println("Você irá precisar de " + latasTinta + " latas de tinta para pintar a parede");
    }
}
