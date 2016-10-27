package dominio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author whoami
 */
public class Carro extends Automovel {

    //<editor-fold defaultstate="collapsed" desc="atributos">
    protected int qtdPortas;
    protected double potenciaMotor;
    protected Cambio cambio;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="construtor">
    /**
     * 
     * @param ano
     * @param aro
     * @param cor
     * @param marca
     * @param mediaKmLitro
     * @param modelo
     * @param opcionais
     * @param qtdPassageiros
     * @param valor
     * @param qtdPortas
     * @param potenciaMotor
     * @param cambio 
     */
    public Carro(int ano, int aro, String cor, Marca marca, double mediaKmLitro, String modelo,
            String opcionais, int qtdPassageiros, double valor, int qtdPortas, double potenciaMotor,
            Cambio cambio) {

        super(ano, aro, cor, marca, mediaKmLitro, modelo, opcionais, qtdPassageiros, valor);

        this.cambio = cambio;
        this.potenciaMotor = potenciaMotor;
        this.qtdPortas = qtdPortas;
    }
    
    /**
     * 
     * @param codigo
     * @param ano
     * @param aro
     * @param cor
     * @param marca
     * @param mediaKmLitro
     * @param modelo
     * @param opcionais
     * @param qtdPassageiros
     * @param valor
     * @param qtdPortas
     * @param potenciaMotor
     * @param cambio 
     */
    public Carro(int codigo, int ano, int aro, String cor, Marca marca, double mediaKmLitro, String modelo,
            String opcionais, int qtdPassageiros, double valor, int qtdPortas, double potenciaMotor,
            Cambio cambio) {

        super(codigo, ano, aro, cor, marca, mediaKmLitro, modelo, opcionais, qtdPassageiros, valor);

        this.cambio = cambio;
        this.potenciaMotor = potenciaMotor;
        this.qtdPortas = qtdPortas;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="gets & sets">
    /**
     * @return the qtdPortas
     */
    public int getQtdPortas() {
        return qtdPortas;
    }

    /**
     * @param qtdPortas the qtdPortas to set
     */
    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    /**
     * @return the potenciaMotor
     */
    public double getPotenciaMotor() {
        return potenciaMotor;
    }

    /**
     * @param potenciaMotor the potenciaMotor to set
     */
    public void setPotenciaMotor(double potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    /**
     * @return the cambio
     */
    public Cambio getCambio() {
        return cambio;
    }

    /**
     * @param cambio the cambio to set
     */
    public void setCambio(Cambio cambio) {
        this.cambio = cambio;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="toString">
    @Override
    public String toString() {
        String dados = super.toString();
        dados += this. getQtdPortas()+";";
        dados += this.getPotenciaMotor()+";";
        dados += this.getCambio()+";";
        return dados;
    }
    //</editor-fold>

}
