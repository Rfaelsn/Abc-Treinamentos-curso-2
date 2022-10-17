package com.aovivo.sisrestaurante;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class WassabiApp {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        boolean continuar = true;
        String [] opcoesContinuaProd = {"sim","finalizar"};
        String [] opcoesClassificProd = {"Promoção","Entradas","Temaki Especial","Holl Wassabi"};
        String [] opcoesMenuConfirm = {"Editar Pedido", "Deletar Produto","Consultar Pedido","descartar Pedido","Finalizar Pedido"};
        String selectClassificProd;
        cliente.setCpf(
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

        cliente.setCardCredito(
        JOptionPane.showInputDialog("digite o número do seu cartão de crédito")
        ); 

        Pedido pedido = new Pedido();
        pedido.setCliente(cliente);

        Produto produto = null;

        List <String> listaProdSelect = new ArrayList<>();
        List <Promocao>produtosPromocao = new ArrayList<>();
        List <Entrada>produtosEntrada = new ArrayList<>();
        List <TemakiEspecial> produtosTemakiEsp = new ArrayList<>();
        List <HollWassabi> produtosHollWassabi = new ArrayList<>();

        while (continuar) {
            selectClassificProd = (String) JOptionPane.showInputDialog(
                null, "Selecione a Categoria de Produto",
                null, JOptionPane.QUESTION_MESSAGE, null, 
                opcoesClassificProd, null
            );
            

            switch (selectClassificProd) {

                case "Promoção"->{ 
                    produto = new Promocao(); 
    
                    produtosPromocao = ((Promocao) produto).getProdutosPromocao();

                    for (int i = 0; i < produtosPromocao.size() ; i++) {
                        listaProdSelect.add(produtosPromocao.get(i).getNomeProduto());
                    }
                }
                case "Entradas"->{
                    produto = new Entrada();

                    produtosEntrada = ((Entrada) produto).getProdutosEntrada();

                    for (int i = 0; i < produtosEntrada.size() ; i++) {
                        listaProdSelect.add(produtosEntrada.get(i).getNomeProduto());
                    }

                } 
                case "Temaki Especial"->{
                    produto = new TemakiEspecial();

                    produtosTemakiEsp = ((TemakiEspecial) produto).getProdutosTemakiEsp();

                    for (int i = 0; i < produtosTemakiEsp.size() ; i++) {
                        listaProdSelect.add(produtosTemakiEsp.get(i).getNomeProduto());
                    }

                } 
                case "Holl Wassabi"->{
                    produto = new HollWassabi();
                    
                    produtosHollWassabi = ((HollWassabi) produto).getProdutosHollWassabi();

                    for (int i = 0; i < produtosHollWassabi.size() ; i++) {
                        listaProdSelect.add(produtosHollWassabi.get(i).getNomeProduto());
                    }

                }
            };
            
            /*converte a lista de nomes do produto da categoria para um array
             * apenas para utilizar no JOptionPane
             */

            Object listaProdSelecionados [] = listaProdSelect.toArray();

            String SelecionarProdutoCateg = (String) JOptionPane.showInputDialog(
                null, "Selecione O produto desejado",
                null, JOptionPane.QUESTION_MESSAGE, null, 
                listaProdSelecionados, null
            );

            for (Promocao prodPromo : produtosPromocao) {
                if (prodPromo.getNomeProduto() == SelecionarProdutoCateg) {
                    produto = prodPromo;
                }
            }
        
            for (Entrada prodEntrada : produtosEntrada) {
                if (prodEntrada.getNomeProduto() == SelecionarProdutoCateg) {
                    produto = prodEntrada;
                }
            }
        
            for (TemakiEspecial prodTemakiEsp : produtosTemakiEsp) {
                if (prodTemakiEsp.getNomeProduto() == SelecionarProdutoCateg) {
                    produto = prodTemakiEsp;
                }
            }

            for (HollWassabi prodHollWassabi : produtosHollWassabi) {
                if (prodHollWassabi.getNomeProduto() == SelecionarProdutoCateg) {
                    produto = prodHollWassabi;
                }
            }
            
            
            pedido.adicionaProduto(produto);
            listaProdSelect.clear();


            continuar = JOptionPane.showOptionDialog(
                null, "deseja inserir mais um produto ?", "titulo",JOptionPane.YES_NO_OPTION,  JOptionPane.QUESTION_MESSAGE, null, opcoesContinuaProd, null
            )  == JOptionPane.YES_OPTION;
        }

        
        continuar = true;
        
        while (continuar) {
            int selectOpMenu= JOptionPane.showOptionDialog(null, "Selecione a opção desejada",
            "Click a button",
            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoesMenuConfirm, opcoesMenuConfirm[0]);
            switch (selectOpMenu) {
                case 0 ->{
                    
                }
                case 1 ->{
                    for (int i = 0; i < pedido.getProdutos().size(); i++) {
                        listaProdSelect.add(pedido.getProdutos().get(i).getNomeProduto());
                    }
                    Object listaProdSelecionados [] = listaProdSelect.toArray();
                    String SelecionarProdutoCateg = (String) JOptionPane.showInputDialog(
                        null, "Selecione O produto desejado",
                        null, JOptionPane.QUESTION_MESSAGE, null, 
                        listaProdSelecionados, null
                    );
                    pedido.removerProduto(SelecionarProdutoCateg);
                    JOptionPane.showMessageDialog(null, SelecionarProdutoCateg+" Excluído com  sucesso !");
                }
            
                case 2->{
                    JOptionPane.showMessageDialog(null, pedido.listarPedido());
                }
                case 3->{
                    WassabiApp.main(null);
                }
                case 4 ->{
                    continuar = false;
                }
            }
        }

        


        
    }

}
