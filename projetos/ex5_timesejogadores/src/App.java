import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Jogador> jogadores = new ArrayList<>();
        String resposta;

        // Criar o time
        System.out.print("Digite o nome do seu time: ");
        String nometime = scanner.nextLine();
        System.out.print("Digite a cidade do seu time: ");
        String cidade = scanner.nextLine();
        Time time = new Time(nometime, cidade);

        // Adicionar jogadores livres
        while (true) {
            System.out.print("Deseja adicionar jogador a lista? (S/N): ");
            resposta = scanner.nextLine().trim();
            if (!"S".equalsIgnoreCase(resposta)) break;

            System.out.print("Digite o nome do jogador: ");
            String nome = scanner.nextLine();
            System.out.print("Digite a posição do jogador: ");
            String posicao = scanner.nextLine();

            jogadores.add(new Jogador(nome, posicao));
            System.out.println("Jogador adicionado à lista de jogadores livres!\n");
        }

        // Listar jogadores livres
        if (!jogadores.isEmpty()) {
            System.out.println("------- JOGADORES SEM TIME -------");
            for (int i = 0; i < jogadores.size(); i++) {
                System.out.println((i + 1) + " - " + jogadores.get(i));
            }
        } else {
            System.out.println("Nenhum jogador disponível na lista.");
        }

        // Mover jogadores para o time
        while (!jogadores.isEmpty()) {
            System.out.print("\nDeseja adicionar algum jogador ao time " + time.nome + "? (S/N): ");
            resposta = scanner.nextLine().trim();
            if (!"S".equalsIgnoreCase(resposta)) break;

            System.out.print("Digite o número do jogador a ser adicionado: ");
            int valor = Integer.parseInt(scanner.nextLine());

            if (valor < 1 || valor > jogadores.size()) {
                System.out.println("Número inválido!");
                continue;
            }

            Jogador selecionado = jogadores.get(valor - 1);
            time.addJogador(selecionado);
            jogadores.remove(valor - 1);
            System.out.println("Jogador adicionado ao time " + time.nome + "!");
        }

        // Listar jogadores do time
        System.out.println("\n-------- Time " + time.nome + " atualizado --------");
        time.listarJogadores();

        scanner.close();
    }
}
