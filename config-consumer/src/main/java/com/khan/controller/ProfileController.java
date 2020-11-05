package com.khan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.khan.model.MemberProfileConfiguration;

@RestController
public class ProfileController {

	@Autowired
	private MemberProfileConfiguration memberProfileConfiguration;

	@RequestMapping("/profile")
	public MemberProfileConfiguration getConfig() {
		return memberProfileConfiguration;
	}
}
