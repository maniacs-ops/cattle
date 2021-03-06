/**
 * This class is generated by jOOQ
 */
package io.cattle.platform.core.model;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "environment", schema = "cattle")
public interface Stack extends java.io.Serializable {

	/**
	 * Setter for <code>cattle.environment.id</code>.
	 */
	public void setId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.environment.id</code>.
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	public java.lang.Long getId();

	/**
	 * Setter for <code>cattle.environment.name</code>.
	 */
	public void setName(java.lang.String value);

	/**
	 * Getter for <code>cattle.environment.name</code>.
	 */
	@javax.persistence.Column(name = "name", length = 255)
	public java.lang.String getName();

	/**
	 * Setter for <code>cattle.environment.account_id</code>.
	 */
	public void setAccountId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.environment.account_id</code>.
	 */
	@javax.persistence.Column(name = "account_id", precision = 19)
	public java.lang.Long getAccountId();

	/**
	 * Setter for <code>cattle.environment.kind</code>.
	 */
	public void setKind(java.lang.String value);

	/**
	 * Getter for <code>cattle.environment.kind</code>.
	 */
	@javax.persistence.Column(name = "kind", nullable = false, length = 255)
	public java.lang.String getKind();

	/**
	 * Setter for <code>cattle.environment.uuid</code>.
	 */
	public void setUuid(java.lang.String value);

	/**
	 * Getter for <code>cattle.environment.uuid</code>.
	 */
	@javax.persistence.Column(name = "uuid", unique = true, nullable = false, length = 128)
	public java.lang.String getUuid();

	/**
	 * Setter for <code>cattle.environment.description</code>.
	 */
	public void setDescription(java.lang.String value);

	/**
	 * Getter for <code>cattle.environment.description</code>.
	 */
	@javax.persistence.Column(name = "description", length = 1024)
	public java.lang.String getDescription();

	/**
	 * Setter for <code>cattle.environment.state</code>.
	 */
	public void setState(java.lang.String value);

	/**
	 * Getter for <code>cattle.environment.state</code>.
	 */
	@javax.persistence.Column(name = "state", nullable = false, length = 128)
	public java.lang.String getState();

	/**
	 * Setter for <code>cattle.environment.created</code>.
	 */
	public void setCreated(java.util.Date value);

	/**
	 * Getter for <code>cattle.environment.created</code>.
	 */
	@javax.persistence.Column(name = "created")
	public java.util.Date getCreated();

	/**
	 * Setter for <code>cattle.environment.removed</code>.
	 */
	public void setRemoved(java.util.Date value);

	/**
	 * Getter for <code>cattle.environment.removed</code>.
	 */
	@javax.persistence.Column(name = "removed")
	public java.util.Date getRemoved();

	/**
	 * Setter for <code>cattle.environment.remove_time</code>.
	 */
	public void setRemoveTime(java.util.Date value);

	/**
	 * Getter for <code>cattle.environment.remove_time</code>.
	 */
	@javax.persistence.Column(name = "remove_time")
	public java.util.Date getRemoveTime();

	/**
	 * Setter for <code>cattle.environment.data</code>.
	 */
	public void setData(java.util.Map<String,Object> value);

	/**
	 * Getter for <code>cattle.environment.data</code>.
	 */
	@javax.persistence.Column(name = "data", length = 16777215)
	public java.util.Map<String,Object> getData();

	/**
	 * Setter for <code>cattle.environment.external_id</code>.
	 */
	public void setExternalId(java.lang.String value);

	/**
	 * Getter for <code>cattle.environment.external_id</code>.
	 */
	@javax.persistence.Column(name = "external_id", length = 128)
	public java.lang.String getExternalId();

	/**
	 * Setter for <code>cattle.environment.health_state</code>.
	 */
	public void setHealthState(java.lang.String value);

	/**
	 * Getter for <code>cattle.environment.health_state</code>.
	 */
	@javax.persistence.Column(name = "health_state", length = 128)
	public java.lang.String getHealthState();

	/**
	 * Setter for <code>cattle.environment.folder</code>.
	 */
	public void setFolder(java.lang.String value);

	/**
	 * Getter for <code>cattle.environment.folder</code>.
	 */
	@javax.persistence.Column(name = "folder", length = 255)
	public java.lang.String getFolder();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface Stack
	 */
	public void from(io.cattle.platform.core.model.Stack from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface Stack
	 */
	public <E extends io.cattle.platform.core.model.Stack> E into(E into);
}
