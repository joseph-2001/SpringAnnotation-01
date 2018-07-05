package com.atguigu.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.util.StringValueResolver;

import com.atguigu.bean.Yellow;
import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@PropertySource("classpath:db.properties")
public class MainConfigOfProfile implements EmbeddedValueResolverAware {

    @Value("${db.user}")
    private String user;

    private String driverClass;

    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        driverClass = resolver.resolveStringValue("${db.driverClass}");
    }

    @Bean
    @Profile("iacp")
    public Yellow yelllow() {
        return new Yellow();
    }

    @Bean(name = "dsIacp")
    //@Profile("default")
    @Profile("iacp")
    public DataSource dataSourceIacp(@Value("${db.password}") String pwd) throws Exception {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser(user);
        dataSource.setPassword(pwd);
        dataSource.setJdbcUrl("jdbc:mysql://172.16.75.203/iacp");
        dataSource.setDriverClass(driverClass);
        return dataSource;
    }

    @Bean(name = "dsJobrec")
    @Profile("jobrec")
    public DataSource dataSourceJobrec(@Value("${db.password}") String pwd) throws Exception {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser(user);
        dataSource.setPassword(pwd);
        dataSource.setJdbcUrl("jdbc:mysql://172.16.75.203/jobrec");
        dataSource.setDriverClass(driverClass);
        return dataSource;
    }

    @Bean(name = "dsTrack")
    @Profile("track")
    public DataSource dataSourceTrack(@Value("${db.password}") String pwd) throws Exception {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser(user);
        dataSource.setPassword(pwd);
        dataSource.setJdbcUrl("jdbc:mysql://172.16.75.203/track");
        dataSource.setDriverClass(driverClass);
        return dataSource;
    }

}
