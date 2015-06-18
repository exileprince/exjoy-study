package cn.exjoy.study.activemq;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;


/**
 * Hello world!
 */
public class ActiveMqStudyTopicProducer {

    private ConnectionFactory connectionFactory;

    private Connection connection;

    private Session session;

    private Destination destination;

    private MessageProducer producer;

    public void process() {
        connectionFactory = new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_USER,
                ActiveMQConnection.DEFAULT_PASSWORD,
                "tcp://localhost:61616");

        try {

            System.out.println("start");
            connection = connectionFactory.createConnection();
            connection.start();

            session = connection.createSession(true, Session.AUTO_ACKNOWLEDGE);

            destination = session.createTopic("topicstudy.exjoy.cn");

            producer = session.createProducer(destination);

            producer.setDeliveryMode(DeliveryMode.PERSISTENT);

            Message message = session.createTextMessage("topic message");

//            message.setJMSDeliveryMode(DeliveryMode.NON_PERSISTENT);

            producer.send(message);

            session.commit();

            System.out.println("end");


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
        new ActiveMqStudyTopicProducer().process();
    }
}
