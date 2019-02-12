package creational.factory.factory_method;

public class Test {
	public static void main(String[] args) {
		
		Producer producer = new MailFactory();
		Sender sender = producer.produce();
		sender.send();
	}
}
