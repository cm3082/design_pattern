package structural.adapter.class_;

public class Test {
	public static void main(String[] args) {
		Target m5 = new M5DataLine();
		m5.connect();
		
		Target adapter = new Adapter();
		adapter.connect();
	}
}
