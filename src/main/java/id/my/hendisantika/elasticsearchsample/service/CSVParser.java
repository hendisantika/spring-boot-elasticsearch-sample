package id.my.hendisantika.elasticsearchsample.service;

import id.my.hendisantika.elasticsearchsample.model.Item;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
@Service
public class CSVParser {
    public List<Item> csvParser(String filePath) {
        List<Item> itemList = new ArrayList<>();
        try {
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream(filePath);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            CSVReader reader = new CSVReader(inputStreamReader);
            String[] headers = reader.readNext();
            String[] row;
            while ((row = reader.readNext()) != null) {
                Item item = new Item();
                for (int i = 0; i < headers.length; i++) {
                    String header = headers[i];
                    String value = row[i];
                    if ("id".equalsIgnoreCase(header)) {
                        item.setId(Integer.parseInt(value));
                    }
                    if ("name".equalsIgnoreCase(header)) {
                        item.setName(value);
                    }
                    if ("price".equalsIgnoreCase(header)) {
                        item.setPrice(Double.valueOf(value));
                    }
                    if ("brand".equalsIgnoreCase(header)) {
                        item.setBrand(value);
                    }
                    if ("category".equalsIgnoreCase(header)) {
                        item.setCategory(value);
                    }
                }
                itemList.add(item);
            }
        } catch (CsvValidationException | IOException e) {
            throw new RuntimeException(e);
        }
        return itemList;
    }
}
