package com.winzone.sendgrid.service;


import com.winzone.sendgrid.dto.EmailDto;

/**
 * @author <a href="mailto:phuongdp.tech@gmail.com">PhuongDP</a>
 */
public interface EmailService {

    boolean sendEmail(EmailDto emailDto);
}
