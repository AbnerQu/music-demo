/** 
* 
* @author linliquan 
* @data 2018年12月23日 00:03:48  
*/

package com.ss.vv.music.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ss.vv.common.AbstractService;
import com.ss.vv.common.IOperations;
import com.ss.vv.music.domain.Test;
import com.ss.vv.music.domain.User;
import com.ss.vv.music.mapper.ITestMapper;
import com.ss.vv.music.service.ITestService;

@Service("testService")
public class TestService extends AbstractService<Test, Test> implements ITestService {

	public TestService() {
		this.setTableName("test");
	}

	@Resource   
	private ITestMapper testMapper;

	@Override
	protected IOperations<Test, Test> getMapper() {
		return testMapper;
	}

	@Override
	public void setTableName(String tableName) {
		this.tableName = tableName;
		;
	}

}
