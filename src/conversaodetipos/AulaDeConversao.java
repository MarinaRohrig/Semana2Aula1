package conversaodetipos;

import java.sql.SQLOutput;
import java.util.Scanner;

// Aula 11/07/22 - Estudo de conversão de tipos
// Autor: Marina Larissa Carpes Röhrig
public class AulaDeConversao {
    public static void main(String[] args){
    int idade = 31;
    double altura = 1.75;
    boolean praticaEsporte = true;
    String nome = "João";

   // int alturaInt = altura;
   // a linha de cima não funciona pois espera um inteiro, mas recebe um double ( altura).

   int alturaInt = (int) altura;
   //Aqui converte o valor de altura para int, e ai funciona. Como concateca um double para int, vai mostrar apenas 1.

        System.out.println(alturaInt);

   String idadeStr = Integer.toString(idade);
   //Aqui converte o inteiro da variável idade em string na variável idadeStr
        System.out.println(idadeStr);

   altura = Double.parseDouble("1.75");
        System.out.println(altura);

        Scanner scanner = new Scanner(System.in);
        //Inicialização da variável de entrada da classe Scanner.

        System.out.println("Digite sua altura: ");
        String alturaStr = scanner.nextLine();
       Double alturaDouble = Double.parseDouble(alturaStr);
        //Converte alturaStr em double e salva em uma variável double
        System.out.println(alturaDouble);

    }
}
