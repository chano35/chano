package exercises.exercises18;

class ShopService {
	private static ShopService static_shopserivce = new ShopService();
	
	// StackOverflowError
	// private ShopService shopserivce = new ShopService();
	int x = 99;
	
	private ShopService() {
	}

	static ShopService getInstnace() {
		return static_shopserivce;
	}

	/*
	static ShopService getInstnace2() {
		return this.shopserivce;
	}
	*/
	
	/*
	ShopService getInstnace2() {
		return this.shopserivce;
	}
	*/
	
	int getX() {
		return this.x;
	}
}
