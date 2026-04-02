/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro1.parte2;

/**
 *
 * @author 12726117983
 */
public class Exercicio01 {
    public static void main (String[] args) {
        double sb = 2700;
        int numHorasExtra = 17;
        double valorHoraExtra = (sb/160)*numHorasExtra;
        double salarioFinal = sb + valorHoraExtra;
        
        System.out.println("Salário base: " + sb);
        System.out.println("Salário Total: " + salarioFinal);
    }
}
