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
public class CarroNovo extends Carro {

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
    public CarroNovo(int ano, int aro, String cor, Marca marca, double mediaKmLitro, String modelo,
            String opcionais, double valor, int qtdPortas, double potenciaMotor,
            Cambio cambio, int qtdPassageiros) {

        super(ano, aro, cor, marca, mediaKmLitro, modelo, opcionais, valor, qtdPortas, potenciaMotor, cambio, qtdPassageiros);
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
     public CarroNovo(int codigo, int ano, int aro, String cor, Marca marca, double mediaKmLitro, String modelo,
            String opcionais, double valor, int qtdPortas, double potenciaMotor, Cambio cambio,  int qtdPassageiros) {

        super(codigo, ano, aro, cor, marca, mediaKmLitro, modelo, opcionais, valor, qtdPortas, potenciaMotor, cambio, qtdPassageiros);
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="toString">
    @Override
    public String toString() {
        String dados = super.toString()+"\n";
        return dados;
    }
    //</editor-fold>

}
