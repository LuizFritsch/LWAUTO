package dominio;

import java.util.List;

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

interface ListaAutomoveis {
    
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
     * Consulta por marca
     * @param marca
     * @return lista com automoveis daquela marca
     */
    public List<Automovel> consultarPorMarca(String marca);
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Consulta por cor">
    /**
     *Consulta um automovel por cor 
     * @param cor
     * @return lista com automoveis daquela cor
     */
    public List<Automovel> consultarPorCor(String cor);
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Consultar por ano">
/**
 * Consulta por ano
 * @param ano
 * @return lista de automoveis com o ano consultado
 */
    public List<Automovel> consultarPorAno(int ano);
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Consultar por valor">
  /**
   * consulta por valor
   * @param valorDesejado
   * @return lista de automoveis com aquele valor
   */
    public List<Automovel> consultarPorValor(double valorDesejado);
    //</editor-fold>
     
    //<editor-fold defaultstate="collapsed" desc="Remover automovel">
    /**
     * Remove o automovel desejado da lista
     * @param auto 
     */
    public void removeAutomovel(int codigo);
    //</editor-fold>

}
