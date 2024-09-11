import java.security.spec.RSAOtherPrimeInfo;import java.util.Scanner;

public class ExemploLacoRepeticao {
    public static void main(String[] args) {

        String[] nomesJogadores = new String[10];
        Scanner sc = new Scanner(System.in);

        //Inicialização; condição, incremento
        //++ => vai somar +1
        for (int i = 0;i < 10;i++) {
            System.out.println("Informe o nome do Player: " + i);
            nomesJogadores[i]= sc.next();
        }
    }
}

//Pedir os nomes do time A
//Pedir os nomes do time A5(Nomes)
//Pedir os nomes do time B
//Pedir os nomes do time B (5Nomes)

////////////////////////////////////////////////////////////////