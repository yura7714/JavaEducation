package lr10;

import org.apache.poi.openxml4j.exceptions.NotOfficeXmlFileException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example12 {
    public static void main(String[] args) throws IOException {
        try {
            String filePath = "src/lr10/example3.xlsx";
            FileInputStream inputStream = new FileInputStream(filePath);

            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

            XSSFSheet sheet = workbook.getSheet("Товары");

            if (sheet == null) {
                System.out.println("Лист с таким именем отсутствует в книге! Укажите корректное имя листа и повторите попытку.");
                return;
            }

            for (Row row: sheet) {
                for (Cell cell: row) {
                    System.out.print(cell.toString() + "\t");
                }
                System.out.println();
            }

            workbook.close();
            inputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден! Проверьте корректность указанного пути и повторите попытку.");
        } catch (NotOfficeXmlFileException e) {
            System.out.println("Файл имеет неподдерживаемый формат! Используйте расширение .xlsx");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
