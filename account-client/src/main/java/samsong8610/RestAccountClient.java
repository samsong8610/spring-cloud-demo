package samsong8610;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * @author sam
 */
public class RestAccountClient implements AccountClient {
    public static final Logger logger = LoggerFactory.getLogger(RestAccountClient.class);
    private String serviceUrl;

    @Autowired
    private RestTemplate restTemplate;

    public RestAccountClient(String serviceUrl) {
        this.serviceUrl = serviceUrl.startsWith("http") ?
                serviceUrl : "http://" + serviceUrl;
        if (this.serviceUrl.endsWith("/")) {
            this.serviceUrl = this.serviceUrl.substring(0, this.serviceUrl.length() - 1);
        }
    }

    @PostConstruct
    public void demoOnly() {
        logger.info("The RestTemplate request factory is " + restTemplate.getRequestFactory().getClass());
    }

    @Override
    public List<AccountDto> list() {
        ResponseEntity<List<AccountDto>> entity = restTemplate.exchange(this.serviceUrl + "/accounts",
                HttpMethod.GET, null, new ParameterizedTypeReference<List<AccountDto>>() {});
        if (entity != null) {
            return entity.getBody();
        }
        return new ArrayList<>();
    }
}
