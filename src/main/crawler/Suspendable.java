package main.crawler;

public interface Suspendable {
	
	void suspend();
	
	void resume();
	 
	boolean isSuspended();
}
