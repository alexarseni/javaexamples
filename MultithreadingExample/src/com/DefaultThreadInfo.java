package com;

public class DefaultThreadInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		System.out.println(t);
		t.setName("MyThread");
		t.setPriority(1);
		System.out.println(t);
	}

}
