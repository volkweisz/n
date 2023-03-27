
import java.util.Scanner;
public class TestCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean entradavalida=false;
        while (!entradavalida){ 
        System.out.println("Digite um número:");
       String entrada = sc.next();
       boolean todosDigitos = true;
       for (int i = 0; i < entrada.length();i++){
       if (!Character.isDigit(entrada.charAt(i))) {
        todosDigitos = false;
        break;
       }
    }
    if(todosDigitos) {
        entradavalida=true;
                System.out.println( " O Número digitado é "+ entrada );
    }else {
   System.out.println(entrada + " Não é um número");
        }
    }    
    }
}