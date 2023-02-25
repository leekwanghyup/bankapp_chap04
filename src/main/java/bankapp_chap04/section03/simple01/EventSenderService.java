package bankapp_chap04.section03.simple01;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URISyntaxException;

import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.WritableResource;

public class EventSenderService {
	
	private ResourceLoader resourceLoader;

	public EventSenderService(String key, String value) {
		System.out.println("Create EventSenderService Bean");
		EventDao.appConfig.put(key, value);
	}
}
