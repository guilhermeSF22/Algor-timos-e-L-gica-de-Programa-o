package trabalhoFinal;

import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {

		 imprimeMenu();
    }

    static void imprimeBoasVindas(String nome) {
        System.out.println("Bem vindo! " + nome);
    }

    static void imprimeMenu() {
        Scanner teclado = new Scanner(System.in);
        int opcao = 999;
        System.out.println("Quantos cadastros deseja validar: ");
        int cadastros = teclado.nextInt();

        // Consumir quebra de linha
        teclado.nextLine();

        int contador = 1;
        while (contador <= cadastros) {
            System.out.println("Informe os dados do " + contador + "º cadastro:");

            System.out.println("Qual o nome? ");
            String nome = teclado.nextLine();
            imprimeBoasVindas(nome);

            while (opcao != 3) {
                System.out.println(nome + ", escolha a opção desejada:");
                System.out.println(
                		"0 - Corrigir o nome \n" +
                        "1 - Descobrir seu signo \n" +
                        "2 - Descobrir a estação do seu nascimento \n" +
                        "3 - Encerrar o programa \n" +
                        "Escolha sua opção: ");
                opcao = teclado.nextInt();

                switch (opcao) {
                    case 0:
                        teclado.nextLine();
                        System.out.println("Informe seu nome: ");
                        nome = teclado.nextLine();
                        break;

                    case 1:
                        informarDataNascimento(teclado, nome);
                        break;

                    case 2:
                        System.out.print("Informe o mês do seu nascimento: ");
                        int mesNascimento = teclado.nextInt();
                        System.out.println("Você nasceu na estação " + descobreEstacao(mesNascimento));
                        break;

                    case 3:
                        System.out.println("Programa encerrado. Até logo!");
                        break;

                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                        break;
                }
            }

            // Consumir quebra de linha
            teclado.nextLine();

            opcao = 999; // Resetar opcao para o próximo cadastro
            contador++;
        }

        teclado.close();
    }
        
    static String descobreEstacao(int mes) {
        String estacao = "";

        switch (mes) {
            case 12:
            case 1:
            case 2:
                estacao = "Verão";
                break;
            case 3:
            case 4:
            case 5:
                estacao = "Outono";
                break;
            case 6:
            case 7:
            case 8:
                estacao = "Inverno";
                break;
            case 9:
            case 10:
            case 11:
                estacao = "Primavera";
                break;
            default:
                System.out.println("Opção inválida! ");
        }

        return estacao;
    }

    static String descobreSigno(int dia, int mes) {
        String signo = "";

        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            signo = "Áries";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            signo = "Touro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            signo = "Gêmeos";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            signo = "Câncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            signo = "Leão";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            signo = "Virgem";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            signo = "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            signo = "Escorpião";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            signo = "Sagitário";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            signo = "Capricórnio";
        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            signo = "Aquário";
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            signo = "Peixes";
        } else {
            System.out.println("Data de nascimento inválida!");
        }

        return signo;
    }

    public static boolean verificaDataInvalida(int dia, int mes, int ano) {
        boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

        if (mes < 1 || mes > 12) {
            return true;
        }

        int diasNoMes;
        switch (mes) {
            case 2:
                diasNoMes = bissexto ? 29 : 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diasNoMes = 30;
                break;
            default:
                diasNoMes = 31;
                break;
        }

        return dia < 1 || dia > diasNoMes;
    }

     static void informarDataNascimento(Scanner teclado, String nome) {
        boolean dataValida = false;

        while (!dataValida) {
            System.out.print("Informe o dia do seu nascimento: ");
            int dia = teclado.nextInt();
            System.out.print("Informe o mês do seu nascimento: ");
            int mes = teclado.nextInt();
            System.out.print("Informe o ano do seu nascimento: ");
            int ano = teclado.nextInt();

            dataValida = !verificaDataInvalida(dia, mes, ano);

            if (!dataValida) {
                System.out.println("Data de nascimento inválida! Tente novamente.");
            } else {
                System.out.println("Seu signo é: " + descobreSigno(dia, mes));
            }
        }
     }
}


		

