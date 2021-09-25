package br.inatel.cdg;

public class Pessoa {
    public String nome;
    public int cpf;
    public Endereco[] enderecos;

    public Pessoa(String nome, int cpf, int qtdEnd) {
        this.nome = nome;
        this.cpf = cpf;
        enderecos = new Endereco[qtdEnd];
    }

    public void addEndereco(Endereco end){
        for(int i=0;i<this.enderecos.length; i++){
            if(this.enderecos[i] == null){
                this.enderecos[i] = end;
                break;
            }
        }
    }

    public void mostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        for(int i=0;i<this.enderecos.length; i++){
            if(this.enderecos[i] != null){
                System.out.println("Rua: " + this.enderecos[i].rua);
                System.out.println("Bairro: " + this.enderecos[i].bairro);
                System.out.println("Número: " + this.enderecos[i].num);
            }
        }
    }
}
