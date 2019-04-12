package com.mm.connectedworkflow;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
//@Cacheable(true)
//@Cache(usage=CacheConcurrencyStrategy.READ_WRITE,region="com.lupin.core.domain.document.Document")
@Table(name = "DOCUMENT")
//@Inheritance(strategy=InheritanceType.JOINED)
//@DiscriminatorColumn(name = "documentType", discriminatorType = DiscriminatorType.STRING, length = 32)
public class Document implements  Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name="DATE_OF_REQUEST")
	private Date dateOfRequest;
	 
	@Id
	@GeneratedValue(generator="document_seq")
	@SequenceGenerator(name="document_seq", sequenceName="DOCUMENT_SEQ", allocationSize = 1)
	@Column(name="ID")
	private Long id;
	
	@Column(name = "CREATED_DATE")
	private Date createdDate;
	
	@Column(name = "MODIFIED_DATE")
	@Version 
	private Date modifiedDate;
	
	@Column(name="REQUEST_NO")
	private String requestNo;
	
	@Column(name="PROCESS_SESSIONID")
	private Integer processSessionId;
	

	
	@Column(name="PROCESS_STATUS")
	private String processStatus;
	
	@Column(name="PROCESS_NAME")
	private String processName;

	@Column(name="PROCESS_ID")
	private String processId;

	@Column(name="PROCESS_VERSION")
	private String processVersion;

	public Date getDateOfRequest() {
		return dateOfRequest;
	}

	public void setDateOfRequest(Date dateOfRequest) {
		this.dateOfRequest = dateOfRequest;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public Integer getProcessSessionId() {
		return processSessionId;
	}

	public void setProcessSessionId(Integer processSessionId) {
		this.processSessionId = processSessionId;
	}

	
	public String getProcessStatus() {
		return processStatus;
	}

	public void setProcessStatus(String processStatus) {
		this.processStatus = processStatus;
	}

	public String getProcessName() {
		return processName;
	}

	public void setProcessName(String processName) {
		this.processName = processName;
	}

	public String getProcessId() {
		return processId;
	}

	public void setProcessId(String processId) {
		this.processId = processId;
	}

	public String getProcessVersion() {
		return processVersion;
	}

	public void setProcessVersion(String processVersion) {
		this.processVersion = processVersion;
	}
	
	
	
	
	
}
