package structural.adapter.class_;

public class Adapter extends M4DataLine implements Target{

	@Override
	public void connect() {
		System.out.println("使用type-c转接头..........");
		super.connect();
	}

}
