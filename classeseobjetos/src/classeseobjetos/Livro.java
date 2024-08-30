package classeseobjetos;

// Definição da classe Livro
public class Livro {
    // Atributos
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private int exemplaresDisponiveis;

    // Construtor
    public Livro(String titulo, String autor, int numeroPaginas, int exemplaresDisponiveis) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.exemplaresDisponiveis = exemplaresDisponiveis;
    }

    // Métodos Getter e Setter para 'titulo'
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Métodos Getter e Setter para 'autor'
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Métodos Getter e Setter para 'numeroPaginas'
    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    // Métodos Getter e Setter para 'exemplaresDisponiveis'
    public int getExemplaresDisponiveis() {
        return exemplaresDisponiveis;
    }

    public void setExemplaresDisponiveis(int exemplaresDisponiveis) {
        if (exemplaresDisponiveis >= 0) {
            this.exemplaresDisponiveis = exemplaresDisponiveis;
        } else {
            System.out.println("O número de exemplares disponíveis não pode ser negativo.");
        }
    }

    // Método para emprestar o livro
    public void emprestar() {
        if (exemplaresDisponiveis > 0) {
            exemplaresDisponiveis--;
            System.out.println("Livro '" + titulo + "' emprestado com sucesso. Exemplares disponíveis: " + exemplaresDisponiveis);
        } else {
            System.out.println("Não há exemplares disponíveis para emprestar do livro '" + titulo + "'.");
        }
    }

    // Método para devolver o livro
    public void devolver() {
        exemplaresDisponiveis++;
        System.out.println("Livro '" + titulo + "' devolvido com sucesso. Exemplares disponíveis: " + exemplaresDisponiveis);
    }

    // Método para exibir as informações do livro
    public void exibirInformacoes() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Número de Páginas: " + getNumeroPaginas());
        System.out.println("Exemplares Disponíveis: " + getExemplaresDisponiveis());
    }

    // Método main para testar a classe
    public static void main(String[] args) {
        // Criação de objetos da classe Livro
    }
}