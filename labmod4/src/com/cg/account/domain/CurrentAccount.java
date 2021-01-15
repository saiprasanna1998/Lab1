package com.cg.account.domain;
	
	public class CurrentAccount extends Account{

		private double overDrawLimit;
		public CurrentAccount(final Long accNo, final String accountHolder,final double overDrawLimit) {
			super(accNo, accountHolder);
			this.overDrawLimit =  overDrawLimit;
		}
		
		public double getOverDrawLimit() {
			return overDrawLimit;

	}

}
