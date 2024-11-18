package cn.iocoder.yudao.module.erp.service.supporting;

import cn.iocoder.yudao.framework.common.exception.util.ThrowUtil;
import cn.iocoder.yudao.module.erp.dal.supporting.TableAssociationInitialization;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import jakarta.annotation.Nonnull;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    * @Description 获取带有@TableName注解的bean
    * @Date 16:20 2024/11/15
    * @Param [tableName]
    * @return java.lang.Class<?>
    **/
    public Class<?> getEntityClassByTableName(String tableName) {
        Map<String, Object> beansWithAnnotation = applicationContext.getBeansWithAnnotation(TableName.class);
        //遍历注解的value
        for (Object bean : beansWithAnnotation.values()) {
            Class<?> clazz = bean.getClass();
            if (clazz.isAnnotationPresent(TableName.class)) {
                TableName table = clazz.getAnnotation(TableName.class);
                if (table.value().equalsIgnoreCase(tableName)) {
                    return clazz;
                }
            }
        }
        throw exception(NOT_FOUND_TABLE_NAME_BEAN, tableName);
    }

    /**
    * @Author Wqh
    * @Description 动态获取MyBatis Plus Mapper接口
    * @Date 17:11 2024/11/15
    * @Param [entityClass]
    * @return com.baomidou.mybatisplus.core.mapper.BaseMapper<?>
    **/
    public BaseMapper<?> getMapper(Class<?> entityClass) {
        // 获取实体类的包名
        String packageName = entityClass.getPackage().getName().replace("dataobject","mysql");
        String simpleName = entityClass.getSimpleName().replace("DO", "");
        // 构建 Mapper 接口的类名
        String mapperClassName = packageName + "." + simpleName + "Mapper";
        try {
            // 加载 Mapper 接口的 Class 对象
            Class<?> mapperClass = Class.forName(mapperClassName);
            // 从 Spring 容器中获取 Mapper
            Object mapper = applicationContext.getBean(mapperClass);
            // 检查是否是 BaseMapper 的子类
            if (BaseMapper.class.isAssignableFrom(mapperClass)) {
                return (BaseMapper<?>) mapper;
            } else {
                throw exception(THE_BEAN_EXCEPTION);
            }
        } catch (ClassNotFoundException e) {
            throw exception(NOT_FOUND_TABLE_NAME_BEAN, mapperClassName);
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
        // map中获取表名
        String tableName = TableAssociationInitialization.getTableMap().get(categoryId);
        Class<?> additionalType = getEntityClassByTableName(tableName);
        BaseMapper<?> mapper = getMapper(additionalType);
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
        // map中获取表名
        String tableName = TableAssociationInitialization.getTableMap().get(categoryId);
        Class<?> additionalType = getEntityClassByTableName(tableName);
        BaseMapper<?> mapper = getMapper(additionalType);
        // 根据产品id查询额外的数据
        List<?> objects = mapper.selectByMap(new HashMap<>() {{ put(PRODUCT_ID_TABLE_FIELD, productId); }});
        // 获取到的list size一定是1个，因为产品和辅助字段是一对一的，如果超过两个则抛出异常
        ThrowUtil.ifThrow(objects.size() != 1, AUX_INFO_LENGTH_NOT_MATCH);
        return objects.get(0);
    }
}
