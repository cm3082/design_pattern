package creational.factory.factory_method;

public class MailFactory implements Producer {

	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new MailSender();
	}

}
