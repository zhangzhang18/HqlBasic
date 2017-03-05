package com.imooc.model;

import java.io.Serializable;
import java.util.Date;

/**
 * �ͻ���Ϣ�־û���
 * 
 * @author Administrator
 * 
 */
public class Customer implements Serializable {

	private Long id;// ����
	private String name;// ����
	private String tel;// �绰
	private String address;// ��ַ
	private String email;// ��������
	private String sex;// �Ա�
	private String description;// ���ҽ���
	private Integer age;// ����
	private Date birthday;// ��������

	public Customer() {

	}

	public Customer(Long id, String name, String tel, String sex, Integer age,
			String email, String address) {
		this.id = id;
		this.name = name;
		this.tel = tel;
		this.sex = sex;
		this.age = age;
		this.email = email;
		this.address = address;

	}

	public Customer(Long id, String name) {
		this.id = id;
		this.name = name;
	}

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

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String toString() {
		return "����:" + this.getId() + "    |    ����:" + this.getName()
				+ "    |     �绰:" + this.getTel() + "    |   �Ա� :"
				+ this.getSex() + "    |   ����:" + this.getAge()
				+ "    |   ��������:" + this.getBirthday() + "    |    ��ַ:"
				+ this.getAddress() + "    |   ��������:" + this.getEmail()
				+ "    |   ���ҽ���:" + this.getDescription();
	}

}
