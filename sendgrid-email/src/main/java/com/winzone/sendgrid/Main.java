package com.winzone.sendgrid;

import com.winzone.sendgrid.dto.EmailDto;
import com.winzone.sendgrid.service.EmailService;
import com.winzone.sendgrid.service.SendGridService;

import java.util.Collections;

/**
 * @author <a href="mailto:phuongdp.tech@gmail.com">PhuongDP</a>
 */
public class Main {
    public static void main(String[] args) {
        EmailService emailService = new SendGridService();
        EmailDto emailDto = EmailDto.builder()
                .subject("Winzone test send email")
                .emailToList(Collections.singletonList("phuongdp.tech@gmail.com"))
                .body("<b>Winzone send to you a welcome message</b>")
                .build();

        emailService.sendEmail(emailDto);
    }
}
