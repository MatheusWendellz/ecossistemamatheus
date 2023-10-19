package Floresta;

public class Natureza {
    String nome;
    int tamanho;
    public Natureza(String nome, int tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public void crescimento() {
        System.out.println(nome + " cresceu.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int gettamanho() {
        return tamanho;
    }

    public void settamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
}