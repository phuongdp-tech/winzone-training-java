package com.winzone.sendgrid.service;

import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;
import com.sendgrid.helpers.mail.objects.Personalization;
import com.winzone.sendgrid.dto.EmailDto;

import java.io.IOException;
import java.util.Objects;

/**
 * @author <a href="mailto:phuongdp.tech@gmail.com">PhuongDP</a>
 */
public class SendGridService implements EmailService {

    // Maybe change to config properties
    private final String SENDER_NAME = "{Please replace your sender name}";
    private final String SENDER_EMAIL = "{Please replace your sender email}";
    private final String API_KEY = "{Please replace your API_KEY}";

    /**
     * Method will call v3 API of SendGrid service
     * @param emailDto the email information
     * @return
     * true: Sent success
     * false: Sent failed
     */
    @Override
    public boolean sendEmail(EmailDto emailDto) {
        Objects.requireNonNull(emailDto.getEmailToList());

        // Setting sender information
        Email sender = new Email(SENDER_EMAIL, SENDER_NAME);

        // Setting email to, email cc, email bcc
        Personalization personalization = new Personalization();
        emailDto.getEmailToList().forEach(e -> personalization.addTo(new Email(e)));

        if (Objects.nonNull(emailDto.getEmailCcList())) {
            emailDto.getEmailCcList().forEach(e -> personalization.addCc(new Email(e)));
        }

        if (Objects.nonNull(emailDto.getEmailBccList())) {
            emailDto.getEmailBccList().forEach(e -> personalization.addBcc(new Email(e)));
        }

        // Setting content email
        Content content = new Content("text/html", emailDto.getBody());

        Mail mail = new Mail();
        mail.setFrom(sender);
        mail.setSubject(emailDto.getSubject());
        mail.addPersonalization(personalization);
        mail.addContent(content);

        try {
            SendGrid sendGrid = new SendGrid(API_KEY);
            Request request = new Request();
            request.setMethod(Method.POST);
            request.setEndpoint("mail/send");
            request.setBody(mail.build());
            Response response = sendGrid.api(request);
            return response.getStatusCode() == 202;
        } catch (IOException exception) {
            return false;
        }
    }
}
