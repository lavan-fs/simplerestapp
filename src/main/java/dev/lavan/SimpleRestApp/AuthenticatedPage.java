package dev.lavan.SimpleRestApp;

public interface AuthenticatedPage extends Page {
	boolean authenticate(String token);
}
