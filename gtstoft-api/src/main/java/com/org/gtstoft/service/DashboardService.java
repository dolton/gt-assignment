package com.org.gtstoft.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.gtstoft.entity.Customer;
import com.org.gtstoft.repository.DashboardRepo;
import com.org.gtstoft.utils.Constant;
import com.org.gtstoft.utils.Headers;

/**
 * @author dolton
 *
 */
@Service
public class DashboardService
{
	Logger logger = LoggerFactory.getLogger(DashboardService.class);
	
	@Autowired
	private DashboardRepo dashboardRepo;

	public Map<String, Object> getCustomerList()
	{
		Map<String, Object> dataMap = new HashMap<>();
		try
		{
			List<Customer> customerList = dashboardRepo.findAll();
			
			dataMap.put(Constant.RESPONSE_DATA, customerList);
			dataMap.put(Constant.FIELD_NAME_HEADER, Headers.CUSTOMER_HEADER_LIST.getHeaders());
		}
		catch(Exception ex)
		{
			logger.error("Error while fetching customer data ", ex);
			throw new RuntimeException("Error while fetching customer data", ex);
		}

		return dataMap;

	}
}
