package structural.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Shop implements InvocationHandler {

	private Object brand;

	public Shop(Object brand) {
		this.brand = brand;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		System.out.println("我是商店" + this.getClass().getSimpleName() + ", 我要开始销售了");
		method.invoke(brand, args);
		System.out.println("我把酒销售完了");
		return null;
	}

}
