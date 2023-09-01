package com.test1;

public class portfolioReqScrData {
	private int portfolioId;
	private String name;
	private String vblCode;
	private String vtdCode;
	private int nodeId;
	private String ownerId;
	private String instance;
	private String mappingName;
	private int errorCode;
	private String errorSevetiry;
	private String entityState;

	public portfolioReqScrData() {

	}

	public portfolioReqScrData(int portfolioId, String name, String vblCode, String vtdCode, int nodeId, String ownerId,
			String instance, String mappingName, int errorCode, String errorSevetiry, String entityState) {
		super();
		this.portfolioId = portfolioId;
		this.name = name;
		this.vblCode = vblCode;
		this.vtdCode = vtdCode;
		this.nodeId = nodeId;
		this.ownerId = ownerId;
		this.instance = instance;
		this.mappingName = mappingName;
		this.errorCode = errorCode;
		this.errorSevetiry = errorSevetiry;
		this.entityState = entityState;
	}

	public int getPortfolioId() {
		return portfolioId;
	}

	public void setPortfolioId(int portfolioId) {
		this.portfolioId = portfolioId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVblCode() {
		return vblCode;
	}

	public void setVblCode(String vblCode) {
		this.vblCode = vblCode;
	}

	public String getVtdCode() {
		return vtdCode;
	}

	public void setVtdCode(String vtdCode) {
		this.vtdCode = vtdCode;
	}

	public int getNodeId() {
		return nodeId;
	}

	public void setNodeId(int nodeId) {
		this.nodeId = nodeId;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getInstance() {
		return instance;
	}

	public void setInstance(String instance) {
		this.instance = instance;
	}

	public String getMappingName() {
		return mappingName;
	}

	public void setMappingName(String mappingName) {
		this.mappingName = mappingName;
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
