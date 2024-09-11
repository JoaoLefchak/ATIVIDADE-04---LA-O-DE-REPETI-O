import java.util.Scanner;

public class AcessoElementosVetor {

    public class Atividadade5_Vetores {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String [] nomes = new String[4];

            for ( int i = 0; i < nomes.length; i++){
                System.out.println("Digite seu Nome: ");
                nomes[i] = scanner.nextLine();
            }
            System.out.println("Os Nomes foram: ");
            for (String nome : nomes){
                System.out.println(nome);
            }


        }
    }
}
