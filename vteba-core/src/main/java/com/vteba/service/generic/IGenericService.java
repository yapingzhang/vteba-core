package com.vteba.service.generic;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.vteba.tx.generic.Page;

/**
 * 通用泛型Service接口，简化Service接口定义。
 * @author yinlei 
 * date 2012-6-3 下午12:51:46
 */
public interface IGenericService<T, ID extends Serializable> {

    /**
     * @param entity
     * @return
     * @see com.vteba.tx.generic.IGenericDao#save(java.lang.Object)
     */
    public abstract ID save(T entity);

    /**
     * @param entity
     * @see com.vteba.tx.generic.IGenericDao#persist(java.lang.Object)
     */
    public abstract void persist(T entity);

    /**
     * @param params
     * @return
     * @see com.vteba.tx.hibernate.BaseGenericDao#getEntityList(java.util.Map)
     */
    public abstract List<T> getEntityList(Map<String, ?> params);

    /**
     * @param params
     * @return
     * @see com.vteba.tx.hibernate.BaseGenericDao#getEntityList(java.lang.Object)
     */
    public abstract List<T> getEntityList(T params);

    /**
     * @param params
     * @param orderMaps
     * @return
     * @see com.vteba.tx.hibernate.BaseGenericDao#getEntityList(java.lang.Object, java.util.Map)
     */
    public abstract List<T> getEntityList(T params, Map<String, String> orderMaps);

    /**
     * @param propName
     * @param value
     * @return
     * @see com.vteba.tx.hibernate.BaseGenericDao#getEntityList(java.lang.String, java.lang.Object)
     */
    public abstract List<T> getEntityList(String propName, Object value);

    /**
     * @param entity
     * @see com.vteba.tx.generic.IGenericDao#update(java.lang.Object)
     */
    public abstract void update(T entity);
    
    /**
     * @param entity
     * @see com.vteba.tx.generic.IGenericDao#saveOrUpdate(java.lang.Object)
     */
    public abstract void saveOrUpdate(T entity);

    /**
     * 批量更新实体entity
     * @param setValue set参数
     * @param params where参数
     */
    public abstract int updateBatch(T setValue, T params);
    
    /**
     * 批量更新实体entity
     * @param setValue set参数
     * @param params where参数，key为属性名，value为属性值
     */
    public abstract int updateBatch(T setValue, Map<String, ?> params);
    
    /**
     * @param propName1
     * @param value1
     * @param propName2
     * @param value2
     * @return
     * @see com.vteba.tx.hibernate.BaseGenericDao#getEntityList(java.lang.String, java.lang.Object, java.lang.String, java.lang.Object)
     */
    public abstract List<T> getEntityList(String propName1, Object value1, String propName2, Object value2);

    /**
     * @return
     * @see com.vteba.tx.hibernate.BaseGenericDao#getAll()
     */
    public abstract List<T> getAll();

    /**
     * @param page
     * @param params
     * @return
     * @see com.vteba.tx.hibernate.BaseGenericDao#queryForPage(com.vteba.tx.generic.Page, java.util.Map)
     */
    public abstract Page<T> queryForPage(Page<T> page, Map<String, ?> params);

    /**
     * @param entity
     * @param id
     * @return
     * @see com.vteba.tx.generic.IGenericDao#load(java.lang.Class, java.io.Serializable)
     */
    public abstract T load(Class<T> entity, ID id);

    /**
     * @param id
     * @return
     * @see com.vteba.tx.generic.IGenericDao#load(java.io.Serializable)
     */
    public abstract T load(ID id);

    /**
     * @param id
     * @return
     * @see com.vteba.tx.generic.IGenericDao#get(java.io.Serializable)
     */
    public abstract T get(ID id);

    /**
     * @param id
     * @see com.vteba.tx.generic.IGenericDao#delete(java.io.Serializable)
     */
    public abstract void delete(ID id);

    /**
     * @param entity
     * @see com.vteba.tx.generic.IGenericDao#delete(java.lang.Object)
     */
    public abstract void delete(T entity);

    /**
     * 根据entity携带的条件删除实体，命名参数
     * @param entity 条件
     */
    public abstract int deleteBatch(T entity);
    
    /**
     * 根据条件删除实体，使用命名参数
     * @param params 条件参数，key为属性名，value为属性值
     */
    public abstract int deleteBatch(Map<String, ?> params);
    
    /**
     * @param propertyName
     * @param propertyValue
     * @return
     * @see com.vteba.tx.hibernate.BaseGenericDao#getListByLike(java.lang.String, java.lang.String)
     */
    public abstract List<T> getListByLike(String propertyName, String propertyValue);

    /**
     * @param model
     * @return
     * @see com.vteba.tx.hibernate.BaseGenericDao#getListByLike(java.lang.Object)
     */
    public abstract List<T> getListByLike(T model);

    /**
     * @param model
     * @param orderMaps
     * @return
     * @see com.vteba.tx.hibernate.BaseGenericDao#getListByLike(java.lang.Object, java.util.Map)
     */
    public abstract List<T> getListByLike(T model, Map<String, String> orderMaps);

    /**
     * @param propertyName
     * @param value
     * @return
     * @see com.vteba.tx.hibernate.BaseGenericDao#uniqueResult(java.lang.String, java.lang.Object)
     */
    public abstract T uniqueResult(String propertyName, Object value);

    /**
     * @param params
     * @return
     * @see com.vteba.tx.hibernate.BaseGenericDao#uniqueResult(java.util.Map)
     */
    public abstract T uniqueResult(Map<String, ?> params);

    /**
     * @param model
     * @return
     * @see com.vteba.tx.hibernate.BaseGenericDao#uniqueResult(java.lang.Object)
     */
    public abstract T uniqueResult(T model);

    /**
     * @param page
     * @param entity
     * @return
     * @see com.vteba.tx.hibernate.BaseGenericDao#queryForPage(com.vteba.tx.generic.Page, java.lang.Object)
     */
    public abstract Page<T> queryForPage(Page<T> page, T entity);
    
    /**
     * 分页查询但是不返回总记录数。
     * @param page 分页参数，以及排序参数
     * @param params 参数，where条件，key为属性名
     * @return 结果List
     */
    public abstract List<T> pagedQueryList(Page<T> page, Map<String, ?> params);
    
    /**
     * 分页查询但是不返回总记录数。
     * @param page 分页参数，以及排序参数
     * @param params 参数，where条件
     * @return 结果List
     */
    public abstract List<T> pagedQueryList(Page<T> page, T params);
    
    /**
     * 批量保存一批数据
     * @param list 实体list
     * @param batchSize 批次大小，每batchSize flush一次
     */
    public abstract void saveEntityBatch(List<T> list, int batchSize);

    /**
     * 根据id list批量删除实体
     * @param list ids列表
     */
    public abstract void deleteEntityBatch(List<ID> list);
    
}
