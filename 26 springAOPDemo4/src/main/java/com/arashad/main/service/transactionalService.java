package com.arashad.main.service;

import org.springframework.stereotype.Service;

@Service
public class transactionalService {
	public void upiTransaction() {
		System.out.println("-----------Business Logic for UPI Transaction---------------");
	}
	
	public void internetBankingTransaction() {
		System.out.println("-----------Business Logic for internet banking transaction--------");
	}
	
	public void mobileBankingTransaction() {
		System.out.println("-----------Business Logic for Mobile Banking Transaction---------");
	}
	public void walletTransaction() {
		System.out.println("------Business Logic for wallet Transaction----------");
	}

}
