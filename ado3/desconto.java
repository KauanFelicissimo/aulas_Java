/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ado3;
import java.util.Scanner;
/**
 *
 * @author kauan.sfelicissimo
 */
public class desconto {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double desconto;
        
        System.out.println("--- Desconto ---");
        
        System.out.println("Valor da sua compra: ");
        float valor = leia.nextFloat();
        
        System.out.println("Forma de pagamento (1 = dinheiro ; 2 = cartão)");
        int pag = leia.nextInt();
        
        if (pag < 1 || pag > 2)
        {
            System.out.println("Escolha uma forma de pagamento válida");
        }
        else if (valor > 100 && pag == 1)
        {
            desconto = valor - (valor * 0.10);
            System.out.printf("Desconto aplicado!!!\nValor será %.2f\n", desconto);
        }
        else if (valor > 100 && pag == 2)
        {
            desconto = valor - (valor * 0.05);
            System.out.printf("Desconto aplicado!!!\nValor será %.2f\n", desconto);
        }
        else if (valor < 100)
        {
            System.out.printf("Desconto não aplicado D:\nValor será %.2f\n", valor);
        }
    }
}