package registrationapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "customer_registration")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cust_id")
	private int custId;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	@Column(name = "User_Id")
	@NotBlank(message = "Userid is required")
	@Size(min = 4, max = 10, message = "Please ensure UserId is within 4-10 range")
	private String userId;

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "password")
	@NotBlank(message = "password is required")
	@Size(min = 4, max = 10, message = "Please ensure Password is within 4-10 range")
	private String password;
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column(name = "cust_age")
	@NotNull(message = "Age is required")
	@Max(100)
	@Min(18)
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Column(name = "first_name")
	@NotBlank(message = "First Name is required")
	@Size(min = 3, max = 10, message = "Please ensure the First Name is within 3-10 range")
	private String firstName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@Column(name = "last_name")
	@NotBlank(message = "Last Name is required")
	@Size(min = 3, max = 10, message = "Please ensure the Last name is within 3-10 range")
	private String lastName;
	
	public String getLastName() {
		return firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", UserId=" + userId + ", password=" + password +", FirstName=" + firstName +",lastName=" +lastName + ", age=" + age
				+ "]";
	}

}
