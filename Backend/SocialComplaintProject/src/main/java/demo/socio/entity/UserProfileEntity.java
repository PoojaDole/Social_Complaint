<<<<<<< HEAD
package demo.socio.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "user_profile_tbl")
public class UserProfileEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long user_id;
	
	@Column(unique = true)
	private long user_aadhar_number;
	
	private String user_first_name;
	
	private String user_middle_name;
	
	private String user_last_name;
	
	@Lob
	private byte[] user_profile_image;
	
	private String user_username;
	
	@Column(columnDefinition = "VARBINARY(100) NOT NULL")
	private String user_password;
	
	@Column(unique = true)
	private long user_contact_number;
	
	@Column(unique = true)
	private String user_email;
	
	private String user_role;
	
	private String user_address_city;
	
	private String user_address_state;
	
	private int user_pincode;

	public UserProfileEntity() {
		super();
	}

	public UserProfileEntity(long user_aadhar_number, String user_first_name, String user_middle_name,
			String user_last_name, byte[] user_profile_image, String user_username, String user_password,
			long user_contact_number, String user_email, String user_role, String user_address_city,
			String user_address_state, int user_pincode) {
		super();
		this.user_aadhar_number = user_aadhar_number;
		this.user_first_name = user_first_name;
		this.user_middle_name = user_middle_name;
		this.user_last_name = user_last_name;
		this.user_profile_image = user_profile_image;
		this.user_username = user_username;
		this.user_password = user_password;
		this.user_contact_number = user_contact_number;
		this.user_email = user_email;
		this.user_role = user_role;
		this.user_address_city = user_address_city;
		this.user_address_state = user_address_state;
		this.user_pincode = user_pincode;
	}

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	public long getUser_aadhar_number() {
		return user_aadhar_number;
	}

	public void setUser_aadhar_number(long user_aadhar_number) {
		this.user_aadhar_number = user_aadhar_number;
	}

	public String getUser_first_name() {
		return user_first_name;
	}

	public void setUser_first_name(String user_first_name) {
		this.user_first_name = user_first_name;
	}

	public String getUser_middle_name() {
		return user_middle_name;
	}

	public void setUser_middle_name(String user_middle_name) {
		this.user_middle_name = user_middle_name;
	}

	public String getUser_last_name() {
		return user_last_name;
	}

	public void setUser_last_name(String user_last_name) {
		this.user_last_name = user_last_name;
	}

	public byte[] getUser_profile_image() {
		return user_profile_image;
	}

	public void setUser_profile_image(byte[] user_profile_image) {
		this.user_profile_image = user_profile_image;
	}

	public String getUser_username() {
		return user_username;
	}

	public void setUser_username(String user_username) {
		this.user_username = user_username;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public long getUser_contact_number() {
		return user_contact_number;
	}

	public void setUser_contact_number(long user_contact_number) {
		this.user_contact_number = user_contact_number;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_role() {
		return user_role;
	}

	public void setUser_role(String user_role) {
		this.user_role = user_role;
	}

	public String getUser_address_city() {
		return user_address_city;
	}

	public void setUser_address_city(String user_address_city) {
		this.user_address_city = user_address_city;
	}

	public String getUser_address_state() {
		return user_address_state;
	}

	public void setUser_address_state(String user_address_state) {
		this.user_address_state = user_address_state;
	}

	public int getUser_pincode() {
		return user_pincode;
	}

	public void setUser_pincode(int user_pincode) {
		this.user_pincode = user_pincode;
	}

	
	
	
}
=======
package demo.socio.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "user_profile_tbl")
public class UserProfileEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long user_id;
	
	@Column(unique = true)
	private long user_aadhar_number;
	
	private String user_first_name;
	
	private String user_middle_name;
	
	private String user_last_name;
	
	@Lob
	private byte[] user_profile_image;
	
	private String user_username;
	
	@Column(columnDefinition = "VARBINARY(100) NOT NULL")
	private String user_password;
	
	@Column(unique = true)
	private long user_contact_number;
	
	@Column(unique = true)
	private String user_email;
	
	private String user_role;
	
	private String user_address_city;
	
	private String user_address_state;
	
	private int user_pincode;

	public UserProfileEntity() {
		super();
	}

	public UserProfileEntity(long user_aadhar_number, String user_first_name, String user_middle_name,
			String user_last_name, byte[] user_profile_image, String user_username, String user_password,
			long user_contact_number, String user_email, String user_role, String user_address_city,
			String user_address_state, int user_pincode) {
		super();
		this.user_aadhar_number = user_aadhar_number;
		this.user_first_name = user_first_name;
		this.user_middle_name = user_middle_name;
		this.user_last_name = user_last_name;
		this.user_profile_image = user_profile_image;
		this.user_username = user_username;
		this.user_password = user_password;
		this.user_contact_number = user_contact_number;
		this.user_email = user_email;
		this.user_role = user_role;
		this.user_address_city = user_address_city;
		this.user_address_state = user_address_state;
		this.user_pincode = user_pincode;
	}

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	public long getUser_aadhar_number() {
		return user_aadhar_number;
	}

	public void setUser_aadhar_number(long user_aadhar_number) {
		this.user_aadhar_number = user_aadhar_number;
	}

	public String getUser_first_name() {
		return user_first_name;
	}

	public void setUser_first_name(String user_first_name) {
		this.user_first_name = user_first_name;
	}

	public String getUser_middle_name() {
		return user_middle_name;
	}

	public void setUser_middle_name(String user_middle_name) {
		this.user_middle_name = user_middle_name;
	}

	public String getUser_last_name() {
		return user_last_name;
	}

	public void setUser_last_name(String user_last_name) {
		this.user_last_name = user_last_name;
	}

	public byte[] getUser_profile_image() {
		return user_profile_image;
	}

	public void setUser_profile_image(byte[] user_profile_image) {
		this.user_profile_image = user_profile_image;
	}

	public String getUser_username() {
		return user_username;
	}

	public void setUser_username(String user_username) {
		this.user_username = user_username;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public long getUser_contact_number() {
		return user_contact_number;
	}

	public void setUser_contact_number(long user_contact_number) {
		this.user_contact_number = user_contact_number;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_role() {
		return user_role;
	}

	public void setUser_role(String user_role) {
		this.user_role = user_role;
	}

	public String getUser_address_city() {
		return user_address_city;
	}

	public void setUser_address_city(String user_address_city) {
		this.user_address_city = user_address_city;
	}

	public String getUser_address_state() {
		return user_address_state;
	}

	public void setUser_address_state(String user_address_state) {
		this.user_address_state = user_address_state;
	}

	public int getUser_pincode() {
		return user_pincode;
	}

	public void setUser_pincode(int user_pincode) {
		this.user_pincode = user_pincode;
	}

	
	
	
}
>>>>>>> da998d1d9107b333d4c6909f4f35fbd469725d9b