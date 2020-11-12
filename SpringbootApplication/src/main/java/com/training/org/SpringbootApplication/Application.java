package com.training.org.SpringbootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController


@ConfigurationProperties(prefix = "mail")
public class Application<DatabaseProperties> {
	
	
	
	
	Logger logger=LoggerFactory.getLogger(Application.class);
	private String hostname;
	private int port;
	private String from;
	private List<String> mailCollection;
	private Map<String,String> additionalHeaders;
	private DatabaseProperties dbProp;


	public Map<String, String> getAdditionalHeaders() {
		return additionalHeaders;
	}

	public void setAdditionalHeaders(Map<String, String> additionalHeaders) {
		this.additionalHeaders = additionalHeaders;
	}

	public DatabaseProperties getDbProp() {
		return dbProp;
	}

	public void setDbProp(DatabaseProperties dbProp) {
		this.dbProp = dbProp;
	}

	public List<String> getMailCollection() {
		return mailCollection;
	}

	public void setMailCollection(List<String> mailCollection) {
		this.mailCollection = mailCollection;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	
	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	//	@Value("${spring.application.name}")
	/////	@Size(min = 0,max = 10)
	//	private String appName;
	////    @Max(5)
	////    @Min(0)
	////    private int threadPool;
	//    
	//    @Pattern(regexp = "^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}$")
	//    private String email;
	////
	//	
	@GetMapping("/")
	public String getDetails() {
		//	email="abc";
		

		logger.debug("This is DEBUG Message");
		logger.info("This is Infor message");
		logger.warn("This is warn message");
		logger.error("This is error message");
		logger.trace("This is trace messsage");
		
		return "\nHostName:- "+ hostname+ "\nPort:- "+port+"\nFrom:- "+from+"\nMailCollection:- "+mailCollection+"\nDBprop:- "+dbProp+"\nAdditionalHeaders:- "+additionalHeaders;
	}

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(Application.class, args);
		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for (String beanName : beanNames){
			System.out.println(beanName);
		}
	}
}


