package structural.adapter.object;

public class Test {
	public static void main(String[] args) {
		Target m5 = new M5DataLine();
		m5.connect();
		
        // ʹ�����⹦���࣬��������
        Target adapter = new Adapter(new M4DataLine());
        adapter.connect();
	}
}
