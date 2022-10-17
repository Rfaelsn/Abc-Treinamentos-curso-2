package com.unidade4.sisalucar;

import javax.swing.JOptionPane;

public class Moto extends Veiculo{
    
    public int getPassageiros(){ //exemplo anulação
        return 1;
    }

    
    public void acelerar(int limiteVelocidade){ //exemplo sobrecarga
        System.out.println("Respeite o limite de velocidade que é de: "+limiteVelocidade);
    }


}
