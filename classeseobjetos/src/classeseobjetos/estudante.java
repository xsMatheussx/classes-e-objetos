
package classeseobjetos;

import java.util.ArrayList;
import java.util.List;

public class estudante {
    // Atributos
    private String nome;
    private int idade;
    private List<String> disciplinasMatriculadas;

    // Construtor
    public estudante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.disciplinasMatriculadas = new ArrayList<>();
    }

    // Método Getter para 'nome'
    public String getNome() {
        return nome;
    }

    // Método Setter para 'nome'
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método Getter para 'idade'
    public int getIdade() {
        return idade;
    }

    // Método Setter para 'idade'
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método Getter para 'disciplinasMatriculadas'
    public List<String> getDisciplinasMatriculadas() {
        return disciplinasMatriculadas;
    }

    // Método Setter para 'disciplinasMatriculadas'
    public void setDisciplinasMatriculadas(List<String> disciplinasMatriculadas) {
        this.disciplinasMatriculadas = disciplinasMatriculadas;
    }

    // Método para adicionar uma disciplina à lista
    public void adicionarDisciplina(String disciplina) {
        disciplinasMatriculadas.add(disciplina);
        System.out.println("Disciplina '" + disciplina + "' adicionada com sucesso.");
    }

    // Método para exibir as disciplinas matriculadas
    public void exibirDisciplinas() {
        System.out.println("Disciplinas matriculadas de " + nome + ":");
        for (String disciplina : disciplinasMatriculadas) {
            System.out.println("- " + disciplina);
        }
    }

 
    }

