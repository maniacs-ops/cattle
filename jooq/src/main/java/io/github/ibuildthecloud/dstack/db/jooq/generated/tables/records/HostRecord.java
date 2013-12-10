/**
 * This class is generated by jOOQ
 */
package io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "host", schema = "dstack")
public class HostRecord extends org.jooq.impl.UpdatableRecordImpl<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.HostRecord> implements io.github.ibuildthecloud.dstack.db.jooq.utils.TableRecordJaxb, org.jooq.Record10<java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.util.Map<String,Object>, java.lang.String, java.lang.String, java.lang.Long>, io.github.ibuildthecloud.dstack.db.jooq.generated.model.Host {

	private static final long serialVersionUID = 616894913;

	/**
	 * Setter for <code>dstack.host.id</code>. 
	 */
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>dstack.host.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	@Override
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>dstack.host.name</code>. 
	 */
	public void setName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>dstack.host.name</code>. 
	 */
	@javax.persistence.Column(name = "name", nullable = false, length = 255)
	@Override
	public java.lang.String getName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>dstack.host.kind</code>. 
	 */
	public void setKind(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>dstack.host.kind</code>. 
	 */
	@javax.persistence.Column(name = "kind", nullable = false, length = 255)
	@Override
	public java.lang.String getKind() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>dstack.host.state</code>. 
	 */
	public void setState(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>dstack.host.state</code>. 
	 */
	@javax.persistence.Column(name = "state", nullable = false, length = 255)
	@Override
	public java.lang.String getState() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>dstack.host.created</code>. 
	 */
	public void setCreated(java.sql.Timestamp value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>dstack.host.created</code>. 
	 */
	@javax.persistence.Column(name = "created", nullable = false)
	@Override
	public java.sql.Timestamp getCreated() {
		return (java.sql.Timestamp) getValue(4);
	}

	/**
	 * Setter for <code>dstack.host.removed</code>. 
	 */
	public void setRemoved(java.sql.Timestamp value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>dstack.host.removed</code>. 
	 */
	@javax.persistence.Column(name = "removed")
	@Override
	public java.sql.Timestamp getRemoved() {
		return (java.sql.Timestamp) getValue(5);
	}

	/**
	 * Setter for <code>dstack.host.data</code>. 
	 */
	public void setData(java.util.Map<String,Object> value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>dstack.host.data</code>. 
	 */
	@javax.persistence.Column(name = "data", length = 16777215)
	@Override
	public java.util.Map<String,Object> getData() {
		return (java.util.Map<String,Object>) getValue(6);
	}

	/**
	 * Setter for <code>dstack.host.uuid</code>. 
	 */
	public void setUuid(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>dstack.host.uuid</code>. 
	 */
	@javax.persistence.Column(name = "uuid", nullable = false, length = 128)
	@Override
	public java.lang.String getUuid() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>dstack.host.description</code>. 
	 */
	public void setDescription(java.lang.String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>dstack.host.description</code>. 
	 */
	@javax.persistence.Column(name = "description", length = 255)
	@Override
	public java.lang.String getDescription() {
		return (java.lang.String) getValue(8);
	}

	/**
	 * Setter for <code>dstack.host.agent_id</code>. 
	 */
	public void setAgentId(java.lang.Long value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>dstack.host.agent_id</code>. 
	 */
	@javax.persistence.Column(name = "agent_id", precision = 19)
	@Override
	public java.lang.Long getAgentId() {
		return (java.lang.Long) getValue(9);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Long> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record10 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row10<java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.util.Map<String,Object>, java.lang.String, java.lang.String, java.lang.Long> fieldsRow() {
		return (org.jooq.Row10) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row10<java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.util.Map<String,Object>, java.lang.String, java.lang.String, java.lang.Long> valuesRow() {
		return (org.jooq.Row10) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.HostTable.HOST.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.HostTable.HOST.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.HostTable.HOST.KIND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.HostTable.HOST.STATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field5() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.HostTable.HOST.CREATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field6() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.HostTable.HOST.REMOVED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.util.Map<String,Object>> field7() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.HostTable.HOST.DATA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.HostTable.HOST.UUID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field9() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.HostTable.HOST.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field10() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.HostTable.HOST.AGENT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getKind();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getState();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value5() {
		return getCreated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value6() {
		return getRemoved();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.Map<String,Object> value7() {
		return getData();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getUuid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value9() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value10() {
		return getAgentId();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached HostRecord
	 */
	public HostRecord() {
		super(io.github.ibuildthecloud.dstack.db.jooq.generated.tables.HostTable.HOST);
	}

	/**
	 * Create a detached, initialised HostRecord
	 */
	public HostRecord(java.lang.Long id, java.lang.String name, java.lang.String kind, java.lang.String state, java.sql.Timestamp created, java.sql.Timestamp removed, java.util.Map<String,Object> data, java.lang.String uuid, java.lang.String description, java.lang.Long agentId) {
		super(io.github.ibuildthecloud.dstack.db.jooq.generated.tables.HostTable.HOST);

		setValue(0, id);
		setValue(1, name);
		setValue(2, kind);
		setValue(3, state);
		setValue(4, created);
		setValue(5, removed);
		setValue(6, data);
		setValue(7, uuid);
		setValue(8, description);
		setValue(9, agentId);
	}
}
