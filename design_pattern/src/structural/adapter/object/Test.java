package structural.adapter.object;

public class Test {
	public static void main(String[] args) {
		Target m5 = new M5DataLine();
		m5.connect();
		
        // 使用特殊功能类，即适配类
        Target adapter = new Adapter(new M4DataLine());
        adapter.connect();
	}
}
