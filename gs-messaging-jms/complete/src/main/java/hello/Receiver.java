package hello;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.support.JmsMessageHeaderAccessor;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class Receiver {

	@JmsListener(destination = "mailbox", containerFactory = "myFactory")
	public void receiveMessage(@Payload Email email,
							   //@Headers MessageHeaders headers,
							   @Headers Map<String,Object> headerMap,
							   JmsMessageHeaderAccessor messageHeaderAccessor) {
		System.out.println("Received <" + email + ">");
		//System.out.println("Headers <" + headers.getId() + ">");
		System.out.println("Correlation ID <" + messageHeaderAccessor.getCorrelationId() + ">");
		System.out.println("Message ID <" + messageHeaderAccessor.getMessageId() + ">");
		System.out.println("Destination <" + messageHeaderAccessor.getDestination() + ">");

		// custom headers
		System.out.println("Custom Key - VALUE <" + headerMap.get("my-custom-key")+ ">");

		System.out.println("Message ID from Map <" + headerMap.get("jms_messageId")+ ">");
	}
}
