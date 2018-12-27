package com.gx.hz.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.SysChartConfigDao;
import com.gx.hz.pojo.SysChartConfig;
import com.gx.hz.service.SysChartConfigService;

/**
 * 展示模块配置接口实现类
 * Created by ten on 17/12/28.
 */
@Service("sysChartConfigService")
public class SysChartConfigServiceImpl extends BaseServiceImpl<SysChartConfig>
        implements SysChartConfigService {

    @Resource
    SysChartConfigDao sysChartConfigDao;
    @Override
    public BaseDao<SysChartConfig> getDao() {
        return sysChartConfigDao;
    }
}
