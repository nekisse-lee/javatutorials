package pos;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MarkmanagementProgram {
	Scanner scan;//글을 입력하는 것.
	DBconnector dbconnecter;//DBconnector class를 상속.
	String user_num = "";//고객 번호


	public MarkmanagementProgram() {
		scan = new Scanner(System.in);//글을 입력하는 객체 생성
	}

	public void go() {//DBconnector class 연결.
		System.out.println("관리 프로그램을 시작합니다.");
		dbconnecter = new DBconnector();//객체 생성
		start();//start 메소드 연결
	}
	//메뉴 메소드
	public void start() {
		while (true) {
			System.out.println("사용하시려는 기능을 선택해 주세요");

			System.out.println("\t 1. 회원 추가");
			System.out.println("\t 2. 물건 구매");
			System.out.println("\t 3. 관리 및 조회");
			System.out.println("\t 4. 물품 추가");
			System.out.println("\t 5. 물품 삭제");
			System.out.println("\t 6. 종료");

			String result = scan.next();//6개의 기능 중 1개 입력

			switch (result) {
				case "1"://회원 추가
					addCustomer();//메소드 이동
					break;
				case "2"://물건 구매
					buyProduct();
					break;
				case "3"://관리 및 조회
					checkSystem();
					break;
				case "4"://물품 추가
					addProduct();
					break;
				case "5"://물품 삭제
					delProduct();
					break;
				case "6"://종료
					System.out.println("시스템을 종료합니다.");
					break;
				default:
					System.out.println("입력이 잘못 되었습니다.");
					break;
			}
			if (result.equals("6"))
				break;
		}
	}

	//물품 삭제 메소드
	public void delProduct() {
		String product_name;//물품명
		product_name = checkAnswerString("삭제하려는 항목의 이름을 적어 주세요.",
				" <= 맞으시면 1을 입력해 주세요.");

		dbconnecter.delProduct(product_name);//dbconnector 클래스의 파일에 물품삭제 메소드 실행
	}

	//물품 추가 메소드
	public void addProduct() {
		String product_name;//물품 이름
		int product_unit_cost;//단가
		int product_prime_cost;//원가
		String product_maker;//제조사
		product_name = checkAnswerString("추가하려는 항목의 이름을 적어 주세요.",
				" <= 맞으시면 1을 입력해 주세요.");
		product_unit_cost = checkAnswerInt("추가하려는 항목의 단가를 적어 주세요.",
				" <= 맞으시면 1을 입력해 주세요.");
		product_prime_cost = checkAnswerInt("추가하려는 항목의 원가를 적어 주세요.",
				" <= 맞으시면 1을 입력해 주세요.");
		product_maker = checkAnswerString("추가하려는 항목의 제조사를 적어 주세요.",
				" <= 맞으시면 1을 입력해 주세요.");

		dbconnecter.addProduct(product_name,product_maker, product_prime_cost,product_unit_cost
		);//저장
	}

	public void checkSystem() {
		System.out.println("관리 및 조회를 시작합니다.");
		System.out.println("\t 1. 일 매출 현황.");
		System.out.println("\t 2. 월 매출 현황.");
		System.out.println("\t 3. 입고 품목 출력.");
		System.out.println("\t 4. 고객 별 구매 내역.");
		System.out.println("\t 5. 품목 별 구매 내역.");
		System.out.println("\t 6. 고객 명단 출력.");
		System.out.println("\t 7. 종료.");

		String result = scan.next();

		switch (result) {
			case "1":
				dbconnecter.dayCheck();
				break;
			case "2":
				dbconnecter.monthCheck();
				break;
			case "3":
				dbconnecter.inputCheck();
				break;
			case "4":
				String phonenumber = checkAnswerString(
						"조회를 원하시는 회원의 전화번호를 입력해 주십시오.", " <= 맞으시면 1을 입력해 주세요.");
				dbconnecter.PrivateCheck(phonenumber);
				break;
			case "5":
				dbconnecter.checkProduct();

				String productnumber = checkAnswerString("조회를 원하시는 품목을 고르시오.",
						" <= 맞으시면 1을 입력해 주세요.");
				dbconnecter.Productcheck(productnumber);
				break;
			case "6":
				dbconnecter.CustomerCheck();
				break;

			default:
				break;
		}
	}

	//고객 등록 메소드
	public void addCustomer() {

		String user_name; // 고객 이름
		int user_age; //고객 나이
		String user_phone; //고객 전화번호

		System.out.println("지금부터 회원 추가를 시작하겠습니다.");
		user_name = checkAnswerString("본인의 이름을 입력하여 주십시오.",
				" <= 본인의 이름이 맞으시면 1을 입력해 주세요.");// 고객 이름을 확인
		user_age = checkAnswerInt("본인의 나이를 입력하여 주십시오.",
				" <= 본인의 나이가 맞으시면 1을 입력해 주세요.");//고객 나이를 확인
		user_phone = checkAnswerString("본인의 전화번호를 입력하여 주십시오.",
				" <= 본인의 이름이 맞으시면 1을 입력해 주세요.");//고객 전화번호를 확인

		Random rand = new Random();//랜덤 객체 생성
		int count = 0;//자리수 초기화(고객번호는 6자리)
		while (true) {
			if (count < 6) { // 고객번호 자리수가 6보다 작을 때
				user_num += rand.nextInt(9);//0에서 9까지 숫자 중에 아무거나 뽑아서 고객번호를 만든다.
			} else {
				if (dbconnecter.checkCustomernum(user_num))//고객번호가 이미 있다면 끝.
					break;
			}
			count++;//자리수가 1씩 증가
		}
		System.out.println("당신의 회원번호는 " + user_num + " 입니다.");//출력
		dbconnecter.addCustomer(user_num, user_name, user_age, user_phone);//값 저장.
		System.out.println("입력이 완료 되었습니다.");
	}

	//물건 구매 메소드
	public void buyProduct() {
		System.out.println("지금부터 상품 구매를 시작하겠습니다.");
		ArrayList<Integer> prod_num_list = new ArrayList<Integer>();//int형의 arraylist 생성(물품 번호)
		ArrayList<Integer> prod_count_list = new ArrayList<Integer>();//물품 개수

		while (true) {//무한루프(break 될때까지 반복)
			dbconnecter.checkProduct();// 물품 목록 출력
			prod_num_list.add(checkAnswerInt("원하시는 항목의 번호를 선택해 주세요.",
					" <= 맞으시면 1을 입력해 주세요."));//구매하려는 물품의 번호를 물품 번호 list에 저장
			prod_count_list.add(checkAnswerInt("수량을 선택해 주세요.",
					" <= 맞으시면 1을 입력해 주세요."));//구매하려는 물품의 수량을 물품 개수 list에 저장

			System.out.println("구매를 종료하시려면 1을 입력해 주시고 추가로 구매를 원하시면 아무키나 입력해 주세요.");
			if (scan.next().equals("1"))//1누르면 구매 메소드에서 나감.
				break;
		}
		System.out.println("총 " + prod_count_list.size() + "개를 구매하셨습니다.");// 물품 개수 list에 저장한 구매 수량이 출력.


		System.out.println("결제 방법을 선택해 주십시오.");
		System.out.println("\t1. 현금");
		System.out.println("\t2. 신용카드");
		System.out.println("\t3. 고객카드");
		System.out.println("\t4. 종료");

		String result = scan.next();//위의 결제 방법 메뉴중에 선택 입력
		System.out.println(result + " <= 맞으시면 1을 입력해주세요.");
		if (!scan.next().equals("1"))
			result = "no";

		switch (result) {
			case "1"://1. 현금
				System.out.println("현금을 선택하셨습니다.");
				calcCost(result, prod_num_list, prod_count_list);//비연동 결제 함수로 연동
				break;
			case "2"://2.신용카드
				System.out.println("신용카드를 선택하셨습니다.");
				calcCost(result, prod_num_list, prod_count_list);//비연동 결제 함수로 연동
				break;
			case "3"://3.고객카드
				System.out.println("고객카드를 선택하셨습니다.");//고객 용도의 결제 함수로 연동
				String result2 = "";
				int point = 0;
				while (true) {
					System.out.println("회원님의 전화번호를 입력해 주십시오.(종료하시려면 1을 입력해주세요.)");
					result2 = scan.next();
					if (dbconnecter.checkCustomer(result2))// 회원정보에 등록되어 있으면
						break;//나감
					else if (result2.equals("1"))//종료
						break;//나감
					else//번호 틀리면
						System.out.println("번호가 존재하지 않습니다.");
				}
				System.out.println(dbconnecter.checkPoint(result2)
						+ "원의 포인트가 있습니다.");//현재 포인트 양을 출력
				System.out.println("사용하시려면 1을 입력하고 사용하지 않으시면 아무 숫자나 입력해주세요.");
				String result1 = scan.next();
				if (result1.equals("1"))
					point = dbconnecter.checkPoint(result2);//포인트 사용

				if (!result2.equals("1"))
					calcCost(result, prod_num_list, prod_count_list, result2, point);//그냥 현금으로 계산
				break;

			default:
				System.out.println("잘못된 입력값입니다.");
				break;

		}
	}

	//파일에 계산을 입력하는 메소드(현금,신용카드-비회원 용도)
	public void calcCost(String method, ArrayList<Integer> Prod_num,
						 ArrayList<Integer> Prod_count) {//결제 수단, 물품 번호,물품 개수를 가지고 계산

		int result_money = dbconnecter.checkCost(Prod_num, Prod_count);//구매의 총액을 변수에 대입
		System.out.println("총 금액 = >" + result_money);//총금액 출력

		if (method.equals("2"))//신용카드를 선택하면
			result_money += result_money * 0.07;//수수료 7%

		System.out.println(result_money + " 원 결제가 완료 되었습니다.");//현금, 신용카드, 고객카드 결제 내역 출력
		dbconnecter.saveresult(Prod_num, Prod_count, "CUS", "11",result_money);//물품 번호,물품 개수,구매,비회원 전화번호
	}

	//파일에 계산을 입력하는 메소드(고객카드의 포인트,현금 or카드 계산-고객 용도)
	public void calcCost(String method, ArrayList<Integer> Prod_num,
						 ArrayList<Integer> Prod_count, String phonenumber, int point) {//결제 구분, 물품 번호, 물품 개수,전화번호,포인트로 계산
		int result_money = dbconnecter.checkCost(Prod_num, Prod_count) - point;//결제한 금액은 총 비용에서 포인트 결제 값을 뺀 값이다.

		if (point > 0)//포인트가 0보다 크면
			dbconnecter.clearPoint(phonenumber);//입력된 전화번호에 맞는 고객의 포인트 사용 후 초기화 클래스로 이동
		else
			dbconnecter.addPoint(checkBonus(result_money), phonenumber);//포인트 추가하기

		System.out.println(result_money + " 원 결제가 완료 되었습니다.");//현금으로 결제됨.
		dbconnecter.saveresult(Prod_num, Prod_count, "CUS", phonenumber,result_money);//회원 전화번호로 구매 목록 저장
	}

	//판매 금액의 비율 계산 메소드
	public int checkBonus(int result_money) {
		if (result_money < 10000)//만원 미만
			return (int) (result_money * 0.001);
		if (result_money >= 10000 && result_money < 50000)//만원 이상 오만원 미만
			return (int) (result_money * 0.005);
		if (result_money >= 50000 && result_money < 100000)//오만원 이상 십만원 미만
			return (int) (result_money * 0.008);
		else//십만원 이상
			return (int) (result_money * 0.01);
	}

	//String 형태로 입력한 값이 맞는지 확인하는 메소드
	public String checkAnswerString(String a, String b) {
		String answer = "";//string 형으로 초기화
		while (true) {
			System.out.println(a);
			answer = scan.next();
			System.out.println(answer + b);
			if (scan.next().equals("1"))//입력한 값이 1번이면 메소드 나감.
				break;
		}
		return answer;//1이 아니면 입력한 값을 호출
	}

	//Int 형태로 입력한 값이 맞는지 확인하는 메소드
	public int checkAnswerInt(String a, String b) {
		int answer = 0;//int 형으로 초기화
		while (true) {
			System.out.println(a);
			answer = scan.nextInt();
			System.out.println(answer + b);
			if (scan.next().equals("1"))
				break;
		}
		return answer;
	}
}
