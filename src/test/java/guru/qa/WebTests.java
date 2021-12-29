package guru.qa;

import guru.qa.config.WebConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WebTests {

    @Test
    public void webTestLocale(){
        System.setProperty("env", "locale");

        WebConfig webConfig = ConfigFactory.create(WebConfig.class, System.getProperties());

        assertThat(webConfig.getBrowserName()).isEqualTo("chrome");
        assertThat(webConfig.getBrowserVersion()).isEqualTo("96");
    }

    @Test
    public void webTestRemote(){
        System.setProperty("env", "remote");

        WebConfig webConfig = ConfigFactory.create(WebConfig.class, System.getProperties());

        assertThat(webConfig.getBrowserName()).isEqualTo("chrome");
        assertThat(webConfig.getBrowserVersion()).isEqualTo("96");
        assertThat(webConfig.getRemoteUrl()).isEqualTo("https://fake.remote.url");
    }
}
