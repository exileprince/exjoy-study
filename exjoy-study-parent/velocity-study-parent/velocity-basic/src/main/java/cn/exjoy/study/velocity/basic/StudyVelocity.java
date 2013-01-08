package cn.exjoy.study.velocity.basic;

import java.io.StringWriter;
import java.util.Properties;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

public class StudyVelocity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * http://blog.csdn.net/sundryl6i/article/details/5573031
		 * 在Velocity中默认加载vm文件的类是FileResourceLoader，而这个类是用File来读取vm文件的
		 */

		Properties properties = new Properties();
		properties.put("file.resource.loader.class",
				"org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");

		Velocity.init(properties);

		// Velocity.

		// Map<String, String> data =new HashMap<String, String>();
		// data.put("key1", "fdsfasdfasdfasdfsadfasdf");
		// data.put("key2", "fdsfasdfasdfasdfsadfasdfgg");
		// data.put("key3", "fdsfasdfasdfasdfsadfasdfxxxx");
		// data.put("key4", "fdsfasdfasdfasdfsadfasdfggggggg");

		// Map<String, Model> data =new LinkedHashMap<String, Model>();
		// Model model1 = new Model();
		// model1.setName("11111");
		// model1.setSex("sssss");
		// data.put(model1.getName(), model1);
		//
		// Model model2 = new Model();
		// model2.setName("222222");
		// model2.setSex("fffff");
		// data.put(model2.getName(), model2);

		Model[] data = new Model[2];
		Model model2 = new Model();
		model2.setName("222222");
		model2.setSex("fffff");
		Model model1 = new Model();
		model1.setName("11111");
		model1.setSex("sssss");
		data[0] = model1;
		data[1] = model2;

		VelocityContext context = new VelocityContext();

		context.put("data", data);

		Template template = Velocity.getTemplate("test.vm");

		StringWriter sw = new StringWriter();

		template.merge(context, sw);

		System.out.println(sw.toString());

	}
}
