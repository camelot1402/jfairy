package com.devskiller.jfairy;

import com.devskiller.jfairy.data.DataMaster;
import com.devskiller.jfairy.producer.RandomGenerator;
import com.devskiller.jfairy.producer.VATIdentificationNumberProvider;
import com.devskiller.jfairy.producer.company.locale.ru.RuVATIdentificationNumberProvider;
import com.devskiller.jfairy.producer.person.AddressProvider;
import com.devskiller.jfairy.producer.person.NationalIdentificationNumberFactory;
import com.devskiller.jfairy.producer.person.NationalIdentityCardNumberProvider;
import com.devskiller.jfairy.producer.person.PassportNumberProvider;
import com.devskiller.jfairy.producer.person.locale.NoNationalIdentificationNumberFactory;
import com.devskiller.jfairy.producer.person.locale.ru.RuAddressProvider;
import com.devskiller.jfairy.producer.person.locale.ru.RuNationalIdentityCardNumberProvider;
import com.devskiller.jfairy.producer.person.locale.ru.RuPassportNumberProvider;

public class RuFairyModule extends FairyModule {

	public RuFairyModule(DataMaster dataMaster, RandomGenerator randomGenerator) {
		super(dataMaster, randomGenerator);
	}

	@Override
	protected void configure() {
		super.configure();
		bind(NationalIdentificationNumberFactory.class).to(NoNationalIdentificationNumberFactory.class);
		bind(NationalIdentityCardNumberProvider.class).to(RuNationalIdentityCardNumberProvider.class);
		bind(VATIdentificationNumberProvider.class).to(RuVATIdentificationNumberProvider.class);
		bind(AddressProvider.class).to(RuAddressProvider.class);
		bind(PassportNumberProvider.class).to(RuPassportNumberProvider.class);
	}
}
