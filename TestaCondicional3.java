public class TestaCondicional3{
    
    public static void main(String[] args){
        System.out.println("testando condicionais");
        
        int idade = 20;
        int quantidadePessoas = 3;
        boolean acompanhado = quantidadePessoas >=2;
        
        System.out.println("valor de acompanhado =" + acompanhado);
        
        if
        (idade>= 18 && acompanhado){
            // || Condição de ou que vale uma das condições
            // && Condição de E que vale para todas as condições verdadeiras
            
            System.out.println("seja bem vindo");
        }
        else{
            System.out.println("infelizmente voce não pode entrar");
        }
    } 
}