public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;


    
    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, String categoria, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.categoria = categoria;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }
    public String getCategoria() {
        return categoria;
    }
    private void setCategoria() {
        if(this.getPeso() < 52.2){
            this.categoria = "Inválido";
        }else if(this.getPeso() <= 70.3){
            this.categoria = "Leve";
        }else if(this.getPeso() <= 83.9){
            this.categoria = "Médio";
        }else if(this.getPeso() <= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválido";
        }
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }
    public void apresentar(){
        System.out.println( "Nome: " + this.getNome() + "\n" +
                            "Nacionaliadade: " + this.getNacionalidade() + "\n" +
                            "Idade: " + this.getIdade() + "\n" +
                            "Altura: " + this.getAltura() + "\n" +
                            "Peso: " + this.getPeso() + "\n" +
                            "Categoria: " + this.getCategoria()+ "\n" +
                            "Vitórias: " + this.getVitorias() + "\n" +
                            "Derrotas: " + this.getDerrotas() + "\n" +
                            "Empates: " + this.getEmpates() +  "\n");

    }
    public void status(){
        System.out.println(this.getNome() + " é um peso " + this.getCategoria() + "\n" +
        this.getVitorias() + " vitórias " + this.getDerrotas() + " derrotas" + "\n" +
        this.getEmpates() + " empates ");
    }
    public void ganharLuta(){
        this.setVitorias(+1);
    } 
    public void perderLuta(){
        this.setDerrotas(+1);
    }
    public void empatarLuta(){
        this.setEmpates(+1);
    }

}   