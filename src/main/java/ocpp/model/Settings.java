package ocpp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="settings")
public class Settings {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
		
	@Column(name="app_id")
	private String app_id;
	
	@Column(name="heartbeat_interval_in_seconds")
	private int heartbeat_interval_in_seconds; 
	
	@Column(name="hours_to_expire")
	private int hours_to_expire; 
	
	@Column(name="mail_host")
	private String mail_host; 
	
	@Column(name="mail_enabled")
	private int mail_enabled; 
	
	@Column(name="mail_username")
	private String mail_username; 
	
	@Column(name="mail_password")
	private String mail_password;
	
	@Column(name="mail_protocol")
	private String mail_protocol;
	
	@Column(name="mail_port")
	private int mail_port;
	
	@Column(name="notification_features")
	private String notification_features;
	
	@Column(name="mail_recipients")
	private String mailmail_recipients_from;

	public String getApp_id() {
		return app_id;
	}

	public void setApp_id(String app_id) {
		this.app_id = app_id;
	}

	public int getHeartbeat_interval_in_seconds() {
		return heartbeat_interval_in_seconds;
	}

	public void setHeartbeat_interval_in_seconds(int heartbeat_interval_in_seconds) {
		this.heartbeat_interval_in_seconds = heartbeat_interval_in_seconds;
	}

	public int getHours_to_expire() {
		return hours_to_expire;
	}

	public void setHours_to_expire(int hours_to_expire) {
		this.hours_to_expire = hours_to_expire;
	}

	public String getMail_host() {
		return mail_host;
	}

	public void setMail_host(String mail_host) {
		this.mail_host = mail_host;
	}

	public int getMail_enabled() {
		return mail_enabled;
	}

	public void setMail_enabled(int mail_enabled) {
		this.mail_enabled = mail_enabled;
	}

	public String getMail_username() {
		return mail_username;
	}

	public void setMail_username(String mail_username) {
		this.mail_username = mail_username;
	}

	public String getMail_password() {
		return mail_password;
	}

	public void setMail_password(String mail_password) {
		this.mail_password = mail_password;
	}

	public String getMail_protocol() {
		return mail_protocol;
	}

	public void setMail_protocol(String mail_protocol) {
		this.mail_protocol = mail_protocol;
	}

	public int getMail_port() {
		return mail_port;
	}

	public void setMail_port(int mail_port) {
		this.mail_port = mail_port;
	}

	public String getNotification_features() {
		return notification_features;
	}

	public void setNotification_features(String notification_features) {
		this.notification_features = notification_features;
	}

	public String getMailmail_recipients_from() {
		return mailmail_recipients_from;
	}

	public void setMailmail_recipients_from(String mailmail_recipients_from) {
		this.mailmail_recipients_from = mailmail_recipients_from;
	}

	@Override
	public String toString() {
		return "Settings [app_id=" + app_id + ", heartbeat_interval_in_seconds=" + heartbeat_interval_in_seconds
				+ ", hours_to_expire=" + hours_to_expire + ", mail_host=" + mail_host + ", mail_enabled=" + mail_enabled
				+ ", mail_username=" + mail_username + ", mail_password=" + mail_password + ", mail_protocol="
				+ mail_protocol + ", mail_port=" + mail_port + ", notification_features=" + notification_features
				+ ", mailmail_recipients_from=" + mailmail_recipients_from + "]";
	}

	public Settings(String app_id, int heartbeat_interval_in_seconds, int hours_to_expire, String mail_host,
			int mail_enabled, String mail_username, String mail_password, String mail_protocol, int mail_port,
			String notification_features, String mailmail_recipients_from) {
		super();
		this.app_id = app_id;
		this.heartbeat_interval_in_seconds = heartbeat_interval_in_seconds;
		this.hours_to_expire = hours_to_expire;
		this.mail_host = mail_host;
		this.mail_enabled = mail_enabled;
		this.mail_username = mail_username;
		this.mail_password = mail_password;
		this.mail_protocol = mail_protocol;
		this.mail_port = mail_port;
		this.notification_features = notification_features;
		this.mailmail_recipients_from = mailmail_recipients_from;
	}
	
}
