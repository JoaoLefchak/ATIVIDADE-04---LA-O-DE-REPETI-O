public class ValoresentreElementosVetor {
    public class aloresentreElementosVetor {
        public static void main(String[] args) {

            int[] valores = new int[4];
            valores[0] = 3;
            valores[1] = 6;
            valores[2] = 9;
            valores[3] = 12;

            System.out.println(" A Soma do Vetor na Posição 0 com a Posição 3 é: "
                    + (valores[0] + valores[3]) );
            for ( int i = 0; i < valores.length ; i++){
                System.out.println("Posições: "+ i + ":" + valores[i]);
            }

        }
    }
}
