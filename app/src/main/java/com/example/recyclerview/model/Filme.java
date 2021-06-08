package com.example.recyclerview.model;


//Aqui foi criada uma nova classe na pasta model, para podermos aplicar essa configuração nos objetos
//que serão adicionados ao recycler view
public class Filme {

    private String tituloFilme;
    private String genero;
    private String ano;

    public Filme(){

    }


    //Use o direito do mouse e crie um construtor com os 3 strings private acima
    public Filme(String tituloFilme, String genero, String ano) {
        this.tituloFilme = tituloFilme;
        this.genero = genero;
        this.ano = ano;
    }

    //Aqui vamos criar o getter e setter com o botão direito assim como o construtor, selecionando os 3
    public String getTituloFilme() {
        return tituloFilme;
    }

    public void setTituloFilme(String tituloFilme) {
        this.tituloFilme = tituloFilme;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}
