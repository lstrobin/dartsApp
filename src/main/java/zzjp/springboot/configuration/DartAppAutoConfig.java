package zzjp.springboot.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by lukasz on 3/26/17.
 *
 * Exampe of how to set bean fields using properties files. Hence - any bean can have different
 * field values for different profiles or other test or custom settings
 */
@Component
public class DartAppAutoConfig {

    @Bean
    @ConfigurationProperties(prefix="bean.custom.mybean")
    public MyBean createConfguredBean() {

        return new MyBean();
    }


}



