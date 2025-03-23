package lr10;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Example10 {

    static JSONObject jsonObject;
    static JSONArray products;

    public static int showMenu(Scanner in) {
        System.out.println("Выберите пункт меню:");
        System.out.println("1. Добавить продукт");
        System.out.println("2. Найти продукт");
        System.out.println("3. Удалить продукт");
        System.out.println("0. Выход");

        int choice;
        while (!in.hasNextInt()) {
            System.out.println("Введено не число! Попробуйте ещё раз:");
            in.next();
        }
        choice = in.nextInt();

        return choice;
    }

    public static void addProduct(Scanner in) {
        System.out.println("Введите имя продукта:");
        String name = in.next();

        double price;
        System.out.println("Введите цену продукта:");
        while (!in.hasNextDouble()) {
            System.out.println("Введите цену продукта (десятичная дробь):");
            in.next();
        }
        price = in.nextDouble();

        int quantity;
        System.out.println("Введите количество продукта (целое число):");
        while (!in.hasNextInt()) {
            System.out.println("Введите количество продукта (целое число):");
            in.next();
        }
        quantity = in.nextInt();

        JSONObject newProduct = new JSONObject();
        newProduct.put("name", name);
        newProduct.put("price", price);
        newProduct.put("quantity", quantity);

        products.add(newProduct);
    }

    public static void searchProduct(Scanner in) {
        System.out.println("Введите название продукта для поиска:");
        String productName = in.next();

        List<JSONObject> searchResult = IntStream
            .range(0, products.size())
            .mapToObj(i -> (JSONObject)products.get(i))
            .filter(product -> productName.equalsIgnoreCase((String) product.get("name")))
            .toList();

        if (!searchResult.isEmpty()) {
            System.out.println("Всего найдено продуктов: " + searchResult.size());
            for (JSONObject product: searchResult) {
                System.out.println("Название: " + product.get("name"));
                System.out.println("Цена: " + product.get("price"));
                System.out.println("Количество: " + product.get("quantity"));
            }
        } else {
            System.out.println("Продукты с таким названием не найдены!");
        }
    }

    public static void saveChanges(String fileName) {
        try (FileWriter file = new FileWriter(fileName)) {
            file.write(jsonObject.toJSONString());
            System.out.println("Файл сохранён!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteProduct(Scanner in) {
        System.out.println("Введите название продукта для удаления:");
        String productName = in.next();

        Iterator iterator = products.iterator();
        while (iterator.hasNext()) {
            JSONObject product = (JSONObject) iterator.next();
            if (productName.equalsIgnoreCase((String) product.get("name"))) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            String filename = "src/lr10/products.json";

            Object obj = parser.parse(new FileReader(filename));
            jsonObject = (JSONObject) obj;
            products = (JSONArray) jsonObject.get("products");

            Scanner in = new Scanner(System.in);

            while (true) {
                int choice = showMenu(in);
                switch (choice) {
                    case 1:
                        addProduct(in);
                        saveChanges(filename);
                        break;
                    case 2:
                        searchProduct(in);
                        break;
                    case 3:
                        deleteProduct(in);
                        saveChanges(filename);
                        break;
                    case 0:
                        in.close();
                        System.exit(0);
                    default:
                        System.out.println("Нет такого пункта!");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
