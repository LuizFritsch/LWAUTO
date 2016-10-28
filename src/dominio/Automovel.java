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
public class Automovel {

    //<editor-fold defaultstate="collapsed" desc="atributos">
    protected static int nmrCarro = 0;
    protected int codigo;
    protected double mediaKmLitro;
    protected double valor;
    protected int ano;
    protected int aro;
    protected Marca marca;
    protected String modelo;
    protected String opcionais;
    protected String cor;
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
     */
    public Automovel(int ano, int aro, String cor, Marca marca, double mediaKmLitro, String modelo,
            String opcionais, double valor) {
        this.codigo = nmrCarro;
        nmrCarro++;
        this.ano = ano;
        this.aro = aro;
        this.cor = cor;
        this.marca = marca;
        this.mediaKmLitro = mediaKmLitro;
        this.modelo = modelo;
        this.opcionais = opcionais;
        this.valor = valor;
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
     */
    public Automovel(int codigo, int ano, int aro, String cor, Marca marca, double mediaKmLitro, String modelo,
            String opcionais, double valor) {
        this.codigo = codigo;
        this.ano = ano;
        this.aro = aro;
        this.cor = cor;
        this.marca = marca;
        this.mediaKmLitro = mediaKmLitro;
        this.modelo = modelo;
        this.opcionais = opcionais;
        this.valor = valor;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="gets & sets">
    /**
     *
     * @return the nmrCarro
     */
    public static int getNmrCarro() {
        return nmrCarro;
    }

    /**
     *
     * @param nmrCarro
     */
    public static void setNmrCarro(int nmrCarro) {
        Automovel.nmrCarro = nmrCarro;
    }

    /**
     *
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

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
        String dados = "";
        dados += this.getCodigo() + ";";
        dados += this.getAno() + ";";
        dados += this.getAro() + ";";
        dados += this.getCor() + ";";
        dados += this.getMarca().getMarca() + ";";
        dados += this.getMediaKmLitro() + ";";
        dados += this.getModelo() + ";";
        dados += this.getOpcionais() + ";";
        dados += this.getValor();
        return dados;
    }
    //</editor-fold>

}
