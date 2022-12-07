import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class ExercicioTres {
    public static void call(Scanner scanner) {
        System.out.println("=== EXERCÍCIOS - LISTA 3 ===");

        System.out.println("+-------------------------------------------------------+");
        System.out.println("| 1 - Tabuada com Arquivo                               |");
        System.out.println("| 2 - Ler e imprimir arquivo de texto                   |");
        System.out.println("| 3 - Operações básicas com a Main                      |");
        System.out.println("| 4 - Exponenciação com Precisão Arbitrária             |");
        System.out.println("| 5 - Nome aleatório de 5 pessoas                       |");
        System.out.println("| 6 - Calcular Raio e Área                              |");
        System.out.println("| 7 - Avaliar se TXT tem JAVA                           |");
        System.out.println("| 8 - 10 primeiros dígitos                              |");
        System.out.println("| 9 - Área com a Main                                   |");
        System.out.println("| 10 - Receba nome de arquivo na Main com valores       |");
        System.out.println("| 11 - Ler e imprimir arquivo de texto                  |");
        System.out.println("+-------------------------------------------------------+");

        int menu = 0;
        try {
            menu = scanner.nextInt();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            menu = 0;
        }

        switch (menu) {
            // 1) Crie um programa que receba um valor e calcule a tabuada deste valor, salvando seu resultado em um arquivo de texto.
            case 1:
<<<<<<< HEAD
                // tabuada(int number);
                tabuada(menu);
=======
                System.out.println("Imprimindo a tabuada!");
                System.out.println("Digite o valor que você deseja saber a tabuada");
                int numero = scanner.nextInt();
                System.out.println(numero);
                tabuada(numero);

                System.out.println("Foi gerado um novo documento com os valores recebidos de forma ordenada!");
                System.out.println("O arquivo gerado foi: arquivoOrdenado.txt");
        
>>>>>>> a848534f95c57878a6a68a8214c0a3a8ae808901
                break;
            // 2) Crie um programa que leia e imprima no console todas as linhas de um arquivo de texto.
            case 2:
                // lerArquivoTexto(String arquivo);
                lerArquivoTexto(String arquivo);
                break;
            // 3) Crie um programa que receba como entrada da classe Main dois valores numéricos e calcule as operações básicas com eles.
            case 3:
                // operacoesBasicas(int numeroUm, int numeroDois)
                operacoesBasicas(int numeroUm, int numeroDois);
                break;
            // 4) Crie um programa que execute uma operação de Exponenciação com o valor inteiro com precisão arbitrária.
            case 4:
                // bigIntExpo(BigInteger base, int pow);
                bigIntExpo(BigInteger base, int pow);
                break;
            // 5) Crie um programa que receba o nome de 5 pessoas e aleatorize eles.
            case 5:
                // aleatorizarPessoas();
                aleatorizarPessoas();
                break;
            // 6) Crie um programa que calcule o raio e a área de uma circunferência (`C = 2πr` e `A = π(r²)`).
            case 6:
                // areaECircunferencia(double raio);
                areaECircunferencia(double raio);
                break;
            // 7) Crie um programa que avalie se um arquivo de texto possui a string "JAVA".
            case 7:
                // hasJava(String arquivo);
                hasJava(String arquivo);
                break;
            // 8) Crie um programa que leia as linhas de um arquivo e imprima no console apenas os 10 primeiros digitos de cada linha.
            case 8:
                // dezDigitos()
                dezDigitos()
                break;
            // 9) Crie um programa que receba como entrada da classe Main dois valores numéricos e calcule a área dos valores (`area = lado1 * lado2`).
            case 9:
                // calculaArea(double numeroUm, double numeroDois);
                calculaArea(double numeroUm, double numeroDois);
                break;
            // 10) Crie um programa que receba como entrada da classe Main o nome de um arquivo de texto que contenha valores numéricos e some todos os valores, imprimindo no console a soma.
            case 10:
                // somaValoresArquivo(String arquivo);
                somaValoresArquivo(String arquivo);
                break;
            // ## DESAFIO - Crie um Jogo da Forca com Arquivos de Texto**
            case 11:
                // forcaComTxt();
                forcaComTxt();
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }
        
    }

<<<<<<< HEAD
    public static void tabuada(int number) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("tabuada.txt"));
            for (int i = 0; i <= 10; i++) {
                writer.write(number + " x " + i + " = " + (number * i));
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
=======

    public static void tabuada(int number) {
        try {
            /*String fileName = "tabuada";
            String extension = ".txt";
            boolean isExists = false;
            int contador = 0;
            String name = "";
            do {
                name = fileName + (contador > 0 ? "(" +contador+ ")" : "") + extension;
                File file = new File(name);
                contador++;
                isExists = file.exists();
            } while (isExists);*/
            String name = "tabuada.txt";
            String content = "";
            String line = "";

            File file = new File(name);
            if (file.exists()) {
                BufferedReader leitura = new BufferedReader(new FileReader(name));
                do {
                    line = leitura.readLine();
                    content += line != null ? line + "\n" : "";
                } while (line != null);
                leitura.close();
            }

            BufferedWriter escreve = new BufferedWriter(new FileWriter(name));
            escreve.append(content);
            escreve.newLine();
            escreve.append("Imprimindo a tabuada de " + number); // append é um método que é usado para anexar a representação de string do argumento booleano a uma determinada sequência.
            escreve.newLine();
            for(int i = 0; i <= 10; i++) {
                escreve.append(" >> " + number + " * " + i + " = " + (number*i));  // adicionando linha com /n
                escreve.newLine();
            }
            escreve.close();
        } catch (Exception e) {
            // TODO: handle exception
>>>>>>> a848534f95c57878a6a68a8214c0a3a8ae808901
        }
    }

    public static void lerArquivoTexto(String arquivo) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(arquivo));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void operacoesBasicas(int numeroUm, int numeroDois) {
        System.out.println("Soma: " + (numeroUm + numeroDois));
        System.out.println("Subtração: " + (numeroUm - numeroDois));
        System.out.println("Multiplicação: " + (numeroUm * numeroDois));
        System.out.println("Divisão: " + (numeroUm / numeroDois));
    }

    public static void bigIntExpo(BigInteger base, int pow) {
        System.out.println(base.pow(pow));
    }

    public static void aleatorizarPessoas() {
        String[] pessoas = new String[5];
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Digite o nome da pessoa " + (i + 1));
            Scanner scanner = new Scanner(System.in);
            pessoas[i] = scanner.next();
        }
        System.out.println("Pessoas aleatorizadas:");
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println(pessoas[(int) (Math.random() * pessoas.length)]);
        }
    }

    public static void areaECircunferencia(double raio) {
        System.out.println("Circunferência: " + (2 * Math.PI * raio));
        System.out.println("Área: " + (Math.PI * Math.pow(raio, 2)));
    }

    public static void hasJava(String arquivo) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(arquivo));
            String line = reader.readLine();
            while (line != null) {
                if (line.contains("JAVA")) {
                    System.out.println("O arquivo contém a palavra JAVA");
                    reader.close();
                    return;
                }
                line = reader.readLine();
            }
            System.out.println("O arquivo não contém a palavra JAVA");
            reader.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void dezDigitos() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("arquivo.txt"));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line.substring(0, 10));
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void calculaArea(double numeroUm, double numeroDois) {
        System.out.println("Área: " + (numeroUm * numeroDois));
    }

    public static void somaValoresArquivo(String arquivo) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(arquivo));
            String line = reader.readLine();
            int soma = 0;
            while (line != null) {
                soma += Integer.parseInt(line);
                line = reader.readLine();
            }
            System.out.println("Soma: " + soma);
            reader.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void forcaComTxt() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("palavras.txt"));
            String line = reader.readLine();
            String[] palavras = new String[10];
            int i = 0;
            while (line != null) {
                palavras[i] = line;
                line = reader.readLine();
                i++;
            }
            reader.close();
            String palavra = palavras[(int) (Math.random() * palavras.length)];
            char[] letras = palavra.toCharArray();
            char[] letrasDescobertas = new char[letras.length];
            for (int j = 0; j < letrasDescobertas.length; j++) {
                letrasDescobertas[j] = '_';
            }
            int tentativas = 0;
            while (tentativas < 6) {
                System.out.println("Tentativas: " + tentativas);
                System.out.println("Palavra: " + new String(letrasDescobertas));
                System.out.println("Digite uma letra");
                Scanner scanner = new Scanner(System.in);
                char letra = scanner.next().charAt(0);
                boolean acertou = false;
                for (int j = 0; j < letras.length; j++) {
                    if (letras[j] == letra) {
                        letrasDescobertas[j] = letra;
                        acertou = true;
                    }
                }
                if (!acertou) {
                    tentativas++;
                }
                if (new String(letrasDescobertas).equals(palavra)) {
                    System.out.println("Você acertou a palavra!");
                    return;
                }
            }
            System.out.println("Você perdeu!");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}