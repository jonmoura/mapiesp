package model;

import java.util.ArrayList;

public class ArquivoComposite extends Arquivo {

    //classe Composite que estende a classe mãe Arquivo
    //além de herdar os atributos de Arquivo, ele sobrescreve o seu método
    //possui um ArrayList para listar os objetos criados e em seguida trata-los individualmente
    //finalmente o Composite possui outros métodos que servirão para tratar os objetos criados

    private ArrayList<Arquivo> arquivos;

    public ArquivoComposite (String nomeDoArquivo) {
        this.nomeDoArquivo = nomeDoArquivo;
        arquivos = new ArrayList<Arquivo>();
    }

    @Override
    public void printNomeDoArquivo() {
        super.printNomeDoArquivo();
        for (Arquivo arquivo : arquivos) {
            arquivo.printNomeDoArquivo();
        }
    }

    public void adicionar(Arquivo novoArquivo) {
        this.arquivos.add(novoArquivo);
    }

    public void remover(String nomeDoArquivo) throws Exception {
        for (Arquivo arquivo : arquivos) {
            if (arquivo.getNomeDoArquivo() == nomeDoArquivo) {
                this.arquivos.remove(arquivo);
                return;
            }
        }
        throw new Exception("Este arquivo não existe");
    }

    public Arquivo getArquivo(String nomeDoArquivo) throws Exception {
        for (Arquivo arquivo : arquivos) {
            if(arquivo.getNomeDoArquivo() == nomeDoArquivo) {
                return arquivo;
            }
        }
        throw new Exception("Este arquivo não existe");
    }
}