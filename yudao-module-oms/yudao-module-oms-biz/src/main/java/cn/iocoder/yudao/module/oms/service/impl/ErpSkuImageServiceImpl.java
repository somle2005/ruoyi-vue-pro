package cn.iocoder.yudao.module.oms.service.impl;

import cn.iocoder.yudao.framework.common.util.custom.MyCollectionUtils;
import cn.iocoder.yudao.module.oms.model.dto.ErpSkuImageDto;
import cn.iocoder.yudao.module.oms.model.entity.ErpShop;
import cn.iocoder.yudao.module.oms.model.entity.ErpSku;
import cn.iocoder.yudao.module.oms.model.entity.ErpSkuImage;
import cn.iocoder.yudao.module.oms.dal.ErpSkuImageMapper;
import cn.iocoder.yudao.module.oms.service.ErpSkuImageService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ErpSkuImageServiceImpl extends ServiceImpl<ErpSkuImageMapper, ErpSkuImage> implements ErpSkuImageService {

    @Resource
    private ErpSkuImageMapper erpSkuImageMapper;
    public void insertOrUpdateErpSkuImage(ErpShop erpShop, List<ErpSkuImageDto> erpSkuImageDtos, Map<String, ErpSku> allSkuMap) {
        if (!CollectionUtils.isEmpty(erpSkuImageDtos)) {
            List<ErpSkuImage> handErpSkuImages = new ArrayList<>();
            for (ErpSkuImageDto erpSkuImageDto : erpSkuImageDtos) {
                List<ErpSkuImage> erpSkuImages = erpSkuImageDto.getErpSkuImages();
                for (ErpSkuImage erpSkuImage : erpSkuImages) {
                    String sku = erpSkuImage.getSku();
                    ErpSku erpSku = allSkuMap.get(sku);
                    if (erpSku != null) {
                        Long id = erpSku.getId();
                        erpSkuImage.setSkuId(id);
                    }
                }
                handErpSkuImages.addAll(erpSkuImages);
            }
            //删除没有子的记录
            List<Long> emptySkuIds = erpSkuImageDtos.stream().filter(e -> CollectionUtils.isEmpty(e.getErpSkuImages())).map(e -> e.getSkuId()).collect(Collectors.toList());
            if (!CollectionUtils.isEmpty(emptySkuIds)) {
                erpSkuImageMapper.delete(new LambdaQueryWrapper<ErpSkuImage>()
                    .in(ErpSkuImage::getSkuId, emptySkuIds)
                    .eq(ErpSkuImage::getDeleted, 0)
                    .eq(ErpSkuImage::getStoreName, erpShop.getName())
                );
            }
            List<ErpSkuImageDto> notEmptyRecord = erpSkuImageDtos.stream().filter(e -> !CollectionUtils.isEmpty(e.getErpSkuImages())).collect(Collectors.toList());
            if (!CollectionUtils.isEmpty(notEmptyRecord)) {
                List<Long> skuIds = notEmptyRecord.stream().map(ErpSkuImageDto::getSkuId).collect(Collectors.toList());
                List<ErpSkuImage> existErpSkuImages = erpSkuImageMapper.selectList(new LambdaQueryWrapper<ErpSkuImage>()
                    .in(ErpSkuImage::getSkuId, skuIds)
                    .eq(ErpSkuImage::getDeleted, 0)
                    .eq(ErpSkuImage::getStoreName, erpShop.getName())
                );
                Map<String, List<ErpSkuImage>> handDBResult = MyCollectionUtils.analyzeCollections(handErpSkuImages, existErpSkuImages);
                //需要新增的
                List<ErpSkuImage> aMinusIntersection = handDBResult.get("aMinusIntersection");
                if (!CollectionUtils.isEmpty(aMinusIntersection)) {
                    erpSkuImageMapper.insert(aMinusIntersection);
                }
                //需要删除的
                List<ErpSkuImage> bMinusIntersection = handDBResult.get("bMinusIntersection");
                if (!CollectionUtils.isEmpty(bMinusIntersection)) {
                    erpSkuImageMapper.deleteBySkuIdAndPlatSrcId(bMinusIntersection, erpShop.getName());
                }
            }
        }
    }


}
