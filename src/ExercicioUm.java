import java.util.Scanner;

public class ExercicioUm {

    public static void call(Scanner scanner) {
        System.out.println("=== EXERCÍCIOS - LISTA 1 ===");

        System.out.println("+-------------------------------------------------------+");
        System.out.println("| 1 - Calcule a Média                                   |");
        System.out.println("| 2 - Calcule a Área                                    |");
        System.out.println("| 3 - Calcule o Volume                                  |");
        System.out.println("| 4 - Valor é maior que o dobro de outro valor          |");
        System.out.println("| 5 - Cálculo de Bhaskara                               |");
        System.out.println("| 6 - Velocidade Média                                  |");
        System.out.println("| 7 - Percentual de Imposto                             |");
        System.out.println("| 8 - Valor é par ou ímpar                              |");
        System.out.println("| 9 - Comparar dois valores de String                   |");
        System.out.println("| 10 - Valor double em string e convertido para inteiro |");
        System.out.println("| 11 - Imposto de renda de um salário                   |");
        System.out.println("| 12 - DESAFIO                                          |");
        System.out.println("+-------------------------------------------------------+");

        int menu = 0;
        try {
            menu = scanner.nextInt();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            menu = 0;
        }

        switch (menu) {
            // 1) Crie um programa que calcule a média (`(nota1 + nota2 + nota3 / 3)`)
            case 1:
<<<<<<< HEAD
                media(10, 7.8, 8.7, 6.9);
                break;
            // 2) Crie um programa que calcule a área (`lado1 * lado2`)
            case 2:
                area(12, 32);
                break;
            // 3) Crie um programa que calcule o volume (`largura * altura * profundidade`)
            case 3:
                volume(5, 8, 12);
                break;
            // 4) Crie um programa que avalie se um valor é maior do que o dobro de outro valor
            case 4:
                System.out.println(valorMaiorQueDobro(34, 70) ? "O valor é maior que o dobro" : "O valor não é maior que o dobro");
                break;
            // 5) Crie um programa que calcule _bhaskara_
            case 5:
                bhaskara(7, 5, -8);
                break;
            // 6) Crie um programa que calcule a velocidade média de uma viagem (`distancia (km) / tempo (h)`)
            case 6:
                mediaViagem(1200, 16);
                break;
            // 7) Crie um programa que calcule o percentual de imposto pago (`faturamento \ qtd imposto`)
            case 7:
                percentualImposto(1000, 0.15);
                // percentualImposto(double faturamento, double qtdImposto)
                break;
            // 8) Crie um programa que teste se um valor é par ou ímpar
            case 8:
                parOuImpar(10);
                // parOuImpar(int valor)
                break;
            // 9) Crie um programa que compare dois valores Strings
            case 9:
                compareString("Testando", "Testando");
                // compareString(String stringUm, String stringDois)
                break;
            // 10) Crie um programa que tenha uma variável com ponto em String e converta seu valor para inteiro
            case 10:
                convertString("10.5");
                // convertString(String valor);
=======
            double notaUm=0, notaDois=0, notaTres=0, media2 = 0;
            System.out.println("Calculo da média das notas!");
            System.out.println("Digite as notas do aluno.");
                try {
                    notaUm = scanner.nextDouble();
                    notaDois = scanner.nextDouble();
                    notaTres = scanner.nextDouble();
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                    notaUm = 0;
                    notaDois = 0;
                    notaTres = 0;
                }
                media2 = media(notaUm, notaDois, notaTres);
                System.out.println("A Média final do Aluno é " + media2);
                if (media2 >= 7) {
                    System.out.println("Aluno está aprovado");
                } else {
                    System.out.println("Aluno está reprovado");
                }
                break;
            // 2) Crie um programa que calcule a área (`lado1 * lado2`)
            case 2:
                double area, ladoUm, ladoDois;
                System.out.println("Calcule a área!"); 
                try {
                    ladoUm = scanner.nextDouble();
                    ladoDois = scanner.nextDouble();
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                    ladoUm = 0;
                    ladoDois = 0;
                }
                area(ladoUm, ladoDois);
                break;
            // 3) Crie um programa que calcule o volume (`largura * altura * profundidade`)
            case 3:
                double largura, altura, profundidade, volumes;
                System.out.println("Realize o cálculo do volume em m³");
                try {
                    largura = scanner.nextDouble();
                    altura = scanner.nextDouble();
                    profundidade = scanner.nextDouble();
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                    largura = 0;
                    altura = 0;
                    profundidade = 0;
                }                
                volumes = volume(largura, altura, profundidade);
                System.out.println("O cálculo do volume é " + volumes + " m³");
                break;
            // 4) Crie um programa que avalie se um valor é maior do que o dobro de outro valor
            case 4:
                int base=0, verificar=0;
                try {
                    System.out.println("Digite o valor da base!");
                    base = scanner.nextInt();
                    System.out.println("Digite o valor a ser verificado!");
                    verificar = scanner.nextInt();
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                    base = 0;
                    verificar = 0;
                }  
                System.out.println("Identifique se o valor final é maior que o dobro de " + base + " !");
                System.out.println(valorMaiorQueDobro(base, verificar) ? "O valor é maior que o dobro" : "O valor não é maior que o dobro");
                break;
            // 5) Crie um programa que calcule _bhaskara_
            case 5:
                // a=7, b=5, c= -8;
                int a=0, b=0, c=0;
                try {
                    System.out.println("Digite o valor de A!");
                    a = scanner.nextInt();
                    System.out.println("Digite o valor de B!");
                    b = scanner.nextInt();
                    System.out.println("Digite o valor de C!");
                    c = scanner.nextInt();
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                    a = 0;
                    b = 0;
                    c = 0;
                }  
                bhaskara(a, b, c);
                System.out.println("O valor de A é " + a + " o valor de B é " + b + " o valor de C é " + c + ".");
                break;
            // 6) Crie um programa que calcule a velocidade média de uma viagem (`distancia (km) / tempo (h)`)
            case 6:
                double distancia=0, tempo=0, mediaDaViagem=0;
                System.out.println("Calcule a media de km/h realizado na viagem!");
                try {
                    System.out.println("Digite a distancia da viagem em m!");
                    distancia = scanner.nextInt();
                    System.out.println("Digite o tempo da viagem em horas!");
                    tempo = scanner.nextInt();
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                    distancia = 0;
                    tempo = 0;
                } 
                mediaDaViagem = mediaViagem(distancia, tempo);
                System.out.println("A média feita durante a viagem foi de " + mediaDaViagem + " km/h.");
                break;
            // 7) Crie um programa que calcule o percentual de imposto pago (`faturamento \ qtd imposto`)
            case 7:
                double faturamento, qtdImposto, percentualImposto=0;
                System.out.println("Calcule o imposto cobrado pelo faturamento anual de uma empresa.");
                try {
                    System.out.println("Digite o valor faturado!");
                    faturamento = scanner.nextInt();
                    System.out.println("Digite o valor do imposto cobrado");
                    qtdImposto = scanner.nextInt();
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                    faturamento = 0;
                    qtdImposto = 0;
                } 
                System.out.println(" O Valor faturado foi de R$ " + faturamento + ".");
                System.out.println(" O valor do imposto cobrado foi de R$ " + qtdImposto + ".");
                percentualImposto(faturamento, qtdImposto);
                System.out.println("O imposto anual retido desta empresa foi de " + percentualImposto + "%.");
                break;
            // 8) Crie um programa que teste se um valor é par ou ímpar
            case 8:
                System.out.println("Descubra se o valor é par ou impar.");
                int valor=38;
                System.out.println(parOuImpar(38) ? "O número " + valor + " é Par!" : "O número " + valor + " é Impar!");
                break;
            // 9) Crie um programa que compare dois valores Strings
            case 9:
                System.out.println("Compare os valores das strings");
                compareString("Pão com Mel", "Rocambole de alface");
                break;
            // 10) Crie um programa que tenha uma variável com ponto em String e converta seu valor para inteiro
            case 10:
                System.out.println("Converta uma String de numero com ponto para um valor Int.");
                String numero = "5.5";
                System.out.println("O valor convertido é " + convertString(numero) + " inteiro.");
>>>>>>> a848534f95c57878a6a68a8214c0a3a8ae808901
                break;
            // 11) Crie um programa que receba o salário e diga o valor de imposto de renda conforme abaixo:
            // Base                     | Alíquota
            // ---------                | ------
            // Até 1.903,98             | Isento
            // De 1.903,99 até 2.826,65 | 7,5%
            // De 2.826,66 até 3.751,05 | 15%
            // De 3.751,06 até 4.664,68 | 22,5%
            // Acima de 4.664,68        | 27,5%
            case 11:
<<<<<<< HEAD
                percentualImpostoSalario(1980);
=======
            double salario;
                System.out.println("Calcule o imposto de renda do salário R$ " + (salario = 2750.00) + ".");
>>>>>>> a848534f95c57878a6a68a8214c0a3a8ae808901
                // percentualImpostoSalario(double salario);
                break;
            // DESAFIO - Crie um programa que teste se um número é primo
            case 12:
                testePrimo(15);

                break;
            default:
                System.out.println("Operação inválida");
                break;
        }
    }

<<<<<<< HEAD
    public static double media(double notaUm, double notaDois, double notaTres, double notaQuatro) {
        System.out.println("Calculo da média das notas");
        double media = (notaUm + notaDois + notaTres + notaQuatro) / 4;
        System.out.println("A Média final do Aluno é " + media);
        if (media >= 7) {
            System.out.println("Aluno está aprovado");
        } else {
            System.out.println("Aluno está reprovado");
        }
        return 0;
    }

