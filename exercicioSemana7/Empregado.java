/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioSemana7;

import java.util.Scanner;

public class Empregado {
    private String nome;
    private String sobrenome;
    private float salario;
    private float aumento;
    Scanner leitor = new Scanner(System.in);
    
    public float aumento(){
        System.out.println("aumentar o salário em %");
        aumento = (leitor.nextFloat() / 100) * salario;
        return aumento + salario;       
    }  
    
    public Empregado(String nome, String sobrenome, float salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setPrimeiroNome(String nome) {
        this.nome = nome;
    }
    
    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public float getSalario() {
        if (salario < 0){
            this.salario = 0;
        } 
        else{
            this.salario = salario;
        }
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
