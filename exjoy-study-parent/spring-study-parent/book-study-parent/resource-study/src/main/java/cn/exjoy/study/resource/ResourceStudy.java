package cn.exjoy.study.resource;

import java.io.File;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

public class ResourceStudy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		testResource();

		testResourceLoader();
	}

	private static void testResourceLoader() {
		try {

			ResourceLoader rl = new PathMatchingResourcePatternResolver();
			Resource rs = rl.getResource("classpath:META-INF/resources/test.txt");

			System.out.println(rs.getFile().getAbsolutePath());

			ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();

			Resource[] rss = resolver.getResources("classpath:META-INF/**/*.txt");

			for (Resource resource : rss) {

				System.out.println(resource.getFile().getAbsolutePath());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void testResource() {
		Resource rs = new ClassPathResource("META-INF/resources/test.txt");

		try {

			File file = rs.getFile();
			System.out.println(file.getAbsolutePath());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
