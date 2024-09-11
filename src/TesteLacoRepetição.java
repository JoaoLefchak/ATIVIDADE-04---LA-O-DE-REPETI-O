import java.util.Scanner;

public class TesteLacoRepetição {
    public static void main(String[] args) {

                String[] NomeTimes = new String[5];
                Scanner sc = new Scanner(System.in);

                System.out.println("Digite o nome do TimeA: ");
                NomeTimes[0] = sc.nextLine();

                for (int i = 0;i < 5;i++) {

                    System.out.println("Nome dos Jogadores Time A: " + i);
                    NomeTimes[i]= sc.next();
                }
                for (int i = 0;i < 5;i++) {
                    System.out.println("Os jogadores do time A são:" +NomeTimes[i]);
                }

                     String[] NomeTimeb = new String[5];
                     Scanner leitor = new Scanner(System.in);

                     System.out.println("Digite o nome do TimeB: ");
                     NomeTimeb[0] = leitor.nextLine();

                    for (int i = 0;i < 5;i++) {

                    System.out.println("Nome dos Jogadores Time B: " + i);
                     NomeTimeb[i]= sc.next();
                  }
                    for (int i = 0;i < 5;i++) {
                    System.out.println("Os jogadores do time B são:" +NomeTimeb[i]);
        }

    }
}


