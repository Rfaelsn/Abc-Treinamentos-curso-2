package com.unidade4.sisalucar;

public class Carro extends Veiculo{
    private static int contCarros = 0;
    private long idCarro;
    private String placa;
    private String fabricante;
    private String modelo;
    private int ano;
    private String cor;
    private float valorDiaria;
    private Revendedor revendedor;

    public int getPassageiros(){ //exemplo anulação
        return 4;
    }

    
    public void acelerar(int limiteVelocidade){ //exemplo sobrecarga
        System.out.println("Respeite o limite de velocidade que é de: "+limiteVelocidade);
    }

    public void abastecer (double valorAbastecerLitros){
        System.out.println("abastecendo "+valorAbastecerLitros+"L");
    }

    public void fechaPorta(){

    }

    public void abrePorta(){

    }

    public Carro() {
        this.idCarro++;
        contCarros++;
    }


    public Carro(String placa, String fabricante, String modelo, int ano, String cor, float valorDiaria,Revendedor revendedor) {
        this.idCarro = idCarro;
        this.placa = placa;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.valorDiaria = valorDiaria;
        this.revendedor = revendedor;
    }


    public long getIdCarro() {
        return this.idCarro;
    }

    public void setIdCarro(long idCarro) {
        this.idCarro = idCarro;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getValorDiaria() {
        return this.valorDiaria;
    }

    public void setValorDiaria(float valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    



}
