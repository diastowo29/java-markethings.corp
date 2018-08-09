package hello.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mkt_user")
public class Users implements Serializable {

	private static final long serialVersionUID = -8051434192144319301L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "npwp")
	private String npwp;

	@Column(name = "firstname")
	private String firstname;

	@Column(name = "lastname")
	private String lastname;

	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;

	@Column(name = "company")
	private String company;

	@Column(name = "email")
	private String email;

	@Column(name = "role")
	private String role;

	@Column(name = "address")
	private String address;

	@Column(name = "city")
	private String city;

	@Column(name = "country")
	private String country;

	@Column(name = "zipcode")
	private String zipcode;

	@Column(name = "about")
	private String about;

	public long getId() {
		return id;
	}

	public String getNpwp() {
		return npwp;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getCompany() {
		return company;
	}

	public String getEmail() {
		return email;
	}

	public String getRole() {
		return role;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}

	public String getZipcode() {
		return zipcode;
	}

	public String getAbout() {
		return about;
	}

	protected Users() {
	}

	public Users(String npwp, String firstname, String lastname, String username, String password, String email,
			String company, String role, String address, String city, String country, String zipcode, String about) {
		this.npwp = npwp;
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
		this.email = email;
		this.company = company;
		this.role = role;
		this.address = address;
		this.city = city;
		this.country = country;
		this.zipcode = zipcode;
		this.about = about;
	}

}