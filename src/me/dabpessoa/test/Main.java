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
//		email.setFrom("atma.vaicomecar@gmail.com");
//		email.setTos(Arrays.asList("dabpessoa@gmail.com"));
//		email.setSubject("Título do meu e-mail");
//		email.setMessage("Corpo do meu e-mail");
//		email.setProxyCredentials(new ProxyCredentials("proxy", 8080));
		
		Email email = Email.create()
						.from("atma.vaicomecar@gmail.com")
						.to("dabpessoa@gmail.com")
						.subject("Título do meu e-mail")
						.message("Corpo do meu e-mail")
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
