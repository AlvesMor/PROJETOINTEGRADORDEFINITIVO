package projetointegrador2;

import java.util.Scanner;

public class ProjetoIntegrador2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int sairPeca = 0;

        int opcao, sessaoEscolhida, pecaEscolhida, areaEscolhida, frisaEscolhida, camaroteEscolhido, poltrona;

        long CPF = 0;

        // String plateiaA[][] = new String[5][5]; 
        String[][] plateiaA = {{"00", "01", "02", "03", "04"}, {"10", "11", "12", "13", "14"}, {"20", "21", "22", "23", "24"}, {"30", "31", "32", "33", "34"}, {"40", "41", "42", "43", "44"}};
        int qtdIngressoPlateiaA = 0, valorIngressoPlateiaA = 40;

        long pedidos[][] = new long[100][6];

        int plateiaB[][] = new int[10][10];
        int qtdIngressoPlateiaB = 0, valorIngressoPlateiaB = 60;
        int frisas[][] = new int[6][5]; //cada linha representa uma frisa e as colunas sua posição;
        int qtdIngressoFrisa = 0, valorIngressoFrisa = 120;
        int camarotes[][] = new int[5][10]; //cada linha representa um camarote e as colunas sua posição;
        int qtdIngressoCamarote = 0, valorIngressoCamarote = 80;
        int balcaoNobre[][] = new int[5][10];  //cada linha representa um balcao e as colunas sua posição;
        int qtdIngressoBalcao = 0, valorIngressoBalcao = 250;

        boolean pecaEscolhida1 = true;
        boolean areaEscolhida1 = true;
        boolean sessaoEscolhida1 = true;
        boolean sairPrograma = true;
        boolean opcao1 = true;
        
        
        
        
        
        
        
        
        
        
        
        while (sairPrograma) {

            System.out.println("Bem vindo ao Teatro ABC, por favor escolha uma opção: ");
            System.out.println("1 - Comprar Ingressos");
            System.out.println("2 - Imprimir Ingressos");
            System.out.println("3 - Estatistica de vendas");
            System.out.println("0 - Sair do programa");
            System.out.print("Opção: ");
            opcao = ler.nextInt();

            int validacao = 0;

            switch (opcao) {
                case 1:
                    while (validacao == 0) {

                        int dig1, dig2, dig3, dig4, dig5, dig6, dig7, dig8, dig9, dig10, dig11;
                        int Verificador01, RestoVerificador01, DigVerificador01;
                        int Verificador02, RestoVerificador02, DigVerificador02;

                        System.out.println("Digite o CPF:");
                        CPF = ler.nextLong();

                        //Usamos CASTING refere-se à conversão de um valor de um tipo de dado para outro.
                        dig1 = (int) (CPF / 10000000000L % 10);
                        dig2 = (int) (CPF / 1000000000 % 10);
                        dig3 = (int) (CPF / 100000000 % 10);
                        dig4 = (int) (CPF / 10000000 % 10);
                        dig5 = (int) (CPF / 1000000 % 10);
                        dig6 = (int) (CPF / 100000 % 10);
                        dig7 = (int) (CPF / 10000 % 10);
                        dig8 = (int) (CPF / 1000 % 10);
                        dig9 = (int) (CPF / 100 % 10);
                        dig10 = (int) (CPF / 10 % 10);
                        dig11 = (int) (CPF % 10);

                        //PRIMEIRO DÍGITO VERIFICADOR
                        //Consideramos como quociente apenas o valor inteiro.
                        Verificador01 = (dig1 * 10) + (dig2 * 9) + (dig3 * 8) + (dig4 * 7) + (dig5 * 6) + (dig6 * 5) + (dig7 * 4) + (dig8 * 3) + (dig9 * 2);

                        // Pegamos o resultado obtido e dividimos por 11.
                        // Se o resto da divisão for menor que 2, então o dígito é igual a 0 (Zero).
                        // Se o resto da divisão for maior ou igual a 2, então o dígito verificador é igual a 11 menos o resto da divisão (11 - resto).
                        RestoVerificador01 = Verificador01 % 11;

                        if (RestoVerificador01 < 2) {
                            DigVerificador01 = 0;
                        } else {
                            DigVerificador01 = 11 - RestoVerificador01;
                        }

                        //SEGUNDO DÍGITO VERIFICADOR
                        //Para calcular o segundo dígito verificadr usaremos o primeiro dígito já calculado
                        Verificador02 = (dig1 * 11) + (dig2 * 10) + (dig3 * 9) + (dig4 * 8) + (dig5 * 7) + (dig6 * 6) + (dig7 * 5) + (dig8 * 4) + (dig9 * 3) + (DigVerificador01 * 2);

                        // Pegamos o resultado obtido e dividimos por 11.
                        // Se o resto da divisão for menor que 2, então o dígito é igual a 0 (Zero).
                        // Se o resto da divisão for maior ou igual a 2, então o dígito verificador é igual a 11 menos o resto da divisão (11 - resto).
                        RestoVerificador02 = Verificador02 % 11;

                        if (RestoVerificador02 < 2) {
                            DigVerificador02 = 0;
                        } else {
                            DigVerificador02 = 11 - RestoVerificador02;
                        }

                        //VALIDAÇÃO
                        if (DigVerificador01 == dig10 && DigVerificador02 == dig11) {
                            System.out.println("O NUMERO DE CPF É VÁLIDO!");
                            validacao++;
                            System.out.print(dig1);
                            System.out.print(dig2);
                            System.out.print(dig3 + ".");
                            System.out.print(dig4);
                            System.out.print(dig5);
                            System.out.print(dig6 + ".");
                            System.out.print(dig7);
                            System.out.print(dig8);
                            System.out.print(dig9 + "-");
                            System.out.print(dig10);
                            System.out.println(dig11);
                        } else {
                            System.out.println("O NUMERO DE CPF É INVÁLIDO!");
                        }

                    }
                    while (opcao1) {
                        System.out.println("Escolha a sessão: ");
                        System.out.println("1 - Manhã");
                        System.out.println("2 - Tarde");
                        System.out.println("3 - Noite");
                        System.out.println("4 - Finalizar compra");
                        System.out.println("0 - Voltar ao menu principal");
                        System.out.print("Opção: ");
                        sessaoEscolhida = ler.nextInt();
                        if (sessaoEscolhida == 0) {
                            sairPrograma = false;
                        }
                        while (sessaoEscolhida1) {
                            switch (sessaoEscolhida) {

                                case 1: // manhã
                                    sessaoEscolhida1 = true;
                                    System.out.println("Escolha uma peça: ");
                                    System.out.println("1 - Primeira peça");
                                    System.out.println("2 - Segunda peça");
                                    System.out.println("3 - Terceira peça");
                                    System.out.println("0 - Voltar ao menu principal");
                                    System.out.print("Opção: ");
                                    pecaEscolhida = ler.nextInt();
                                    if (pecaEscolhida == 0) {
                                        sessaoEscolhida1 = false;
                                    }

                                    while (pecaEscolhida1) {
                                        switch (pecaEscolhida) {
                                            case 1: //primeira peça
                                                pecaEscolhida1 = true;
                                                System.out.println("Escolha uma área: ");
                                                System.out.println("1 - Plateia A");
                                                System.out.println("2 - Plateia B");
                                                System.out.println("3 - Frisa");
                                                System.out.println("4 - Camarote");
                                                System.out.println("5 - Balcão Nobre");
                                                System.out.println("0 - Voltar ao menu principal");
                                                System.out.print("Opção: ");
                                                areaEscolhida = ler.nextInt();
                                                if (areaEscolhida == 0) {
                                                    pecaEscolhida1 = false;
                                                }
                                                while (areaEscolhida1) {
                                                    switch (areaEscolhida) {
                                                        case 1:
                                                            areaEscolhida1 = true;

                                                            System.out.println("Digite a posição desejada: ");
                                                            for (int k = 0; k < 5; k++) {
                                                                for (int j = 0; j < 5; j++) {
                                                                    System.out.print(plateiaA[k][j] + " ");
                                                                }
                                                                System.out.println();
                                                            }
                                                            poltrona = ler.nextInt();
                                                            int linhaPA = poltrona / 10;
                                                            int colunaPA = poltrona % 10;
                                                            System.out.println("Posição escolhida: " + linhaPA + " - " + colunaPA);
                                                            plateiaA[linhaPA][colunaPA] = "X "; //aqui eu quero substituir o valor da matriz por um "X" para representar que a poltrona ja foi selecionada

                                                            System.out.println("Pedido finalizado com sucesso!" + "CPF: " + CPF + "|| Sessão: " + sessaoEscolhida + "|| Area: " + areaEscolhida + "||poltrona: " + poltrona);

                                                            areaEscolhida1 = false;
                                                            break;
                                                        case 2:
                                                            break;
                                                        case 3:
                                                            break;
                                                        case 4:
                                                            break;
                                                        case 5:
                                                            break;
                                                        case 0:
                                                            areaEscolhida1 = false;
                                                            pecaEscolhida1 = false;
                                                            break;
                                                        default:
                                                    }
                                                }
                                                break;
                                            case 2: //segunda peça
                                                break;
                                            case 3: //terceira peça
                                                break;
                                            case 0: // encerrar while
                                                sessaoEscolhida1 = false;
                                                pecaEscolhida1 = false;
                                                break;
                                            default:
                                        }
                                    }
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    break;
                                case 0:
                                    sessaoEscolhida1 = false;
                                    break;
                                default:

                            }
                        }
                    }

                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    sairPrograma = false;
                    opcao1 = false;
                    break;
                default:
            }
        }

    }

}
