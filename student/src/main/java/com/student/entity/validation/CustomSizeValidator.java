/****************************************************************************
 *                              COPYRIGHT NOTICE
*
*                      Copyright(@2006) by Interland Technology Services PVT. LTD **
*
*      This program is used to monitor the stream control and Stop/Start
*      the streams. The program and related materials are confidential and
*      proprietary of Interland Technology Services PVT. LTD and no part of these materials
*      should be reproduced, published in any forms without the written
*      approval of INTERLAND
*
** Project Name         : iPSH
** Program description  : CustomSizevalidator
** Version No           : 1.0.0
** Author               : Harichand
** Date Created         : 15-April-2020
** Modification Log     :   
CRId/ProjectId	Date Modified      	User		         Description		
Prod_1.0.0	               			 
*****************************************************************************/
package com.student.entity.validation;

import javax.validation.ConstraintValidator;

import javax.validation.ConstraintValidatorContext;

import org.springframework.util.StringUtils;

import com.student.util.ApplicationProperties;

public class CustomSizeValidator implements ConstraintValidator<CustomSize, String> {

	private String maxKey;
	private String minKey;
	private boolean required;

	@Override
	public void initialize(CustomSize customSize) {
		this.maxKey = customSize.maxKey();
		this.minKey = customSize.minKey();
		this.required = customSize.required();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		int maxValue = Integer.parseInt(ApplicationProperties.INSTANCE.getValue(maxKey));
		int minValue = Integer.parseInt(ApplicationProperties.INSTANCE.getValue(minKey));
		if (required == true) {
			if (StringUtils.isEmpty(value) && minValue == 0) {
				return true;
			}
			if (!StringUtils.isEmpty(value) && (value.length() < minValue || value.length() > maxValue)) {
				return false;
			}
		} else {
			if (!StringUtils.isEmpty(value) && (value.length() < minValue || value.length() > maxValue)) {
				return false;
			}
		}
		return true;
	}
}
