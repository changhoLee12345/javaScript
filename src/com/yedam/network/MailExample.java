package com.yedam.network;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailExample {
	public static void main(String[] args) throws AddressException, MessagingException {
		String host = "smtp.naver.com";// mail서버(smtp)
		final String user = "leadon@naver.com";// 아이디
		final String passwd = "^y7u8i9o0p";// 비번

		String toUser = "cholee@yedam.ac"; // 받는메일주소.

		Properties props = new Properties();
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", 587);
		props.put("mail.smtp.auth", true);

		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(user, passwd);
			}
		});

		MimeMessage message = new MimeMessage(session);
		message.setFrom(new InternetAddress(user));
		message.addRecipient(Message.RecipientType.TO, new InternetAddress(toUser));

		message.setSubject("네이버 메일 테스트"); // 메일 제목..
		message.setText("네이버 메일 내용 부분"); // 내용..
		Transport.send(message); // 메일 발송..
		System.out.println("mail sended....");

	}
}
