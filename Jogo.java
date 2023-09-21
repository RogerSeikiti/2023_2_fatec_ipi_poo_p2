import java.util.Random;
public class Jogo {
    public static void main(String[] args) throws Exception {
        var gerador = new Random();
        var personagem = new Personagem("John");
        var soneca = new Personagem("Soneca", 0, 4, 10);
        //nasce com muito e sem energia. fome mais ou menos
        //ele tem probabilidade de 80% de dormir
        //10% de caçar
        //10% de comer

        while(true){
            int oQueFazer = gerador.nextInt(3); //[0...3]
             switch(oQueFazer) {
                case 0:
                 personagem.cacar();
                 break;
                case 1:
                 personagem.comer();
                 break;
                case 2:
                 personagem.dormir();
                 break;
             }
            personagem.cacar();
            personagem.comer();
            personagem.dormir();

            Thread.sleep(5000);
            System.out.printf("e: %d, f: %d, s: %d", personagem.energia, personagem.fome, personagem.sono);
            var oQueSonecaVaiFazer = gerador.nextDouble();
            if (oQueSonecaVaiFazer <= 0.8)
             soneca.dormir();
             else if (oQueSonecaVaiFazer = 0.9)
             soneca.comer();
             else 
              soneca.cacar();
              soneca.exibirEstado();
              System.out.printf("********************************");
            System.out.println("********************************");
        }
    }
    
}
