/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author whoami
 */
public class CarroUsado extends Carro {

    //<editor-fold defaultstate="collapsed" desc="atributos">
    protected int qtdDonos;
    protected String estado;
    protected int finalPlaca;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="construtor">
    public CarroUsado(int ano, int aro, String cor, Marca marca, double mediaKmLitro, String modelo,
            String opcionais, int qtdPassageiros, double valor, int qtdPortas, double potenciaMotor,
            Cambio cambio, int qtdDonos, String estado, int finalPlaca) {

        super(ano, aro, cor, marca, mediaKmLitro, modelo, opcionais, qtdPassageiros, valor, qtdPortas, potenciaMotor, cambio);
        this.qtdDonos = qtdDonos;
        this.estado = estado;
        this.finalPlaca = finalPlaca;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="gets & sets">
    /**
     * @return the qtdDonos
     */
    public int getQtdDonos() {
        return qtdDonos;
    }

    /**
     * @param qtdDonos the qtdDonos to set
     */
    public void setQtdDonos(int qtdDonos) {
        this.qtdDonos = qtdDonos;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the finalPlaca
     */
    public int getFinalPlaca() {
        return finalPlaca;
    }

    /**
     * @param finalPlaca the finalPlaca to set
     */
    public void setFinalPlaca(int finalPlaca) {
        this.finalPlaca = finalPlaca;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="toString">
    @Override
    public String toString() {
        String dados;
        dados = super.toString();
        dados += "\nQuantidade de donos: " + getQtdDonos() + "\nEstado do carro: " + getEstado()
                + "\nFinal da placa: "+getFinalPlaca();
        return dados;
    }
    //</editor-fold>

}
