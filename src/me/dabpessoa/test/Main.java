package me.dabpessoa.test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import me.dabpessoa.email.Email;
import me.dabpessoa.email.EmailException;
import me.dabpessoa.email.EmailSender;
import sun.misc.IOUtils;

public class Main {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		final String host = "smtp.gmail.com";
		final String username = "atma.vaicomecar@gmail.com";
		final String password = "[coloque_aqui_a_senha]";
		
		EmailSender sender = new EmailSender(host, username, password);
		
//		Email email = new Email();
//		email.setFrom("atma.vaicomecar@gmail.com");
//		email.setTos(Arrays.asList("dabpessoa@gmail.com"));
//		email.setSubject("T�tulo do meu e-mail");
//		email.setMessage("Corpo do meu e-mail");
//		email.setProxyCredentials(new ProxyCredentials("proxy", 8080));

		String string = "testando arquivo anexo.";

		Email email = Email.create()
						.from("atma.vaicomecar@gmail.com")
						.to("dabpessoa@gmail.com")
						.subject("Título do meu e-mail")
						.message("Corpo do meu e-mail")
						.attachment("teste.txt", string.getBytes())
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
