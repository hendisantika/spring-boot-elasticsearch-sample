package id.my.hendisantika.elasticsearchsample.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-elasticsearch-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 11/12/24
 * Time: 07.26
 * To change this template use File | Settings | File Templates.
 */
@Data
@Document(indexName = "itemindex")
public class Item {
    @Id
    private int id;
    @Field(type = FieldType.Text, name = "name")
    private String name;
    @Field(type = FieldType.Double, name = "price")
    private Double price;
    @Field(type = FieldType.Keyword, name = "brand")
    private String brand;
    @Field(type = FieldType.Keyword, name = "category")
    private String category;
}
