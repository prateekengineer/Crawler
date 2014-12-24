package main.crawler;

public class WebCrawler implements Runnable{

	private URLFrontier frontier;
	private CrawlingConfiguration crawlingConfiguration;
	private WebCrawlController controller;
	
	private void init(WebCrawlController controller) {
		this.controller = controller;
		this.frontier = controller.getFrontier();
		this.crawlingConfiguration = controller.getCrawlConfig();
	}
	
	@Override
	public void run() {
		
	}

}
