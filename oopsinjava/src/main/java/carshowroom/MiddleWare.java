package carshowroom;

public class MiddleWare {
	int choose;
	public void MiddleWareChoose(){
		System.out.println("Jeevan");
		Welcome w = new Welcome();
		w.WelcomeNote();
		choose=w.choise;
		switch (choose) {
		case 1:
			AddShowRoom addshowroom = new AddShowRoom();
			addshowroom.AddShowroom();
			break;
//		case 1:
//			AddShowroom addshowroom = new AddShowroom();
//			break;
//		case 1:
//			AddShowroom addshowroom = new AddShowroom();
//			break;
//		case 1:
//			AddShowroom addshowroom = new AddShowroom();
//			break;
//		case 1:
//			AddShowroom addshowroom = new AddShowroom();
//			break;
		default:
			break;
		}
	}
}
