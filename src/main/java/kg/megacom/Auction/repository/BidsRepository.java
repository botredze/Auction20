package kg.megacom.Auction.repository;

import kg.megacom.Auction.model.entity.Bids;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BidsRepository extends JpaRepository<Bids, Long> {
}
