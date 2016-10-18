/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author whoami
 * 
 */

public interface ListaAutomoveis {
    
    //<editor-fold defaultstate="collapsed" desc="incluir">
    /**
     * Inclui um automovel na lista
     * @param auto
     * @return true caso consiga incluir, false caso contrario 
     */
    public boolean incluir(Automovel auto);
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Consulta por marca">
    /**
     * Consulta um automovel pela marca
     * @param marca
     * @return todos automoveis daquela marca
     */
    public Automovel consultarPorMarca(String marca);
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Consulta por cor">
    /**
     *Consulta um automovel por cor 
     * @param cor
     * @return todos automoveis daquela cor
     */
    public Automovel consultarPorCor(String cor);
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Consultar por ano">
    /**
     * Consulta automoveis pelo ano
     * @param ano
     * @return todos automoveis daquele ano
     */
    public Automovel consultarPorAno(int ano);
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Consultar por valor">
    /**
     * Consulta por um teto de valor
     * @param valorDesejado
     * @return todos automoveis do valor desejado para baixo
     */
    public Automovel consultarPorValor(double valorDesejado);
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Consultar por media de km por hora">
    /**
     * Consulta pela media de km por hora
     * @param mediaKmHora
     * @return todos automoveis com media menor ou igual a media desejada
     */
    public Automovel consultarPorMediaKmHora(double mediaKmHora);
    //</editor-fold>
     
    //<editor-fold defaultstate="collapsed" desc="Remover automovel">
    /**
     * Remove o automovel desejado da lista
     * @param auto 
     */
    public void removeAutomovel(Automovel auto);
    //</editor-fold>

}
