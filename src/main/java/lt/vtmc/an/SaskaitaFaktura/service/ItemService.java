package lt.vtmc.an.SaskaitaFaktura.service;

import lt.vtmc.an.SaskaitaFaktura.model.Item;

import java.util.List;
import java.util.Optional;

public interface ItemService {

    List<Item> listAllItems();

    Optional<Item> findItemById(Long id);

    void createItem(Item item);

    Item editItemById(Long id, Item item);

    void deleteItemById(Long id);

}
