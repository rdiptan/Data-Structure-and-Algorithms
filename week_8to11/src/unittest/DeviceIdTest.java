package unittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import utils.Device;

class DeviceIdTest {

	@Test
	void test() {
		Device dv = new Device();
		//testing the output device name of given device id that exists
		String output = dv.convertIdToName("0");
		assertEquals("Apache",output);
	}

}
