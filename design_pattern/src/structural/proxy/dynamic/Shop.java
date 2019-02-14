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

		System.out.println("�����̵�" + this.getClass().getSimpleName() + ", ��Ҫ��ʼ������");
		method.invoke(brand, args);
		System.out.println("�ҰѾ���������");
		return null;
	}

}
