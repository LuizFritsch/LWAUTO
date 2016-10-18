/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author whoami
 */
public class CarroNovo extends Carro{
    
     //<editor-fold defaultstate="collapsed" desc="construtor">
    public CarroNovo(int ano, int aro, String cor, Marca marca, double mediaKmLitro, String modelo, String opcionais, int qtdPassageiros, double valor, int qtdPortas, double potenciaMotor, Cambio cambio) {
        super(ano, aro, cor, marca, mediaKmLitro, modelo, opcionais, qtdPassageiros, valor, qtdPortas, potenciaMotor, cambio);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="toString">
    @Override
    public String toString(){
        String dados = super.toString();
        return dados;
    }
    //</editor-fold>
    
}
