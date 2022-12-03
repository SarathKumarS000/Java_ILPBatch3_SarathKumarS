package com.experion.thread;

import com.experion.entity.Account;

public class JointAccount implements Runnable {
	private Account jAccount = new Account(1000);

	@Override
	public void run() {

		startWithdrawing();
	}

	private synchronized void startWithdrawing() {

		System.out.println(Thread.currentThread().getName() + " is withdrawing");
		try {
			if(jAccount.getBalance()> 0) {
				System.out.println(Thread.currentThread().getName() + " is going to sleep");
				Thread.sleep(500);
				System.out.println(Thread.currentThread().getName() + " woke up and going to complete the withdrawal");
				jAccount.setBalance(jAccount.getBalance() - 1000);
				System.out.println("Current Balance is " + jAccount.getBalance());
			}
			else {
				System.out.println("Insufficient Balance");
			}
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
