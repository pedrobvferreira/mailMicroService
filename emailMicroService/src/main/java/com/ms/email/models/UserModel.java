package com.ms.email.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.modelmapper.ModelMapper;

import com.ms.email.dtos.UserDto;



/**
 * @author Pedro Ferreira
 **/
@Entity
@Table(name = "user_model")
public class UserModel implements Serializable {

	private static final long serialVersionUID = -3013122315662714947L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    private String name;
    private String email;
    private String password;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_email_model", referencedColumnName = "id")
    private EmailModel emailSender;
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public EmailModel getEmailSender() {
		return emailSender;
	}

	public void setEmailSender(EmailModel emailSender) {
		this.emailSender = emailSender;
	}
	
	@Transient
	public String toString() {
		return "User{" + "id=" + this.id + ", name='" + this.name + '\'' + ", email='" + this.email + '\'' + '}';
	}
	
	@Transient
	public static UserModel convert(UserDto userDto) {
		return new ModelMapper().map(userDto, UserModel.class);
	}
}