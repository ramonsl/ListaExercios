import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        //variaveis
        int quantidadeJogadores=0;
        String nome;
        float alturaMaior=0.0f;
        float altura;
        float somaAltura = 0;
        float mediaAltura;
        int idadeVelho=0;
        int idade;
        float peso;
        float pesoMais=0;
        // como não sabemos quantos jogadores, vamos usar um do wuile, pois é indeterminado
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Nome do jogador");
            nome=teclado.next();
            //se o nome for sair, temos que parar a execução
            if (nome.equals("sair")){
                break;
                //break para um laço
            }
            System.out.println("Altura:");
            altura=teclado.nextFloat();
            System.out.println("Idade:");
            idade=teclado.nextInt();
            System.out.println("peso:");
            peso=teclado.nextFloat();
            //se for o primeiro jogador (quantidade 0) ele vai ser o mais alto,gordo e velho
            if (quantidadeJogadores==0){
                alturaMaior=altura;
                pesoMais=peso;
                idadeVelho=idade;
            }
            //se não for, ou seja ja tem ao menos um..
            if (quantidadeJogadores!=0){
                //copara o peso do meliante com o maior peso..e alura e idade
                if(peso>pesoMais){
                    pesoMais=peso;
                }
                if(altura>alturaMaior){
                    alturaMaior=altura;
                }
                if(idade>idadeVelho){
                    idadeVelho=idade;
                }

            }
            //somas as alturas para ver a media
            somaAltura+=altura;
            //adiciona 1 na quantidade
            quantidadeJogadores+=1;

        }while (!nome.equals("sair"));//para comparar Strings devemos usar equals ao inves de ==
        //como queremos perguntar emqunato for diferente de sair usamos ! no inicio para negar

        System.out.println("Mais alto: "+alturaMaior);
        System.out.println("Mais pesado: "+pesoMais);
        System.out.println("Mais Velho: "+idadeVelho);
        System.out.println("Quantidade: "+quantidadeJogadores);
        System.out.println("Media de altura:"+somaAltura/quantidadeJogadores);
    }
}
