package com.org.gtstoft.utils;

import java.util.ArrayList;
import java.util.List;

public enum Headers
{
	CUSTOMER_HEADER_LIST
	{
		public List<TableHeaders> getHeaders()
		{
			List<TableHeaders> headerList = new ArrayList<>();
			headerList.add(new TableHeaders(Constant.FIELD_LABEL_FIRSTNAME,
			      Constant.FIELD_NAME_FIRSTNAME, Constant.DATATYPE_STRING));
			headerList.add(new TableHeaders(Constant.FIELD_LABEL_LASTNAME, Constant.FIELD_NAME_LASTNAME,
			      Constant.DATATYPE_STRING));
			headerList.add(new TableHeaders(Constant.FIELD_LABEL_EMAIL,
			      Constant.FIELD_NAME_EMAIL, Constant.DATATYPE_STRING));
			headerList.add(new TableHeaders(Constant.FIELD_LABEL_GENDER,
			      Constant.FIELD_NAME_GENDER, Constant.DATATYPE_STRING));
			headerList.add(new TableHeaders(Constant.FIELD_LABEL_MOBILE,
			      Constant.FIELD_NAME_MOBILE, Constant.DATATYPE_STRING));
			
			return headerList;
		}

	};
	
	public abstract List<TableHeaders> getHeaders();
}
