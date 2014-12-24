package main.crawler;

public class CrawlingConfiguration{

	private int maxDepthOfCrawling = -1;
	private String storageFolder;
	private String seedURL;
	
	public CrawlingConfiguration(String seedURL) {
		this.seedURL = seedURL;
	}

	public int getMaxDepthOfCrawling() {
		return maxDepthOfCrawling;
	}
	
	public void setMaxDepthOfCrawling(int maxDepthOfCrawling) {
		this.maxDepthOfCrawling = maxDepthOfCrawling;
	}
	
	public String getStorageFolder() {
		return storageFolder;
	}
	
	public void setStorageFolder(String storageFolder) {
		this.storageFolder = storageFolder;
	}

	public String getSeedURL() {
		return seedURL;
	}

	public void setSeedURL(String seedURL) {
		this.seedURL = seedURL;
	}
}
