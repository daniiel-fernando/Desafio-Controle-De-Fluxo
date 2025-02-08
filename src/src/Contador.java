package src;
import java.util.Scanner;
public class Contador {
   public static void main(String[] args) {
    Scanner terminal = new Scanner(System.in);
    
    System.out.println("Digite o primeiro parâmetro: ");
    int paramentroUm = terminal.nextInt();

    System.out.println("Digite o segundo parâmetro: ");
    int paramentroDois = terminal.nextInt();

    terminal.close();


    try {
        contar(paramentroUm, paramentroDois);
    } catch(ParametrosInvalidosException e){
        System.out.println(e.getMessage()); }
    }
    
public static void contar (int paramentroUm, int paramentroDois) throws ParametrosInvalidosException{
    if (paramentroDois <= paramentroUm) {
        throw new ParametrosInvalidosException();
    }

    int contagem = paramentroDois - paramentroUm;

    for (int i = 1; i <= contagem; i ++) {
        System.out.println("Imprimindo número: " + i);
    }
}
}

