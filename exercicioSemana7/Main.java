/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicioSemana7;

import java.util.Scanner;

public class Main {     
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("nome, sobrenome e salário de dois empregados:");
        Empregado empregado1 = new Empregado(leitor.next(),leitor.next(),leitor.nextFloat());
        System.out.println("próximo:");
        Empregado empregado2 = new Empregado(leitor.next(),leitor.next(),leitor.nextFloat());
        System.out.println("o funcionário " + empregado1.getNome() +" "+ 
                empregado1.getSobrenome() + " recebe R$" + empregado1.getSalario());
        System.out.println("o novo salário é R$" + empregado1.aumento());
        System.out.println("próximo:");
        System.out.println("o funcionário " + empregado2.getNome() +" "+ 
                empregado2.getSobrenome() + " recebe R$" + empregado2.getSalario());        
        System.out.println("o novo salário é R$" + empregado2.aumento());
    }
    
}
