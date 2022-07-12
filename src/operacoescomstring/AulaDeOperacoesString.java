package operacoescomstring;
// Aula 11/07/22 - Estudo de opera��es com string
// Autor: Marina Larissa Carpes R�hrig

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class AulaDeOperacoesString {
    public static void main(String[] args) {
        String nome = "Marina";
        Scanner scanner = new Scanner(System.in);
        System.out.printf("O tamanho da string Marina �:%d ",nome.length());
        System.out.println("Marina Larissa - O tamanho da string �: ".length());
        // lenght vai calcular os caracteres de uma string


        System.out.println("Digite seu nome: ");
        String nomeDoUsuario = scanner.nextLine();
        System.out.printf("%s, seu nome possu� %d caracteres. %n", nomeDoUsuario,nomeDoUsuario.length());
        // Exemplo com lenght

        System.out.println(nomeDoUsuario.toLowerCase());
        System.out.println(nomeDoUsuario.toUpperCase());
        // Exemplos com lower e upper case, que transforma em ma�scula e minuscula.

        System.out.println("                remove espa�os no come�o e no fim          ".trim());
        // Exemplo com .trim, ele remove espa�os do come�o e do fim.

        System.out.println(nomeDoUsuario.equals(" Jos�"));
        System.out.println(nomeDoUsuario.equalsIgnoreCase("Marina"));
        //Equals compara uma string com outra e retorna true ou false. Equalsignorecase, ignora maiusculo e minusculo.

        System.out.println(nomeDoUsuario.charAt(0));
        //Verifica o caractere ( char) da string nomeDousuario na posi��o 0, indice 0.

        System.out.println(nomeDoUsuario.charAt(1));
        // mostra o caractere no �ndice 1, se n�o existir apresenta erro

        System.out.println("Digite seu primeiro e �ltimo nome");
        String nomeCompletoDoUsuario = scanner.nextLine();

        System.out.printf("%s, suas iniciais s�o: %s%s%n",nomeCompletoDoUsuario,
                nomeCompletoDoUsuario.charAt(0),
                nomeCompletoDoUsuario.charAt(nomeCompletoDoUsuario.indexOf(" ")+1));
        //Aqui pega o nome completo, calcula o sobrenome como a primeira palavra ap�s um espa�o.

        char primeiraLetraNome = nomeCompletoDoUsuario.charAt(0);
        int indiceDoEspaco = nomeCompletoDoUsuario.indexOf(" ");
        char primeiraLetraSobrenome = nomeCompletoDoUsuario.charAt(indiceDoEspaco+1);

        System.out.printf("%s, suas iniciais s�o: %s%s%n",
                nomeCompletoDoUsuario,primeiraLetraNome,primeiraLetraSobrenome);

        System.out.println();
        System.out.println(nomeCompletoDoUsuario.indexOf("e"));
        System.out.println(nomeCompletoDoUsuario.lastIndexOf("e"));
        //Verifica primeira ocorrencia da letra E na string e a �ltima ocorrencia da letra E na stirng.

        System.out.println(nomeCompletoDoUsuario.replace('o','i'));

        String nomeSemEspacos = nomeCompletoDoUsuario.replace(" ", "");
        // substitui todos espa�os por vazio, replace retorna uma string que vai salvar em uma string nova

        System.out.println(nomeSemEspacos);
        System.out.println(nomeSemEspacos.length());
        System.out.println(nomeCompletoDoUsuario);

        System.out.println(nomeCompletoDoUsuario.substring(indiceDoEspaco+1));
        System.out.println(nomeCompletoDoUsuario.substring(0,indiceDoEspaco));
        //cria uma substring com base em um indice inicial ou indice inicial e final

        System.out.println("  ".isEmpty());
        System.out.println("  ".isBlank());
        // Verifica se est� vazio ou se est� em branco

    }
}
