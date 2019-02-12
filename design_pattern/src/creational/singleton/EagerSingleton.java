package creational.singleton;

/*public class EagerSingleton {

	// �ھ�̬��ʼ�����д�������ʵ������δ��뱣֤���̰߳�ȫ
	private static EagerSingleton uniqueInstance = new EagerSingleton();

	// Singleton��ֻ��һ�����췽�������Ǳ�private���εģ������û��޷�ͨ��new���������ö���ʵ��
	private EagerSingleton() {
		System.out.println("��~~��Ҫ��~~�Ҳ��뱻����~~�Һö�");
	}

	public static EagerSingleton getInstance() {
		return uniqueInstance;
	}
}*/

public enum EagerSingleton {
	// ����һ��ö�ٵ�Ԫ�أ������� Singleton ��һ��ʵ��
	INSTANCE;

	public void doSomeThing() {
		System.out.println("��~~��Ҫ��~~�Ҳ��뱻����~~�Һö�");
	}
}
