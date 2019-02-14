package structural.adapter.object;

class Adapter implements Target {

	private M4DataLine target;

	public Adapter(M4DataLine target) {
		this.target = target;
	}

	@Override
	public void connect() {
		System.out.println("插入 type-c 转接头");
		target.connect();
	}

}
