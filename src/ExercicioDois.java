import java.util.Scanner;

public class ExercicioDois {


    public static void call(Scanner scanner) {
        System.out.println("=== EXERCÍCIOS - LISTA 2 ===");

        System.out.println("+-------------------------------------------------------+");
        System.out.println("| 1 - Calcule a Média                                   |");
        System.out.println("| 2 - Mês do Ano                                        |");
        System.out.println("| 3 - Forca                                             |");
        System.out.println("| 4 - Tabuada                                           |");
        System.out.println("| 5 - Letra a Letra                                     |");
        System.out.println("| 6 - Número ímpares multiplos de 7                     |");
        System.out.println("| 7 - Calcule a Média de Notas informadas               |");
        System.out.println("| 8 - Fatorial                                          |");
        System.out.println("| 9 - Calculo IMC                                       |");
        System.out.println("| 10 - Operadores                                       |");
        System.out.println("| 11 - DESAFIO                                          |");
        System.out.println("+-------------------------------------------------------+");

        int menu = 0;
        try {
            menu = scanner.nextInt();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            menu = 0;
        }

        switch (menu) {
            // 1) Crie um programa que receba três notas calcule a média e diga se foi aprovado (`(nota1 + nota2 + nota3 / 3)`) e (`média maior que 7 para ser aprovado`).
            case 1:
                // calculaMedia(double notaUm, double notaDois, double notaTres);
                calculaMedia(10, 10, 10);
                break;
            // 2) Crie um programa que receba um número e indique o mês que representa.
            case 2:
                // qualMes(int mes);
                qualMes(7);
                break;
            // 3) Crie um programa que simule um jogo da forca, com a entrada da palavra oculta, a quantidade de tentativas para acerto e depois solicite a entrada da palavra. A cada erro deve imprimir a quantidade de tentativas restantes e o 'membro' que foi marcado. Ao final deve imprimir se acertou ou não a palavra e se foi 'enforcado'.
            case 3:
                // forca(String palavra, int tentativa, Scanner scanner);
                forca("teste", 5, scanner);
                break;
            // 4) Crie um programa que imprima a tabuada de 0 a 10.
            case 4:
                // tabuada(int numero);
                tabuada(5);
                break;
            // 5) Crie um programa que receba uma String e imprima linha a linha suas letras.
            case 5:
                // letraALetra(String palavra);
                letraALetra("teste");
                break;
            // 6) Crie um programa que de a soma de todos os números ímpares e múltiplos de 7 entre 1 e 500.
            case 6:
                // numerosImpares();
                numerosImpares();
                break;
            // 7) Crie um programa que tenha como entrada as notas de um aluno. Somente se encerrará quando for inserida uma nota negativa. Ao final deverá informar a média das notas.
            case 7:
                // calculaMedia(double[] notas);
                calculaMedia(new double[] { 10, 10, 10 });
                break;
            // 8) Crie um programa que receba um valor e imprima o fatorial desse número. Ex.: 3! = 3 x 2 x 1 = 6.
            case 8:
                // fatorial(int numero);
                fatorial(5);
                break;
            // 9) Crie um programa que receba a altera e o peso e calcule o IMC:
            // 
            // IMC | Classificação
            // --- | ------
            // Abaixo de 18,5 | Abaixo do Peso
            // Entre 18,6 e 24,9 | Peso Ideal
            // Entre 25,0 e 29,9 | Levemente acima do peso
            // Entre 30,0 e 34,9 | Obesidade Grau I
            // Entre 35,0 e 39,9 | Obesidade Grau II
            // Acima de 40 | Obesidade Grau III (mórbida)
            case 9:
                // imc(double altura, double peso);
                imc (1.80, 80);
                break;
            // 10) Crie um programa que receba dois valores e solicite a operação a ser realizada (+ - * /). Ao final imprima o resultado.
            case 10:
                // operador(int valorUm, int valorDois, char operacao);
                operador(10, 5, '+');
                break;
            // DESAFIO: Crie um programa que receba um valor em reais e determine qual o mínimo de notas necessárias para entregá-lo. <br> Notas: R$ 200, R$ 100, R$ 50, R$ 10, R$ 5, R$ 1 <br> Exemplo: R$ 15 -> 1 nota de R$ 10 e 1 nota de R$ 5
            case 11:
                notasNecessarias(scanner);
                //notasNecessarias(Scanner scanner);
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }
    }

    public static void calculaMedia(double notaUm, double notaDois, double notaTres) {
        double media = (notaUm + notaDois + notaTres) / 3;
        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }

    public static void qualMes(int mes) {
        switch (mes) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("Mês inválido");
                break;
        }
    }

    public static void forca(String palavra, int tentativa, Scanner scanner) {
        String palavraOculta = "";
        for (int i = 0; i < palavra.length(); i++) {
            palavraOculta += "_";
        }
        int tentativas = 0;
        while (tentativas < tentativa) {
            System.out.println("Palavra: " + palavraOculta);
            System.out.println("Tentativas: " + tentativas);
            System.out.println("Digite uma letra: ");
            String letra = scanner.next();
            if (palavra.contains(letra)) {
                for (int i = 0; i < palavra.length(); i++) {
                    if (palavra.charAt(i) == letra.charAt(0)) {
                        palavraOculta = palavraOculta.substring(0, i) + letra + palavraOculta.substring(i + 1);
                    }
                }
            } else {
                tentativas++;
            }
            if (palavraOculta.equals(palavra)) {
                System.out.println("Parabéns, você acertou a palavra!");
                break;
            }
        }
        if (tentativas == tentativa) {
            System.out.println("Você foi enforcado!");
        }
    }

    public static void tabuada(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public static void letraALetra(String palavra) {
        for (int i = 0; i < palavra.length(); i++) {
            System.out.println(palavra.charAt(i));
        }
    }

    public static void numerosImpares() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void calculaMedia(double[] notas) {
        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            media += notas[i];
        }
        media /= notas.length;
        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }

    public static void fatorial(int numero) {
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        System.out.println(fatorial);
    }

    public static void imc(double altura, double peso) {
        double imc = peso / (altura * altura);
        if (imc < 18.5) {
            System.out.println("Abaixo do Peso");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Peso Ideal");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Obesidade Grau II");
        } else {
            System.out.println("Obesidade Grau III (mórbida)");
        }
    }

    public static void operador(int numeroUm, int numeroDois, char operador) {
        switch (operador) {
            case '+':
                System.out.println(numeroUm + numeroDois);
                break;
            case '-':
                System.out.println(numeroUm - numeroDois);
                break;
            case '*':
                System.out.println(numeroUm * numeroDois);
                break;
            case '/':
                System.out.println(numeroUm / numeroDois);
                break;
            default:
                System.out.println("Operador inválido");
                break;
        }
    }


   // R$200, R$ 100, R$ 50, R$ 10, R$ 5, R$ 1
   public static int[] notasNecessarias(Scanner scanner) {
       int valor = scanner.nextInt();
       int quantidade = 0;
       while (valor >= 200) {
        valor -= 200;
           quantidade++;
       }
       while (valor >= 100) {
        valor -= 100;
           quantidade++;
       }
       while (valor >= 50) {
        valor -= 50;
           quantidade++;
       }
       while (valor >= 10) {
        valor -= 10;
           quantidade++;
       }
       while (valor >= 5) {
        valor -= 5;
           quantidade++;
       }
       while (valor >= 1) {
        valor -= 1;
           quantidade++;
       }
       System.out.println("Quantidade de notas necessárias: " + quantidade);
    return null;
   }


@Override
public String toString() {
    return "ExercicioDois []";
}}