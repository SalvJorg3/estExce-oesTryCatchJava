import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        

        Scanner sc = new Scanner(System.in);

/*Criado um vetor aonde será escrito as Strings da matriz e depois elas 
 são acessadas (dependendo dos valores colocados podem gerar exceções) 
 em um programa normal o tratamento dessas exceções serve para que o programa 
 não seja finalizado incorretamente */
        

    try {    

        String[] vect = sc.nextLine().split(" ");
        int position = sc.nextInt();
        System.out.println(vect[position]);
    }
    /* Exceção que captura uma posição indicada fora do limite do vetor */
    catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Invalid position!");
    }
   /*Exceção que captura o erro aonde não é informado a posição 
    do elemento do vetor com números */
    catch (InputMismatchException e) {
        System.out.println("Input error!");
    }

    System.out.println("End of program");

        sc.close();

    }
}
