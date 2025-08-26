
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
//        //Objeto para leitura dos dados
//        Scanner leitor = new Scanner(System.in);
//
//        // Entrada do intervalo
//        System.out.print("Digite o valor inicial: ");
//        long inicio = leitor.nextInt();
//
//        System.out.print("Digite o valor final: ");
//        long fim = leitor.nextInt();

        long inicio = 10;  // Valor inicial do intervalo
        long fim = 500000000;     // Valor final do intervalo

        System.out.println("Números primos do intervalo " + inicio + " e " + fim + ":");
        //Dividindo o intervalo em dois sub-intervalos.

        System.out.println("Segmento 1 entre " + inicio + " e " + ((int) fim / 2 - 1) + ":");
        //Inicializando o objeto que calcula os primos
        CalculaPrimo cp1 = new CalculaPrimo(inicio, (int) fim / 2 - 1);

        System.out.println("Segmento 2 entre " + ((int) fim / 2) + " e " + fim + ":");
        //Inicializando o objeto que calcula os primos
        CalculaPrimo cp2 = new CalculaPrimo((int) fim / 2, fim);

        //Executando as threads
        Thread t1 = new Thread(cp1);
        Thread t2 = new Thread(cp2);
        t1.start();
        t2.start();
    }
}
