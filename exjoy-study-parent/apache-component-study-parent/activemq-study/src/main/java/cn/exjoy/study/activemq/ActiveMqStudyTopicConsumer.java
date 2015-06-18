package cn.exjoy.study.activemq;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * Created with IntelliJ IDEA.
 * User: zhangzhiqiang
 * Date: 13-1-6
 * Time: 下午6:06
 * Activemq Study for topic consumer
 */
public class ActiveMqStudyTopicConsumer {

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

            session = connection.createSession(true, Session.AUTO_ACKNOWLEDGE);

            destination = session.createTopic("topicstudy.exjoy.cn");

//            session.setMessageListener();

            consumer = session.createConsumer(destination);

            while (true) {
                TextMessage message = (TextMessage) consumer.receive(100000);

                if (null != message) {
                    System.out.println(message.getText());
                    session.commit();
                } else {
                    break;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally {
            try {
                session.close();
                connection.close();
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new ActiveMqStudyTopicConsumer().process();
    }
}
