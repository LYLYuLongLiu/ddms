package cn.wisdsoft.utils;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddressList;

import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;
import java.util.regex.Pattern;

/**
 * The type Export util 2.
 *
 * @Author 高伟萌
 * @Date 2018 /10/1 19:39
 * @Description TODO
 */
public class TempUtil {
    /**
     * Create excel hssf workbook.
     * 创建一个工作空间
     *
     * @param sheetName the sheet name 工作簿名称
     * @param header    the header 工作簿中的表头
     * @return the hssf workbook  工作空间
     */
    public static HSSFWorkbook createExcel(String sheetName, String[] header) {
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook();
        HSSFSheet hssfSheet = hssfWorkbook.createSheet(sheetName);
        HSSFRow row = hssfSheet.createRow(0);
        HSSFFont font = hssfWorkbook.createFont();
        font.setFontName("微软雅黑");
        //创建行样式
        HSSFCellStyle style = hssfWorkbook.createCellStyle();
        //将字体应用到样式中
        style.setFont(font);
        //水平居中
        style.setAlignment(HorizontalAlignment.CENTER);
        //垂直居中
        style.setVerticalAlignment(VerticalAlignment.CENTER);
        //字体大小
        font.setFontHeightInPoints((short) 15);
        //字体颜色
        font.setColor(IndexedColors.RED.getIndex());
        //String[] myList = new String[]{"id", "username", "password"};
        int cellid = 0;
        for (String index : header) {
            row.setHeight((short) 500);
            Cell cell = row.createCell(cellid);
            cell.setCellStyle(style);
            cell.setCellValue(index);
            hssfSheet.autoSizeColumn(cellid);
            cellid++;
        }
        return hssfWorkbook;
    }

    /**
     * Gets hssf sheet.
     * 得到工作空间中的sheet
     *
     * @param hssfWorkbook the hssf workbook  工作空间
     * @param sheetName    the sheet name  工作簿名称
     * @return the hssf sheet  工作簿
     * @throws Exception the exception
     */
    public static HSSFSheet getHSSFSheet(HSSFWorkbook hssfWorkbook, String sheetName) throws Exception {
        HSSFSheet sheet = hssfWorkbook.getSheet(sheetName);
        if (sheet == null) {
            throw new Exception("该工作簿没有所指定的sheet");
        }
        return sheet;
    }

    /**
     * Sets boxes.
     * 设置下拉选择框
     *
     * @param firstRow the first row  起始行
     * @param lastRow  the last row  终止行
     * @param firstCol the first col  起始列
     * @param lastCol  the last col  终止列
     * @param selects  the selects  设置下拉框内的值
     * @param sheet    the sheet  选择要设置约束的sheet工作簿
     * @throws Exception the exception
     */
    public static void setBoxes(int firstRow, int lastRow, int firstCol, int lastCol, String[] selects, HSSFSheet sheet) throws Exception {
        if (firstRow <= 1 || lastRow <= 1 || firstCol <= 0 || lastCol <= 0) {
            HSSFDataValidationHelper hssfDataValidationHelper = new HSSFDataValidationHelper(sheet);
            DataValidationConstraint dataValidationConstraint = hssfDataValidationHelper.createExplicitListConstraint(selects);
            CellRangeAddressList cellRangeAddressList = new CellRangeAddressList(firstRow, lastRow, firstCol, lastCol);
            HSSFDataValidation hssfDataValidation = (HSSFDataValidation) hssfDataValidationHelper.createValidation(dataValidationConstraint, cellRangeAddressList);
            hssfDataValidation.createPromptBox("输入提示", "请选择数据");
            hssfDataValidation.createErrorBox("错误提示", "请选择下拉框内的数据");
            hssfDataValidation.setShowErrorBox(true);
            hssfDataValidation.setShowPromptBox(true);
            sheet.addValidationData(hssfDataValidation);
        } else {
            throw new Exception("起始行、终止行、起始列、终止列不能小于0");
        }

    }


    /**
     * Set date.
     * 设置时间限制
     *
     * @param firstRow  the first row  起始行
     * @param lastRow   the last row  终止行
     * @param firstCol  the first col  起始列
     * @param lastCol   the last col  终止列
     * @param firstDate the first date 设置时间范围（开始）  如1990-01-01
     * @param lastDate  the last date  设置时间范围（结束）  如2999-01-01
     * @param dateType  the date type  设置时间输入的格式  如yyyy-MM-dd
     * @param sheet     the sheet  选择要设置约束的sheet工作簿
     * @throws Exception the exception
     */
    public static void setDate(int firstRow, int lastRow, int firstCol, int lastCol, String firstDate, String lastDate, String dateType, HSSFSheet sheet) throws Exception {
        if (firstRow <= 1 || lastRow <= 1 || firstCol <= 0 || lastCol <= 0) {
            HSSFDataValidationHelper hssfDataValidationHelper = new HSSFDataValidationHelper(sheet);
            String pattern = "\\d{4}(-)\\d{1,2}\\1\\d{1,2}";
            Pattern r = Pattern.compile(pattern);
            if (r.matcher(firstDate).matches() && r.matcher(lastDate).matches()) {
                DataValidationConstraint dateConstraint = hssfDataValidationHelper.createDateConstraint(DataValidationConstraint.OperatorType.BETWEEN, firstDate, lastDate, dateType);
                CellRangeAddressList cellRangeAddressList = new CellRangeAddressList(firstRow, lastRow, firstCol, lastCol);
                HSSFDataValidation hssfDataValidation = (HSSFDataValidation) hssfDataValidationHelper.createValidation(dateConstraint, cellRangeAddressList);
                hssfDataValidation.createPromptBox("输入提示", "请填写日期");
                hssfDataValidation.createErrorBox("错误提示", "请输入yyyy-MM-dd格式的时间(时间的范围为" + firstDate + "---" + lastDate + ")");
                hssfDataValidation.setShowPromptBox(true);
                hssfDataValidation.setShowErrorBox(true);
                sheet.addValidationData(hssfDataValidation);
            } else {
                throw new Exception("firstDate或者lastDate格式错误(必须为yyyy-MM-dd格式)");
            }
        } else {
            throw new Exception("起始行、终止行、起始列、终止列不能小于0");
        }
    }


