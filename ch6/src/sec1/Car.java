package sec1;

public class Car {
	private String name;
	private String style; //경차,승용차,승합차,화물차
	private String company;
	private String fuel; //경유, 등유, 휘발유, 가스, 전기, 수소
	private int tire;
	private int speed;
	private String num;
	private int usetime;
	
	Car(){this("자동차");}	
	Car(String name){this(name, "승용차");}
	Car(String name, String style){this(name, style, "르노삼성");}
	Car(String name, String style, String company){this(name, style, company, "휘발유");}
	Car(String name, String style, String company, String fuel){this(name, style, company, fuel, 4);}
	Car(String name, String style, String company, String fuel, int tire){this(name, style, company, fuel, tire, 0);}
	Car(String name, String style, String company, String fuel, int tire, int speed){this(name, style, company, fuel, tire, speed, "0000");}
	Car(String name, String style, String company, String fuel, int tire, int speed, String num){this(name, style, company, fuel, tire, speed, num, 0);}
	Car(String name, String style, String company, String fuel, int tire, int speed, String num, int usetime) {
		this.name = name;
		this.style = style;
		this.company = company;
		this.fuel = fuel;
		this.tire = tire;
		this.speed = speed;
		this.num = num;
		this.usetime = usetime;
	}
	
	public void computeMoney() {
		System.out.println("그냥 가십쇼.");
	}
	public void computeMoney(int usetime) {
		System.out.println(usetime+"분 주차하셨습니다.");
	}
	public void computeMoney(int usetime,String style) {
		System.out.println(style+"는 "+usetime+"분 주차 하시면 공짜입니다.");
	}
	
	
	
	
	

	
	
	
	
}
