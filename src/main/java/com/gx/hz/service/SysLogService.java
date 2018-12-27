/**
 * Copyright (C) 2015 GuangZhou GuanXuan Information Technology CO., Ltd. All rights reserved
 *
 * 本代码版权归广州冠宣信息科技有限公司所有，且受到相关的法律保护。
 * 没有经过版权所有者的书面同意，
 * 任何其他个人或组织均不得以任何形式将本文件或本文件的部分代码用于其他商业用途。
 *
 */
package com.gx.hz.service;

import com.gx.hz.pojo.SysLog;

import java.util.List;


/**
 * @author hqj
 *
 */
public interface SysLogService extends IBaseService<SysLog> {
	List<SysLog> findSysLogAndSysUser();


}
