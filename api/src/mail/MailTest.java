package mail;

import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;
import javax.mail.internet.MimeMultipart;

// 메일을 전송하는 메서드로 만들고,
// 팀원들에게 반복문으로 모두 메일 발송시키


public class MailTest {
	
	public void sendMail(String Email, String inMessage) {
		// 메일 인코딩
        final String bodyEncoding = "UTF-8"; //콘텐츠 인코딩
        
        // 원하는 메일 제목 작성
        String subject = "{※디버깅 5인조 휴무 안내}";
        
        // 보낸 이메일 작성
        String fromEmail = "dcode0971@gmail.com";
        String fromUsername = "동건 킴";
        
        // 받는 이메일
        String toEmail = Email; // 콤마(,)로 여러개 나열
        
        //도메인 사용할 필요 없다
        //앱비밀번호
        final String username = "dcode0971@gmail.com";         
        final String password = "durw jjhy oaap plss";

        // 메일에 출력할 텍스트
        String html = null;
        StringBuffer sb = new StringBuffer();
        sb.append(inMessage);
        html = sb.toString();
        
        // 메일 옵션 설정
        Properties props = new Properties();    
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");
        
        try {
          // 메일 서버  인증 계정 설정
          Authenticator auth = new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
              return new PasswordAuthentication(username, password);
            }
          };
          
          // 메일 세션 생성
          Session session = Session.getDefaultInstance(props, auth);
          
          // 메일 송/수신 옵션 설정
          Message message = new MimeMessage(session);
          message.setFrom(new InternetAddress(fromEmail, fromUsername));
          message.setRecipients(RecipientType.TO, InternetAddress.parse(toEmail, false));
          message.setSubject(subject);
          message.setSentDate(new Date());
          
//          // 메일 콘텐츠 설정
          Multipart mParts = new MimeMultipart();
          MimeBodyPart mTextPart = new MimeBodyPart();
          MimeBodyPart mFilePart = null;
 //    
//          // 메일 콘텐츠 - 내용
          mTextPart.setText(html, bodyEncoding, "html");
          mParts.addBodyPart(mTextPart);
//                
//          // 메일 콘텐츠 설정
          message.setContent(mParts);
     
          // 메일 발송
          Transport.send( message );
          
        } catch ( Exception e ) {
          e.printStackTrace();
        }
	}
	
	public static void main(String[] args) {
		MailTest ms = new MailTest();
		String message = "저녁 뭐드세요";
		
		System.out.println(message);
		
		String[] emailLists = {
	            "alsdk6761@gmail.com",
	            "dcode0971@gmail.com",
	            "djduckgoo@gmail.com",
	            "ssam010925@gmail.com",
	            "croissen214@gmail.com",
	            "codefuling@gmail.com"
	    };
		
		for(String mail : emailLists) {
			ms.sendMail(mail, message);
		}
	}
}









