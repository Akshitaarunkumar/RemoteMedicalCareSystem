import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class JavaMailUtil {
    //the method to send mail 
    public static void sendMail(String sender, String recipient, String msg, String subject) throws Exception {
        Properties properties = new Properties();

        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        String myPass = "";
        //Password authentication
        Session session = Session.getInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(sender, myPass);
            }
        });
        //message preparation to send
        Message message = prepareMessage(session, sender, recipient, msg, subject);
        //to send message
        Transport.send(message);
    }

    private static Message prepareMessage(Session session, String myEmail, String recipient, String msg, String subject) {
        try {
            //session opened to send message
            Message message = new MimeMessage(session);
            //to set sender mailid
            message.setFrom(new InternetAddress(myEmail));
            //to set recipient id
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
            //to set subject
            message.setSubject(subject);
            //to set message
            message.setText(msg);
            return message;
        } catch (MessagingException ex) {
            Logger.getLogger(JavaMailUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
