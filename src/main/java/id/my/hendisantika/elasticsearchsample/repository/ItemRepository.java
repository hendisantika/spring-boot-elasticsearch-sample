package id.my.hendisantika.elasticsearchsample.repository;

import id.my.hendisantika.elasticsearchsample.model.Item;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-elasticsearch-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 11/12/24
 * Time: 07.28
 * To change this template use File | Settings | File Templates.
 */
public interface ItemRepository extends ElasticsearchRepository<Item, Integer> {
    List<Item> findByName(String name);

    List<Item> findByCategory(String category);

    List<Item> findByPriceBetween(double low, double high);
}
