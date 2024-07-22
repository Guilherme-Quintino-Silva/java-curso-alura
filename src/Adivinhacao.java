import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int notaAdivinhada = 0;
        int tentativas = 0;
        int aleatorio = new Random().nextInt(100);

        while (tentativas < 5) {
            System.out.println("Tente adivinhar o numero aleatorio:");
            notaAdivinhada = leitura.nextInt();
             if (notaAdivinhada < aleatorio) {
                 System.out.println("Nota digitada é menor do que o número gerado.");
             } else if(notaAdivinhada == aleatorio) {
                 System.out.println("Parabéns, voce adivinhou o número.");
                 break;
             } else {
                 System.out.println("Nota digitada é maior do que o número gerado.");
             }
             tentativas++;
        }
        if (tentativas == 5 && aleatorio != notaAdivinhada) {
            System.out.println("As 5 tentativas foram esgotadas.");
        };
    }
}
