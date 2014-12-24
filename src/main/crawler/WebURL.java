package main.crawler;

public class WebURL {
	private String url;
	private int depth;
	private boolean hasParent;
	
	public WebURL(String url) {
		this.url = url;
		depth = 0;
		hasParent = false;
	}
	
	public WebURL(String url, int depth) {
		this.url = url;
		this.depth = depth;
		hasParent = (depth==0 ? false : true);
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public boolean isHasParent() {
		return hasParent;
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof WebURL ? url.equals(((WebURL) obj).getUrl()) : false;
	}
	
}
