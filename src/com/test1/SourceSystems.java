package com.test1;

public class SourceSystems {
	private String code;
	private String name;
	private String desc;
	private int version;
	private int order;
	private int errorCode;
	private String errorSevetiry;
	private String entityState;

	public SourceSystems() {

	}

	public SourceSystems(String code, String name, String desc, int version, int order, int errorCode,
			String errorSevetiry, String entityState) {
		super();
		this.code = code;
		this.name = name;
		this.desc = desc;
		this.version = version;
		this.order = order;
		this.errorCode = errorCode;
		this.errorSevetiry = errorSevetiry;
		this.entityState = entityState;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorSevetiry() {
		return errorSevetiry;
	}

	public void setErrorSevetiry(String errorSevetiry) {
		this.errorSevetiry = errorSevetiry;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
