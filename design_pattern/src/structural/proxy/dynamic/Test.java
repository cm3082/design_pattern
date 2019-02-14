package structural.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) {
		Wine maotai = new Maotai();
		InvocationHandler handler1 = new Shop(maotai);
		Wine dynamicProxy1 = (Wine) Proxy.newProxyInstance(Maotai.class.getClassLoader(), Maotai.class.getInterfaces(),
				handler1);
		dynamicProxy1.sell();
		
		
		Wine wuliangye = new Wuliangye();
		InvocationHandler handler2 = new Shop(wuliangye);
		Wine dynamicProxy2 = (Wine) Proxy.newProxyInstance(Maotai.class.getClassLoader(), Maotai.class.getInterfaces(),
				handler2);
		dynamicProxy2.sell();
		
		Cigarette furongwang = new Furongwang();
		InvocationHandler handler3 = new Shop(furongwang);
		Cigarette dynamicProxy3 = (Cigarette) Proxy.newProxyInstance(Furongwang.class.getClassLoader(), Furongwang.class.getInterfaces(),
				handler3);
		dynamicProxy3.sell();
	}
}
