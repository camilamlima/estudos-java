public class TestaEscopo{
    
    public static void main(String [] args){
        
        int idade = 20;
        int quantidadePessoas = 3;
        
        boolean acompanhado;
        
        if(quantidadePessoas >= 2){
            acompanhado = true;
        } else{
            acompanhado = false;
        }
        
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