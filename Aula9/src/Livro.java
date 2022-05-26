package Aula;

import java.util.Random;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getTotPaginas() {
        return totPaginas;
    }
    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }
    public int getPagAtual() {
        return pagAtual;
    }
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }
    public boolean getAberto() {
        return aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    public Pessoa getLeitor() {
        return leitor;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    @Override
    public void abrir() {
        this.setAberto(true);
    }
    @Override
    public void fechar() {
        this.setAberto(false);
    }
    @Override
    public void folhear() {
        
        Random aleatorio = new Random();
        int folhear = aleatorio.nextInt(getTotPaginas());
        this.setPagAtual(this.getPagAtual() + folhear);
        
        if (this.getPagAtual() > this.getTotPaginas()){
            this.setPagAtual(this.getPagAtual() - this.getTotPaginas());
        }
    }
    @Override
    public void avancarPag() {
        this.setPagAtual(+1);
    }
    @Override
    public void voltarPag() {
        this.setPagAtual(-1);        
    }
    public void detalhes() { 
        System.out.println("Livro: " + this.getTitulo() + "\n" + 
        "Autor: " + this.getAutor() + "\n" +
        "Total de páginas: " + this.getTotPaginas() + "\n" +
        "Página atual: " + this.getPagAtual() + "\n" +
        "Aberto: " + this.getAberto() + "\n" +
        "Leitor: " + getLeitor());;
    }
    
}
