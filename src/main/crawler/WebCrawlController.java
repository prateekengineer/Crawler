package main.crawler;

public class WebCrawlController {

	private CrawlingConfiguration crawlConfig;
	private URLFrontier frontier;
	
	public WebCrawlController(CrawlingConfiguration crawConfig,URLFrontier frontier) {
		crawlConfig = crawConfig;
		this.frontier = frontier;
	}
	
	public void startCrawler() {
		WebCrawler webCrawler = new WebCrawler();
	}

	public CrawlingConfiguration getCrawlConfig() {
		return crawlConfig;
	}

	public void setCrawlConfig(CrawlingConfiguration crawlConfig) {
		this.crawlConfig = crawlConfig;
	}

	public URLFrontier getFrontier() {
		return frontier;
	}

	public void setFrontier(URLFrontier frontier) {
		this.frontier = frontier;
	}
	
	//https://www.yammer.com/pramati.com/#/threads/company?type=general
	//http://wiki.imaginea.com/Training
	//https://help.github.com/articles/adding-an-existing-project-to-github-using-the-command-line/
	
}
