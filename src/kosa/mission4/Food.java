package kosa.mission4;

public class Food {
	private String foodName; //음식
	private int price; //가격

	public Food() {}
	
	public Food(String foodName, int price) {
		super();
		this.foodName = foodName;
		this.price = price;
	}

	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void show() {
		System.out.print("음식 : " + foodName);
		System.out.print(", 가격 : " + price + "원");
	}

}