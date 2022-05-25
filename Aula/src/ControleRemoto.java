public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto(){
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
    }
    private int getVolume() {
        return volume;
    }
    private void setVolume(int volume) {
        this.volume = volume;
    }
    private boolean getLigado() {
        return ligado;
    }
    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    private boolean getTocando() {
        return tocando;
    }
    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    @Override
    public String toString() {
        return "ControleRemoto [ligado=" + ligado + ", tocando=" + tocando + ", volume=" + volume + "]";
    }
    @Override
    public void ligar() {
        this.setLigado(true);       
    }
    @Override
    public void desligar() {
        this.setLigado(false);        
    }
    @Override
    public void abrirMenu() {
        if(this.getLigado() == true){
            System.out.println("--------------MENU---------------");
            System.out.print("Está ligado: " + this.getLigado() + "\n" +
                                "Volume: " + this.getVolume());
        }
        
    }
    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu");        
    }
    @Override
    public void maisVolume() {
        if(this.getLigado() == true){
        this.setVolume(this.getVolume() + 1);
        }
    }
    @Override
    public void menosVolume() {
        if(this.getLigado() == true){
            this.setVolume(this.getVolume() - 1);
        }
    }
    @Override
    public void ligarMudo() {
        if(this.getLigado() == true && this.getVolume() >= 0){
            this.setVolume(0);
        }
        
    }
    @Override
    public void desligarMudo() {
        if(this.getLigado() == true && this.getVolume() == 0){
            this.setVolume(50);
        }
    }
    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())){
            this.setLigado(true);            
        }     
    }
    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()){
            this.setLigado(false);  
        }
    
    }
}
