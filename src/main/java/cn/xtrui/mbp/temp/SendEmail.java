package cn.xtrui.mbp.temp;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import com.sun.mail.util.MailSSLSocketFactory;

public class SendEmail implements Runnable
{

    @Override
    public void run() {
        List<String> toList = new ArrayList<String>();
        toList.add("904024782@qq.com");
        toList.add("824008199@qq.com");
        String message = "hello,test yi xia";
        if(sendEmails(toList,message)){
            System.out.println("发送成功");
        }
        else {
            System.out.println(
                    "发送失败"
            );
        }


    }
    /**
    * @author we
     * @return 是否发送成功
     * @param to 目的邮箱地址列表
     * @param messageString 邮件内容
    **/
    public static boolean sendEmails(List<String> to, String messageString){
        // 收件人电子邮箱
        //String to = "904024782@qq.com";

        // 发件人电子邮箱
        String from = "admin@xtrui.cn";

        // 指定发送邮件的主机为 smtp.qq.com
        String host = "smtp.qq.com";

        // 获取系统属性
        Properties properties = System.getProperties();

        // 设置邮件服务器
        properties.setProperty("mail.smtp.host", host);

        properties.put("mail.smtp.auth", "true");
        MailSSLSocketFactory sf = null;
        try {
            sf = new MailSSLSocketFactory();
            sf.setTrustAllHosts(true);
        } catch (GeneralSecurityException e) {
            e.printStackTrace();
            return false;
        }

        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.ssl.socketFactory", sf);
        // 获取默认session对象
        Session session = Session.getDefaultInstance(properties,new Authenticator(){
            @Override
            public PasswordAuthentication getPasswordAuthentication()
            {
                return new PasswordAuthentication("admin@xtrui.cn", "rdyjidtaoybzbaib"); //发件人邮件用户名、密码
            }
        });

        try{
            // 创建默认的 MimeMessage 对象
            MimeMessage message = new MimeMessage(session);

            // Set From: 头部头字段
            message.setFrom(new InternetAddress(from));

            for (String s : to) {
                // Set To: 头部头字段
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(s));

                // Set Subject: 头部头字段
                message.setSubject("来自小天瑞的");


                // 设置消息体
                message.setText(messageString);

                // 发送消息
                Transport.send(message);
                System.out.println("Sent message successfully....from runoob.com");
            }
        }catch (MessagingException mex) {
            mex.printStackTrace();
            return false;
        }
        return true;
    }
}
