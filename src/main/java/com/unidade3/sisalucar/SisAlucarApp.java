package com.unidade3.sisalucar;

import java.time.LocalDate;


public class SisAlucarApp {
    public static void main(String[] args) {

        Carro carro1 = new Carro(
            "jdk-2001","Volkswagen","gol quadrado",1995,"azul metálico",160f,Revendedor.ABCVEICULOS
        );

        Cliente cliente1 = new Cliente();
        cliente1.setCpf("123456789-32");
        cliente1.setNome("Rafael Silva do Nascimento");
        cliente1.setCnh("XWS1234");

        calcularValorLocacao(carro1, null);
        
        
        
        
    }

    public void realizarLocacao(long idCarroLocado, long idCliente, float valorDiaria) {
        Locacao locacao = new Locacao();
        locacao.setIdCarroLocado(idCarroLocado);
        locacao.setIdCliente(idCliente);
        locacao.setDataInicio(LocalDate.now());
        locacao.setDataFim(LocalDate.now().plusDays(2));
        locacao.setValorLocado(2*valorDiaria);

        
    }

        
    public static void calcularValorLocacao(Carro carro1, LocalDate ...datas) //exemplo de varargs
    { 
        float totalFaturado = carro1.getValorDiaria();
    }


}
