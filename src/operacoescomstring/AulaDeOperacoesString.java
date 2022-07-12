package operacoescomstring;
// Aula 11/07/22 - Estudo de operações com string
// Autor: Marina Larissa Carpes Röhrig

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class AulaDeOperacoesString {
    public static void main(String[] args) {
        String nome = "Marina";
        Scanner scanner = new Scanner(System.in);
        System.out.printf("O tamanho da string Marina é:%d ",nome.length());
        System.out.println("Marina Larissa - O tamanho da string é: ".length());
        // lenght vai calcular os caracteres de uma string


        System.out.println("Digite seu nome: ");
        String nomeDoUsuario = scanner.nextLine();
        System.out.printf("%s, seu nome possuí %d caracteres. %n", nomeDoUsuario,nomeDoUsuario.length());
        // Exemplo com lenght

        System.out.println(nomeDoUsuario.toLowerCase());
        System.out.println(nomeDoUsuario.toUpperCase());
        // Exemplos com lower e upper case, que transforma em maíscula e minuscula.

        System.out.println("                remove espaços no começo e no fim          ".trim());
        // Exemplo com .trim, ele remove espaços do começo e do fim.

        System.out.println(nomeDoUsuario.equals(" José"));
        System.out.println(nomeDoUsuario.equalsIgnoreCase("Marina"));
        //Equals compara uma string com outra e retorna true ou false. Equalsignorecase, ignora maiusculo e minusculo.

        System.out.println(nomeDoUsuario.charAt(0));
        //Verifica o caractere ( char) da string nomeDousuario na posição 0, indice 0.

        System.out.println(nomeDoUsuario.charAt(1));
        // mostra o caractere no índice 1, se não existir apresenta erro

        System.out.println("Digite seu primeiro e último nome");
        String nomeCompletoDoUsuario = scanner.nextLine();

        System.out.printf("%s, suas iniciais são: %s%s%n",nomeCompletoDoUsuario,
                nomeCompletoDoUsuario.charAt(0),
                nomeCompletoDoUsuario.charAt(nomeCompletoDoUsuario.indexOf(" ")+1));
        //Aqui pega o nome completo, calcula o sobrenome como a primeira palavra após um espaço.

        char primeiraLetraNome = nomeCompletoDoUsuario.charAt(0);
        int indiceDoEspaco = nomeCompletoDoUsuario.indexOf(" ");
        char primeiraLetraSobrenome = nomeCompletoDoUsuario.charAt(indiceDoEspaco+1);

        System.out.printf("%s, suas iniciais são: %s%s%n",
                nomeCompletoDoUsuario,primeiraLetraNome,primeiraLetraSobrenome);

        System.out.println();
        System.out.println(nomeCompletoDoUsuario.indexOf("e"));
        System.out.println(nomeCompletoDoUsuario.lastIndexOf("e"));
        //Verifica primeira ocorrencia da letra E na string e a última ocorrencia da letra E na stirng.

        System.out.println(nomeCompletoDoUsuario.replace('o','i'));

        String nomeSemEspacos = nomeCompletoDoUsuario.replace(" ", "");
        // substitui todos espaços por vazio, replace retorna uma string que vai salvar em uma string nova

        System.out.println(nomeSemEspacos);
        System.out.println(nomeSemEspacos.length());
        System.out.println(nomeCompletoDoUsuario);

        System.out.println(nomeCompletoDoUsuario.substring(indiceDoEspaco+1));
        System.out.println(nomeCompletoDoUsuario.substring(0,indiceDoEspaco));
        //cria uma substring com base em um indice inicial ou indice inicial e final

        System.out.println("  ".isEmpty());
        System.out.println("  ".isBlank());
        // Verifica se está vazio ou se está em branco

    }
}
