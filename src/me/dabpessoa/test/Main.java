package me.dabpessoa.test;

import java.io.IOException;
import java.util.Arrays;

import me.dabpessoa.email.Email;
import me.dabpessoa.email.EmailException;
import me.dabpessoa.email.EmailSender;
import me.dabpessoa.email.ProxyCredentials;

public class Main {

	public static void main(String[] args) {
		
		EmailSender sender = new EmailSender("smtp.seduc.ce.gov.br", "financeiro@seduc.ce.gov.br", "f!an@489");
		sender.setProtocol("smtps");
		
		Email email = new Email();
		email.setFrom("diego.pessoa@seduc.ce.gov.br");
		email.setTos(Arrays.asList("diego.pessoa@seduc.ce.gov.br"));
		email.setSubject("teste de envio de email <título>");
		email.setMessage("teste de corpo de e-mail");
		email.setProxyCredentials(new ProxyCredentials("proxy", 8080));
		
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
