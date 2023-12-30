package com.util;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.MessageDigestSpi;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.NoSuchElementException;
import javax.net.ssl.StandardConstants;

public class ApplicationUtil {


	    public String generateUniqueId() {
	       return generateSCMId();
	    }

	    private String generateSCMId() {
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyMddHHmmSS");
	        String timestamp = dateFormat.format(new Date());
	        int randomSuffix = (int) (Math.random() * 1000); // Add a random suffix for uniqueness
	        return timestamp + String.format("%03d", randomSuffix);
	    }
	    public static String hashPassword(String password) {
	        try {
	            MessageDigest digest = MessageDigest.getInstance("SHA-256");
	            byte[] encodedHash = digest.digest(password.getBytes(StandardCharsets.UTF_8));

	            StringBuilder hexString = new StringBuilder(2 * encodedHash.length);
	            for (byte b : encodedHash) {
	                String hex = Integer.toHexString(0xff & b);
	                if (hex.length() == 1) {
	                    hexString.append('0');
	                }
	                hexString.append(hex);
	            }

	            return hexString.toString();
	        } catch (NoSuchAlgorithmException e) {
	            e.printStackTrace(); // Handle the exception appropriately
	            return null;
	        }
	    }

	    public static void main(String[] args) {
	        String password = "user123";
	        String hashedPassword = hashPassword(password);
	        System.out.println("Hashed Password: " + hashedPassword);
	    }

	    }


