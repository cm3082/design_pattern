package creational.singleton;

public class LazySingleton {

	private static LazySingleton uniqueInstance;

	private LazySingleton() {
		System.out.println("��~~��Ҫ��~~�Ҳ��뱻����~~�Һ���");
	}

	// 1. û�м���synchronized�ؼ��ֵİ汾���̲߳���ȫ��
	public static LazySingleton getInstance_1() {

		if (uniqueInstance == null) {
			return new LazySingleton();
		} else {
			return uniqueInstance;
		}
	}

	// 2. �̰߳�ȫ��
	public static synchronized LazySingleton getInstance_2() {
		if (uniqueInstance == null) {
			uniqueInstance = new LazySingleton();
		}
		return uniqueInstance;
	}

	// 3. ˫�ؼ�������double-checked locking��
	// volatile��֤����uniqueInstance��������ʼ����Singletonʵ��ʱ������߳̿�����ȷ����uniqueInstance����
	private volatile static LazySingleton uniqueInstance3;

	public static LazySingleton getInstance_3() {
		// ���ʵ������������ڣ��ͽ���ͬ�������
		if (uniqueInstance3 == null) {
			// ֻ�е�һ�βų���ִ������Ĵ���
			synchronized (LazySingleton.class) {
				// ����ͬ���������ټ��һ�Σ��������null���Ŵ���ʵ��
				if (uniqueInstance3 == null) {
					uniqueInstance3 = new LazySingleton();
				}
			}
		}
		return uniqueInstance3;
	}

	// 4. �Ǽ�ʽ/��̬�ڲ��෽ʽ
	// ֻ��ͨ����ʽ���� getInstance ����ʱ���Ż���ʽװ�� SingletonHolder �࣬�Ӷ�ʵ����
	// instance��ֻ�е�һ��ʹ�����������ʵ����ʱ��ż��أ�ͬʱ�������̰߳�ȫ���⣩��
	private static class SingletonHolder {
		private static final LazySingleton INSTANCE = new LazySingleton();
	}

	public static final LazySingleton getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
