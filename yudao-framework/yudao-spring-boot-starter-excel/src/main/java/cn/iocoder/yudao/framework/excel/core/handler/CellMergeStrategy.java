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
 * 通用合并 + 居中处理器，基于 @ExcelMergeGroup 注解自动合并并居中，支持唯一标识字段限制合并范围
 *
 * @author :wdy
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

        // 初始化每列的起始行
        mergeColumnIndexList.forEach(i -> mergeStartRowMap.put(i, 1));
    }

    @Override
    public void afterRowDispose(WriteSheetHolder writeSheetHolder, WriteTableHolder writeTableHolder,
                                Row row, Integer relativeRowIndex, Boolean isHead) {
        if (isHead) return;

        Sheet sheet = writeSheetHolder.getSheet();
        int rowIndex = row.getRowNum();

        if (rowIndex > 1 && lastRow != null) {
            // 判断是否属于同一个唯一标识组
            boolean sameGroup = isSameGroup(row, lastRow);

            for (int colIndex : mergeColumnIndexList) {
                String current = getCellValue(row.getCell(colIndex));
                String previous = getCellValue(lastRow.getCell(colIndex));

                if (!sameGroup || !Objects.equals(current, previous)) {
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

    /**
     * 判断两行是否属于同一唯一标识组（即相同唯一列值）
     */
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
}
