/**
 * Copyright (C) 2015 GuangZhou GuanXuan Information Technology CO., Ltd. All rights reserved
 *
 * 本代码版权归广州冠宣信息科技有限公司所有，且受到相关的法律保护。
 * 没有经过版权所有者的书面同意，
 * 任何其他个人或组织均不得以任何形式将本文件或本文件的部分代码用于其他商业用途。
 *
 */
package com.gx.hz.dao;

import java.util.List;
import java.util.Map;

import com.gx.hz.pojo.DnsmClgf;

/**
 * 【DosAJmapper接口】
 *
 * @version 
 * @author hqj  2017年8月17日 下午5:11:17
 * 
 */
public interface DnsmClgfDao extends BaseDao<DnsmClgf> {
	DnsmClgf  selectAjIdByAjh(int DnsmClgf);
	DnsmClgf checkAjh(String DnsmClgf);
	List<Map<String, Object>> countByOrg();
}
