优点

可以让任何两个没有关联的类一起运行
提高了类的复用，想使用现有的类，而此类的接口标准又不符合现有系统的需要。通过适配器模式就可以让这些功能得到更好的复用。
增加了类的透明度，客户端只关注结果
使用适配器的时候，可以调用自己开发的功能，从而自然地扩展系统的功能。
缺点

过多使用会导致系统凌乱，追溯困难（内部转发导致，调用A适配成B）


建议尽量使用对象的适配器模式，少用继承。适配器模式也是一种包装模式，它与装饰模式同样具有包装的功能，此外，对象适配器模式还具有委托的意思。总的来说，适配器模式属于补偿模式，专门用来在系统后期扩展、修改时使用，但要注意不要过度使用适配器模式