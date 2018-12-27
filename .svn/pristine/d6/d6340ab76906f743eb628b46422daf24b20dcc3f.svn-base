package com.gx.common.dict;

import com.gx.common.constant.base.AbstractDictMap;


/**
 * 字典map
 *
 */
public class DictMap extends AbstractDictMap {

    @Override
    public void init() {
        put("code","字典代码");
        put("name","字典名称");
        put("type","字典类型");
        put("isEnable","是否启用");
        put("remark","备注");
        put("tmlx","条目类型");
        put("showIndex","显示顺序");
    }

    @Override
    protected void initBeWrapped() {
    	putFieldWrapperMethodName("isEnable","getIsEnable");
    }
}
