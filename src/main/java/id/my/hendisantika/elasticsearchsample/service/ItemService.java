package id.my.hendisantika.elasticsearchsample.service;

import id.my.hendisantika.elasticsearchsample.model.Item;
import id.my.hendisantika.elasticsearchsample.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-elasticsearch-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 11/12/24
 * Time: 07.29
 * To change this template use File | Settings | File Templates.
 */
@Service
@RequiredArgsConstructor
public class ItemService {
    private final ItemRepository itemRepository;

    public List<Item> findByName(String itemName) {
        return itemRepository.findByName(itemName);
    }

    public List<Item> findByCategory(String category) {
        return itemRepository.findByCategory(category);
    }

    public List<Item> findByPriceBetween(double low, double high) {
        return itemRepository.findByPriceBetween(low, high);
    }
}