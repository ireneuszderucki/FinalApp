package pl.ireneuszderucki.entity;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="users")
public class User {

	@Id
	@NotBlank
	private String username;
	
	@NotBlank
	private String password;
	
	@NotNull
	private boolean enabled;
	
	@NotBlank
	@Email
	private String email;
	
	private String sex;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="username")
	private Set<Role> roles;
	
	@OneToMany
	@JoinColumn(name="username")
	private List<JobOffer> offers = new ArrayList<>();
	
	private String created = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	
	
//	@OneToMany
//	@JoinColumn(name="username")
//	private List<Company> companies = new ArrayList<>();

	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public List<JobOffer> getOffers() {
		return offers;
	}

	public void setOffers(List<JobOffer> offers) {
		this.offers = offers;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

//	public List<Company> getCompanies() {
//		return companies;
//	}
//
//	public void setCompanies(List<Company> companies) {
//		this.companies = companies;
//	}
}
