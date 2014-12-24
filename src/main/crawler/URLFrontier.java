package main.crawler;

import java.util.concurrent.ConcurrentLinkedQueue;

public class URLFrontier{
	private ConcurrentLinkedQueue<WebURL> frontierQueue;
	private ConcurrentLinkedQueue<WebURL> visitedURLQueue;
	
	public URLFrontier() {
		frontierQueue =  new ConcurrentLinkedQueue<WebURL>();
		visitedURLQueue = new ConcurrentLinkedQueue<WebURL>();
	}
	
	public void add(WebURL seedURL) {
		if(frontierQueue.contains(seedURL) || visitedURLQueue.contains(seedURL))
			return;
		frontierQueue.add(seedURL);
	}
	
	public void remove(WebURL visitedURL) {
		frontierQueue.remove(visitedURL);
		visitedURLQueue.add(visitedURL);
	}

}
