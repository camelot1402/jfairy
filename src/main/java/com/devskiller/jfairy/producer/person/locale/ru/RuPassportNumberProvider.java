package com.devskiller.jfairy.producer.person.locale.ru;

import com.devskiller.jfairy.producer.person.PassportNumberProvider;
import org.apache.commons.lang3.RandomStringUtils;

/**
 * @author Olga Maciaszek-Sharma
 * @since 15.03.15
 */
public class RuPassportNumberProvider implements PassportNumberProvider {

	@Override
	public String get() {
		return RandomStringUtils.randomAlphanumeric(10);
	}
}
