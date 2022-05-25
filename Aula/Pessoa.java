package Aula;

public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;

    public Pessoa(String nome, int idade, char sexo){
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public char getSexo(){
        return sexo;
    }
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    public String toString() {
        return ("Nome: " + this.getNome() + ", Idade: " + this.getIdade() + 
        ", Sexo: " + this.getSexo());
    }
    public void fazerAniver(){
        this.setIdade(this.getIdade() + 1);
    }
}
