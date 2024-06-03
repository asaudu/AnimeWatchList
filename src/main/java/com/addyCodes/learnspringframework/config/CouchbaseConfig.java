package com.addyCodes.learnspringframework.config;

import com.couchbase.client.core.msg.kv.DurabilityLevel;
import com.couchbase.client.java.env.ClusterEnvironment;
import com.couchbase.client.java.transactions.config.TransactionsConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;

@Configuration
public class CouchbaseConfig extends AbstractCouchbaseConfiguration {
    @Value("${spring.couchbase.bootstrap-hosts}")
    private String hostName;

    @Value("${spring.couchbase.bucket.user}")
    private String username;

    @Value("${spring.couchbase.bucket.password}")
    private String password;

    @Value("${spring.couchbase.bucket.name}")
    private String bucketName;

    @Override
    public String getConnectionString() {
        return hostName;
    }

    @Override
    public String getUserName() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getBucketName() {
        return bucketName;
    }

    @Override
    public void configureEnvironment(ClusterEnvironment.Builder builder) {
        builder.transactionsConfig(TransactionsConfig.durabilityLevel(DurabilityLevel.NONE));
    }
}
