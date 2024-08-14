package com.dio.iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("----Aparelho eletrônico----");
        iphone.ligar("+5500 9000-0000");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("----Navegador de Internet----");
        iphone.exibirPagina("web.dio.me");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        System.out.println("----Reprodutor de música----");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Kanye west - God is");
    }
}
