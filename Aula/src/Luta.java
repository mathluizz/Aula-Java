import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;


    
    
    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    public boolean getAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria() == l2.getCategoria() && l1 != l2){
            this.setAprovada(true);
            this.setDesafiante(l1);
            this.setDesafiado(l2);
        }else{
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null); 
        }

    }
    public void lutar(){
        if (this.getAprovada() == true) {
           System.out.println("####APARESENTANDO####");
            this.desafiado.apresentar();
            System.out.println("####APARESENTANDO####");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); //0 1 2
            switch(vencedor){
                case 0:
                System.out.println("Empatou!");
                this.getDesafiado().empatarLuta();
                this.getDesafiante().empatarLuta();
                break;

                case 1:
                System.out.println("Vitória do " + this.getDesafiante());
                this.getDesafiante().ganharLuta();
                this.getDesafiado().perderLuta();
                break;

                case 2:
                System.out.println("Vitória do " + this.getDesafiado());
                this.getDesafiado().ganharLuta();
                this.getDesafiante().perderLuta();
                break;
            }
        } else {
            System.out.println("Luta não pode acontecer...");
        }
    }
}
