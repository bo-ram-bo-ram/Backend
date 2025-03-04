package com.ChargeControl.www.Backend.api.violation.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ViolationResponseDto {

    private long id;
    private String carNumber;
    private String carImage;
    private String violationContent;
    private String violationPlace;
    private String violationDate;

}
