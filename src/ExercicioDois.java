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
                double notaUm=0, notaDois=0, notaTres=0, media=0, soma=0;
                System.out.println("*** Cálcule a média do aluno!");
                try {
                    System.out.println("Digite a primeira nota.");
                    notaUm   = scanner.nextInt();
                    System.out.println("Digite a segunda nota.");
                    notaDois = scanner.nextInt();
                    System.out.println("Digite a terceira nota.");
                    notaTres = scanner.nextInt();
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                    notaUm   = 0;
                    notaDois = 0;
                    notaTres = 0;
                }
                soma  = notaUm + notaDois + notaTres;
                media = calculaMedia(notaUm, notaDois, notaTres);
                System.out.println("A soma das notas do aluno foi: " + soma);
                System.out.println("A média das notas do aluno foi: " + media);
                if(media>=7)
                    System.out.println("Aluno aprovado. Parabéns! Boa sorte na sua nova caminhada!");
                else 
                    System.out.println("Aluno foi Reprovado, estude mais na próxima vez, boa sorte.");
                break;
            // 2) Crie um programa que receba um número e indique o mês que representa.
            case 2:
                // qualMes(int mes);
                int mesInformado=0;
                System.out.println("***Apresente o nome do mês representado pelo número***");
                try {
                    System.out.println(" Digite o número para representar o mês: ");
                    mesInformado = scanner.nextInt();                  
                    System.out.println("o mês representado por esse número é " + qualMes(mesInformado));
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
                
                break;
            // 3) Crie um programa que simule um jogo da forca, com a entrada da palavra oculta, a quantidade de tentativas para acerto e depois solicite a entrada da palavra. A cada erro deve imprimir a quantidade de tentativas restantes e o 'membro' que foi marcado. Ao final deve imprimir se acertou ou não a palavra e se foi 'enforcado'.
            case 3:
                // forca(String palavra, int tentativa, Scanner scanner);
                System.out.println("1º Jogador: Digite uma palavra.");
                String palavra_oculta = scanner.next();

                System.out.println("1º Jogador: Defina o número de tentativas do seu adversário.");
                int tentativas = scanner.nextInt();

                for(int i = tentativas; i > 0; i--) {
                    System.out.println("2º Jogador: Digite a palavra chave");
                    String palavra_chave = scanner.next();
                    if(palavra_oculta.equals(palavra_chave)) {
                        System.out.println("Parabéns você acertou! Você precisou de " + (tentativas - i + 1) + " tentativas para acertar");
                        break;
                    } else if( i > 1 ) {
                        System.out.println("Você Errou! Tente outra vez");
                    } else {
                        System.out.println("Que pena você perdeu a palavra chave era" + palavra_oculta + ", mais sorte na próxima");
                    }
                }
                break;
            // 4) Crie um programa que imprima a tabuada de 0 a 10.
            case 4:
                // tabuada(int numero);
                System.out.println("Digite um número e descubra a sua tabuada.");
                int numero = scanner.nextInt();
                tabuada(numero);
                break;
            // 5) Crie um programa que receba uma String e imprima linha a linha suas letras.
            case 5:
                // letraALetra(String palavra);
                System.out.println("Digite uma palavra.");
                String palavra = scanner.next();
                for (char letra : letraALetra(palavra)) {
                    System.out.println(letra);
                }

                break;
            // 6) Crie um programa que de a soma de todos os números ímpares e múltiplos de 7 entre 1 e 500.
            case 6:
                 // numerosImpares();
                System.out.println("Cálculo da soma de todos os números ímpares e múltiplos de 7 entre 1 e 500 é: " + numerosImpares());
                break;
            // 7) Crie um programa que tenha como entrada as notas de um aluno. Somente se encerrará quando for inserida uma nota negativa. Ao final deverá informar a média das notas.
            case 7:
                // calculaMedia(double[] notas);
                break;
            // 8) Crie um programa que receba um valor e imprima o fatorial desse número. Ex.: 3! = 3 x 2 x 1 = 6.
            case 8:
                // fatorial(int numero);
                System.out.println("Digite um valor e descubra o seu Fatorial");
                int valor = scanner.nextInt();
                System.out.println("O resultado do fatorial de " + valor + " é: " + fatorial(valor));
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
                break;
            // 10) Crie um programa que receba dois valores e solicite a operação a ser realizada (+ - * /). Ao final imprima o resultado.
            case 10:
                // operador(int valorUm, int valorDois, char operacao);
                break;
            // DESAFIO: Crie um programa que receba um valor em reais e determine qual o mínimo de notas necessárias para entregá-lo. <br> Notas: R$ 200, R$ 100, R$ 50, R$ 10, R$ 5, R$ 1 <br> Exemplo: R$ 15 -> 1 nota de R$ 10 e 1 nota de R$ 5
            case 11:
                // notasNecessarias(int valor);
            default:
                System.out.println("Operação inválida");
                break;
        }
    }

    public static double calculaMedia(double notaUm, double notaDois, double notaTres) {
        double soma = (notaUm + notaDois + notaTres);
        double media = (soma / 3);
        return media;
    }

    public static String qualMes(int mes) throws Exception {
        String[] meses = new String[]{ "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        if (mes < 1 || mes > 12) {
            throw new Exception("Você digitou um mês inválido");
        }
        return meses[mes - 1];
    }

    public static int[] tabuada(int numero) {
        for (int i = 0 ;  i <= 10 ; i++) {
            System.out.println(" >> " + numero + " * " + i + " = " + (numero*i));
        }    
        return new int[10];
    }

    public static char[] letraALetra(String palavra) {
        char[] letras = new char[palavra.length()];
        for(int i = 0; i < letras.length; i++) {
            letras[i] = palavra.charAt(i);
        }
        return letras;
    }

    public static int numerosImpares() {
        int soma=0;
        for(int i=0; i<=500; i++) {
            if(i % 2 != 0 && i % 7 == 0) {
                soma = soma + i;
            }
        }
        return soma;
    }

    public static double calculaMedia(double[] notas) {
        return 0;
    }

    public static int fatorial(int valor) {
        int fatorial = valor;
        for(int i = valor; i > 0; i--) {
            fatorial *= i;
            System.out.println(i + (i !=1 ? "X" : ""));
        }
        System.out.println("=");
        return fatorial;
    }

    public static double imc(double altura, double peso) {
        return 0;
    }

    public static double operador(int valorUm, int valorDois, char operacao) {
        return 0;
    }

    public static int[] notasNecessarias(int valor) {
        return new int[6];
    }
}
