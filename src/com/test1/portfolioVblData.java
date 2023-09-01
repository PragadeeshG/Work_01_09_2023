package com.test1;

public class portfolioVblData {
	private int vblCd;
	private String name;
	private String desc;
	private String vtdCd;
	private int parentCd;
	private String vblOwner;
	private int vtdOwer;
	private int subCertId;
	private String subCertOwner;
	private int errorCode;
	private String errorSevetiry;
	private String entityState;

	public portfolioVblData() {

	}

	public portfolioVblData(int vblCd, String name, String desc, String vtdCd, int parentCd, String vblOwner,
			int vtdOwer, int subCertId, String subCertOwner, int errorCode, String errorSevetiry, String entityState) {
		super();
		this.vblCd = vblCd;
		this.name = name;
		this.desc = desc;
		this.vtdCd = vtdCd;
		this.parentCd = parentCd;
		this.vblOwner = vblOwner;
		this.vtdOwer = vtdOwer;
		this.subCertId = subCertId;
		this.subCertOwner = subCertOwner;
		this.errorCode = errorCode;
		this.errorSevetiry = errorSevetiry;
		this.entityState = entityState;
	}

	public int getVblCd() {
		return vblCd;
	}

	public void setVblCd(int vblCd) {
		this.vblCd = vblCd;
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

	public String getVtdCd() {
		return vtdCd;
	}

	public void setVtdCd(String vtdCd) {
		this.vtdCd = vtdCd;
	}

	public int getParentCd() {
		return parentCd;
	}

	public void setParentCd(int parentCd) {
		this.parentCd = parentCd;
	}

	public String getVblOwner() {
		return vblOwner;
	}

	public void setVblOwner(String vblOwner) {
		this.vblOwner = vblOwner;
	}

	public int getVtdOwer() {
		return vtdOwer;
	}

	public void setVtdOwer(int vtdOwer) {
		this.vtdOwer = vtdOwer;
	}

	public int getSubCertId() {
		return subCertId;
	}

	public void setSubCertId(int subCertId) {
		this.subCertId = subCertId;
	}

	public String getSubCertOwner() {
		return subCertOwner;
	}

	public void setSubCertOwner(String subCertOwner) {
		this.subCertOwner = subCertOwner;
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
