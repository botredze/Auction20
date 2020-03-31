package kg.megacom.Auction.mapper;

import kg.megacom.Auction.model.dto.*;
import kg.megacom.Auction.model.entity.*;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClassMapper {

    ClassMapper INSTANSE= Mappers.getMapper(ClassMapper.class);

    BidsDto bidsToBidsDto (Bids bids);
    CustomerDto customerToCustomerDto (Customer customer);
    LotsDto lotsToLotsDto (Lots lots);
    StatusDto statusesToStatusDto (Statuses status);
    UserDto usersToUsersDto(Users users);

}
