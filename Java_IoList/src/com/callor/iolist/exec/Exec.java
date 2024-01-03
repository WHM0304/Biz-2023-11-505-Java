package com.callor.iolist.exec;

import com.callor.iolist.service.Service;
import com.callor.iolist.service.impl.ServiceImplV1;

public class Exec {
	
	public static void main(String[] args) {
		String data = "src/iolitst.txt";
		Service service = new ServiceImplV1(data);
		service.loadData();
		service.printData();
		
		
	}

}
