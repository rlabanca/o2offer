package br.com.zoom.o2o.model.dto;

public class ApiResponse<T> {

	private T result;

	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}
	
}
