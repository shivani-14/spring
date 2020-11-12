package com.training.org.SpringbootApplication;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Component
@ConfigurationProperties
@Validated
public class GlobalProperties {
    @Max(5)
    @Min(0)
    private int threadPool;
    private String email;
   
   
    public GlobalProperties() {
	super();
}
    
	public GlobalProperties(@Max(5) @Min(0) int threadPool, @NotEmpty String email) {
		super();
		this.threadPool = threadPool;
		this.email = email;
	}

	//getters and setters
public int getThreadPool() {
	return threadPool;
}
public void setThreadPool(int threadPool) {
	this.threadPool = threadPool;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
   
}


