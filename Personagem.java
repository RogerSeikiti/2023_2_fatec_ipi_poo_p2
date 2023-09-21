public class Personagem (
 //atributos ou propriedades 
   String nome;
    int energia = 10;
    int fome = 0;
    int sono = 0;
//comportamentos (métodos)
   void cacar(){
    if(energia >= 2){
        System.out println(nome + "Caçando...");
        energia -= 2; //energia = energia -2;
    }
    else {
        System.out println(nome + "Sem energia para caçar...");
    }
    fome = Math.min(fome + 1, 10);
    sono = Math.min(sono + 1, 10); 
   }

   void comer(){
   if(fome >= 1){
       System.out println(nome + "Comendo...");
      // operador ternário 
       energia = energia + 1 > 10 ? 10: energia + 1;
       fome --;
   }
   else {
       System.out println(nome + "Sem fome...");
   }
   
}

   void dormir(){
    if (sono > 0){
        System.out println(nome + "Dormindo...");
        sono -= 1;
        energia Math.min(10, energia + 1);
    }
    else {
        System.out println(nome + "Sem sono...");
    } 
}
      
    
    
)