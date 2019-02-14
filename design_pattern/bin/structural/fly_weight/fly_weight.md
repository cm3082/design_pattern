享元模式角色划分
FlyWeight 享元接口或者（抽象享元类），定义共享接口
ConcreteFlyWeight 具体享元类，该类实例将实现共享
UnSharedConcreteFlyWeight 非共享享元实现类
FlyWeightFactory 享元工厂类，控制实例的创建和共享


享元模式的主要目的是实现对象的共享，即共享池，当系统中对象多的时候可以减少内存的开销，通常与工厂模式一起使用。
-----