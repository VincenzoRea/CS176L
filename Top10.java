import java.io.IOException;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Element;


public class Top10 {
	
	public static void main(String[] args) throws IOException {
		String hmtl = "https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2022&month=0&season1=2022&ind=0&team=0&rost=0&age=0&filter=&players=0&startdate=2022-01-01&enddate=2022-12-31&sort=13,d&page=1_100";
		Document doc = Jsoup.connect(hmtl).get();
		Elements table = doc.select("tbody");
		Elements rows = table.select("tr");
		 for (Element row : rows) {
		      Elements columns = row.select("td.grid_line_break rgSorted");
		      
		      for (Element column : columns) {
		        System.out.print(column.text() + "\t");
		      }
		      System.out.println();
		    }
		
		
		
			
			
	}
	

}
