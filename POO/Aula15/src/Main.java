public class Main {
    public static void main(String[] args) throws Exception {
        Gafanhoto g1 = new Gafanhoto("Matheus", 22, 'M', "maaluizz");
        Gafanhoto g2 = new Gafanhoto("Maria", 30, 'F', "mariazinhapp");

        Video video[] = new Video[2];
        video[0] = new Video("Poo");
        video [1] = new Video("Java");
        
        Visualizacao visualizacao[] = new Visualizacao[2];
        visualizacao[0] = new Visualizacao(g1, video[0]);
        visualizacao[0].avaliar(86f);

        visualizacao [1] = new Visualizacao(g2, video[0]);
        visualizacao[1].avaliar();
        
        System.out.println(visualizacao[0].toString());
    }
}
