package guru.qa.config;

import org.aeonbits.owner.Config;


@Config.Sources({"file:/tmp/token.properties", "classpath:token.properties"})
public interface ApiConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://pinterest.com")
    String getBaseUrl();

    @Key("token")
    String getToken();
}
