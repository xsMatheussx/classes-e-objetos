
package classeseobjetos;

// Definição da classe Retangulo
public class Retangulo {
    // Atributos
    private double largura;
    private double altura;

    // Construtor
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    // Métodos Getter e Setter para 'largura'
    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (largura > 0) {
            this.largura = largura;
        } else {
            System.out.println("A largura deve ser positiva.");
        }
    }

    // Métodos Getter e Setter para 'altura'
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("A altura deve ser positiva.");
        }
    }

    // Método para calcular a área do retângulo
    public double calcularArea() {
        return largura * altura;
    }

    // Método para calcular o perímetro do retângulo
    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    // Método para exibir as informações do retângulo
    public void exibirInformacoes() {
        System.out.println("Largura: " + getLargura());
        System.out.println("Altura: " + getAltura());
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }

    // Método main para testar a classe
    public static void main(String[] args) {
        // Criação de um objeto da classe Retangulo
    }
}