package com.boot.demo.app.properties;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class AwsProperties {
    @Value("${aws.access.key:#{null}}")
    private String accessKey;
    @Value("${aws.access.secretKey:#{null}}")
    private String secretKey;
    @Value("${aws.access.region:#{null}}")
    private String region;
    @Value("${aws.access.s3region:#{null}}")
    private String s3Region;
    @Value("${aws.access.profile:#{null}}")
    private String profile;
}
