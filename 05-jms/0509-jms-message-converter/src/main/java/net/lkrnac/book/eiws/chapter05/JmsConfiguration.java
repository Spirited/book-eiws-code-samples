package net.lkrnac.book.eiws.chapter05;

import javax.jms.ConnectionFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.MessageType;

@Configuration
@EnableJms
public class JmsConfiguration {
  @Bean
  public JmsTemplate jmsTemplate(ConnectionFactory connectionFactory,
      MessageConverter messageConverter) {
    JmsTemplate jmsTemplate = new JmsTemplate(connectionFactory);
    jmsTemplate.setMessageConverter(messageConverter);
    return jmsTemplate;
  }

  @Bean
  public MessageConverter messageConverter() {
    MappingJackson2MessageConverter messageConverter =
        new MappingJackson2MessageConverter();
    messageConverter.setTargetType(MessageType.TEXT);
    messageConverter.setTypeIdPropertyName("__type");
    return messageConverter;
  }

  @Bean
  public DefaultJmsListenerContainerFactory jmsListenerContainerFactory(
      ConnectionFactory connectionFactory, MessageConverter messageConverter) {
    DefaultJmsListenerContainerFactory factory =
        new DefaultJmsListenerContainerFactory();
    factory.setConnectionFactory(connectionFactory);
    factory.setMessageConverter(messageConverter);
    return factory;
  }
}
