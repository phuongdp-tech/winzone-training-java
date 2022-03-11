package com.winzone.sendgrid.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author <a href="mailto:phuongdp.tech@gmail.com">PhuongDP</a>
 */
@Data
@Builder
public class EmailDto {
    private List<String> emailToList;
    private List<String> emailCcList;
    private List<String> emailBccList;
    private String subject;
    private String body;
}
