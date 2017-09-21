# RabbitMQ-Camel-Spring

This gives a small idea about how to integrate rabbitmq with spring and add support by camel. 

The rabbitmq: component allows you produce and consume messages from RabbitMQ instances. 

RabbitMQ AMQP client offers a pure RabbitMQ approach over the generic AMQP component.

Maven users will need to add the following dependency to their pom.xml for this component:
```
<dependency>
    <groupId>org.apache.camel</groupId>
    <artifactId>camel-rabbitmq</artifactId>
    <version>x.x.x</version>
    <!-- use the same version as your Camel core version -->
</dependency>
```

URI format : rabbitmq://hostname[:port]/exchangeName?[options]

For more details refer : http://camel.apache.org/rabbitmq.html
