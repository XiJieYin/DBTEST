/**
 * Copyright (C) 2015 GuangZhou GuanXuan Information Technology CO., Ltd. All rights reserved
 *
 * 本代码版权归广州冠宣信息科技有限公司所有，且受到相关的法律保护。
 * 没有经过版权所有者的书面同意，
 * 任何其他个人或组织均不得以任何形式将本文件或本文件的部分代码用于其他商业用途。
 *
 */
package com.gx.hz.service;

import java.util.List;

import com.gx.hz.pojo.InfoTaskRule;
import com.gx.hz.pojo.InfoTaskRuleDetail;

/**
 * 
 * @version 
 * @author cyq  2017-12-15 上午11:37:06
 * 
 */
public interface InfoTaskRuleService extends IBaseService<InfoTaskRule>{

	public boolean saveRuleDetail(String detailList,String isUpdate,String ruleId) throws Exception;
	
	/**
	 * 根据角色ID，规则ID查询是否有上级ID,没有上级的ID返回0，有的话直接返回上级ID
	 * 
	 * @author cyq 2017-12-19
	 * @param ruleId
	 * @param roleId
	 * @throws Exception
	 */
	public Integer queryDetail(Integer ruleId ,Integer roleId) throws Exception;
	
	/**
	 * 根据规则ID，查询详细配置情况
	 * @author cyq 2017-12-19
	 * @param ruleId
	 * @return
	 * @throws Exception
	 */
	public List<InfoTaskRuleDetail> queryDetailByRuleId(Integer ruleId) throws Exception;
	
	/**
	 * 查询所有的规则跟相应的配置
	 * 
	 * @author cyq 2017-12-21
	 * @return
	 * @throws Exception
	 */
	public List<InfoTaskRule> getRuleAndDetail() throws Exception;
}
