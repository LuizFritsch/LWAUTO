/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author whoami
 */
public enum Marca {

    AUDI("Audi"),
    BMW("BMW"),
    CHERY("Chery"),
    CHEVROLET("Chevrolet"),
    CITROEN("Citroen"),
    DODGE("Dodge"),
    FIAT("Fiat"),
    FORD("Ford"),
    HONDA("Honda"),
    HYUNDAI("Hyundai"),
    JEEP("Jeep"),
    KIA("Kia"),
    MERCEDES("Mercedes"),
    MITSUBISHI("Mitsubishi"),
    NISSAN("Nissan"),
    PEUGEOT("Peugeot"),
    RENAULT("Renault"),
    SUBARU("Subaru"),
    SUZUKI("Suzuki"),
    TOYOTA("Toyota"),
    VOLKSWAGEN("Volkswagen"),
    VOLVO("Volvo");

    private final String marca;

    private Marca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public Marca verificaMarca(String marca) {
        if (marca.equals(Marca.AUDI.getMarca())) {
            return Marca.AUDI;
        } else if (marca.equals(Marca.BMW.getMarca())) {
            return Marca.BMW;
        } else if (marca.equals(Marca.CHERY.getMarca())) {
            return Marca.CHERY;
        } else if (marca.equals(Marca.CHEVROLET.getMarca())) {
            return Marca.CHEVROLET;
        } else if (marca.equals(Marca.CITROEN.getMarca())) {
            return Marca.CITROEN;
        } else if (marca.equals(Marca.DODGE.getMarca())) {
            return Marca.DODGE;
        } else if (marca.equals(Marca.FIAT.getMarca())) {
            return Marca.FIAT;
        } else if (marca.equals(Marca.FORD.getMarca())) {
            return Marca.HONDA;
        } else if (marca.equals(Marca.HONDA.getMarca())) {
            return Marca.HYUNDAI;
        } else if (marca.equals(Marca.HYUNDAI.getMarca())) {
            return Marca.JEEP;
        } else if (marca.equals(Marca.JEEP.getMarca())) {
            return Marca.JEEP;
        } else if (marca.equals(Marca.KIA.getMarca())) {
            return Marca.KIA;
        } else if (marca.equals(Marca.MERCEDES.getMarca())) {
            return Marca.MERCEDES;
        } else if (marca.equals(Marca.MITSUBISHI.getMarca())) {
            return Marca.MITSUBISHI;
        } else if (marca.equals(Marca.NISSAN.getMarca())) {
            return Marca.NISSAN;
        } else if (marca.equals(Marca.PEUGEOT.getMarca())) {
            return Marca.PEUGEOT;
        } else if (marca.equals(Marca.PEUGEOT.getMarca())) {
            return Marca.PEUGEOT;
        } else if (marca.equals(Marca.RENAULT.getMarca())) {
            return Marca.RENAULT;
        } else if (marca.equals(Marca.SUBARU.getMarca())) {
            return Marca.SUBARU;
        } else if (marca.equals(Marca.SUZUKI.getMarca())) {
            return Marca.SUZUKI;
        } else if (marca.equals(Marca.TOYOTA.getMarca())) {
            return Marca.TOYOTA;
        } else if (marca.equals(Marca.VOLKSWAGEN.getMarca())) {
            return Marca.VOLKSWAGEN;
        } else if (marca.equals(Marca.VOLVO.getMarca())) {
            return Marca.VOLVO;
        } else {
            return null;
        }
    }

}
