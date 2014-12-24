package test;

import java.io.IOException;
import java.util.regex.Pattern;

import main.crawler.CrawlingConfiguration;
import main.crawler.URLFrontier;
import main.crawler.WebURL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
	public static void main(String[] args) throws IOException {
		String year = "2014";
		String month = "\\d\\d";
		
		/*WebURL seedURL = new WebURL("http://mail-archives.apache.org/mod_mbox/maven-users/");

		Elements childURLs1 = getHTMLBodyElementFromURL(seedURL).getElementsByAttributeValueMatching("href", Pattern.compile(year+month+".mbox/thread"));
		for(Element anchorTag :  childURLs1){
			Elements childDocBody =  getHTMLBodyElementFromURL(new WebURL(anchorTag.absUrl("href"),1)).select("td[class=subject] > a");
			for(Element childAnchor : childDocBody){
				Document parseDocument = Jsoup.parse(getHTMLBodyElementFromURL(new WebURL(childAnchor.absUrl("href"), 2)).toString());
				System.out.println(parseDocument.select("tr[class=from] > td[class=left]").text().concat(" : ").concat(parseDocument.select("tr[class=from] > td[class=right]").text()));
				System.out.println(parseDocument.select("tr[class=subject] > td[class=left]").text().concat(" : ").concat(parseDocument.select("tr[class=subject] > td[class=right]").text()));
				System.out.println(parseDocument.select("tr[class=date] > td[class=left]").text().concat(" : ").concat(parseDocument.select("tr[class=date] > td[class=right]").text()));
				System.out.println(parseDocument.select("tr[class=contents] > td > pre").text());
				System.out.println();
			}
		}*/
		
		WebURL seedURL = new WebURL("http://mail-archives.apache.org/mod_mbox/maven-users/");

		Elements childURLs1 = getHTMLBodyElementFromURL(seedURL).getElementsByAttributeValueMatching("href", Pattern.compile(year+month+".mbox/thread"));
		for(Element anchorTag :  childURLs1){
			Elements childDocBody =  getHTMLBodyElementFromURL(new WebURL(anchorTag.absUrl("href"),1)).select("td[class=subject] > a");
			for(Element childAnchor : childDocBody){
				Document parseDocument = Jsoup.parse(getHTMLBodyElementFromURL(new WebURL(childAnchor.absUrl("href"), 2)).toString());
				System.out.println(parseDocument.select("tr[class=from] > td[class=left]").text().concat(" : ").concat(parseDocument.select("tr[class=from] > td[class=right]").text()));
				System.out.println(parseDocument.select("tr[class=subject] > td[class=left]").text().concat(" : ").concat(parseDocument.select("tr[class=subject] > td[class=right]").text()));
				System.out.println(parseDocument.select("tr[class=date] > td[class=left]").text().concat(" : ").concat(parseDocument.select("tr[class=date] > td[class=right]").text()));
				System.out.println(parseDocument.select("tr[class=contents] > td > pre").text());
				System.out.println();
			}
		}
	}
	
	public static Element getHTMLBodyElementFromURL(WebURL URL) throws IOException{
		return Jsoup.connect(URL.getUrl()).get().body();
	}

	public static Element getParsedBodyFromURL(WebURL URL) throws IOException{
		return Jsoup.parse(URL.getUrl());
	}
}

class Controller{
	private CrawlingConfiguration crawlingConfiguration;
//	private CrawlingPolicy crawlingPolicy;
	private URLFrontier urlFrontier; 
	
	
}
