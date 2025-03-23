package lr10;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;

public class Example11 {
    public static void main(String[] args) {

        JSONObject jsonObject = new JSONObject();
        JSONArray newsArray = new JSONArray();
        String fileName = "src/lr10/news.json";

        try {
            int errors = 0;

            Document doc = null;

            while (errors < 2) {
                try {
                    doc = Jsoup.connect("https://urfu.ru/get-news/ru/news/?cols=3&pid=53%2C11367%2C30302&categories=1%2C10%2C12%2C130%2C155%2C2%2C212%2C232%2C264%2C27%2C277%2C3%2C33%2C4%2C5%2C52%2C6%2C7%2C8%2C9%2C90%2C93%2C96&fullmode=1&offset=0&rows=5&selected=0&page=54&show_categories=1").get();
                    break;
                } catch (Exception e) {
                    errors++;
                    System.out.println("Не удалось подключиться по данному адресу. Повторная попытка " + errors);
                }
            }

            if (doc == null) {
                System.out.println("Не удалось подключиться по данному адресу. Проверьте корректность адреса.");
                return;
            }

            Elements newsParent = doc.select(".news-item");

            for (Element news: newsParent) {
                JSONObject nextNews = new JSONObject();

                String title = news.selectFirst(".text a").text();
                System.out.println("Тема: " + title);
                nextNews.put("title", title);

                String date = news.selectFirst(".date").text();
                System.out.println("Дата: " + date);
                nextNews.put("date", date);

                newsArray.add(nextNews);
            }

            jsonObject.put("news", newsArray);

            try (FileWriter file = new FileWriter(fileName)) {
                file.write(jsonObject.toJSONString());
                System.out.println("Файл сохранён!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
