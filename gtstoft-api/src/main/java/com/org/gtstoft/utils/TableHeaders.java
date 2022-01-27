package com.org.gtstoft.utils;

public class TableHeaders
{
	private String headers;
	private String dataColumn;
	private String dataType;

	public TableHeaders( String headers, String dataColumn, String dataType)
	{
		super();
		this.headers = headers;
		this.dataColumn = dataColumn;
		this.dataType = dataType;
	}

	public String getHeaders()
	{
		return headers;
	}

	public String getDataColumn()
	{
		return dataColumn;
	}

	public String getDataType()
	{
		return dataType;
	}


	public void setHeaders(String headers)
	{
		this.headers = headers;
	}

	public void setDataColumn(String dataColumn)
	{
		this.dataColumn = dataColumn;
	}

	public void setDataType(String dataType)
	{
		this.dataType = dataType;
	}
}
