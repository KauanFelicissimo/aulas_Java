/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividades;
import java.util.Scanner;
/**
 *
 * @author kauan.sfelicissimo
 */
public class comissao {
    public static void main(String[] args) {
        System.out.println("----Calculo de comissão----");
        
        Scanner leia = new Scanner(System.in);
        
        double salario = 2000.00;
        
        
        System.out.println("Qual foi o valor da venda desse mês: ");
        double comissao = leia.nextDouble();
        
        double salario_final = salario + (comissao * 0.15);
        
        System.out.printf("O salário final é: %.2f \n" , salario_final);
        
    }
}
