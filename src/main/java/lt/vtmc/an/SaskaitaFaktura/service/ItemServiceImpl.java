package lt.vtmc.an.SaskaitaFaktura.service;

import lt.vtmc.an.SaskaitaFaktura.model.Invoice;
import lt.vtmc.an.SaskaitaFaktura.model.Item;
import lt.vtmc.an.SaskaitaFaktura.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ItemServiceImpl implements ItemService{
@Autowired
    private ItemRepository itemRepository;

    @Override
    public List<Item> listAllItems() {
        return itemRepository.findAll();
    }

    @Override
    public Optional<Item> findItemById(Long id) {
        return Optional.empty();
    }

    @Override
    public void createItem(Item item) {
itemRepository.save(item);
    }

    @Override
    public Item editItemById(Long id, Item item) {
        return null;
    }

    @Override
    public void deleteItemById(Long id) {

    }
}
