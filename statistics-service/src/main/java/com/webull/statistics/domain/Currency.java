package com.webull.statistics.domain;

public enum Currency {

	USD, EUR, RUB;

	public static Currency getBase() {
		return USD;
	}
}
