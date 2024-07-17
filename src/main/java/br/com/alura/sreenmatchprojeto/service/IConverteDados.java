package br.com.alura.sreenmatchprojeto.service;

public interface IConverteDados {
    <T> T  obterDados(String json, Class<T> classe);
}