    public static double area(double ladoUm, double ladoDois) {
        System.out.println("Calculo área!");
        double area = ladoUm * ladoDois;
        System.out.println("A area total é " + area + " m²");
        return 0;
    }

    public static double volume(double largura, double altura, double profundidade) {
        System.out.println("Realize o cálculo do volume m³");
        double volume = largura * altura * profundidade;
        System.out.println("O cálculo do volume é " + volume + " m³");
        return 0;
    }

    public static boolean valorMaiorQueDobro(double base, double verificar) {
        System.out.println("Identifique se o valor final é maior que o dobro de " + base + " !");
        if (base*2 < verificar) {
            return true;
        }

=======
    public static double media(double notaUm, double notaDois, double notaTres) {
        double media = (notaUm + notaDois + notaTres) / 3;
        return media;
    }

    public static double area(double ladoUm, double ladoDois) {
        double area = ladoUm * ladoDois;
        return area;
    }

    public static double volume(double largura, double altura, double profundidade) {
        double volume = largura * altura * profundidade;
        return volume;
    }

    public static boolean valorMaiorQueDobro(double base, double verificar) {
        if (base*2 < verificar) {
            return true;
        }
>>>>>>> a848534f95c57878a6a68a8214c0a3a8ae808901
        return false;
    }

    public static double[] bhaskara(int a, int b, int c) {
        double delta = (b * b)-4 * a * c;
        double[] bhaskara = new double[]{0,0};
        bhaskara[0]= ((b* -1)+ Math.sqrt(delta))/2*a;
        bhaskara[1]= ((b* -1)- Math.sqrt(delta))/2*a;
<<<<<<< HEAD
        System.out.println("O valor de A é " + a + " o valor de B é " + b + " o valor de C é " + c + "o x| é " + bhaskara[0] + " e o x|| é " + bhaskara[1]);
=======
        System.out.println("Então " + "o x| é " + bhaskara[0] + " e o x|| é " + bhaskara[1] + ".");
>>>>>>> a848534f95c57878a6a68a8214c0a3a8ae808901
        return bhaskara;
    }

    public static double mediaViagem(double distancia, double tempo) {
<<<<<<< HEAD
        System.out.println("Calcule a média de km/h feita na viagem");
        double mediaViagem = distancia / tempo;
        System.out.println("Foi realizado uma média de " + mediaViagem + " km/H");
        
        return 0;
    }

    public static double percentualImposto(double faturamento, double qtdImposto) {
        System.out.println("Calcule o percentual de imposto pago");
        double percentualImposto = faturamento * qtdImposto;
        System.out.println("O percentual de imposto pago é " + percentualImposto);
        return 0;
    }

    public static void parOuImpar(int valor) {
        System.out.println("Verifique se o valor é par ou ímpar");
        if (valor % 2 == 0) {
            System.out.println("O valor é par");
        } else {
            System.out.println("O valor é ímpar");
        }
    }

    public static void compareString(String stringUm, String stringDois) {
        System.out.println("Compare duas strings");
        if (stringUm.equals(stringDois)) {
            System.out.println("As strings são iguais");
        } else {
            System.out.println("As strings são diferentes");
        }
    }

    public static void convertString(String valor) {
        System.out.println("Converta o valor para inteiro");
        int valorConvertido = Integer.parseInt(valor);
        System.out.println("O valor convertido é " + valorConvertido);
    }

    public static void percentualImpostoSalario(double salario) {
        System.out.println("Calcule o percentual de imposto pago");
        if (salario <= 1903.98) {
            System.out.println("Isento");
        } else if (salario >= 1903.99 && salario <= 2826.65) {
            System.out.println("7,5%");
        } else if (salario >= 2826.66 && salario <= 3751.05) {
            System.out.println("15%");
        } else if (salario >= 3751.06 && salario <= 4664.68) {
            System.out.println("22,5%");
        } else if (salario >= 4664.69) {
            System.out.println("27,5%");
        }
    }
    
    public static void testePrimo(int valor) {
        System.out.println("Teste se o valor é primo");
        if (valor % 2 == 0) {
            System.out.println("O valor é primo");
        } else {
            System.out.println("O valor não é primo");
        }
=======
        double mediaViagem = distancia / tempo;
        return mediaViagem;
    }

    public static double percentualImposto(double faturamento, double qtdImposto) {
        double percentualImposto = (qtdImposto * 100) / faturamento;
        return percentualImposto;
    }

    public static boolean parOuImpar(int valor) {
        if ( valor % 2 == 0 )
            return true;
        else
            return false;
    }

    public static boolean compareString(String stringUm, String stringDois) {
        boolean retorno = stringUm.equals(stringDois);
        System.out.println(retorno);
        return retorno;
    }

    public static int convertString(String numero) {
        double converteParaNumero = Double.parseDouble(numero); 
        int convertido = (int) converteParaNumero;
        return convertido;
    }

    public static double percentualImpostoSalario(double salario) {
        double valorIr = salario;
        // Até 1.903,98             | Isento
            // De 1.903,99 até 2.826,65 | 7,5%
            // De 2.826,66 até 3.751,05 | 15%
            // De 3.751,06 até 4.664,68 | 22,5%
            // Acima de 4.664,68        | 27,5%
        if (valorIr < 1903.98) {
            System.out.println("Você é isento ao Imposto de Renda.");

        } else if (valorIr >= 1903.98 && valorIr < 2826.65) {
                System.out.println("Você terá 7.5% de imposto. O valor a ser descontado é de R$ " + valorIr * 0.075 + " reais.");

            } else if (valorIr >= 2826.65 && valorIr < 3751.05) {
                    System.out.println("Você terá 15% de imposto. O valor a ser descontado é de R$ " + valorIr * 0.15 + " reais.");

                } else if (valorIr >= 3751.05 && valorIr < 4664.68) {
                        System.out.println("Você terá 22,5% de imposto. O valor a ser descontado é de R$ " + valorIr * 0.225 + " reais.");

                    } else
                        System.out.println("Você terá 27,5% de imposto. O valor a ser descontado é de R$ " + valorIr * 0.275 + " reais.");
        return -1;
    }

    public static boolean testePrimo(int valor) {
        for(int i = 2; i < valor; i++) {
            if(valor % i == 0) {
                return false;
            }
        }
        return true ;
>>>>>>> a848534f95c57878a6a68a8214c0a3a8ae808901
    }

}