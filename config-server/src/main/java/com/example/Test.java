package com.example;

import java.security.Provider;
import java.security.Security;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class Test {
	
	static {
		  System.out.println(System.getProperty("java.version"));
		  for (Provider provider : Security.getProviders())
		    System.out.println(provider);
		}

		public static void main(String[] args) throws Exception {
		  KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
		  keyGenerator.init(128);
		  SecretKey secretKey = keyGenerator.generateKey();
		  Cipher cipher = Cipher.getInstance("AES");
		  cipher.init(Cipher.ENCRYPT_MODE, secretKey);
		}

}
