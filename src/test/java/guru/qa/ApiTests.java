package guru.qa;

import guru.qa.config.ApiConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class ApiTests {

    @Test
    public void apiTest(){
        ApiConfig apiConfig = ConfigFactory.create(ApiConfig.class, System.getProperties());
        assertThat(apiConfig.getBaseUrl()).isEqualTo("https://pinterest.com");
        assertThat(apiConfig.getToken()).isEqualTo("123abc");
    }
}
