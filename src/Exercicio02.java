import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        //variaveis
        int numeroSorteado=10;///vamos dizer que na brincadeira o usuario precisa acerta o 10
        int chute;
        //nesse caso, como nao sabemos quantas vezes o laço vai repetir varias vezes,
        // vamos usar um laço indeterminado
        Scanner teclado= new Scanner(System.in);

        do { //inicio do laço

            //le o numero
            System.out.println("Qual numero");
            chute=teclado.nextInt();
            //se for menor, falar que o chute precisa ser maior
            if (chute<numeroSorteado){
                System.out.println("Errou! o numero é maior");
            }
            //se for maior, falar que o chute precisa ser menor

            if (chute>numeroSorteado){
                System.out.println("Errou! o numero é menor");
            }

        }while (chute!=numeroSorteado);//final, enquanto o chute for diferente do numero ele ira ficar aqui
        System.out.println("Parabens! você acertou!");
    }
}
