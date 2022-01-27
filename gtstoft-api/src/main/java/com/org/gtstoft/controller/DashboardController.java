package com.org.gtstoft.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.gtstoft.service.DashboardService;
import com.org.gtstoft.utils.Constant;
import com.org.gtstoft.utils.ServiceResponse;

/**
 * @author dolton
 *
 */
@RestController
@RequestMapping("/api/dashboard")
public class DashboardController
{
	@Autowired
	private DashboardService dashboardService;

	@GetMapping(value = "/getCustomerList")
	public ServiceResponse getCustomerList()
	{
		ServiceResponse serviceResponse = new ServiceResponse();

		Map<String, Object> dataMap = dashboardService.getCustomerList();

		serviceResponse.setStatus(Constant.STATUS_SUCCESS);
		serviceResponse.setResponse(dataMap);

		return serviceResponse;
	}
}
