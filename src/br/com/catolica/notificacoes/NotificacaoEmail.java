package br.com.catolica.notificacoes;

import br.com.catolica.interfaces.Notificacao;

public class NotificacaoEmail implements Notificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Email: " + mensagem);
    }
}
