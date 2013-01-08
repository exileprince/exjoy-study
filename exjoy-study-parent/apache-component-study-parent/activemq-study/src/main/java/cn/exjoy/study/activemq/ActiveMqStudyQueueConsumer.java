package cn.exjoy.study.activemq;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.ActiveMQConnection;

import javax.jms.*;

/**
 * Created with IntelliJ IDEA.
 * User: zhangzhiqiang
 * Date: 13-1-6
 * Time: 下午6:06
 * Active Mq Study for Queue consumer
 */
public class ActiveMqStudyQueueConsumer {

    private Connection connection;

    private ConnectionFactory connectionFactory;

    private Session session;

    private Destination destination;

    private MessageConsumer consumer;

    protected void process() {
        connectionFactory = new ActiveMQConnectionFactory(
                ActiveMQConnection.DEFAULT_USER,
                ActiveMQConnection.DEFAULT_PASSWORD,
                "tcp://localhost:61616");

        try {
            connection = connectionFactory.createConnection();

            connection.start();

            session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

            destination = session.createQueue("autocreate.exjoy.cn");

            consumer = session.createConsumer(destination);

            while (true) {
                TextMessage message = (TextMessage) consumer.receive(10000);

                if (null != message) {
                    System.out.println(message.getText());
                    session.commit();
                } else {
                    break;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ActiveMqStudyQueueConsumer().process();
    }
}
