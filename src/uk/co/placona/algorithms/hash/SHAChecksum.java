package uk.co.placona.algorithms.hash;

import java.io.InputStream;
import java.security.MessageDigest;

public class SHAChecksum {

	public String generate(InputStream fis) throws Exception {
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		byte[] dataBytes = new byte[1024];
		
		int nread = 0;
		
		while((nread = fis.read(dataBytes)) != -1){
			md.update(dataBytes, 0, nread);
		}
		
		byte[] mdbytes = md.digest();
		
		// Now convert the byte to hex format
		StringBuffer hexString = new StringBuffer();
    	for (int i=0;i<mdbytes.length;i++) {
    	  hexString.append(Integer.toHexString(0xFF & mdbytes[i]));
    	}
    	
    	return hexString.toString();
		
	}
	
}
