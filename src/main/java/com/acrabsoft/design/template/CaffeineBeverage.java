package com.acrabsoft.design.template;

public abstract class CaffeineBeverage {
	/**
	 * 模板方法，用来控制泡茶与冲咖啡的流程,申明为final，不希望子类覆盖这个方法，防止更改流程的执行顺序
	 */
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		//钩子
		if (customerWantsCondiments()) { // 如果顾客需要添加调料，我们才会调用addCondiments()方法
			addCondiments();
		}
	}

	/**
	 * @desc 将brew()、addCondiment()声明为抽象类，具体操作由子类实现
	 * @return void
	 */
	abstract void brew();

	abstract void addCondiments();

	void boilWater() {
		System.out.println("Boiling water...");
	}

	void pourInCup() {
		System.out.println("Pouring into Cup...");
	}

	//钩子
	public boolean customerWantsCondiments() {
		return true;
	}
}
