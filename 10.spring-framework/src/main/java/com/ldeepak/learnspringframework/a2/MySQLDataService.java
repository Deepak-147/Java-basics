package com.ldeepak.learnspringframework.a2;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataService implements DataService {

	@Override
	public int[] retrieveData() {
		// TODO Auto-generated method stub
		return new int[] {11, 22, 33, 44, 55};
	}

}
