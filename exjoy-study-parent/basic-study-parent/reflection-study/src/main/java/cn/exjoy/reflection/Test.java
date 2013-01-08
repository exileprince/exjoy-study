package cn.exjoy.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import cn.exjoy.reflection.domain.Book;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		Book xx = new Book();
		
		Class<?> class1 = Book.class;
		Class<?> class2 = xx.getClass();
		Class<?> class3 = Class.forName("cn.exjoy.reflection.domain.Book");
		Class<?> class4 = Thread.currentThread().getContextClassLoader().loadClass("cn.exjoy.reflection.domain.Book");
		
		System.out.println(class1 == class2);
		System.out.println(class1 == class3);
		System.out.println(class1 == class4);
		
		
	   System.out.println(Book.class.getName());
		System.out.println(xx.getClass().getName());
		System.out.println(Class.forName("cn.exjoy.reflection.domain.Book").getName());
	   
		try {
			ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

			Class<?> clazz = classLoader.loadClass("cn.exjoy.reflection.domain.Book");

			Constructor<?> constructor = clazz.getConstructor((Class<?>[]) null);

			Object book = constructor.newInstance();

			Method setTitle = clazz.getMethod("setTitle", String.class);
			setTitle.invoke(book, "测试");

			System.out.println(book);

			for (Method method : clazz.getDeclaredMethods()) {
				System.out.println(method.toString());

				if (method.getParameterTypes().length > 0)
					System.out.println(method.getParameterTypes()[0].getName());
				System.out.println(method.getReturnType().getName());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
