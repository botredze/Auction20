package kg.megacom.Auction.model.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class LotsDto {
    private  Long idDto;

    private String nameDto;
    private double maxPriceDto;
    private double minPriceDto;
    private double stepDto;

    private LocalDate start_DateDto;
    private LocalDate endDateDto;
}
