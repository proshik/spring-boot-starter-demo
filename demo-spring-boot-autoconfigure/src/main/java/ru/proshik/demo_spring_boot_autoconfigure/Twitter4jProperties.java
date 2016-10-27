package ru.proshik.demo_spring_boot_autoconfigure;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * Created by proshik on 27.10.16.
 */
@ConfigurationProperties(prefix= Twitter4jProperties.TWITTER4J_PREFIX)
public class Twitter4jProperties {

    static final String TWITTER4J_PREFIX = "twitter4j";

    private Boolean debug = false;

    @NestedConfigurationProperty
    private OAuth oauth = new OAuth();

    public Boolean getDebug() {
        return debug;
    }

    public void setDebug(Boolean debug) {
        this.debug = debug;
    }

    public OAuth getOauth() {
        return oauth;
    }

    public void setOauth(OAuth oauth) {
        this.oauth = oauth;
    }

    public static class OAuth {

        private String consumerKey;
        private String consumerSecret;
        private String accessToken;
        private String accessTokenSecret;

        public String getConsumerKey() {
            return consumerKey;
        }
        public void setConsumerKey(String consumerKey) {
            this.consumerKey = consumerKey;
        }
        public String getConsumerSecret() {
            return consumerSecret;
        }
        public void setConsumerSecret(String consumerSecret) {
            this.consumerSecret = consumerSecret;
        }
        public String getAccessToken() {
            return accessToken;
        }
        public void setAccessToken(String accessToken) {
            this.accessToken = accessToken;
        }
        public String getAccessTokenSecret() {
            return accessTokenSecret;
        }
        public void setAccessTokenSecret(String accessTokenSecret) {
            this.accessTokenSecret = accessTokenSecret;
        }

    }

}
