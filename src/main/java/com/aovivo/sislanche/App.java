package com.aovivo.sislanche;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class App {
    static FormaPagamento formaPagamento;
    public static void main(String[] args) {
        boolean continuar = true;
        String nomeProduto,observacoes;
        double preco;
        double peso;
        int numParcelas = 0; 
        double totalConta = 0;
        String [] opcoes = {"sim","finalizar"};
        Integer qtdParcelas [] = {1,2,3,4,5,6,7,8,9,10,12};
        
        List <Produto> produtos = new ArrayList<Produto>(); 
        Cliente cliente = new Cliente();
        cliente.setCpfCliente(
        Long.parseLong(
            JOptionPane.showInputDialog("digite seu cpf")
        )
        );  

        cliente.setNome(
        JOptionPane.showInputDialog("digite seu nome")
        ); 

        cliente.setEndereco(
        JOptionPane.showInputDialog("digite seu endereço")
        ); 

        cliente.setTelefone(
        JOptionPane.showInputDialog("digite seu telefone")
        ); 

        cliente.setEmail(
        JOptionPane.showInputDialog("digite seu Email")
        ); 

        while (continuar) {
            nomeProduto = JOptionPane.showInputDialog("digite o nome do produto:");

            preco = Double.parseDouble(
                JOptionPane.showInputDialog("digite o Preço do produto")
            );

            totalConta += preco;

            peso = Double.parseDouble(
                JOptionPane.showInputDialog("digite o Peso do produto (g)")
            );
            produtos.add(new Produto(nomeProduto,preco,peso));

            continuar = JOptionPane.showOptionDialog(
                null, "deseja inserir mais um produto ?", "titulo",JOptionPane.YES_NO_OPTION,  JOptionPane.QUESTION_MESSAGE, null, opcoes, null
            )  == JOptionPane.YES_OPTION;
            
        }

        Object opcaoSelecionada =JOptionPane.showInputDialog(
            null, "Selecione uma avaliação para o garçom",
            null, JOptionPane.INFORMATION_MESSAGE, null,    
            formaPagamento.values(), formaPagamento.AVISTA
        ); 

        formaPagamento = (FormaPagamento) opcaoSelecionada;

        
        
        totalConta = switch (formaPagamento) {
            case PIX -> totalConta-(totalConta*formaPagamento.getPorcentDescont()); 
            case AVISTA -> totalConta-(totalConta*formaPagamento.getPorcentDescont()); 
            case DEBITO -> totalConta-(totalConta*formaPagamento.getPorcentDescont()); 
            case CREDITO ->{
                numParcelas = (Integer)JOptionPane.showInputDialog(
                    null, "Selecione a quantidade de",
                    null, JOptionPane.QUESTION_MESSAGE, null, 
                    qtdParcelas, null
                );
                yield (totalConta-(totalConta*formaPagamento.getPorcentDescont()));
            }
            default -> 0;
        };
        
        observacoes = JOptionPane.showInputDialog("Acrescente uma  observação");

        Pedido pedido = new Pedido(produtos, cliente, totalConta, formaPagamento.name(), numParcelas, observacoes);

        JOptionPane.showMessageDialog(null, pedido.descricaoPedido(pedido));



    }
}
