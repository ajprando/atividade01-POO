import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private int idade;

    public void status() {
        System.out.print("Nome: " + this.getNome() + "\n");
        System.out.print("Data de nascimento: " + this.getDataNascimento() + "\n");
        System.out.print("Idade: " + this.getIdade() + "\n");
    }

    //Construtor
    public Pessoa(String nome, LocalDate dataNascimento, int idade) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.idade = idade;
    }

    //Getters
    public String getNome() {
        return this.nome;
    }

    public LocalDate getDataNascimento() {
        return this.dataNascimento;
    }

    public int getIdade() {
        return this.idade;
    }

    //Setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setIdade (int idade) {
        this.idade = idade;
    }

}
