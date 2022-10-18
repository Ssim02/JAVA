import java.util.Scanner;

class Phone {
	private String name;
	private String tel;
	private String input;
	// 생성자
	public Phone(String input) { this.input = input; }
	
	public void setName(String name) { this.name = name; }
	public void setTel(String tel) { this.tel = tel; }
	public String getName() { return this.name = name;}
	public String getTel() { return this.tel = tel; }
}
public class PhoneBook {

	Scanner scanner = new Scanner(System.in);
	private int peopleNumber;
	private String saveInfo;
	private String searchName;
	private int point = 1;
	private int save = 0; // split분리 저장하기 위한 변수
	public void run() {
		System.out.print("인원수>");
		peopleNumber = scanner.nextInt();
		Phone [] phone = new Phone[peopleNumber]; // 객체 배열의 레퍼런스만 생성된 상태?
		for(int i = 0; i<phone.length; i++) {
			phone[i] = new Phone(" ");
		}
		for(int i=0; i<peopleNumber; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			saveInfo = scanner.nextLine();
			// split으로 이름과 번호를 분리해서 저장
			String [] mobNum = new String [peopleNumber*2];
			mobNum = saveInfo.split(" ");
			phone[i].setName(mobNum[save]);
			//save += 1;
			phone[i].setTel(mobNum[save]);
			//save += 1;
			////////////////////////////////
			}
		System.out.println("저장되었습니다...");
		while(point != 0) {
			System.out.print("검색할 이름>>");
			searchName = scanner.next();
			if(searchName.equals("그만")) {
				point = 0;
			}
			for(int i = 0; i<phone.length; i++) {
				if(searchName.equals(phone[i].getName())) {
					System.out.println(searchName + "의 번호는 " + phone[i].getTel() + "입니다.");
				}
			}
			// 루프를 다 돌았는데 없는 경우
			System.out.println(searchName + " 이 없습니다.");
		}
		// while문을 빠져나오면 프로그램 종료
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneBook phonebook = new PhoneBook();
		phonebook.run();
	}

}
