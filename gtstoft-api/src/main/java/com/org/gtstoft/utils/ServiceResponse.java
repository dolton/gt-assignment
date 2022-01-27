package com.org.gtstoft.utils;

public class ServiceResponse
{
	private Object response;
	private String status;
	private Object error;

	public ServiceResponse()
	{

	}

	public ServiceResponse(final String message)
	{
		super();
		this.setResponse(message);
	}

	public ServiceResponse(final Object message, final String error, String status)
	{
		super();
		this.setResponse(message);
		this.setError(error);
		this.setStatus(status);
	}

	public ServiceResponse(String message, String serviceError)
	{
		super();
		this.setResponse(message);
		this.setError(serviceError);
	}

	public Object getResponse()
	{
		return response;
	}

	public String getStatus()
	{
		return status;
	}

	public Object getError()
	{
		return error;
	}

	public void setResponse(Object response)
	{
		this.response = response;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	public void setError(Object error)
	{
		this.error = error;
	}
}
