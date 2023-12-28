import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        //variaveis
        float[][] valores = new float[5][4];//declarando uma matriz
        float maiorNota=0;
        float somaNotas=0;
        int matriculaMaiorNota=0;
        Scanner teclado= new Scanner(System.in);


        //como sabemos que sao 5 linha, vamos usar um for
        for (int i=0;i<5;i++){
            System.out.println("Codigo do aluno");
            valores[i][0]=teclado.nextFloat();
            System.out.println("media das provas");
            valores[i][1]=teclado.nextFloat();
            System.out.println("media das trabalhos");
            valores[i][2]=teclado.nextFloat();
            //apos ler a notas podemos calcular pegando o valores lidos e atribuidos
            //na coluna 3 (4 se considerar começar por 1)
            valores[i][3]= (float) (valores[i][1]*0.6  + valores[i][2]*0.4);
            //soma as notas
            somaNotas+=valores[i][3];
            if (maiorNota<valores[i][3]){
                maiorNota=valores[i][3];
                matriculaMaiorNota=i;

                //aqui vemos que tem a maior nota e em qual linha ela esta (i)
            }
        }

        System.out.println("Maior nota= "+ maiorNota);
        System.out.println("Matricula maior nota= "+ valores[matriculaMaiorNota][0]);
        System.out.println("Media =" +somaNotas/4);
}}
