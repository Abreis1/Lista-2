package br.inatel.cdg;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Pessoa p = new Pessoa("João",123456789,3);
        Endereco end1 = new Endereco("Rua 1","Centro",125);
        Endereco end2 = new Endereco("Rua 2","Alameda",10);
        Endereco end3 = new Endereco("Rua 3","Centro",240);


        p.addEndereco(end1);
        p.addEndereco(end2);
        p.addEndereco(end3);
        p.mostraInfo();
    }
}
