package hash;

import static org.junit.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.InputStream;

import org.junit.Test;

import uk.co.placona.algorithms.hash.SHAChecksum;

public class SHAChecksumTests {
	private InputStream fis = SHAChecksumTests.class.getResourceAsStream("/fixtures/fixture1.log");
	private SHAChecksum shaChecksum = new SHAChecksum();
	public SHAChecksumTests(){
		
	}
	
	
	@Test
	public void testChecksum() throws Exception{
		// a file checksum
		String checksum = new String();
		checksum = "3bb1fe1fc83a8e47ebbc8ba4f84ec6532768e72aca8de566f49ea669f6c78";
		
		assertTrue("CheckSum should be the same", shaChecksum.generate(fis).equals(checksum));
	}
}