    /**
     * Sets length.
     * 设置输入字段的长度
     *
     * @param firstRow     the first row  起始行
     * @param lastRow      the last row  终止行
     * @param firstCol     the first col  起始列
     * @param lastCol      the last col  终止列
     * @param sheet        the sheet  工作簿
     * @param hssfWorkbook the hssf workbook  工作空间
     * @param length       the length  限制的长度
     * @param fieldName    the field name  限制的字段名称（如手机号、身份证号）
     * @throws Exception the exception
     */
    public static void setLength(int firstRow, int lastRow, int firstCol, int lastCol, HSSFSheet sheet, HSSFWorkbook hssfWorkbook, String length, String fieldName) throws Exception {
        //String[] flag = new String[]{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        if (firstRow <= 1 || lastRow <= 1 || firstCol <= 0 || lastCol <= 0) {
            //String oneFlag = flag[firstCol];
            HSSFDataValidationHelper hssfDataValidationHelper = new HSSFDataValidationHelper(sheet);
            DataValidationConstraint dataValidationConstraint = hssfDataValidationHelper.createTextLengthConstraint(DataValidationConstraint.OperatorType.EQUAL, length, length);
            //DataValidationConstraint customConstraint = hssfDataValidationHelper.createCustomConstraint("COUNTIF($" + oneFlag + "$2:" + oneFlag + "2," + oneFlag + "2)=1");
            CellRangeAddressList cellRangeAddressList = new CellRangeAddressList(firstRow, lastRow, firstCol, lastCol);
            HSSFDataValidation hssfDataValidation = (HSSFDataValidation) hssfDataValidationHelper.createValidation(dataValidationConstraint, cellRangeAddressList);
            //DataValidation validation = hssfDataValidationHelper.createValidation(customConstraint, cellRangeAddressList);
            hssfDataValidation.createPromptBox("输入提示", "请填写" + fieldName);
            hssfDataValidation.createErrorBox("错误提示", "该列的位数必须是" + length + "位！");
            hssfDataValidation.setShowPromptBox(true);
            hssfDataValidation.setShowErrorBox(true);
            sheet.addValidationData(hssfDataValidation);
            //sheet.addValidationData(validation);
        } else {
            throw new Exception("起始行、终止行、起始列、终止列不能小于0");
        }
    }


    /**
     * Sets cell format.
     * 设置行的格式为文本
     *
     * @param firstRow     the first row  起始行
     * @param lastRow      the last row  终止行
     * @param firstCols    the first cols  添加列的数组
     * @param hssfWorkbook the hssf workbook  工作空间
     * @param sheet        the sheet  工作簿
     */
    public static void setCellFormat(int firstRow, int lastRow, int[] firstCols, HSSFWorkbook hssfWorkbook, HSSFSheet sheet) {
        HSSFRow row;
        HSSFCell cell;
        HSSFCellStyle cellStyle = hssfWorkbook.createCellStyle();
        HSSFDataFormat format = hssfWorkbook.createDataFormat();
        cellStyle.setDataFormat(format.getFormat("@"));
        for (int i = firstRow; i <= lastRow; i++) {
            row = sheet.createRow(i);
            for (int firstCol : firstCols) {
                cell = row.createCell(firstCol);
                cell.setCellStyle(cellStyle);
            }
        }
    }

    /**
     * Gets excel.
     * 获取Excel文档
     *
     * @param hssfWorkbook the hssf workbook  Excel工作空间
     * @param fileName     the file name  Excel文件名称
     * @param response     the response  HTTPServletResponse响应
     * @throws Exception the exception
     */
    public static void getExcel(HSSFWorkbook hssfWorkbook, String fileName, HttpServletResponse response) throws Exception {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("Content-Disposition", "attachment; filename=" + URLEncoder.encode(fileName + ".xls", "UTF-8"));
        hssfWorkbook.write(response.getOutputStream());
        System.out.println(response.getHeader("Content-Disposition"));
        response.getOutputStream().flush();
        response.getOutputStream().close();
    }
}

