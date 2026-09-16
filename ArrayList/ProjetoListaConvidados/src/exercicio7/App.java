package exercicio7;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> convidados = new ArrayList<>();

        int opcao = 0;

        while (opcao != 6) {

            System.out.println("\n===== MENU =====");
            System.out.println("1 - Adicionar convidado");
            System.out.println("2 - Alterar convidado");
            System.out.println("3 - Remover convidado");
            System.out.println("4 - Procurar convidado");
            System.out.println("5 - Exibir convidados");
            System.out.println("6 - Encerrar");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Digite o nome do convidado: ");
                    String nome = scanner.nextLine();

                    convidados.add(nome);

                    System.out.println("Convidado adicionado!");
                    break;


                case 2:
                    System.out.print("Digite a posição do convidado: ");
                    int posicao = scanner.nextInt();
                    scanner.nextLine();

                    if (posicao >= 0 && posicao < convidados.size()) {

                        System.out.print("Digite o novo nome: ");
                        String novoNome = scanner.nextLine();

                        convidados.set(posicao, novoNome);

                        System.out.println("Convidado alterado!");

                    } else {
                        System.out.println("Posição inválida!");
                    }

                    break;


                case 3:
                    System.out.print("Digite o nome do convidado: ");
                    String nomeRemover = scanner.nextLine();

                    if (convidados.contains(nomeRemover)) {

                        convidados.remove(nomeRemover);

                        System.out.println("Convidado removido!");

                    } else {
                        System.out.println("Convidado não encontrado.");
                    }

                    break;


                case 4:
                    System.out.print("Digite o nome do convidado: ");
                    String nomeProcurar = scanner.nextLine();

                    int posicaoEncontrada = convidados.indexOf(nomeProcurar);

                    if (posicaoEncontrada != -1) {
                        System.out.println(
                            "Convidado encontrado na posição: "
                            + posicaoEncontrada
                        );
                    } else {
                        System.out.println("Convidado não encontrado.");
                    }

                    break;


                case 5:
                    System.out.println("\n===== CONVIDADOS =====");

                    for (String convidado : convidados) {
                        System.out.println(convidado);
                    }

                    break;


                case 6:
                    System.out.println("Programa encerrado!");
                    break;


                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}