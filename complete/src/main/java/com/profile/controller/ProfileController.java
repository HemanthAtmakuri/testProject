package com.profile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.profile.model.ProfileBean;
import com.profile.service.ProfileService;

@RestController
public class ProfileController {

	@Autowired
	private ProfileService profileService;
	
	@RequestMapping("/profile")
	public ProfileBean getProfile()
	{
		
		ProfileBean bean = profileService.getProfile();
		
		return bean;
		
	}
}
