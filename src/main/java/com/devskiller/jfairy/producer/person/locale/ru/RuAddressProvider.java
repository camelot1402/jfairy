package com.devskiller.jfairy.producer.person.locale.ru;

import com.devskiller.jfairy.data.DataMaster;
import com.devskiller.jfairy.producer.BaseProducer;
import com.devskiller.jfairy.producer.person.AbstractAddressProvider;

import javax.inject.Inject;

public class RuAddressProvider extends AbstractAddressProvider {

	@Inject
	public RuAddressProvider(DataMaster dataMaster, BaseProducer baseProducer) {
		super(dataMaster, baseProducer);
	}

	@Override
	public RuAddress get() {
		return new RuAddress(getStreetNumber(), getStreet(), getApartmentNumber(),
				getCity(), getPostalCode());
	}

}
