public class Executavel {
    public static void main(String[] args) {
       
        Lutador l1 = new Lutador("Pretty Boy", "França", 31 , 1.75, 68.9, "Leve", 11, 2, 1);
       

        Lutador l2 = new Lutador("Putscript", "Brasil", 29, 1.68, 57.8, "Leve", 14, 2, 3);
       

       Lutador l3 = new Lutador("Snapshadow", "EUA", 35, 1.65, 80.9, "Médio", 12, 2, 1);
       

       Lutador l4 = new Lutador("Dead Code", "Austrália", 28, 1.93, 81.6, "Médio", 13, 0, 2);
       
       Lutador l5 = new Lutador("Ufocobol", "Brasil", 37, 1.70, 119.3, "Pesado", 5, 4, 3);
       

       Lutador l6 = new Lutador("Nerdaard", "EUA", 30, 1.81, 105.7, "Pesado", 12, 2, 4);
    
       Luta luta1 = new Luta();
       luta1.marcarLuta(l1, l2);
       luta1.lutar();

    }   
}