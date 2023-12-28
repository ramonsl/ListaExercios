import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        //declarando as variaveis
        String nomeProduto;
        float valor;
        //variavel para ser o desconto incial
        float desconto =0.05f;
        //teclado para leitura
        Scanner teclado= new Scanner(System.in);

        //ler o produto e o valor
        System.out.println("Nome do produto");
        nomeProduto=teclado.next();
        System.out.println("Valor do produto");
        valor=teclado.nextFloat();//float pq é um valor numerico

        System.out.println("Produto : "+nomeProduto);
        System.out.println("Valor : "+valor);

        //usar um laço para dar o desconte até 50%
        //vamos fazer usando for
        for(int i=0;i<10;i++){//bloco for vai percorer de 0 ate 10\\
            float valorDesconto=valor*desconto;//calcular o preco do produto com desconto
            System.out.println("Quantidade: "+i+ " x =" +valorDesconto);//mostrar
            desconto+= 0.05; // a cada interaçao aumentamos + 0.05 ou 5%
        }

    }
}
