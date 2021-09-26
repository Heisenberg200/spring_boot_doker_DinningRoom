package com.example.spring.boot.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ComponentScan
public class Order {
private int id;
private int priority;
private int max_wait;
public Order()
{
	this.id = id;
	this.priority = priority;
	this.max_wait = max_wait;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getPriority() {
	return priority;
}
public void setPriority(int priority) {
	this.priority = priority;
}
public int getMax_wait() {
	return max_wait;
}
public void setMax_wait(int max_wait) {
	this.max_wait = max_wait;
}




}
