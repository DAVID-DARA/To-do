package todo.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "customers")
public class Customer {
	
	@Id
	@Column(name = "id", nullable = false)
	private Long id;
	
	@Column(name = "firstname")
	private String firstName;
	
	@Column(name = "lastname")
	private String lastName;
	
	@Column(name = "dob")
	private Date dateOfBirth;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "username")
	private String Username;
	
	@Column(name = "passcode")
	private String password;
}
