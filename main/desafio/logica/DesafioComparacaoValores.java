package logica;
import java.util.ArrayList;
import java.util.Scanner;

public class DesafioComparacaoValores {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //Scanner para input do usuário.

        float somaValores = 0; //
        ArrayList <Integer> listaValores = new ArrayList<Integer>();


        //Aqui poderiamos ter usado o Switch case, porém, o código iria ficar verboso. Por isso optei pelo While
        while (listaValores.size() < 5) {
            System.out.println("Digite um valor:");
            listaValores.add(scanner.nextInt());
        }

        // Inicializa menor e maior com o primeiro valor para usá-lo como referência nas comparações.
        int menor = listaValores.get(0);
        int maior = listaValores.get(0);

        // Estrutura de repetição foi escolhida pois percorre os indexes do array.
        for (int i = 1; i < listaValores.size(); i++) {
            int valorAtual = listaValores.get(i);

            if (valorAtual < menor) {
                menor = valorAtual;
            } else if (valorAtual > maior) {
                maior = valorAtual;
            }
        }

        //Optei pelo for each ao invés da tradicional pois quero acessar diretamente os valores e não os indexes.
        for (Integer valores : listaValores) {
            somaValores += valores;
        }

        //Como se trata de média decidi utilizar float.
        float media = somaValores / 5;

        System.out.println("O menor valor digitado foi: " + menor);
        System.out.println("O maior valor digitado foi: " + maior);
        System.out.println("A média dos valores digitados foram: " + media);



    }




}
