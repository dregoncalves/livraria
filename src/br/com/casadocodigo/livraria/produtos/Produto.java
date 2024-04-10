package br.com.casadocodigo.livraria.produtos;

public interface Produto {

    double getValor();

    boolean aplicaDescontoDe(double v);
}
