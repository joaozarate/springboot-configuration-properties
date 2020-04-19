package com.zarate.properties.app;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("conspirators.name")
public class PisonianConspiracyProperties {

	private String executed;

	/**
	 * forced to commit suicide
	 */
	private String commitSuicide;

	/**
	 * Exiled or denigrated
	 */
	private String exiled = "Annius Pollio";

	/**
	 * Pardoned or acquitted
	 */
	private String pardoned = "Antonius Natalis";

	public String getExecuted() {
		return executed;
	}

	public void setExecuted(String executed) {
		this.executed = executed;
	}

	public String getCommitSuicide() {
		return commitSuicide;
	}

	public void setCommitSuicide(String commitSuicide) {
		this.commitSuicide = commitSuicide;
	}

	public String getExiled() {
		return exiled;
	}

	public void setExiled(String exiled) {
		this.exiled = exiled;
	}

	public String getPardoned() {
		return pardoned;
	}

	public void setPardoned(String pardoned) {
		this.pardoned = pardoned;
	}

}
