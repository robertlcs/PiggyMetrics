package com.webull.notification.service;

import com.webull.notification.domain.NotificationType;
import com.webull.notification.domain.Recipient;

import javax.mail.MessagingException;
import java.io.IOException;

public interface EmailService {

	void send(NotificationType type, Recipient recipient, String attachment) throws MessagingException, IOException;

}
