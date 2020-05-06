package com.devskiller.jfairy.producer.person.locale.ru;

import com.devskiller.jfairy.producer.person.locale.AbstractAddress;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

public class RuAddress extends AbstractAddress {

	public RuAddress(String streetNumber, String street, String apartmentNumber, String city, String postalCode) {
		super(street, streetNumber, apartmentNumber, postalCode, city);
	}

	@Override
	public String getAddressLine1() {
		return street
				+ (isNotBlank(apartmentNumber) ? " APT " + apartmentNumber : "");
	}

	@Override
	public String getAddressLine2() {
		return city + " " + postalCode;
	}
}
