package dev.lavan.SimpleRestApp;

public interface AuthenticatedPage extends Page {
	boolean authenticate(String token);

	ResponseDTO message(Object Status, Object error, Object data);
}
