package br.com.gravata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;

import javax.persistence.EntityManagerFactory;

/**
 * criado por bruno em 11/10/17.
 */
@SpringBootApplication
public class Configuracao {

    public static void main(String ... args){
        SpringApplication.run(Configuracao.class,args);
    }


    @Bean
    public HibernateJpaSessionFactoryBean sessionFactory(EntityManagerFactory emf) {
        HibernateJpaSessionFactoryBean factory = new HibernateJpaSessionFactoryBean();
        factory.setEntityManagerFactory(emf);
        return factory;
    }

}
