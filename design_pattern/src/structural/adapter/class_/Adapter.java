package structural.adapter.class_;

public class Adapter extends M4DataLine implements Target{

	@Override
	public void connect() {
		System.out.println("ʹ��type-cת��ͷ..........");
		super.connect();
	}

}
