package xyz.kekhuay.prospring5.ch4;

import java.io.File;
import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DestructiveBeanWithInterface {
	
	private File file;
	private String filePath;
	
	@PostConstruct
	public void afterPropertiesSet() throws IOException {
		System.out.println("Initializing Bean");
		
		if (filePath == null) {
			throw new IllegalArgumentException("You must specify the file path property of " + DestructiveBeanWithInterface.class);
		}
		
		this.file = new File(filePath);
		this.file.createNewFile();
		
		System.out.println("File exists: " + file.exists());
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destroying Bean");
		
		if (!file.delete()) {
			System.out.println("ERROR: failed to delete file.");
		}
		
		System.out.println("File exists: " + file.exists());
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:spring/app-context-annotation.xml");
		ctx.registerShutdownHook();
		ctx.refresh();
		ctx.getBean("destructiveBean", DestructiveBeanWithInterface.class);
		ctx.close();
	}

}
