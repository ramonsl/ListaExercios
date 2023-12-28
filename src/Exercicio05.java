import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        int tam=3;//variavel usada pra testar de forma mais rapida
        //variaveis
        float[][] precos = new float[tam][3];//declarando uma matriz
        Scanner teclado= new Scanner(System.in);
        for (int linha=0; linha<tam;linha++){
            System.out.println("Digite os Preços dos produtos "+(linha+1));
            for (int coluna=0;coluna<3;coluna++){
                System.out.println("Mercado  "+ (coluna+1));
                precos[linha][coluna]=teclado.nextFloat();
            }
        }

        //ver quais sao os melhores preços

        for (int linha=0; linha<tam;linha++){
            float melhorPreco=precos[0][0];
            System.out.println("Preço do produto "+ (linha+1));
            for (int coluna=0;coluna<3;coluna++){
                if (melhorPreco>precos[linha][coluna]){
                    melhorPreco=precos[linha][coluna];
                }
            }
            System.out.println("Melhor preço r$"+melhorPreco);
        }
    }}
