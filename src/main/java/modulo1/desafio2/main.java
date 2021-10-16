package modulo1.desafio2;


import java.util.*;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        var numeroDeVezes = 0;
        var key = 0;
        var t = false;
        var valorFaltante = 0L;

        System.out.print("Digite o valor a ser calculado: ");
        var valor = sc.nextInt();

        ArrayList<Long> arrayList = new ArrayList<>();

        for (int fatorial = 0; fatorial <= valor; fatorial++) {
            var valorFatorial = fatorialFun(fatorial);
            arrayList.add(valorFatorial);
        }

        for (int j = 0; j <= arrayList.size(); j++) {
            if (arrayList.get(j) == valor || arrayList.get(j) > valor) {
                break;
            }
            numeroDeVezes++;
        }
        var valorProximo = arrayList.get(numeroDeVezes - 1);
        valorFaltante = valor - valorProximo;
        key++;
        numeroDeVezes--;

        do {
            while (arrayList.get(numeroDeVezes) <= valorFaltante) {
                if (arrayList.contains(valorFaltante)  || arrayList.get(numeroDeVezes) < valorFaltante)  {
                    valorFaltante -= arrayList.get(numeroDeVezes);
                    key++;
                }
            }

            if (valorFaltante == 0) {
                System.out.println("O valor " + valor + " pode ser somado com " + key + "! fatoriais");
                t = true;
                break;
            }

            for (int i = numeroDeVezes; i <= numeroDeVezes; numeroDeVezes--) {
                var vaaaa = arrayList.get(numeroDeVezes);
                if (vaaaa <= valorFaltante) {
                    valorFaltante -= arrayList.get(numeroDeVezes);
                    key++;
                }
            }
        } while (!t);
    }

    private static long fatorialFun(int valor) {
        int anterior = valor - 1;
        int fatorialDoValor = 0;

        if (valor <= 1) {
            return 1;
        } else {
            fatorialDoValor = (int) (valor * fatorialFun(anterior));
        }
        return fatorialDoValor;
    }
}
