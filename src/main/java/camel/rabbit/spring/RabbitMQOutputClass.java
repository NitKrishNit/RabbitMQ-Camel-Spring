package camel.rabbit.spring;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.spring.SpringCamelContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RabbitMQOutputClass {
    public static final void main(String[] args) throws Exception{
        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext( "applicationContext.xml" );
        CamelContext camelContext = SpringCamelContext.springCamelContext( applicationContext,false );
        camelContext.addRoutes( new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("timer://simple?period=1000").setBody().simple( "TestMessage" ).to( "rabbitmq://localhost/myExchange?queue=myQueue" );

            }
        } );
        camelContext.start();
    }
}
