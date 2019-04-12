package com.mm.connectedworkflow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.kie.api.runtime.process.WorkItemHandler;



/**
 * Parameter class
 * @author Nishant
 *
 */
public class ProcessParameter {
	
	/**
	 * Name of the process.
	 */
	private String processName;
	
	/**
	 * This map will hold Parameters.
	 */
	private final Map<String, Object> parameterMap;
	
	/**
	 * This Map will hold 
	 */
	private final Map<String, WorkItemHandler> workItemHandlers;
	
	/**
	 * list of BPMN files.
	 */
	private final List<String> bpmnFiles;
	
	/**
	 * list of Drool files.
	 */
	private final List<String> drlFiles;
	
	/**
	 * list of Drool files.
	 */
	private final List<String> dtFiles;
	
	/**
	 * constructor.
	 */
	public ProcessParameter(String processName) {
		this.processName = processName;
		parameterMap = new HashMap<String, Object>();
		workItemHandlers = new HashMap<String, WorkItemHandler>();
		bpmnFiles = new ArrayList<String>();
		drlFiles = new ArrayList<String>(); 
		dtFiles = new ArrayList<String>(); 
	}
	
	/**
	 * Add Parameter to parameter map.
	 * @param name Name of the parameter.
	 * @param parameter instance of parameter.
	 */
	public void addParameter(String name, Object parameter) {
		parameterMap.put(name, parameter);
	}
	
	/**
	 * Add workitem handler to workitemhandler map.
	 * @param name Name of the workitem handler.
	 * @param handler 
	 */
	public void addWkHandler(String name, WorkItemHandler handler) {
		workItemHandlers.put(name, handler);
	}

	/**
	 * Add BPMN file to array list.
	 * @param bpmnFile name of the BPMN file.
	 */
	public void addBpmnFilePath(String bpmnFile) {
		bpmnFiles.add(bpmnFile);
	}
	
	/**
	 * Add DRL file to array list.
	 * @param drlFile name of the DRL file.
	 */
	public void addDrlFilePath(String drlFile) {
		drlFiles.add(drlFile);
	}
	
	/**
	 * Add Decision Table file to array list.
	 * @param dtFile name of the DT file.
	 */
	public void addDtFiles(String dtFile) {
		dtFiles.add(dtFile);
	}

	/**
	 * @return the parameterMap
	 */
	public Map<String, Object> getParameterMap() {
		return parameterMap;
	}

	/**
	 * @return the workItemHandlers
	 */
	public Map<String, WorkItemHandler> getWorkItemHandlers() {
		return workItemHandlers;
	}

	/**
	 * @return the bpmnFiles
	 */
	public List<String> getBpmnFiles() {
		return bpmnFiles;
	}

	/**
	 * @return the drlFiles
	 */
	public List<String> getDrlFiles() {
		return drlFiles;
	}

	/**
	 * 
	 * @return Process Name
	 */
	public String getProcessName() {
		return processName;
	}

	public List<String> getDtFiles() {
		return dtFiles;
	}

}
