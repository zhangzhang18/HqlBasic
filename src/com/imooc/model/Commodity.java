package com.imooc.model;

import java.io.Serializable;

/**
 * ��Ʒ��Ϣ�־û���
 * 
 * @author Administrator
 * 
 */
public class Commodity implements Serializable {
	private Long id;// ����
	private String name;// ����
	private Double price;// �۸�
	private String unit;// ��λ
	private String category;// ���
	private String description;// ���
	private Seller seller;// �̼�

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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	public String toString() {
		return "����:" + this.getId() + "    |   ����:" + this.getName()
				+ "    |     �۸�:" + this.getPrice() + "    |   ��λ :"
				+ this.getUnit() + "    |   ����:" + this.getCategory()
				+ "    |   ��Ӫ�̼�:" + this.getSeller().getName() + "    |   ���:"
				+ this.getDescription();
	}

}
