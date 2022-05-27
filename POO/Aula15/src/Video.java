public class Video implements AcoesVideo{
    private String titulo;       
    private float avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    
   
    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 0.0f;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;    
    }
    public void like() {
        this.setCurtidas(+1);
    }
    public void pause() {
        this.setReproduzindo(false);
    }
    public void play() {
        this.setReproduzindo(true);
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public float getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(float avaliacao) {
        float novaAvaliacao = (this.avaliacao + avaliacao)/this.views;
        this.avaliacao = novaAvaliacao;
    }
    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }
    public int getCurtidas() {
        return curtidas;
    }
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
    public boolean getReproduzindo() {
        return reproduzindo;
    }
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    @Override
    public String toString() {
        return "[titulo=" + titulo + ", avaliacao=" + avaliacao + ", curtidas=" + curtidas + ", reproduzindo=" + reproduzindo
                 + ", views=" + views + "]";
    }

    
}
