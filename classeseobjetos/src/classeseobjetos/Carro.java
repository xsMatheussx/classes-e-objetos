/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classeseobjetos;

// Definição da classe Carro
public class Carro {
    // Atributos
    private String marca;
    private String modelo;
    private int ano;
    private double velocidade;

    // Construtor
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0.0; // Inicialmente, o carro está parado
    }

    // Métodos Getter e Setter para 'marca'
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Métodos Getter e Setter para 'modelo'
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Métodos Getter e Setter para 'ano'
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Métodos Getter e Setter para 'velocidade'
    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        if (velocidade >= 0) {
            this.velocidade = velocidade;
        } else {
            System.out.println("A velocidade não pode ser negativa.");
        }
    }

    // Método para acelerar o carro
    public void acelerar(double aumento) {
        if (aumento > 0) {
            velocidade += aumento;
            System.out.println("O carro acelerou para " + getVelocidade() + " km/h.");
        } else {
            System.out.println("O valor de aceleração deve ser positivo.");
        }
    }

    // Método para desacelerar o carro
    public void desacelerar(double reducao) {
        if (reducao > 0) {
            if (reducao <= velocidade) {
                velocidade -= reducao;
                System.out.println("O carro desacelerou para " + getVelocidade() + " km/h.");
            } else {
                velocidade = 0;
                System.out.println("O carro parou completamente.");
            }
        } else {
            System.out.println("O valor de desaceleração deve ser positivo.");
        }
    }

    // Método para exibir a velocidade atual do carro
    public void exibirVelocidade() {
        System.out.println("Velocidade atual: " + getVelocidade() + " km/h.");
    }

    // Método main para testar a classe
    public static void main(String[] args) {
       
    }
}