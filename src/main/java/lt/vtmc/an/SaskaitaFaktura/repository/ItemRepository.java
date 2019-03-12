package lt.vtmc.an.SaskaitaFaktura.repository;

import lt.vtmc.an.SaskaitaFaktura.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {




}
