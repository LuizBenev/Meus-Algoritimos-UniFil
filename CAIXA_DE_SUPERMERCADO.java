import java.util.Scanner;

public class CAIXA_DE_SUPERMERCADO {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nomeCliente, nomeProduto, formaDePagamento;
        double valorTotalFinal = 0.0, valorTotalbruto = 0.0, valorTotalDeDesconto = 0.0;
        double valorUnitario, valorBruto, desconto = 0.0, valorDeDesconto = 0.0;
        int quantidade, menuPagamento, payDinheiro = 0, payPix = 0, payCartao = 0;

        for (int i = 0; i < 3; i++) {

            System.out.println("Informe seu nome:");
            nomeCliente = teclado.nextLine();
            System.out.println("Informe o nome do produto:");
            nomeProduto = teclado.nextLine();
            System.out.println("Informe o valor unitario do produto:");
            valorUnitario = Double.parseDouble(teclado.nextLine());
            System.out.println("Informe a quantidade que está comprado:");
            quantidade = Integer.parseInt(teclado.nextLine());

            valorBruto = valorUnitario * quantidade;

            System.out.println("\n-----Formas De Pagamento-----\n\n");
            System.out.println("(1) - Dinheiro (10% de desconto)");
            System.out.println("(2) - Pix (5% de desconto)");
            System.out.println("(3) - Cartão (desconto indisponivel)");
            System.out.println("Digite a opção desejada:");
            menuPagamento = Integer.parseInt(teclado.nextLine());

            switch (menuPagamento) {

                case 1:
                    desconto = valorBruto * 0.10;
                    formaDePagamento = "Dinheiro";
                    payDinheiro++;
                    break;
                case 2:
                    desconto = valorBruto * 0.05;
                    formaDePagamento = "Pix";
                    payPix++;
                    break;
                case 3:
                    formaDePagamento = "Cartão";
                    payCartao++;
                    break;
                default:
                    System.out.println("Forma de pagamento invalda :(\n" +
                            "(Aplicando padrão)");
                    formaDePagamento = "Cartão";
                    payCartao++;
            }
            valorDeDesconto = valorBruto - desconto;

            System.out.println("\n-----Confira Sua Compra-----\n\n");
            System.out.println("Seu Nome:" + nomeCliente);
            System.out.println("Produto Selecionado:" + nomeProduto);
            System.out.println("Quantidade:" + quantidade);
            System.out.println("Valor Sem Desconto: R$ " + valorBruto);
            System.out.println("Desconto Aplicado; R$ " + desconto);
            System.out.println("Valor Final: R$ " + valorDeDesconto);
            System.out.println("Forma de pagamento " + formaDePagamento + "\n\n");

            valorTotalbruto = valorTotalbruto + valorBruto;
            valorTotalDeDesconto = valorTotalDeDesconto + desconto;
            valorTotalFinal = valorTotalFinal + valorDeDesconto;
        }
        System.out.println("\n-----Fechamento De Caixa-----\n\n");
        System.out.println("Total Bruto: R$ " + valorTotalbruto);
        System.out.println("Total De Descontos: R$ " + valorTotalDeDesconto);
        System.out.println("Total Arrecadado: R$ " + valorTotalFinal + "\n\n");
        System.out.println("-----Formas De Pagamento-----\n\n");
        System.out.println("Dinheiro: " + payDinheiro);
        System.out.println("Pix: " + payPix);
        System.out.println("Cartão: " + payCartao);

        teclado.close();
    }
}
