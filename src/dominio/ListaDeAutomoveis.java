/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.*;
import java.util.*;

/**
 *
 * @author whoami
 */
public class ListaDeAutomoveis implements ListaAutomoveis {

    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private List<Automovel> listaDeAutomoveis;
    private String tipo;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Construtor">
    public ListaDeAutomoveis(String tipo) {
        this.tipo = tipo;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="getLista">
    public List<Automovel> getListaDeAutomoveis() {
        return listaDeAutomoveis;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="incluir">
    @Override
    public boolean incluir(Automovel auto) {
        if (listaDeAutomoveis.add(auto)) {
            return true;
        } else {
            return false;
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Consultar por Codigo">
    public Automovel consultarPorCodigo(int codigo) {
        for (Automovel auto : listaDeAutomoveis) {
            if (auto.getCodigo() == codigo) {
                return auto;
            }
        }
        return null;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Consultar por marca">
    @Override
    public List<Automovel> consultarPorMarca(String marca) {
        List<Automovel> listaMarca = new ArrayList();
        for (Automovel auto : listaDeAutomoveis) {
            if (auto.getMarca().equals(marca)) {
                listaMarca.add(auto);
            }
        }
        return listaMarca;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Consultar por cor">
    @Override
    public List<Automovel> consultarPorCor(String cor) {
        List<Automovel> listaCor = new ArrayList();
        for (Automovel auto : listaDeAutomoveis) {
            if (auto.getCor().equals(cor)) {
                listaCor.add(auto);
            }
        }
        return listaCor;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Consultar por ano">
    @Override
    public List<Automovel> consultarPorAno(int ano) {
        List<Automovel> listaAno = new ArrayList();
        for (Automovel auto : listaDeAutomoveis) {
            if (auto.getAno() == ano) {
                listaAno.add(auto);
            }
        }
        return listaAno;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Consultar por valor">
    @Override
    public List<Automovel> consultarPorValor(double valorDesejado) {
        List<Automovel> listaValor = new ArrayList();
        for (Automovel auto : listaDeAutomoveis) {
            if (auto.getValor() <= valorDesejado) {
                listaValor.add(auto);
            }
        }
        return listaValor;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Remove automovel">
    
    @Override
    public void removeAutomovel(int codigo) {
        for (Automovel autom : listaDeAutomoveis) {
            if (autom.getCodigo() == codigo) {
                listaDeAutomoveis.remove(autom);
            }
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Escrever no arquivo">
    public boolean escreverArquivo() {
        try {
            BufferedWriter strWriter = new BufferedWriter(new FileWriter(System.getProperty("user.dir") + System.getProperty("file.separator") + this.tipo + ".csv"));

            for (int i = 0; i < listaDeAutomoveis.size(); i++) {
                strWriter.write(listaDeAutomoveis.get(i).toString());
            }

            strWriter.close();

        } catch (FileNotFoundException ex) {
            return false;
        } catch (IOException e) {
            return false;
        }

        return true;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Ler arquivo">
    //</editor-fold>
}
