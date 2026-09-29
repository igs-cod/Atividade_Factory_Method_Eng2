package br.com.catolica.notificacoes;

import br.com.catolica.interfaces.Notificacao;

public class NotificacaoPush implements Notificacao {
    @Override
    public void enviar(String mensagem)

    {
        System.out.println("Push: " + mensagem);
    }
}
