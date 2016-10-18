/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author whoami
 */
public class Automovel {

    //<editor-fold defaultstate="collapsed" desc="atributos">
    protected double mediaKmLitro;
    protected double valor;
    protected int qtdPassageiros;
    protected int ano;
    protected int aro;
    protected Marca marca;
    protected String modelo;
    protected String opcionais;
    protected String cor;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="construtor">
    public Automovel(int ano, int aro, String cor, Marca marca, double mediaKmLitro, String modelo,
            String opcionais, int qtdPassageiros, double valor) {
        this.ano = ano;
        this.aro = aro;
        this.cor = cor;
        this.marca = marca;
        this.mediaKmLitro = mediaKmLitro;
        this.modelo = modelo;
        this.opcionais = opcionais;
        this.qtdPassageiros = qtdPassageiros;
        this.valor = valor;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="gets & sets">
    /**
     * @return the mediaKmLitro
     */
    public double getMediaKmLitro() {
        return mediaKmLitro;
    }

    /**
     * @param mediaKmLitro the mediaKmLitro to set
     */
    public void setMediaKmLitro(double mediaKmLitro) {
        this.mediaKmLitro = mediaKmLitro;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the qtdPassageiros
     */
    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    /**
     * @param qtdPassageiros the qtdPassageiros to set
     */
    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the aro
     */
    public int getAro() {
        return aro;
    }

    /**
     * @param aro the aro to set
     */
    public void setAro(int aro) {
        this.aro = aro;
    }

    /**
     * @return the marca
     */
    public Marca getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the opcionais
     */
    public String getOpcionais() {
        return opcionais;
    }

    /**
     * @param opcionais the opcionais to set
     */
    public void setOpcionais(String opcionais) {
        this.opcionais = opcionais;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="toString">
    @Override
    public String toString() {
        String dados="";
        dados += "\nAno: " + getAno() + "\nAro: " + getAro() + "\nCor: " + getCor() + "\nMarca: " + getMarca()
                + "\nMedia de km por litro: " + getMediaKmLitro() + "\nModelo: " + getModelo() + "\nOpcionais: "
                + getOpcionais() +"\nQuantidade de passageiros: "+getQtdPassageiros() +"\nValor: "+getValor();
        return dados;
    }
    //</editor-fold>

}
