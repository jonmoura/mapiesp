package main;

import model.Arquivo;
import model.ArquivoComposite;
import model.ArquivoVideo;

public class Main {

    public static void main(String[] args) {

        //primeiramente são criados os objetos da classe filha
        //em seguida é criado um objeto do Composite que irá se relacionar com os objetos criados anteriormente
        //por fim, os objetos da classe filha são adicionados dentro do objeto do Composite através do método do próprio Composite

        Arquivo primeiroVideo = new ArquivoVideo("Aula 01.mp4");
        Arquivo segundoVideo = new ArquivoVideo("Aula 02.mp4");

        Arquivo primeiraPasta = new ArquivoComposite("video aulas");

        ((ArquivoComposite) primeiraPasta).adicionar(primeiroVideo);
        ((ArquivoComposite) primeiraPasta).adicionar(segundoVideo);

        primeiraPasta.printNomeDoArquivo();
    }
}
