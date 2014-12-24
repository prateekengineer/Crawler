package main.crawler;

public abstract class Crawler {
	
	private CrawlingConfiguration crawlingConfiguration;
	
	public Crawler(CrawlingConfiguration crawlingConfiguration) {
		this.crawlingConfiguration = crawlingConfiguration;
		
	}

	public CrawlingConfiguration getCrawlingConfiguration() {
		return crawlingConfiguration;
	}

	public void setCrawlingConfiguration(CrawlingConfiguration crawlingConfiguration) {
		this.crawlingConfiguration = crawlingConfiguration;
	}


	abstract boolean start();
	
	abstract boolean stop();
}
