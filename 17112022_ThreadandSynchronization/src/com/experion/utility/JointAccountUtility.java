package com.experion.utility;

import com.experion.thread.JointAccount;

public class JointAccountUtility {

	public static void main(String[] args) {
		 JointAccount job = new JointAccount();
		 Thread husbandWorker = new Thread(job);
		 husbandWorker.setName("Husband Thread");
		 
		 Thread wifeWorker = new Thread(job);
		 wifeWorker.setName("Wife Thread");
		 
		 husbandWorker.start();
		 wifeWorker.start();
	}
}
