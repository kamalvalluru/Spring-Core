package com.spring.utilschema.standalone;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Company {
	private List<String> names;
	private Map<String, Integer> designations;
	private Properties prop;

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}
	@Override
	public String toString() {
		return "Company [names=" + names + ", designations=" + designations + ", prop=" + prop + "]";
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	public Map<String, Integer> getDesignations() {
		return designations;
	}

	public void setDesignations(Map<String, Integer> designations) {
		this.designations = designations;
	}

}
