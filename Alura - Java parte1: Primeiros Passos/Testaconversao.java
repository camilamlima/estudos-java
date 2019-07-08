public class Testaconversao{
    
    public static void main(String[] args){
        
        double salario = 1250.70;
        int valor = (int) salario;
        
        System.out.println(valor);
        
        long numeroGrande = 3325652663586L;
        //número acima de 64bytes
        short valorPequeno = 213123;
        //numero ate 16bytes
        
        byte b = 127
        // so vai até 256, sendo metade negativo e metade positivo
        
        float pontoFlutuante = 3.14f;
        
        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2;
        
        System.out.println(total);
        
    }
}