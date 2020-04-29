package com.itpractice;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {

	public static void main(String[] args) throws UnknownHostException {
     
		InetAddress address = InetAddress.getByName("192.168.88.101"); 
	    System.out.println(address);
	    
	    System.out.println(address.getHostAddress());
	    System.out.println(address.getHostName());
	    System.out.println(address.getLocalHost());
	}

}
