package cn.iocoder.yudao.framework.excel.core.handler;

import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.metadata.data.ImageData;
import com.alibaba.excel.metadata.data.WriteCellData;
import com.alibaba.excel.write.handler.CellWriteHandler;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.metadata.holder.WriteTableHolder;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.util.Units;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Excel 图片写入处理器（支持多图）
 *
 * @author wdy
 */
public class ImageCellWriteHandler implements CellWriteHandler {

    private final HashMap<String, List<ImageData>> imageDataMap = new HashMap<>(16);

    @Override
    public void afterCellDataConverted(WriteSheetHolder writeSheetHolder, WriteTableHolder writeTableHolder,
                                       WriteCellData<?> cellData, Cell cell, Head head, Integer relativeRowIndex, Boolean isHead) {
        if (isHead) return;

        // 提取图片数据并移除默认渲染
        if (!CollectionUtils.isEmpty(cellData.getImageDataList())) {
            String key = cell.getRowIndex() + "_" + cell.getColumnIndex();
            imageDataMap.put(key, cellData.getImageDataList());
            cellData.setType(CellDataTypeEnum.EMPTY);
            cellData.setImageDataList(new ArrayList<>());
        }
    }

    @Override
    public void afterCellDispose(WriteSheetHolder writeSheetHolder, WriteTableHolder writeTableHolder,
                                 List<WriteCellData<?>> cellDataList, Cell cell, Head head,
                                 Integer relativeRowIndex, Boolean isHead) {
        if (isHead || CollectionUtils.isEmpty(cellDataList)) return;

        String key = cell.getRowIndex() + "_" + cell.getColumnIndex();
        List<ImageData> imageDataList = imageDataMap.get(key);
        if (CollectionUtils.isEmpty(imageDataList)) return;

        // 设置单元格高度与列宽
        Sheet sheet = cell.getSheet();
        sheet.getRow(cell.getRowIndex()).setHeight((short) (400 * imageDataList.size()));
        sheet.setColumnWidth(cell.getColumnIndex(), 20 * 256); // 宽度 = 20字符

        for (int i = 0; i < imageDataList.size(); i++) {
            ImageData imageData = imageDataList.get(i);
            if (ObjectUtils.isEmpty(imageData) || imageData.getImage() == null) continue;
            insertImage(sheet, cell, imageData.getImage(), i);
        }

        imageDataMap.remove(key);
    }

    private void insertImage(Sheet sheet, Cell cell, byte[] pictureData, int indexOffset) {
        int pictureType = Workbook.PICTURE_TYPE_PNG;
        int pictureIndex = sheet.getWorkbook().addPicture(pictureData, pictureType);

        Drawing<?> drawing = sheet.getDrawingPatriarch();
        if (drawing == null) {
            drawing = sheet.createDrawingPatriarch();
        }

        CreationHelper helper = sheet.getWorkbook().getCreationHelper();
        ClientAnchor anchor = helper.createClientAnchor();

        anchor.setCol1(cell.getColumnIndex());
        anchor.setCol2(cell.getColumnIndex() + 1); // 占据一列宽度
        anchor.setRow1(cell.getRowIndex());
        anchor.setRow2(cell.getRowIndex() + 1); // 占据一行高度

        anchor.setDx1(Units.pixelToEMU(150) * indexOffset);
        anchor.setDx2(Units.pixelToEMU(150) * (indexOffset + 1));
        anchor.setDy1(0);
        anchor.setDy2(0);

        anchor.setAnchorType(ClientAnchor.AnchorType.MOVE_AND_RESIZE);
        drawing.createPicture(anchor, pictureIndex);
    }
}
