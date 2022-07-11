package conversaodetipos;

import java.sql.SQLOutput;
import java.util.Scanner;

// Aula 11/07/22 - Estudo de convers�o de tipos
// Autor: Marina Larissa Carpes R�hrig
public class AulaDeConversao {
    public static void main(String[] args){
    int idade = 31;
    double altura = 1.75;
    boolean praticaEsporte = true;
    String nome = "Jo�o";

   // int alturaInt = altura;
   // a linha de cima n�o funciona pois espera um inteiro, mas recebe um double ( altura).

   int alturaInt = (int) altura;
   //Aqui converte o valor de altura para int, e ai funciona. Como concateca um double para int, vai mostrar apenas 1.

        System.out.println(alturaInt);

   String idadeStr = Integer.toString(idade);
   //Aqui converte o inteiro da vari�vel idade em string na vari�vel idadeStr
        System.out.println(idadeStr);

   altura = Double.parseDouble("1.75");
        System.out.println(altura);

        Scanner scanner = new Scanner(System.in);
        //Inicializa��o da vari�vel de entrada da classe Scanner.

        System.out.println("Digite sua altura: ");
        String alturaStr = scanner.nextLine();
       Double alturaDouble = Double.parseDouble(alturaStr);
        //Converte alturaStr em double e salva em uma vari�vel double
        System.out.println(alturaDouble);

    }
}
