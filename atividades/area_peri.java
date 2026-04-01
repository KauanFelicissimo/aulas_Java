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
public class area_peri {
    public static void main(String[] args) {
        System.out.println("----Calculo de área e perimêtro----");
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Qual a base do seu retângulo: ");
        float base = leia.nextFloat();
        
        System.out.println("Qual a altura do seu retângulo: ");
        float altura = leia.nextFloat();
        
        float area = base * altura;
        float perimetro = 2 * (base + altura);
        
        System.out.printf("A área do seu retângulo é: %.2f\nO perimetro é: %.2f\n", area , perimetro);
    }
            
       
}
