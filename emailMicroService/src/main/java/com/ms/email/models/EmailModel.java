package com.ms.email.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Pedro Ferreira
 **/
@Entity
@Table(name = "email_model")
public class EmailModel implements Serializable {

	private static final long serialVersionUID = -3013122315662714947L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name = "id")
	private Long id;
	@Column(name = "email_from")
	private String emailFrom;
	@Column(name = "email_to")
	private String emailTo;
	@Column(name = "subject")
	private String subject;
	@Column(name = "body", columnDefinition = "TEXT")
	private String body;
	@Column(name = "send_date")
	private LocalDateTime sendDate;
	@Column(name = "status_email")
	private String statusEmail;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getEmailFrom() {
		return emailFrom;
	}

	public void setEmailFrom(String emailFrom) {
		this.emailFrom = emailFrom;
	}

	public String getEmailTo() {
		return emailTo;
	}

	public void setEmailTo(String emailTo) {
		this.emailTo = emailTo;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public LocalDateTime getSendDate() {
		return sendDate;
	}

	public void setSendDate(LocalDateTime sendDate) {
		this.sendDate = sendDate;
	}

	public String getStatusEmail() {
		return statusEmail;
	}

	public void setStatusEmail(String statusEmail) {
		this.statusEmail = statusEmail;
	}
	
	@Override
	public String toString() {
		return "Email{" + "id=" + this.id + ", emailFrom='" + this.emailFrom + '\'' + ", emailTo='" + this.emailTo + '\'' + '}';
	}

}
