   public class Gafanhoto extends Pessoa{
    
    private String login;
    private int totAssistido;

     
    /*public Gafanhoto(String nome, int idade, char sexo, String login) {
        this.login = login;
        this.totAssistido = 0;
    }*/
        public Gafanhoto(String nome, int idade, char sexo, String login) {
            super(nome, idade, sexo);
            this.login = login;
            this.totAssistido = 0;
        }
    
    public void viuMaisUm() {
        this.setTotAssistido(+1);
    }

    protected void ganharExp() {
        this.experiencia ++;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto [" + super.toString() + "\nlogin=" + login + ", totAssistido=" + totAssistido + "]";
    }
    
}
