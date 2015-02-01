package com.prabin.practice;

public class Pizza {

	private final PizzaVO vo;

	private static class PizzaVO {
		int size;
		boolean cheese;
		boolean pepperoni;
		boolean bacon;
	}

	public static class Builder {

		private final PizzaVO vo = new PizzaVO();

		public Builder(int size) {
			vo.size = size;
		}

		public Builder cheese(boolean value) {
			vo.cheese = value;
			return this;
		}

		public Builder pepperoni(boolean value) {
			vo.pepperoni = value;
			return this;
		}

		public Builder bacon(boolean value) {
			vo.bacon = value;
			return this;
		}

		public Pizza build() {
			return new Pizza(vo);
		}
	}

	private Pizza(PizzaVO vo) {
		this.vo = vo;
	}

	public int getSize() {
		return vo.size;
	}

	// other getter setter methods as per your taste

}
