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
public class Moto extends Automovel {

    //<editor-fold defaultstate="collapsed" desc="atributos">
    protected double cilindradas;
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
     * @param valor
     * @param cilindradas
     */
    public Moto(int ano, int aro, String cor, Marca marca, double mediaKmLitro, String modelo,
            String opcionais, double valor, double cilindradas) {

        super(ano, aro, cor, marca, mediaKmLitro, modelo, opcionais, valor);
        this.cilindradas = cilindradas;
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
     * @param valor
     * @param cilindradas
     */
    public Moto(int codigo, int ano, int aro, String cor, Marca marca, double mediaKmLitro, String modelo,
            String opcionais, double valor, double cilindradas) {

        super(ano, aro, cor, marca, mediaKmLitro, modelo, opcionais, valor);
        this.cilindradas = cilindradas;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="gets & sets">
    /**
     * @return the cilindradas
     */
    public double getCilindradas() {
        return cilindradas;
    }

    /**
     * @param cilindradas the cilindradas to set
     */
    public void setCilindradas(double cilindradas) {
        this.cilindradas = cilindradas;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="toString">
    @Override
    public String toString() {
        String dados = super.toString();
        dados += cilindradas + "\n";
        return dados;
    }
    //</editor-fold>

}
