package com.xxx.messageBo.dao;

import com.xxx.messageBo.bean.Page;
import com.xxx.messageBo.bean.User;

public interface PageDao {
	public Page<User> findAllUserWithPage(int pageNum,int pageSize);

}
