package modulo1.desafio3;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de uma das provas: ");
        var valorDaProva = sc.nextInt();

        System.out.print("Digite a média: ");
        var media = sc.nextInt();

        for(int i = 0; i <= 100; i++){
            if((valorDaProva + i) / 2 == media){
                System.out.println("Valor da segunda prova é: " + i );
                break;
            }
        }
    }
}
