package com.profile.service.impl;

import org.springframework.stereotype.Service;

import com.profile.model.ProfileBean;
import com.profile.service.ProfileService;

@Service
public class ProfileServiceImpl implements ProfileService {

	@Override
	public ProfileBean getProfile() {
		ProfileBean bean = new ProfileBean();
		bean.setName("Hemanth");
		bean.setDesignation("Engineer");
		bean.setSalary(Double.valueOf("54544.44"));
		bean.setAge(25);
		return bean;
	}

}
