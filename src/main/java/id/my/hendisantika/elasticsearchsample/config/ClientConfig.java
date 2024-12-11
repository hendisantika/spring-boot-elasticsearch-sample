package id.my.hendisantika.elasticsearchsample.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.elc.ElasticsearchConfiguration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-elasticsearch-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 11/12/24
 * Time: 07.30
 * To change this template use File | Settings | File Templates.
 */
@Configuration
@EnableElasticsearchRepositories(basePackages = "id.my.hendisantika.elasticsearchsample.repository")
public class ClientConfig extends ElasticsearchConfiguration {
    @Override
    public ClientConfiguration clientConfiguration() {
        return ClientConfiguration.builder().connectedTo("localhost:9200").build();
    }
}
