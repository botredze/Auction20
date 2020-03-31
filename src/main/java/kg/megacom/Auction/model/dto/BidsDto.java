package kg.megacom.Auction.model.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class BidsDto {

    private Long idDto;
    private LocalDate add_dateDto;
    private double bidValueDto;

    private  boolean activeDto;

}
