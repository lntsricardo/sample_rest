//package com.sample.project.config;
//
//import javax.persistence.EntityManagerFactory;
//import javax.sql.DataSource;
//
//import org.flywaydb.core.Flyway;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.DependsOn;
//
//@Configuration
//public class AppConfig {
//	
//	@Bean(initMethod = "migrate")
//	public Flyway flyway() {
//		Flyway flyway = new Flyway();
//		flyway.setBaselineOnMigrate(true);
//		flyway.setLocations("classpath:/resources/db/migration");
//		flyway.setDataSource(dataSource());
//		return flyway;
//	}
//
//	@Bean @DependsOn("flyway")
//	public EntityManagerFactory entityManagerFactory() {
//		EntityManagerFactory factory = new;
//		bean.setDataSource(dataSource());
//		// other configurations
//		return bean.getObject();
//	}
//
//	@Bean
//	public DataSource dataSource() {
//		DataSource dataSource = new BasicDataSource();
//		// data source configuration
//		return dataSource;
//	}
//
//}
