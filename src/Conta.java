import javax.swing.JOptionPane;

public class Conta {
 
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

public Conta(){
    this.setSaldo(0.00);
    this.setStatus(false);
}


    
    public int getNumConta(){
        return numConta;
    }
    public void setNumConta(int numConta){
        this.numConta = numConta;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "Conta [numConta=" + numConta + ", tipo=" + tipo +", dono=" + dono + ", saldo=" + saldo +  ",  status=" + status +"]";
    }
    
    public void abrirConta(){
        
        this.setDono((JOptionPane.showInputDialog(null, "Qual o nome do titular? "))); 
        this.setStatus(true);
        int escolha = JOptionPane.showConfirmDialog(null, "Deseja abrir uma conta-corrente?");

        if (escolha == 0){
            this.setSaldo(50.00);
            this.setTipo("CC");
           }else{
            this.setSaldo(150.00);
            this.setTipo("CP");
        }

    }

    public void fecharConta(){
        if (this.getSaldo() == 0.00){
            this.setStatus(false);
            System.out.println("Conta encerrada com sucesso");
        }else{
            this.setStatus(true);
            System.out.println("ERRO, conta precisa estar zerada");

        }
    }

    public void depositar(){
        if (this.getStatus() == true){
            double valorDeposito = (Double.parseDouble(JOptionPane.showInputDialog(null, "Qual será o valor do depósito?")));
            this.setSaldo(this.getSaldo() + valorDeposito);
        }else{
            System.out.println("Conta está encerrada");
        }
    }

    public void sacar(){


        if (this.getStatus() == true){
        double valorSaque = (Double.parseDouble(JOptionPane.showInputDialog(null, "Qual será o valor do saque?")));    

         if(valorSaque <= this.getSaldo()){
            double saldoAtual = (this.getSaldo() - valorSaque);
            this.setSaldo(saldoAtual);
            }else{
            System.out.println("Saldo insuficiente");
            }
        }else{
        System.out.println("Conta inativa");
        }
    }
    public void pagarMensal(){
        double tarifa;
        if (this.getTipo() == "CC"){
            tarifa = 12.00;
        }else{
             tarifa = 20.00;
        }
        
        if (saldo > tarifa){
                double saldoAtual = (this.getSaldo() - tarifa);   
                setSaldo(saldoAtual);
        }else{
            System.out.println("Sem saldo para pagamento da tarifa");
        }
    }
        
}

