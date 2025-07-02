package cn.iocoder.yudao.framework.excel.core.handler;

import cn.iocoder.yudao.framework.excel.core.aop.ExcelMergeGroup;
import com.alibaba.excel.write.handler.RowWriteHandler;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.metadata.holder.WriteTableHolder;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;

import java.lang.reflect.Field;
import java.util.*;

/**
 * 通用合并 + 样式处理器，基于 @ExcelMergeGroup 注解自动合并单元格，
 * 支持唯一标识字段分组控制合并范围，合并后保留原样式并居中显示
 */
public class CellMergeStrategy implements RowWriteHandler {

    private final List<Integer> mergeColumnIndexList;
    private final List<Integer> uniqueColumnIndexList;
    private final int size;
    private final Map<Integer, Integer> mergeStartRowMap = new HashMap<>();
    private Row lastRow;

    public CellMergeStrategy(Class<?> clazz, int size) {
        this.size = size;
        Field[] fields = clazz.getDeclaredFields();
        List<String> fieldNames = Arrays.stream(fields).map(Field::getName).toList();

        this.mergeColumnIndexList = new ArrayList<>();
        this.uniqueColumnIndexList = new ArrayList<>();

        for (Field field : fields) {
            ExcelMergeGroup annotation = field.getAnnotation(ExcelMergeGroup.class);
            if (annotation != null) {
                int index = fieldNames.indexOf(field.getName());
                if (index >= 0) {
                    mergeColumnIndexList.add(index);
                    if (annotation.unique()) {
                        uniqueColumnIndexList.add(index);
                    }
                }
            }
        }

        mergeColumnIndexList.forEach(i -> mergeStartRowMap.put(i, 1));
    }

    @Override
    public void afterRowDispose(WriteSheetHolder writeSheetHolder, WriteTableHolder writeTableHolder,
                                Row row, Integer relativeRowIndex, Boolean isHead) {
        if (isHead) return;

        Sheet sheet = writeSheetHolder.getSheet();
        int rowIndex = row.getRowNum();

        if (rowIndex > 1 && lastRow != null) {
            boolean sameGroup = isSameGroup(row, lastRow);

            for (int colIndex : mergeColumnIndexList) {
                String current = getCellValue(row.getCell(colIndex));
                String previous = getCellValue(lastRow.getCell(colIndex));

                if (!sameGroup || !Objects.equals(current, previous)) {
                    int start = mergeStartRowMap.get(colIndex);
                    int end = rowIndex - 1;
                    if (end > start) {
                        CellRangeAddress region = new CellRangeAddress(start, end, colIndex, colIndex);
                        sheet.addMergedRegionUnsafe(region);
                        Cell originCell = sheet.getRow(start).getCell(colIndex);
                        CellStyle baseStyle = (originCell != null && originCell.getCellStyle() != null)
                            ? originCell.getCellStyle()
                            : sheet.getWorkbook().createCellStyle();
                        setRegionStyle(sheet, region, baseStyle);
                    }
                    mergeStartRowMap.put(colIndex, rowIndex);
                } else if (rowIndex == size) {
                    int start = mergeStartRowMap.get(colIndex);
                    if (rowIndex > start) {
                        CellRangeAddress region = new CellRangeAddress(start, rowIndex, colIndex, colIndex);
                        sheet.addMergedRegionUnsafe(region);
                        Cell originCell = sheet.getRow(start).getCell(colIndex);
                        CellStyle baseStyle = (originCell != null && originCell.getCellStyle() != null)
                            ? originCell.getCellStyle()
                            : sheet.getWorkbook().createCellStyle();
                        setRegionStyle(sheet, region, baseStyle);
                    }
                }
            }
        }

        lastRow = row;
    }

    private boolean isSameGroup(Row currentRow, Row lastRow) {
        for (int colIndex : uniqueColumnIndexList) {
            String curr = getCellValue(currentRow.getCell(colIndex));
            String prev = getCellValue(lastRow.getCell(colIndex));
            if (!Objects.equals(curr, prev)) {
                return false;
            }
        }
        return true;
    }

    private String getCellValue(Cell cell) {
        if (cell == null) return "";
        return switch (cell.getCellType()) {
            case STRING -> cell.getStringCellValue();
            case NUMERIC -> String.valueOf(cell.getNumericCellValue());
            case BOOLEAN -> String.valueOf(cell.getBooleanCellValue());
            default -> "";
        };
    }

    private CellStyle createCenterStyle(Sheet sheet, CellStyle originalStyle) {
        Workbook workbook = sheet.getWorkbook();
        CellStyle newStyle = workbook.createCellStyle();
        newStyle.cloneStyleFrom(originalStyle); // 保留字体、颜色、边框等
        newStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        return newStyle;
    }


    private void setRegionStyle(Sheet sheet, CellRangeAddress region, CellStyle originalStyle) {
        CellStyle centerStyle = createCenterStyle(sheet, originalStyle);
        for (int rowIdx = region.getFirstRow(); rowIdx <= region.getLastRow(); rowIdx++) {
            Row row = sheet.getRow(rowIdx);
            if (row == null) row = sheet.createRow(rowIdx);
            Cell cell = row.getCell(region.getFirstColumn());
            if (cell == null) cell = row.createCell(region.getFirstColumn());
            cell.setCellStyle(centerStyle);
        }
    }
}
