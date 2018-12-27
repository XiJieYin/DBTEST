package com.gx.hz.service;

import com.gx.hz.pojo.InfoRwryjh;

import java.util.List;

/**
 * Created by ten on 17/11/17.
 */
public interface InfoRwryjhService  extends IBaseService<InfoRwryjh> {

    public int insertNewRWJH(List<InfoRwryjh> infoRwryjhs);
}
