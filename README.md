# payPlatform
多线程安全实现简单的支付平台
1、分别创建buyer和seller两个类实现Runnable接口,重写run方法，run方法包含putout和getin方法，在transform类用synchronized修饰具体的putout和getin方法，保证安全。
2.在主函数新建两个线程，使用new Thread,Thread.sleep, Thread.start.
