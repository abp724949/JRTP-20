package com.ashokit.security;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Passwordervice {
	
 int i=10;
 int j=20;
 int k=30;
	public static String encode(String txt) {

		Encoder encoder = Base64.getEncoder();
		return encoder.encodeToString(txt.getBytes());

	}
	
	public static String Decode(String encodedtxt) {
		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(encodedtxt);
		return new String(decode);
		
	}
	
	public void m1() {
		System.out.println("Arjun");
	}
	
	public static void main(String[] args) {
		
		String encode = Passwordervice.encode("Arjun");
		System.out.println(encode);
		
		String decode = Passwordervice.Decode(encode);
		System.out.println(decode);
		
		
		
		
		
		
		
	}

}
