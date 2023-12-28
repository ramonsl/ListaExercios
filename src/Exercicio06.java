import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        int[] vetor={1,2,3,4,5,6,7,8,8,9};
        int numero;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Digite um numero");
        numero=teclado.nextInt();
        int cont=0;
        for (int i=0;i<10;i++){
            if (numero==vetor[i]){
                cont++;
            }
        }
        System.out.println("Numero aparece= "+cont);
        System.out.println("Numero Maiores");

        for (int i=0;i<10;i++){
            if (numero<vetor[i]){
                System.out.println(vetor[i]);
            }
        }
        System.out.println("Numero menores");
        for (int i=0;i<10;i++){
            if (numero>vetor[i]){
                System.out.println(vetor[i]);
            }
        }
    }
}
