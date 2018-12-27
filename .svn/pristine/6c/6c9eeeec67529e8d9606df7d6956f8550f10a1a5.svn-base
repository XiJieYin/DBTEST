package com.gx.hz.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.FileDao;
import com.gx.hz.pojo.File;
import com.gx.hz.service.FileService;

@Service("fileService")
public class FileServiceImpl extends BaseServiceImpl<File> implements FileService {
	@Resource
	private FileDao fileDao;

	@Override
	public BaseDao<File> getDao() {
		// TODO Auto-generated method stub
		return fileDao;
	}

}
