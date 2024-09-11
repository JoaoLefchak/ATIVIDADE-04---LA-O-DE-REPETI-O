    import java.text.DecimalFormat;
    import java.util.Scanner;

    public class LeituraValoresUsuário {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            Double[] vetor = new Double[3];


            for (int i = 0; i < vetor.length; i++) {
                System.out.println("Digite o valor para a posição " + i + ": ");
                vetor[i] = scanner.nextDouble();
            }

            System.out.println("Valores do vetor: ");
            for (Double valor : vetor) {
                System.out.println(valor + " ");
            }
            DecimalFormat df = new DecimalFormat("###.00");
            Double  media =   vetor[0]+ vetor[1] + vetor[2]/3;
            System.out.println("A media dos valores dos vetores é "+ df.format(media) );
        }
    }
