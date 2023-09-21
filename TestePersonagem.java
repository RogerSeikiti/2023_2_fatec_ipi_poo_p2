public class TestePersonagem {
    public static void main(String[] args) {
        new Personagem();
        //java 10 (compilador): inferênia de tipos 
        var p = new Personagem();
        p.nome = "José";
        p.cacar();
        p.comer();
        p.dormir();
    }
}
