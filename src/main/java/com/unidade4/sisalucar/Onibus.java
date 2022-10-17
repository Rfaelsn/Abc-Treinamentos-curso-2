package com.unidade4.sisalucar;

public class Onibus extends Veiculo {
    public int getPassageiros(){ //exemplo anulação
        return 40;
    }

    
    public void acelerar(int limiteVelocidade){ //exemplo sobrecarga
        System.out.println("Respeite o limite de velocidade que é de: "+limiteVelocidade);
    }
}
