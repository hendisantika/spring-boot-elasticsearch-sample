package id.my.hendisantika.elasticsearchsample.config;

import id.my.hendisantika.elasticsearchsample.model.Item;
import id.my.hendisantika.elasticsearchsample.repository.ItemRepository;
import id.my.hendisantika.elasticsearchsample.service.CSVParser;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-elasticsearch-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 11/12/24
 * Time: 07.31
 * To change this template use File | Settings | File Templates.
 */
@Configuration
@RequiredArgsConstructor
public class DataSetup {
    private final ItemRepository itemRepository;
    private final CSVParser csvParser;

    @PostConstruct
    public void setupData() {
        List<Item> itemList = csvParser.csvParser("items.csv");
        itemRepository.saveAll(itemList);
    }
}
