package cn.wisdsoft.utils;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Import util.
 *
 * @Author 高伟萌
 * @Date 2018 /9/27 20:49
 * @Description TODO
 */
public class ImportUtil {
    private final static String improt2003L = ".xls";
    private final static String improt2007U = ".xlsx";

    /**
     * 获取每一行的值
     * @param cell 行
     * @return java.lang.Object
     */
    private static Object getCellValue(@org.jetbrains.annotations.NotNull Cell cell) {
        Object value = null;
        DecimalFormat df = new DecimalFormat("0");                // 格式化number  string字符串
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");    // 格式化日期
        DecimalFormat df1 = new DecimalFormat("0.00");             // 格式化数字

        switch (cell.getCellTypeEnum()) {
            case BOOLEAN:
                value = cell.getBooleanCellValue();

                break;

            case STRING:
                value = cell.getStringCellValue();

                break;

            case NUMERIC:
                if ("General".equals(cell.getCellStyle().getDataFormatString())) {
                    value = df.format(cell.getNumericCellValue());
                } else if ("m/d/yy".equals(cell.getCellStyle().getDataFormatString())) {
                    value = sdf.format(cell.getDateCellValue());
                } else {
                    value = df1.format(cell.getNumericCellValue());
                }

                break;

            case BLANK:
                value = "";

                break;

            default:
                break;
        }

        return value;
    }


    /**
     * Gets excel.
     *
     * @param inputStream the input stream
     * @param fileName    the file name
     * @return the excel
     * @throws Exception the exception
     */
    public static Workbook getExcel(InputStream inputStream, String fileName) throws Exception {
        Workbook workbook;
        String fileType = fileName.substring(fileName.lastIndexOf("."));

        switch (fileType) {
            case improt2003L:
                workbook = new HSSFWorkbook(inputStream);
                break;
            case improt2007U:
                workbook = new XSSFWorkbook(inputStream);
                break;
            default:
                throw new Exception("文件解析错误");
        }

        return workbook;
    }


    /**
     * Gets list by excel.
     *
     * @param workbook the workbook
     * @return the list by excel
     */
    public static List<List<Object>> getListByExcel(Workbook workbook) {
        List<List<Object>> list;
        Sheet sheet;
        Row row;
        Cell cell;

        list = new ArrayList<List<Object>>();

        // 遍历sheet
        for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
            sheet = workbook.getSheetAt(i);

            if (sheet == null) {
                continue;
            }

            // 遍历sheet中的行数
            for (int j = sheet.getFirstRowNum() + 1; j <= sheet.getLastRowNum(); j++) {
                row = sheet.getRow(j);

                if ((row == null) || (row.getFirstCellNum() == j)) {
                    continue;
                }

                // 遍历列
                List<Object> li = new ArrayList<Object>();

                for (int k = row.getFirstCellNum(); k < row.getLastCellNum(); k++) {
                    cell = row.getCell(k);
                    li.add(ImportUtil.getCellValue(cell));
                }

                list.add(li);
            }
        }

        return list;
    }
}
