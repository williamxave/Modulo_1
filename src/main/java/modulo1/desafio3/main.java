package modulo1.desafio3;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var valorDaProva = 0;
        var media = 0;
        var validaMedia = 0;
        var validaProva = 0;

        System.out.print("Digite o valor de uma das provas: ");
        valorDaProva = sc.nextInt();
        validaProva = validaProva(valorDaProva, sc);

        System.out.print("Digite a média: ");
        media = sc.nextInt();
        validaMedia = validaMedia(media, sc,validaProva);

        var valorDaPrimeiraProva = verificaMedia(validaMedia,validaProva);
        System.out.println("Valor da segunda prova é: " + valorDaPrimeiraProva);

    }

    private static Integer validaProva(Integer primeraProva, Scanner sc) {
        if (primeraProva < 0 || primeraProva > 100) {
            while (primeraProva < 0 || primeraProva > 100) {
                System.out.print("Digite um valor válido para a prova: ");
                primeraProva = sc.nextInt();
            }
        }
        return primeraProva;
    }

    private static Integer validaMedia(Integer media, Scanner sc, Integer valorProva) {
        var valorDaPrimeiraProva = verificaMedia(media,valorProva);
        if(media < 0 || media > 100 || valorDaPrimeiraProva > 100){
            while (media < 0 || media > 100 || valorDaPrimeiraProva > 100) {
                System.out.print("Digite um valor válido para a média: ");
                media = sc.nextInt();
            }
        }
        return media;
    }

    private static  Integer verificaMedia(Integer media, Integer valorProva){
        var valorDaPrimeiraProva = (media * 2) - valorProva;
        return valorDaPrimeiraProva;
    }

}
