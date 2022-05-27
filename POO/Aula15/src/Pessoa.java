public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected char sexo;
    protected float experiencia;

    
    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0.0f;
    }


    protected abstract void ganharExp();


    @Override
    public String toString() {
        return "Pessoa [experiencia=" + experiencia + ", idade=" + idade + ", nome=" + nome + ", sexo=" + sexo + "]";
    }

    
}


