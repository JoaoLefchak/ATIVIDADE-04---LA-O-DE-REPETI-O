import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //primeira forma de criar e inicializar um vetor
        //criamos um vetor vazio
        int[] votos = new int[10];

        //nomeVetor [posicao] = valor
        votos[0] = 90;
        votos[1] = 80;
        votos[2] = 70;
        votos[3] = 60;

        String[] nomes = new String[5];

        Scanner entrada = new Scanner(System.in);
        nomes[0] = entrada.next();
        nomes[1] = entrada.next();
        nomes[2] = entrada.next();

        System.out.println("O primeiro nome é : " + nomes[2]);


        double[] valores = {5.5,10.0,9,99};







    }
}