package com.aovivo.desafiogarcomenumswitch;

public enum GorjetaGarcom {
    RUIM(0),REGULAR(0.18),
    BOM(0.2),EXCELENTE(0.22);
    
    double porcentGorjeta;

    private GorjetaGarcom(double porcentGorjeta){
        this.porcentGorjeta = porcentGorjeta;
    }
    
    public double getPorcentGorjeta() {
        return this.porcentGorjeta;
    }

    public void setPorcentGorjeta(double porcentGorjeta) {
        this.porcentGorjeta = porcentGorjeta;
    }

}
