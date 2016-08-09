package me.dabpessoa.test;

import java.io.IOException;

import me.dabpessoa.email.Email;
import me.dabpessoa.email.EmailException;
import me.dabpessoa.email.EmailSender;

public class Main {

	public static void main(String[] args) {
		
		final String host = "smtp.gmail.com";
		final String username = "atma.vaicomecar@gmail.com";
		final String password = "[coloque_aqui_a_senha]";
		
		EmailSender sender = new EmailSender(host, username, password);
		
//		Email email = new Email();
//		email.setFrom("diego.pessoa@seduc.ce.gov.br");
//		email.setTos(Arrays.asList("diego.pessoa@seduc.ce.gov.br"));
//		email.setSubject("teste de envio de email <título>");
//		email.setMessage("teste de corpo de e-mail");
//		email.setProxyCredentials(new ProxyCredentials("proxy", 8080));
		
		Email email = Email.create()
						.from("diego.pessoa@seduc.ce.gov.br")
						.to("diego.pessoa@seduc.ce.gov.br")
						.subject("teste")
						.message("teste message")
//						.proxy("proxy", 8080)
						.mail();
		
		try {
			sender.doSend(email);
		} catch (EmailException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
