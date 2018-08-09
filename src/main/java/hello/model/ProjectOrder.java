package hello.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mkt_projectorder")
public class ProjectOrder implements Serializable {

	private static final long serialVersionUID = 8947243861900773352L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "mkt_projectid")
	private int projectId;

	@Column(name = "mkt_supplierId")
	private int supplierId;

	@Column(name = "mkt_totalamount")
	private long totalAmount;

	@Column(name = "mkt_statusid")
	private int statusId;

	@Column(name = "mkt_quotationid")
	private int quotationId;

	@Column(name = "mkt_pofileurl")
	private String poFileUrl;

	public long getId() {
		return id;
	}

	public int getProjectId() {
		return projectId;
	}

	public int getSupplierId() {
		return supplierId;
	}

	public long getTotalAmount() {
		return totalAmount;
	}

	public int getStatusId() {
		return statusId;
	}

	public int getQuotationId() {
		return quotationId;
	}
	
	protected ProjectOrder () {
		
	}

	public ProjectOrder(int id, int projectId, int supplierId, long totalAmount, int statusId, int quotationId,
			String poFileUrl) {
		if (id != 0) {
			this.id = id;
		}
		this.projectId = projectId;
		this.supplierId = supplierId;
		this.totalAmount = totalAmount;
		this.statusId = statusId;
		this.quotationId = quotationId;
	}
}
