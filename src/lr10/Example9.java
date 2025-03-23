package lr10;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example9 {
    static Document doc;

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

        Element product = doc.createElement("product");

        Element productName = doc.createElement("name");
        productName.appendChild(doc.createTextNode(name));
        product.appendChild(productName);

        Element productPrice = doc.createElement("price");
        productPrice.appendChild(doc.createTextNode(String.valueOf(price)));
        product.appendChild(productPrice);

        Element productQuantity = doc.createElement("quantity");
        productQuantity.appendChild(doc.createTextNode(String.valueOf(quantity)));
        product.appendChild(productQuantity);

        doc.getFirstChild().appendChild(product);
        System.out.println("Продукт добавлен!");
    }

    public static void searchProduct(Scanner in) {
        System.out.println("Введите название продукта для поиска:");
        String productName = in.next();

        List<Element> products = getProducts(productName);

        if (!products.isEmpty()) {
            System.out.println("Всего найдено продуктов: " + products.size());
            for (Element product: products) {
                System.out.println("Название: " + product.getElementsByTagName("name").item(0).getTextContent());
                System.out.println("Цена: " + product.getElementsByTagName("price").item(0).getTextContent());
                System.out.println("Количество: " + product.getElementsByTagName("quantity").item(0).getTextContent());
            }
        } else {
            System.out.println("Продукты с таким названием не найдены!");
        }
    }

    private static List<Element> getProducts(String productName) {
        NodeList nodeList = doc.getElementsByTagName("product");
        Stream<Node> nodeStream = IntStream.range(0, nodeList.getLength()).mapToObj(nodeList::item);

        List<Element> products = nodeStream
                .filter(node -> node.getNodeType() == Node.ELEMENT_NODE)
                .map(node -> (Element) node)
                .filter(element -> {
                    String name = element.getElementsByTagName("name").item(0).getTextContent();
                    return name.equalsIgnoreCase(productName);
                })
                .toList();
        return products;
    }

    public static void deleteProduct(Scanner in) {
        System.out.println("Введите название продукта для удаления:");
        String productName = in.next();

        List<Element> products = getProducts(productName);

        for (Element product: products) {
            Node parent = product.getParentNode();
            parent.removeChild(product);
        }

        System.out.println("Удалено продуктов: " + products.size());
    }

    public static void saveChanges(File file) {
        try {
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(file);
            transformer.transform(source, result);
            System.out.println("Файл сохранён!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            File inputFile = new File("src/lr10/products.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            Scanner in = new Scanner(System.in);

            while (true) {
                int choice = showMenu(in);
                switch (choice) {
                    case 1:
                        addProduct(in);
                        saveChanges(new File("src/lr10/products.xml"));
                        break;
                    case 2:
                        searchProduct(in);
                        break;
                    case 3:
                        deleteProduct(in);
                        saveChanges(new File("src/lr10/products.xml"));
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
