package modulo1.desafio1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        var vezes = 0;
        var ir = false;
        var pessoas = 0;
        var resto = 0;

        System.out.print("Digite o limite de passageiros: ");
       var  limitePassageiro = sc.nextInt();
        if (limitePassageiro <= 2 || limitePassageiro >= 100) {
            while(limitePassageiro <= 2 || limitePassageiro >= 100){
                System.out.print("Digite um limite de passageiros válido: ");
                limitePassageiro = sc.nextInt();
            }
        }

        System.out.println("");

        System.out.print("Digite o quantos passageiros tem no total: ");
        var totalPassagerios = sc.nextInt();
        if(totalPassagerios <= 1 || totalPassagerios >= 100){
            while(totalPassagerios <= 2 || totalPassagerios >= 1000 ){
                System.out.print("Digite uma limite de passageiros válida: ");
                totalPassagerios = sc.nextInt();
            }
        }

        System.out.println("");

        if (limitePassageiro == totalPassagerios || totalPassagerios > limitePassageiro) {
            pessoas = totalPassagerios - limitePassageiro;
            resto = totalPassagerios - pessoas;
            do {
                if (pessoas < limitePassageiro) {
                    vezes++;
                    if(resto >= 0) {
                        pessoas = resto;
                    }
                    if(resto - pessoas <= 0){
                        resto = 0;
                    }
                }
                if (pessoas >= limitePassageiro) {
                    var limite = limitePassageiro - 1;
                    var sobra = pessoas - limite;
                    pessoas = limite;
                    resto += sobra;
                }
                if(pessoas == 0){
                    ir  = true;
                }
            } while (!ir);
            System.out.println("O minino de vezes de viajens são: " +vezes);
        } else {
            vezes++;
            System.out.println("Apenas: " + vezes + " viajem");
        }
    }
}
