/*
 * Copyright 2014 by SCSK Corporation.
 * 
 * This file is part of PrimeCloud Controller(TM).
 * 
 * PrimeCloud Controller(TM) is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 * 
 * PrimeCloud Controller(TM) is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with PrimeCloud Controller(TM). If not, see <http://www.gnu.org/licenses/>.
 */
package jp.primecloud.auto.dao.crud.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.primecloud.auto.dao.crud.BaseAwsSslKeyDao;
import jp.primecloud.auto.entity.crud.AwsSslKey;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

/**
 * <p>
 * {@link BaseAwsSslKeyDao}の実装クラスです。
 * </p>
 *
 */
public abstract class BaseAwsSslKeyDaoImpl extends SqlMapClientDaoSupport implements BaseAwsSslKeyDao {

    protected String namespace = "AwsSslKey";

    /**
     * {@inheritDoc}
     */
    @Override
    public AwsSslKey read(
            Long keyNo
        ) {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("keyNo", keyNo);
        return (AwsSslKey) getSqlMapClientTemplate().queryForObject(getSqlMapId("read"), paramMap);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @SuppressWarnings("unchecked")
    public List<AwsSslKey> readAll() {
        return (List<AwsSslKey>) getSqlMapClientTemplate().queryForList(getSqlMapId("readAll"));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @SuppressWarnings("unchecked")
    public List<AwsSslKey> readInKeyNos(
            Collection<Long> keyNos
        ) {
        if (keyNos.isEmpty()) {
            return new ArrayList<AwsSslKey>();
        }
        Map<String, Object> paramMap = new HashMap<String, Object>();
        if (keyNos instanceof List) {
            paramMap.put("keyNos", keyNos);
        } else {
            paramMap.put("keyNos", new ArrayList<Long>(keyNos));
        }
        paramMap.put("orderBys", new String[0]);
        return (List<AwsSslKey>) getSqlMapClientTemplate().queryForList(getSqlMapId("readInKeyNos"), paramMap);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void create(AwsSslKey entity) {
        String id = "create";
        if (entity.getKeyNo() == null) {
            id = "createAuto";
        }
        getSqlMapClientTemplate().insert(getSqlMapId(id), entity);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void update(AwsSslKey entity) {
        getSqlMapClientTemplate().insert(getSqlMapId("update"), entity);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void delete(AwsSslKey entity) {
        getSqlMapClientTemplate().insert(getSqlMapId("delete"), entity);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void deleteAll() {
        getSqlMapClientTemplate().delete(getSqlMapId("deleteAll"));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void deleteByKeyNo(
            Long keyNo
        ) {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("keyNo", keyNo);
        getSqlMapClientTemplate().delete(getSqlMapId("deleteByKeyNo"), paramMap);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public long countAll() {
        return (Long) getSqlMapClientTemplate().queryForObject(getSqlMapId("countAll"));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public long countByKeyNo(
            Long keyNo
        ) {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("keyNo", keyNo);
        return (Long) getSqlMapClientTemplate().queryForObject(getSqlMapId("countByKeyNo"), paramMap);
    }

    protected String getSqlMapId(String id) {
        if (namespace == null || namespace.length() == 0) {
            return id;
        }
        return namespace + "." + id;
    }

}
