package hello.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mkt_complaint")
public class Complaint implements Serializable {

	private static final long serialVersionUID = 6090388660608030274L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "mkt_orderid")
	private int orderId;

	@Column(name = "mkt_title")
	private String title;

	@Column(name = "mkt_category")
	private String category;

	@Column(name = "mkt_message")
	private String message;

	@Column(name = "mkt_statusid")
	private int statusId;

	public long getId() {
		return id;
	}

	public int getOrderId() {
		return orderId;
	}

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public String getMessage() {
		return message;
	}

	public int getStatusId() {
		return statusId;
	}
	
	protected Complaint () {
		
	}

	public Complaint(int id, int orderId, String title, String category, String message, int statusId) {
		if (id != 0) {
			this.id = id;
		}
		this.orderId = orderId;
		this.title = title;
		this.category = category;
		this.message = message;
		this.statusId = statusId;
	}
}
