package lr10;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Example6 {
    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("https://urfu.ru/get-news/ru/news/?cols=3&pid=53%2C11367%2C30302&categories=1%2C10%2C12%2C130%2C155%2C2%2C212%2C232%2C264%2C27%2C277%2C3%2C33%2C4%2C5%2C52%2C6%2C7%2C8%2C9%2C90%2C93%2C96&fullmode=1&offset=0&rows=5&selected=0&page=54&show_categories=1").get();

            Elements newsParent = doc.select(".news-item");

            for (Element news: newsParent) {
                System.out.println("Тема: " + news.selectFirst(".text a").text());
                System.out.println("Дата: " + news.selectFirst(".date").text());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
