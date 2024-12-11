package id.my.hendisantika.elasticsearchsample.controller;

import id.my.hendisantika.elasticsearchsample.model.Item;
import id.my.hendisantika.elasticsearchsample.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-elasticsearch-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 11/12/24
 * Time: 07.40
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping("/api/v1/items")
@RequiredArgsConstructor
public class ItemController {
    private final ItemService itemService;

    @GetMapping("/{name}")
    public List<Item> getItemByName(@PathVariable("name") String name) {
        return itemService.findByName(name);
    }

    @GetMapping("/category/{category}")
    public List<Item> getItemsByCategory(@PathVariable("category") String category) {
        return itemService.findByCategory(category);
    }
}
