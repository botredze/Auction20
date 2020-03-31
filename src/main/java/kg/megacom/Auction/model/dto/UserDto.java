package kg.megacom.Auction.model.dto;

import lombok.Data;

@Data
public class UserDto {
    private Long idDto;
    private String nameDto;
    private String loginDto;
    private String passwordDto;
    private boolean is_activeDto;

}
