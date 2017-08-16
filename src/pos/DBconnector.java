package pos;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class DBconnector {
	String url;
	BufferedWriter bw;//쓰기
	BufferedReader br;//읽기
	String urlhuman, urlgood, urlmonth;//고객정보,물품정보,판매관리

	//txt 파일로 연결
	public DBconnector() {
		urlhuman = "Temp/humanpage.txt";
		urlgood = "Temp/goods.txt";
		urlmonth = "Temp/month.txt";
	}

	//1.고객 등록 정보를 파일에 저장하는 메소드
	public boolean addCustomer(String customer_num, String customer_name,
							   int customer_age, String customer_phone) {//고객번호, 이름, 나이, 전화번호
		try {
			bw = new BufferedWriter(new FileWriter(urlhuman, true));//고객정보 파일에 쓴다. true이면 있는 글자 뒤에 첨가하는 것.
			String localtype = customer_num + "\t" + customer_name + "\t" //저장될 고객 등록 문자열 형태(tab으로 나눔)
					+ customer_age + "\t" + customer_phone + "\t0\t0";
			System.out.println(localtype);//확인
			bw.write(localtype.toString());//고객 등록 씀
			bw.newLine();//한 줄 내려
			bw.flush(); //모든 내용을 출력소스에 출력한 후, 버퍼를 비운다.
			bw.close();//버퍼를 닫음.
		} catch (IOException e) {//예외처리
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		System.out.println(customer_num + "/" + customer_name + "/"
				+ customer_age + "/" + customer_phone + "/ 입력완료.");//출력
		return true;
	}
	//파일에서 고객 번호를 체크하는 메소드
	public boolean checkCustomernum(String customer_num) {
		ArrayList<String> line = new ArrayList<String>();//string 기반 arraylist 객체 생성

		try {
			br = new BufferedReader(new FileReader(urlhuman));//고객 정보 파일 읽기
			while (true) {
				String lines = br.readLine();//한줄씩 읽기
				if (lines == null) {//없으면 끝
					break;
				} else//있으면
					line.add(lines.split("\t")[0]);//고객번호를 arraylist에 삽입
			}
			br.close();//파일 닫기
		} catch (Exception e) {//예외처리
			// TODO Auto-generated catch bloc
			e.printStackTrace();
			return false;
		}
		System.out.println(customer_num + "/ 체크완료");//고객 번호 체크 출력
		if (line.contains(customer_num))//arraylist에 고객 번호가 들어 있으면
			return false; //false
		else//없으면
			return true;//true
	}

	//파일에서 물품을 확인하는 메소드
	public void checkProduct() {
		try {
			br = new BufferedReader(new FileReader(urlgood));//물품 파일 읽기
			int count = 0;//개수 초기화
			while (true) {
				String lines = br.readLine();//파일 한줄씩 읽어서
				if (lines == null) {//내용 없으면
					break;//나감
				} else//내용 있으면
					System.out.println(count + "\t" + lines.split("\t")[0]
							+ "\t" + lines.split("\t")[1] + "\t"
							+ lines.split("\t")[3]);//상품번호,상품이름,제조사,가격 출력
				count++;//상품 번호는 1씩 증가
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("목록 출력");
	}

	public boolean checkCustomer(String phonenumer) {
		ArrayList<String> line = new ArrayList<String>();

		try {
			br = new BufferedReader(new FileReader(urlhuman));
			while (true) {
				String lines = br.readLine();
				if (lines == null) {
					break;
				} else
					line.add(lines.split("\t")[3]);
			}
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch bloc
			e.printStackTrace();
			return false;
		}
		System.out.println(phonenumer + "/ 체크완료");
		if (line.contains(phonenumer))
			return true;
		else
			return false;
	}

	//총 구매 비용을 확인하는  메소드
	public int checkCost(ArrayList<Integer> Prod_num,
						 ArrayList<Integer> Prod_count) {//물품 번호,물품 개수를 이용해서 비용을 확인

		ArrayList<String> line = new ArrayList<String>();//string 기반으로 arraylist 생성
		int finalcost = 0; // 최종 비용(모든 물건을 구매한 후, 합계)
		try {
			br = new BufferedReader(new FileReader(urlgood));//물품 목록을 읽어옴.
			while (true) {
				String lines = br.readLine();//한 줄로 읽기
				if (lines == null) {// 내용이 없으면 나감
					break;
				} else//내용이 있으면
					line.add(lines.split("\t")[3]);//비용을 list에 삽입
			}
			br.close();
		} catch (Exception e) {//예외처리
			// TODO Auto-generated catch bloc
			e.printStackTrace();
		}
		for (int i = 0; i < Prod_count.size(); i++) {//물품 수량의 size만큼
			finalcost += Integer.parseInt(line.get(Prod_num.get(i)))//구입하려는 물품 목록의 가격(가격이므로 string->int 변환 필요)
					* Prod_count.get(i);//물품의 수량
			//구입하려는 물품의 가격*수량을 누적하여 총 금액을 구함.
		}

		System.out.println(Prod_num.size() + "개/ 총 금액 계산완료 =" + finalcost);// 구입물품의 개수, 총 금액 출력
		return finalcost; //총금액 호출
	}

	public int checkPoint(String phonenumber) {
		String point = "";

		try {
			br = new BufferedReader(new FileReader(urlhuman));
			while (true) {
				String lines = br.readLine();
				if (lines == null) {
					break;
				} else if (lines.split("\t")[3].equals(phonenumber))
					point = lines.split("\t")[5];
			}
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch bloc
			e.printStackTrace();
		}

		System.out.println(phonenumber + "/ 포인트 계산 완료");
		return Integer.parseInt(point);
	}

	//포인트 초기화 메소드
	public void clearPoint(String phonenumber) {
		ArrayList<String[]> localist = new ArrayList<String[]>();//string[] arraylist 생성

		try {
			br = new BufferedReader(new FileReader(urlhuman));//고객정보 파일 연다.
			while (true) {
				String lines = br.readLine();//한줄씩 읽기
				if (lines == null) {
					break;
				} else//내용 있으면
					localist.add(lines.split("\t"));//전체 내용을 리스트에 저장
			}
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch bloc
			e.printStackTrace();
		}

		for (int i = 0; i < localist.size(); i++) {//고객 정보 파일에서
			if (localist.get(i)[3].equals(phonenumber))//전화번호가 같으면
			{
				localist.get(i)[5] = "0";//포인트가 0
				//localist.get(i)[4] = calcCost.result_money;//남은 금액(포인트 사용 후 남은 금액)

			}
		}

		try {
			bw = new BufferedWriter(new FileWriter(urlhuman));//고객정보에 씀
			for (int i = 0; i < localist.size(); i++) {//고객정보파일에서
				String localtype = localist.get(i)[0] + "\t"
						+ localist.get(i)[1] + "\t" + localist.get(i)[2] + "\t"
						+ localist.get(i)[3] + "\t" + localist.get(i)[4] + "\t"
						+ localist.get(i)[5];//새롭게 정의된 고객 정보를 입력(고객번호, 고객이름, 고객나이,고객폰번호,고객금액,고객포인트)
				System.out.println(localtype);
				bw.write(localtype.toString());//파일에 저장
				bw.newLine();
				bw.flush();
			}
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(phonenumber + "/ 포인트 초기화");//포인트 초기화
	}

	//포인트를 가산하는 메소드
	public void addPoint(int point, String phonenumber) {//포인트와 전화번호를 가지고  포인트 가산
		ArrayList<String[]> localist = new ArrayList<String[]>();//list

		try {
			br = new BufferedReader(new FileReader(urlhuman));//고객정보
			while (true) {
				String lines = br.readLine();
				if (lines == null) {
					break;
				} else
					localist.add(lines.split("\t"));//전체 저장
			}
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch bloc
			e.printStackTrace();
		}

		for (int i = 0; i < localist.size(); i++) {//고객 정보 값 중에서
			if (localist.get(i)[3].equals(phonenumber)) {//전화번호가 같으면
				int local = Integer.parseInt(localist.get(i)[5]);//list에 저장된 포인트 값
				localist.get(i)[5] = String.valueOf(local + point);//list에 저장된 포인트 값에 새로운 포인트를 합쳐 다시 리스트에 저장

			}
		}

		try {
			bw = new BufferedWriter(new FileWriter(urlhuman));//고객정보 쓰기
			for (int i = 0; i < localist.size(); i++) {//고객정보 전체에
				String localtype = localist.get(i)[0] + "\t"
						+ localist.get(i)[1] + "\t" + localist.get(i)[2] + "\t"
						+ localist.get(i)[3] + "\t" + localist.get(i)[4] + "\t"
						+ localist.get(i)[5];//새롭게 저장된 값들을 지정
				System.out.println(localtype);
				bw.write(localtype.toString());//저장
				bw.newLine();
				bw.flush();
			}
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("포인트 추가");
	}

	//구매-입고 내역 저장 메소드
	public void saveresult(ArrayList<Integer> Prod_num,
						   ArrayList<Integer> Prod_count, String CUS_PRO, String phonenumber, int result_money) {//물품 번호,물품 개수,구매인지 입고인지 구분,전화번호를 이용해서 비회원 구매 내역 저장
		Calendar cal = Calendar.getInstance();//날짜 함수
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//년,월,일,시,분,초까지 출력되는 포맷

		ArrayList<String> prod_name = new ArrayList<String>();//물품 이름 리스트
		ArrayList<String> unitcost = new ArrayList<String>();//단가 리스트
		ArrayList<String> line = new ArrayList<String>();//물품 목록 리스트
		ArrayList<Integer> primecost = new ArrayList<Integer>();//원가 리스트

		ArrayList<String> userline = new ArrayList<String>();//사용자 저장을 위한 리스트

		try {
			br = new BufferedReader(new FileReader(urlgood));//파일 읽기
			int count = 0;
			while (true) {
				String lines = br.readLine();//한줄씩 읽기
				if (lines == null) {
					break;
				} else {//내용 있으면
					prod_name.add(lines.split("\t")[0]);//전체 물품 이름 삽입
					unitcost.add(lines.split("\t")[3]);//전체 단가 삽입
					primecost.add(Integer.parseInt(lines.split("\t")[2]));//전체 원가 삽입
				}
				line.add(lines);//전체 내용은 line list에 넣음.

			}
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch bloc
			e.printStackTrace();
		}

		for (int i = 0; i < Prod_num.size(); i++) {//물품 번호 list 크기만큼

			if ((Integer.parseInt(line.get(Prod_num.get(i)).split("\t")[4]) - Prod_count
					.get(i)) < 5)//(물품 목록의 재고-구매된 물품 수량)의 값이 5보다 적게 남으면
			{

				orderProduct(prod_name.get(i), primecost.get(i));//물품 입고
				/*
				line.get(Prod_num.get(i)).split("\t")[4] = String.valueOf(Integer
						.parseInt(line.get(Prod_num.get(i)).split("\t")[4])
						+50);//입고 된 물품의 수를 string으로 물품 번호 리스트에 대입 후, line 리스트에 삽입
*/
				String local1 = String.valueOf(Integer
						.parseInt(line.get(Prod_num.get(i)).split("\t")[4])
						+ 50);//현재 재고 값-물품 수량 = string 형태로 형변환


				line.set(Prod_num.get(i), line.get(Prod_num.get(i)).split("\t")[0] +"\t"+line.get(Prod_num.get(i)).split("\t")[1]
						+"\t"+line.get(Prod_num.get(i)).split("\t")[2] +"\t"+line.get(Prod_num.get(i)).split("\t")[3] +"\t"+ local1);



			}
			String local = String.valueOf(Integer
					.parseInt(line.get(Prod_num.get(i)).split("\t")[4])
					- Prod_count.get(i));//현재 재고 값-물품 수량 = string 형태로 형변환

			line.set(Prod_num.get(i), line.get(Prod_num.get(i)).split("\t")[0] +"\t"+line.get(Prod_num.get(i)).split("\t")[1]
					+"\t"+line.get(Prod_num.get(i)).split("\t")[2] +"\t"+line.get(Prod_num.get(i)).split("\t")[3] +"\t"+ local);
			//물품 번호 리스트의 모든 값들을 뒤의 값{물품 번호 , 물품 이름, 물품 원가, 물품 단가, (현재 재고 값-물품 수량)값} 으로 수정
//			System.out.println(/*"구매 후 남은 재고량 : "*/line.get(Prod_num.get(i)).split("\t")[4]);//수정된 재고 값 출력
//			System.out.println(String.valueOf(Integer
//					.parseInt(line.get(Prod_num.get(i)).split("\t")[4])
//					- Prod_count.get(i)));//수정된 재고값- 물품의 수량
		}

		try {
			bw = new BufferedWriter(new FileWriter(urlmonth, true));//판매관리 읽기
			for (int i = 0; i < Prod_count.size(); i++) {//물품 수량의 사이즈까지
				String localtype = format.format(cal.getTime()) + "\t"
						+ phonenumber + "\t" + prod_name.get(i) + "\t"
						+ unitcost.get(i) + "\t" + Prod_count.get(i) + "\t"
						+ CUS_PRO;//날짜, 전화번호, 물품이름, 단가, 물품 수량, 판매-입고 구분
				//System.out.println(localtype);
				bw.write(localtype.toString());// 쓰기
				bw.newLine();
				bw.flush();
			}
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			bw = new BufferedWriter(new FileWriter(urlgood));//물품 읽기
			for (int i = 0; i < line.size(); i++) {
				bw.write(line.get(i));//line 리스트 값을 입력
				bw.newLine();
				bw.flush();
			}
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			br = new BufferedReader(new FileReader(urlhuman));//파일 읽기
			int count = 0;
			while (true) {
				String lines = br.readLine();//한줄씩 읽기
				if (lines == null) {
					break;
				} else if (lines.split("\t")[3].equals(phonenumber)){//내용 있으면
					int total_money = Integer.parseInt(lines.split("\t")[4]) + result_money;
					lines = lines.split("\t")[0] + "\t" +lines.split("\t")[1] + "\t"+lines.split("\t")[2] + "\t"+lines.split("\t")[3] + "\t"+ total_money + "\t"+lines.split("\t")[5];
				}
				userline.add(lines);//전체 내용은 line list에 넣음.

			}
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch bloc
			e.printStackTrace();
		}



		try {
			bw = new BufferedWriter(new FileWriter(urlhuman));//고객정보 읽기
			for (int i = 0; i < userline.size(); i++) {
				bw.write(userline.get(i));//line 리스트 값을 입력
				bw.newLine();
				bw.flush();
			}
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		System.out.println(CUS_PRO + "/ " + phonenumber + "/결제 기록 완료");// 판매-입고 구분, 전화번호, 출력

	}

	//물품 입고 메소드
	public void orderProduct(String prod_name, int primecost) {//물품명,원가

		Calendar cal = Calendar.getInstance();//날짜 함수
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//포맷

		try {
			bw = new BufferedWriter(new FileWriter(urlmonth, true));//판매관리창에 입력
			bw.write(format.format(cal.getTime()) + "\t123456\t"+prod_name+"\t" + primecost + "\t50\tPRO");//입고하는 마트 이름으로 단가 대신 원가로..
			bw.newLine();
			bw.flush();

			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	//일 매출 현황 메소드
	public void dayCheck() {

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//포맷
		Date datenow = new Date();//날짜 객체 생성
		try {
			br = new BufferedReader(new FileReader(urlmonth));//판매 관리 읽기
			while (true) {//무한 루프
				String lines = br.readLine();
				if (lines == null) {
					break;
				} else if (format.parse(lines.split("\t")[0]).getDate() == datenow
						.getDate())//현재 시간이랑 시간이 같으면
					System.out.println(lines);// 파일 내용에 출력
			}
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch bloc
			e.printStackTrace();
		}
		System.out.println("일일 관리 출력");
	}

	//월 매출 현황 메소드
	public void monthCheck() {

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date datenow = new Date();
		try {
			br = new BufferedReader(new FileReader(urlmonth));
			while (true) {
				String lines = br.readLine();
				if (lines == null) {
					break;
				} else if (format.parse(lines.split("\t")[0]).getMonth() == datenow
						.getMonth())//월이 같으면
					System.out.println(lines);//출력
			}
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch bloc
			e.printStackTrace();
		}
		System.out.println("월별 관리 출력");
	}

	//입고 물품 출력 메소드
	public void inputCheck() {

		try {
			br = new BufferedReader(new FileReader(urlmonth));
			while (true) {
				String lines = br.readLine();
				if (lines == null) {
					break;
				} else if (lines.split("\t")[5].equals("PRO"))//입고 내용이면
					System.out.println(lines);// 출력
			}
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch bloc
			e.printStackTrace();
		}
		System.out.println("입고 내역 출력");
	}

	public void CustomerCheck() {
		try {
			br = new BufferedReader(new FileReader(urlhuman));
			while (true) {
				String lines = br.readLine();
				if (lines == null) {
					break;
				} else
					System.out.println(lines);
			}
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch bloc
			e.printStackTrace();
		}
		System.out.println("고객 관리 출력");
	}

	//고객 별 구매 내역 메소드
	public void PrivateCheck(String phonenumber) {

		try {
			br = new BufferedReader(new FileReader(urlmonth));
			while (true) {
				String lines = br.readLine();
				if (lines == null) {
					break;
				} else if (lines.split("\t")[1].equals(phonenumber))//전화번호가 같으면
					System.out.println(lines);//출력
			}
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch bloc
			e.printStackTrace();
		}
		System.out.println(phonenumber + "/ 고객 구매 내역 출력");
	}

	//물품 별 구매 내역 메소드
	public void Productcheck(String Product_number) {
		String productname = "";

		try {
			br = new BufferedReader(new FileReader(urlgood));
			int count = 0;
			while (true) {
				String lines = br.readLine();

				if (lines == null) {
					break;
				} else if (count == Integer.parseInt(Product_number)) {//물품 번호와 맞으면
					productname = lines.split("\t")[0];//물품 번호 부여

				}
				count++;//1씩 증가하면서 한줄씩 출력되는것
			}
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch bloc
			e.printStackTrace();
		}

		try {
			br = new BufferedReader(new FileReader(urlmonth));
			while (true) {
				String lines = br.readLine();
				if (lines == null) {
					break;
				} else if (lines.split("\t")[2].equals(productname))//물품 이름과 맞으면
					System.out.println(lines);//출력
			}
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch bloc
			e.printStackTrace();
		}

		System.out.println(Product_number + "/ 물품 판매 내역 출력");
	}

	//물품 추가 메소드
	public void addProduct(String prod_name, String prod_maker, int prime_cost,int unit_cost
	) {

		try {
			bw = new BufferedWriter(new FileWriter(urlgood, true));
			String localtype = prod_name + "\t" +prod_maker+ "\t" + prime_cost + "\t" +unit_cost ;
			System.out.println(localtype);
			bw.write(localtype.toString());
			bw.newLine();
			bw.flush();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(prod_name + "/" + prod_maker  + "/" + prime_cost   + "/"
				+ unit_cost + "/ 추가 완료");
	}

	//파일에서 물품 삭제 메소드
	public void delProduct(String prod_name) {
		ArrayList<String> line = new ArrayList<String>();//string 기반  arraylist 생성

		try {
			br = new BufferedReader(new FileReader(urlgood));//물품 파일 읽기
			while (true) {
				String lines = br.readLine();
				if (lines == null) {
					break;
				} else if (!lines.split("\t")[0].equals(prod_name))//물품명이  arraylist에 없으면
					line.add(lines);//list에 삽입
			}
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch bloc
			e.printStackTrace();
		}

		try {
			bw = new BufferedWriter(new FileWriter(urlgood));//물품 파일에 쓰기. 뒤에 true가 없으므로 지우고 다시 쓰기.
			for (int i = 0; i < line.size(); i++) {
				bw.write(line.get(i));//파일에 쓰기
				bw.newLine();
				bw.flush();
			}
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(prod_name + "/ 삭제 완료");
	}
}
