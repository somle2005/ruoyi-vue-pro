package cn.iocoder.yudao.framework.excel.core.handler;

import cn.iocoder.yudao.framework.excel.core.aop.ExcelMergeGroup;
import com.alibaba.excel.write.handler.RowWriteHandler;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.metadata.holder.WriteTableHolder;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellRangeAddress;

import java.lang.reflect.Field;
import java.util.*;

/**
 * 通用合并 + 居中处理器，基于 @ExcelMergeGroup 注解自动合并并居中
 *
 * @author: wdy
 */
public class CellMergeStrategy implements RowWriteHandler {
    private final List<Integer> mergeColumnIndexList;
    private final int size;
    private final Map<Integer, Integer> mergeStartRowMap = new HashMap<>();
    private Row lastRow;

    public CellMergeStrategy(Class<?> clazz, int size) {
        this.size = size;
        this.mergeColumnIndexList = resolveMergeColumnIndexes(clazz);
        this.mergeColumnIndexList.forEach(index -> mergeStartRowMap.put(index, 1));
    }

    private List<Integer> resolveMergeColumnIndexes(Class<?> clazz) {
        Field[] fields = clazz.getDeclaredFields();

        List<String> allFieldNames = Arrays.stream(fields)
            .map(Field::getName).toList();

        return Arrays.stream(fields)
            .filter(f -> f.isAnnotationPresent(ExcelMergeGroup.class))
            .map(Field::getName)
            .map(allFieldNames::indexOf)
            .filter(i -> i >= 0)
            .toList();
    }

    @Override
    public void afterRowDispose(WriteSheetHolder writeSheetHolder, WriteTableHolder writeTableHolder, Row row,
                                Integer relativeRowIndex, Boolean isHead) {
        if (isHead) return;

        Sheet sheet = writeSheetHolder.getSheet();
        int rowIndex = row.getRowNum();

        if (rowIndex > 1 && lastRow != null) {
            for (int colIndex : mergeColumnIndexList) {
                String current = getCellValue(row.getCell(colIndex));
                String previous = getCellValue(lastRow.getCell(colIndex));

                if (!Objects.equals(current, previous)) {
                    int start = mergeStartRowMap.get(colIndex);
                    int end = rowIndex - 1;
                    if (end > start) {
                        sheet.addMergedRegionUnsafe(new CellRangeAddress(start, end, colIndex, colIndex));
                    }
                    mergeStartRowMap.put(colIndex, rowIndex);
                } else if (rowIndex == size) {
                    int start = mergeStartRowMap.get(colIndex);
                    if (rowIndex > start) {
                        sheet.addMergedRegionUnsafe(new CellRangeAddress(start, rowIndex, colIndex, colIndex));
                    }
                }
            }
        }

        lastRow = row;
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
}
