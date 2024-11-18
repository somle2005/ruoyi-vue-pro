package cn.iocoder.yudao.module.erp.service.supporting;

import cn.iocoder.yudao.framework.common.exception.util.ThrowUtil;
import cn.iocoder.yudao.module.erp.dal.supporting.TableAssociationInitialization;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import jakarta.annotation.Nonnull;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import static cn.iocoder.yudao.framework.common.exception.enums.GlobalErrorCodeConstants.*;
import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.erp.enums.ErrorCodeConstants.AUX_INFO_LENGTH_NOT_MATCH;

/**
 * @className: EntityService
 * @author: Wqh
 * @date: 2024/11/15 13:09
 * @Version: 1.0
 */
@Service
public class MyBatisDOService implements ApplicationContextAware {

    private ApplicationContext applicationContext;
    public static final String PRODUCT_ID = "productId";
    public static final String PRODUCT_ID_TABLE_FIELD = "product_id";
    public static final String PRODUCT_ADDITIONAL_ID = "id";

    @Override
    public void setApplicationContext(@Nonnull ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    /**
    * @Author Wqh
    * @Description 通过mapper获取实体类
    * @Date 16:20 2024/11/15
    * @Param [tableName]
    * @return java.lang.Class<?>
    **/
    public Class<?> getEntityClassByMapper(Class<?> mapperClass) {
        Type[] genericInterfaces = mapperClass.getGenericInterfaces();
        for (Type genericInterface : genericInterfaces) {
            if (genericInterface instanceof ParameterizedType parameterizedType) {
                if (parameterizedType.getRawType() == BaseMapper.class) {
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    if (actualTypeArguments.length > 0 && actualTypeArguments[0] instanceof Class) {
                        return (Class<?>) actualTypeArguments[0];
                    }
                }
            }
        }
        throw exception(NOT_FOUND_TABLE_NAME_BEAN, mapperClass.getName());
    }

    /**
    * @Author Wqh
    * @Description 获取MyBatis Plus Mapper接口
    * @Date 17:11 2024/11/15
    * @Param [entityClass]
    * @return com.baomidou.mybatisplus.core.mapper.BaseMapper<?>
    **/
    public BaseMapper<?> getMapper(Class<?> mapperClass) {
        try {
            // 从 Spring 容器中获取 Mapper
            Object mapper = applicationContext.getBean(mapperClass);
            return (BaseMapper<?>) mapper;
        } catch (BeansException e) {
            throw exception(NOT_FOUND_TABLE_NAME_BEAN, mapperClass.getName());
        }
    }

    /**
    * @Author Wqh
    * @Description 新增产品额外信息
    * @Date 11:34 2024/11/18
    * @Param [additionalDO]
    **/
    public void insertAdditionalData(Object additionalDO) {
        Class<?> additionalType = additionalDO.getClass();
        BaseMapper<?> mapper = getMapper(additionalType);
        ThrowUtil.ifSqlThrow(((BaseMapper<Object>) mapper).insert(additionalDO), DB_INSERT_ERROR);
    }


    /**
    * @Author Wqh
    * @Description 修改产品额外信息
    * @Date 11:34 2024/11/18
    * @Param [additionalDO]
    **/
    public void updateAdditionalData(Object additionalDO) {
        Class<?> additionalType = additionalDO.getClass();
        BaseMapper<?> mapper = getMapper(additionalType);
        ThrowUtil.ifSqlThrow(((BaseMapper<Object>) mapper).updateById(additionalDO), DB_UPDATE_ERROR);
    }

    /**
    * @Author Wqh
    * @Description 删除产品额外信息
    * @Date 11:34 2024/11/18
    * @Param [categoryId, productId]
    **/
    public void deleteAdditionalData(Long categoryId, Long productId) {
        // map中获取mapper
        BaseMapper<?> mapper = getMapper(TableAssociationInitialization.getTableMap().get(categoryId));
        // 删除表中product_id是产品id的值
        mapper.deleteByMap(new HashMap<>() {{ put(PRODUCT_ID_TABLE_FIELD, productId); }});
    }

    /**
    * @Author Wqh
    * @Description 获取产品额外信息
    * @Date 11:34 2024/11/18
    * @Param [categoryId, productId]
    * @return java.lang.Object
    **/
    public Object getAdditionalData(Long categoryId, Long productId) {
        // map中获取mapper
        BaseMapper<?> mapper = getMapper(TableAssociationInitialization.getTableMap().get(categoryId));
        // 根据产品id查询额外的数据
        List<?> objects = mapper.selectByMap(new HashMap<>() {{ put(PRODUCT_ID_TABLE_FIELD, productId); }});
        // 获取到的list size一定是1个，因为产品和辅助字段是一对一的，如果超过两个则抛出异常
        ThrowUtil.ifThrow(objects.size() != 1, AUX_INFO_LENGTH_NOT_MATCH);
        return objects.get(0);
    }
}
