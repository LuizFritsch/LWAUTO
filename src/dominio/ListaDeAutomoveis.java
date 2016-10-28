/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
            BufferedWriter nroImoveis = new BufferedWriter(new FileWriter(System.getProperty("user.dir") + System.getProperty("file.separator") + "max.txt"));
            nroImoveis.write(Automovel.getNmrCarro() + "\n");
            nroImoveis.close();
        } catch (FileNotFoundException ex) {
            return false;
        } catch (IOException e) {
            return false;
        }
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
    public boolean lerArquivo() throws FileNotFoundException, IOException {
        try {
            BufferedReader nroImo = new BufferedReader(new FileReader(System.getProperty("user.dir") + System.getProperty("file.separator") + "max.txt"));
            Automovel.setNmrCarro(Integer.parseInt(nroImo.readLine()));
            nroImo.close();
        } catch (FileNotFoundException ex) {
            return false;
        } catch (IOException e) {
            return false;
        }
        try {
            BufferedReader strReader = new BufferedReader(new FileReader(System.getProperty("user.dir") + System.getProperty("file.separator") + this.tipo + ".csv"));
            switch (this.tipo) {

                case "CarroNovo":
                    String line;
                    String[] s;

                    while ((line = strReader.readLine()) != null) {
                        s = line.split(";");
                        int ano, aro, qtdPortas, qtdPassageiros, codigo;
                        double mediaKmLitro, valor, potenciaMotor;
                        String cor, opcionais, modelo;
                        Cambio cambio = null;
                        Marca marca = null;

                        codigo = Integer.parseInt(s[0]);
                        ano = Integer.parseInt(s[1]);
                        aro = Integer.parseInt(s[2]);
                        cor = s[3];
                        marca = marca.verificaMarca(s[4]);
                        mediaKmLitro = Double.parseDouble(s[5]);
                        modelo = s[6];
                        opcionais = s[7];
                        valor = Double.parseDouble(s[8]);
                        qtdPortas = Integer.parseInt(s[9]);
                        potenciaMotor = Double.parseDouble(s[10]);
                        cambio = cambio.verificaCambio(s[11]);
                        qtdPassageiros = Integer.parseInt(s[12]);

                        CarroNovo c = new CarroNovo(codigo, ano, aro, cor, marca, mediaKmLitro, modelo, opcionais,
                                valor, qtdPortas, potenciaMotor, cambio, qtdPassageiros);
                        this.incluir(c);

                    }

                    break;

                case "CarroUsado":

                    while ((line = strReader.readLine()) != null) {

                        s = line.split(";");
                        int ano, aro, qtdPortas, qtdPassageiros, codigo, qtdDonos, finalPlaca;
                        double mediaKmLitro, valor, potenciaMotor;
                        String cor, opcionais, modelo, estado;
                        Cambio cambio = null;
                        Marca marca = null;

                        codigo = Integer.parseInt(s[0]);
                        ano = Integer.parseInt(s[1]);
                        aro = Integer.parseInt(s[2]);
                        cor = s[3];
                        marca = marca.verificaMarca(s[4]);
                        mediaKmLitro = Double.parseDouble(s[5]);
                        modelo = s[6];
                        opcionais = s[7];
                        valor = Double.parseDouble(s[8]);
                        qtdPortas = Integer.parseInt(s[9]);
                        potenciaMotor = Double.parseDouble(s[10]);
                        cambio = cambio.verificaCambio(s[11]);
                        qtdPassageiros = Integer.parseInt(s[12]);
                        qtdDonos = Integer.parseInt(s[13]);
                        estado = s[14];
                        finalPlaca = Integer.parseInt(s[15]);

                        CarroUsado c = new CarroUsado(codigo, ano, aro, cor, marca, mediaKmLitro, modelo, opcionais,
                                valor, qtdPortas, potenciaMotor, cambio, qtdPassageiros, qtdDonos, estado, finalPlaca);
                        this.incluir(c);

                    }
                    break;

                case "Moto":
                    while ((line = strReader.readLine()) != null) {
                        s = line.split(";");
                        int ano, aro, qtdPortas, qtdPassageiros, codigo;
                        double mediaKmLitro, valor, potenciaMotor, cilindradas;
                        String cor, opcionais, modelo;
                        Cambio cambio = null;
                        Marca marca = null;

                        codigo = Integer.parseInt(s[0]);
                        ano = Integer.parseInt(s[1]);
                        aro = Integer.parseInt(s[2]);
                        cor = s[3];
                        marca = marca.verificaMarca(s[4]);
                        mediaKmLitro = Double.parseDouble(s[5]);
                        modelo = s[6];
                        opcionais = s[7];
                        valor = Double.parseDouble(s[8]);
                        qtdPortas = Integer.parseInt(s[9]);
                        potenciaMotor = Double.parseDouble(s[10]);
                        cambio = cambio.verificaCambio(s[11]);
                        qtdPassageiros = Integer.parseInt(s[12]);
                        cilindradas = Double.parseDouble(s[13]);

                        Moto c = new Moto(codigo, ano, aro, cor, marca, mediaKmLitro, modelo, opcionais, qtdPassageiros, valor, cilindradas);
                        this.incluir(c);

                    }

                    break;

            }
        } catch (FileNotFoundException ex) {
            return false;

        } catch (IOException ex) {
            return false;
        }
        return true;
    }
}
//</editor-fold>
