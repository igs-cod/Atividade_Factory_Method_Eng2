package br.com.catolica.notificacoes;

import br.com.catolica.interfaces.Notificacao;

public class NotificacaoSms implements Notificacao {
    @Override
    public void enviar(String mensagem)

    {
        System.out.println("SMS: " + mensagem);
    }
}
