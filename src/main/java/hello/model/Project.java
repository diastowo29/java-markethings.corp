package hello.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mkt_project")
public class Project implements Serializable {

	private static final long serialVersionUID = 2719221252505234167L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "corp_id")
	private long corp_id;

	@Column(name = "title")
	private String title;

	@Column(name = "qty")
	private int qty;

	@Column(name = "period")
	private String period;

	@Column(name = "pic")
	private String pic;

	@Column(name = "pic_email")
	private String pic_email;

	@Column(name = "city")
	private String city;

	@Column(name = "pic_phone")
	private String pic_phone;

	@Column(name = "price")
	private long price;

	@Column(name = "project_desc")
	private String desc;

	public long getCorp_id() {
		return corp_id;
	}

	public String getTitle() {
		return title;
	}

	public int getQty() {
		return qty;
	}

	public String getPeriod() {
		return period;
	}

	public String getPic() {
		return pic;
	}

	public String getPic_email() {
		return pic_email;
	}

	public String getCity() {
		return city;
	}

	public String getPic_phone() {
		return pic_phone;
	}

	public long getPrice() {
		return price;
	}

	public String getDesc() {
		return desc;
	}

	protected Project() {
	}

	public Project(int id, long corp_id, String title, int qty, String period, String pic, String pic_email,
			String pic_phone, String city, long price, String desc) {
		if (id != 0) {
			this.id = id;
		}
		this.corp_id = corp_id;
		this.title = title;
		this.qty = qty;
		this.period = period;
		this.pic = pic;
		this.pic_email = pic_email;
		this.pic_phone = pic_phone;
		this.city = city;
		this.price = price;
		this.desc = desc;
	}

}