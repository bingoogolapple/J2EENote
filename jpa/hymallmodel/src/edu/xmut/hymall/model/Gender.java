package edu.xmut.hymall.model;

public enum Gender {
	MAN {
		public String getName() {
			return "男";
		}
	},
	WOMEN {
		public String getName() {
			return "女";
		}
	};
	public abstract String getName();
}
