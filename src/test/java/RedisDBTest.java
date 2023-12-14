import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.lettuce.core.RedisClient;
import io.lettuce.core.api.StatefulRedisConnection;
import io.lettuce.core.api.sync.RedisStringCommands;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import ru.javarush.lukyanov.hibernateFinal.repository.redis.CityCountry;

import java.util.List;

import static ru.javarush.lukyanov.hibernateFinal.Main.prepareRedisClient;

public class RedisDBTest {
    public ObjectMapper mapper;
    public static RedisClient redisClient;

    @BeforeAll
    private void setup() {
        redisClient = prepareRedisClient();
        mapper = new ObjectMapper();
    }

    @AfterAll
    static void tearDown() {
        redisClient.close();
    }

    private void testRedisData(List<Integer> ids) {
        try (StatefulRedisConnection<String, String> connection = redisClient.connect()) {
            RedisStringCommands<String, String> sync = connection.sync();
            for (Integer id : ids) {
                String value = sync.get(String.valueOf(id));
                try {
                    mapper.readValue(value, CityCountry.class);
                } catch (JsonProcessingException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
